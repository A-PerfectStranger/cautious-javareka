public class Recursividad {

    public static void generarPermutaciones(String entrada) {
        generar("", entrada);
    }

    private static void generar(String prefijo, String cadena) {
        int n = cadena.length();
        if (n == 0) {
            System.out.println(prefijo);
        } else {
            for (int i = 0; i < n; i++) {
                generar(prefijo + cadena.charAt(i), cadena.substring(0, i) + cadena.substring(i + 1, n));
            }
        }
    }

    public static void main(String[] args) {
        String entrada = "abc";
        System.out.println("Permutaciones de '" + entrada + "':");
        generarPermutaciones(entrada);      
    }
}
