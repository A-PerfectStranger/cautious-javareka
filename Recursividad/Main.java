public class Main {

    public static int sumaHasta(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumaHasta(n - 1);
        }
    }

    public static boolean esPrimo(int num, int divisor) {
        if (divisor == 1) {
            return true;
        } else {
            if (num % divisor == 0) {
                return false;
            } else {
                return esPrimo(num, divisor - 1);
            }
        }
    }

    public static String invertirString(String str) {
        if (str.isEmpty()) {
            return str;
        } else {
            return invertirString(str.substring(1)) + str.charAt(0);
        }
    }


    public static void main(String[] args) {

    }
}
