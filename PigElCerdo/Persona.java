package PigElCerdo;
import java.util.Scanner;

public class Persona extends Jugador {
    private Scanner scanner;

    public Persona() {
        super();
        scanner = new Scanner(System.in);
    }

    public boolean continuar() {
        System.out.print("Quieres continuar? (S/N) ");
        String respuesta = scanner.nextLine();
        return respuesta.equalsIgnoreCase("S");
    }

    public String preguntar(String pregunta) {
        System.out.println(pregunta);
        System.out.print("-> ");
        String respuesta = scanner.nextLine();
        return respuesta;
    }

    

}