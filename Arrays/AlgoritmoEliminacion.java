public class AlgoritmoEliminacion {
    public static void main(String[] args) {
        int[] V = new int[10];

        for (int i = 0; i < V.length; i++) {
            V[i] = i + 1;
        }

        int x = 5;
        int i = 1;
        while (i <= V.length && x != V[i]) {
            i++;
        }
        if (i > V.length) {
            System.out.println("Element not found");
        } else {
            for (int j = i; j < V.length - 1; j++) {
                V[j] = V[j + 1];
            }
        }
        
        for (int k : V) {
            System.out.println(k);
        }


    } 
}
