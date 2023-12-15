public class QuickSort {
    public static void quickSort(int[] array, int inicio, int fin) {
        if (inicio < fin) {
            int indiceParticion = particion(array, inicio, fin);

            quickSort(array, inicio, indiceParticion - 1);
            quickSort(array, indiceParticion + 1, fin);
        }
    }

    public static int particion(int[] array, int inicio, int fin) {
        int pivote = array[fin];
        int i = inicio - 1;

        for (int j = inicio; j < fin; j++) {
            if (array[j] < pivote) {
                i++;

                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i + 1];
        array[i + 1] = array[fin];
        array[fin] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        int[] array = { 7, 2, 1, 6, 8, 5, 3, 4 };
        int n = array.length;

        System.out.println("Array original:");
        imprimirArray(array);

        quickSort(array, 0, n - 1);

        System.out.println("\nArray ordenado:");
        imprimirArray(array);
    }

    public static void imprimirArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
