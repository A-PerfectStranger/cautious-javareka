public class BicolaSalidaRestringida {
    private int frente;
    private int atras;
    private int[] cola;
    private int maxSize;


    public BicolaSalidaRestringida (int maxSize) {
        this.maxSize = maxSize;
        this.cola = new int[maxSize];
        this.frente = 0; 
        this.atras = -1; 
    }

    // Método para insertar al final de la bicola
    public void insertarAlFinal(int valor) {
        if (atras == maxSize - 1) { 
            System.out.println("Desbordamiento");
        } else {
            cola[++atras] = valor;
        }
    }

    // Método para insertar al frente de la bicola
    public void insertarAlFrente(int valor) {
        if (frente == maxSize - 1) {
            System.out.println("Desbordamiento");
        } else {
            atras++;
            cola[atras] = valor;
        }
    }

    // Método para extraer desde el frente 
    public int extraerDesdeFrente() {
        if (frente > atras) {
            System.out.println("Subdesbordamiento");
            return -1; 
        } else {
            int valorExtraido = cola[frente];
            cola[frente] = 0;
            System.out.println("Frente: " + valorExtraido);
            frente++;
            return valorExtraido;
        }
    }
    
    // Método para mostrar los elementos 
    public void mostrarCola() {
        for (int i : cola) {
            System.out.println(i);
        }
    }
}
