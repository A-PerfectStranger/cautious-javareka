package PigElCerdo;
import java.util.Random;
public class Game {
    
    private Persona persona;
    private Computador contrincante;
    private Random dado;

    public Game() {
        persona = new Persona();
        contrincante = new Computador();
        dado = new Random();
    }

    public void start() {
        limpiarPantalla();
        mostrarMenu();
    }

    private void limpiarPantalla() {
        System.out.print("\033[H\033[2J");  
        System.out.flush(); 
    }

    private void mostrarMenu() {
        System.out.println("-------------  HOLA   ------------");
        System.out.println("Bienvenido al Juego de Pig el Cerdo");
        comenzar();
    }

    private void comenzar() {
        if (!quiereJugar()) {
            System.out.printf("Okay, hasta luego \n");
            return;
        }
        iniciarPartida();
    }

    private void iniciarPartida() {
        limpiarPantalla();
        while (noHayGanador()) {
            mostrarPuntaje();
            persona.setTurno(true);
            System.out.println("Es tu turno, ahora tiras los dados ");
            esperar();
            jugar();
            if (puedeContinuar()) {
                iniciarPartida();
            }
            limpiarPantalla();
            contrincante.setTurno(true);
            System.out.println("Ahora es el turno de tu adversario, tira los dados ");
            esperar();
            jugar();
            if (quiereContinuar()) {
                iniciarPartida();
            }
        }

    }

    private boolean puedeContinuar() {
        return persona.continuar() && persona.getTurno();
    }

    private boolean quiereContinuar() {
        return contrincante.continuar() && contrincante.getTurno();
    }

    private void jugar() {
        int puntajeTemporal = lanzarDado();
        System.out.println("Salió un " + puntajeTemporal);
        if (puntajeTemporal == 1) {
            System.out.println("No hay puntos para ti");
            cambiarTurno();
            return;
        }
        asignarPuntaje(puntajeTemporal);
    }

    private void cambiarTurno() {
        if (persona.turno) {
            persona.turno = false;
            return;
        }
        contrincante.turno = false;
    }

    private void asignarPuntaje(int puntaje) {
        if (persona.turno) {
            persona.sumarPuntaje(puntaje);
            return;
        }
        contrincante.sumarPuntaje(puntaje);
    }

    private boolean noHayGanador() {
        return persona.puntaje < 100 && contrincante.puntaje < 100;
    }

    private int lanzarDado() {
        return dado.nextInt(6) + 1;
    }

    private boolean quiereJugar() {
        return persona.preguntar("Comenzamos? (S/N)").equalsIgnoreCase("S");
    }

    private void esperar() {
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    private void mostrarPuntaje() {
        System.out.println("Tu puntaje: " + persona.getPuntaje());
        System.out.println("Su puntaje: " + contrincante.getPuntaje());
    }
    
}