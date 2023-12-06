package Prueba;
import java.util.Scanner;

public class Prueba {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el nombre del día de la semana y el número de días a avanzar
        System.out.print("Ingrese el nombre de un día de la semana (en minúsculas): ");
        String diaSemana = scanner.nextLine();
        System.out.print("Ingrese el número de días a avanzar: ");
        int dias = scanner.nextInt();

        // Llamar a la función para obtener el día después de N días
        String nuevoDia = obtenerDiaSiguiente(diaSemana, dias);

        // Imprimir el resultado
        System.out.println("El día después de " + dias + " días es: " + nuevoDia);

        scanner.close();
    }

    public static String obtenerDiaSiguiente(String diaSemana, int dias) {
        // Array con los días de la semana
        String[] diasSemana = {"lunes", "martes", "miércoles", "jueves", "viernes", "sábado", "domingo"};

        // Encontrar la posición del día ingresado en el array
        int indiceDia = -1;
        for (int i = 0; i < diasSemana.length; i++) {
            if (diasSemana[i].equals(diaSemana)) {
                indiceDia = i;
                break;
            }
        }

        // Calcular el nuevo índice del día después de N días
        int nuevoIndice = (indiceDia + dias) % 7;

        // Retornar el día de la semana correspondiente al nuevo índice
        return diasSemana[nuevoIndice];
    }
}
