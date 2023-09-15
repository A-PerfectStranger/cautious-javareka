package Arrays;
import java.util.Scanner;

public class Registro {

    private float[] tiempos;
    private float[] distancias;
    private String[] etiquetas; 
    private Scanner scanner;

    public Registro() {
        tiempos = new float[10];
        distancias = new float[10];
        etiquetas = new String[10];
        scanner = new Scanner(System.in);
    }

    public void agregarValoresAListaTiempo() {
        for (int i = 0; i < tiempos.length; i++) {
            System.out.print("[" + (i + 1) + " ]" + ": ");
            tiempos[i] = scanner.nextFloat();
        }
    }

    public void agregarValoresAListaDistancia() {
        for (int i = 0; i < distancias.length; i++) {
            System.out.print("[" + (i + 1) + " ]" + ": ");
            distancias[i] = scanner.nextFloat();
        }
    }

    public void agregarValoresAListaEtiquetas() {
        for (int i = 0; i < etiquetas.length; i++) {
            System.out.print("[" + (i + 1) + " ]" + ": ");
            etiquetas[i] = scanner.nextLine();
        }
    }

    public void mostrarDatos() {
        System.out.println("Tiempos: ");
        for (float f : tiempos) {
            System.out.println(f);
        }
        System.out.println();
        System.out.println("Distancias: ");
        for (float i : distancias) {
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Etiquetas: ");
        for (String a : etiquetas) {
            System.out.println(a);           
        }
        System.out.println();
        esperar(3000);
    }

    public void eliminarDato() {
        tiempos[tiempos.length - 1] = 0f;
        distancias[distancias.length - 1] = 0f;
        etiquetas[etiquetas.length - 1] = "";
    }

    private void esperar(int mili) {
        try {
            Thread.sleep(mili);
        } catch (Exception e) {
            e.getStackTrace();
        }

    }
}
