package Arrays;
import java.util.Scanner;

public class Menu {

    private Scanner scanner;
    private Registro registro;

    public Menu () {
        registro = new Registro();
        scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        limpiarPantalla();
        System.out.println("------");
        System.out.println("0. Salir");
        System.out.println("1. Ingresar Dato ");
        System.out.println("2. Mostrar Datos");
        System.out.println("3. Eliminar Dato");
        System.out.print("-> ");
        int respuesta = scanner.nextInt();
        ejecutarAccion(respuesta);
    }

    private void limpiarPantalla() {
        System.out.print("\033[H\033[2J");  
        System.out.flush(); 
    }

    private void ejecutarAccion(int respuesta) {
        switch (respuesta) {
            case 0:
                System.out.println("Saliendo...");
                break;
            case 1:
                mostrarListas();
                break;
            case 2:
                registro.mostrarDatos();
                break;
            case 3:
                registro.eliminarDato();
                break;
        }
        mostrarMenu();
    }
    

    private void mostrarListas() {
        System.out.println("A qué lista? ");
        System.out.println("1. Tiempos ");
        System.out.println("2. Distancias ");
        System.out.println("3. Etiquetas ");
        System.out.print("-> ");
        int otrarespuesta = scanner.nextInt();
        guardarDatos(otrarespuesta);
    }

    private void guardarDatos(int otrarespuesta) {
        switch (otrarespuesta) {
            case 1:
                registro.agregarValoresAListaTiempo();
                break;
            case 2:
                registro.agregarValoresAListaDistancia();
                break;
            case 3:
                registro.agregarValoresAListaEtiquetas();
                break;
        }
    }
}
