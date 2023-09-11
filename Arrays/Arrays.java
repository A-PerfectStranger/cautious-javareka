import java.util.Scanner;

class Arrays {
    double[] tiempos = new double[10];
    double[] distancias = new double[10];
    String[] etiquetas = new String[10]; 
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        limpiarPantalla(); 
        int respuesta = 0;
        respuesta = mostrarMenu(true);
        realizarAccion(respuesta);
    }

    private static void limpiarPantalla() {
        System.out.print("\033[H\033[2J");  
        System.out.flush();
    }

    private static void realizarAccion(int respuesta) {
        switch(respuesta) {
            case 0:
                System.out.println("Saliendo...");
                break;
            case 1:
                ingresarDato();
                break;
            case 2:
                verDatos();
                break;
            case 3:
                eliminarUltimoDato();
                break;
            limpiarPantalla();
            mostrarMenu();
        }
    }

    private static void eliminarUltimoDato() {
        tiempos[tiempos.length -1] = 0;
        distancias[distancias.length -1] = 0;
        etiquetas[etiquetas.length -1] = 0;
    }

    private static void verDatos() {
        for(double tiempo :tiempos) {
            System.out.println("Tiempos: ");
            System.out.println(tiempo);
        }
        for(double distancia :distancias) {
            System.out.println("Distancias: ");
            System.out.println(distancia);
        }
        for(String etiqueta :etiquetas) {
            System.out.println("Etiquetas: ");
            System.out.println(etiqueta);
        }
    }

    private static void ingresarDato() {
        System.out.print("A cuál lista (tiempos/distancias/etiquetas): ");
        String respuesta = scanner.nextLine();
        if (respuest.equals("etiquetas")) {
            for(int u = 0; u < respuesta.length; u++) {
                respuesta[u] = nextLine();
            }
        } else {
            for(int u = 0; u < respuesta.length; u++) {
                respuesta[u] = nextDouble();
            }
        }
        scanner.nextLine();
    }

    public static int mostrarMenu(boolean error) {
        if (error) {
            System.out.println("Elige una opcion (0, 1, 2, 3): ");
            System.out.println("-------------------------------");
            System.out.println("[0] Finalizar");
            System.out.println("[1] Ingresar Dato");
            System.out.println("[2] Ver Datos");
            System.out.println("[3] Eliminar ultimo dato");
            System.out.print("-> ");
            int respuesta = scanner.nextInt();
            while (respuesta < 0 || respuesta > 3) {
                respuesta = mostrarMenu(false);
            }
            return respuesta;
        }
        return 0;
    }
}
