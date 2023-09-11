import java.util.Scanner;

class Hospital {

    public static void main(String[] args) {
        ingresarPaciente("Eduarda");
    }

    public static void ingresarPaciente(String nombrePaciente) {
        System.out.println("Hola " + nombrePaciente);
        String respuesta = preguntar(nombrePaciente + ", ha tenido una caída? (S/N)");
        if (siEsVerdad(respuesta)) {
            ingresarATraumatología();
        } else {
            preguntarPorOtraCosa(nombrePaciente);
        }
        System.out.println(nombrePaciente + " " + "Usted está bien!!");
    }

    public static String preguntar(String pregunta) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(pregunta);
        String respuesta = scanner.nextLine();
        return respuesta;
    }

    private static void preguntarPorOtraCosa(String nombrePaciente) {
        String respuesta = preguntar(nombrePaciente + ", Talvez le duela el pecho? ");
        if (siEsVerdad(respuesta)) {
            ingresarACardiologia();
        } else {
            enviarAMedicinaGeneral();
        }
    }

    private static boolean siEsVerdad(String respuesta) {
        return respuesta.equals("S");
    }

    private static void enviarAMedicinaGeneral() {
        String respuesta = preguntar("Tiene fiebre? ");
        if (siEsVerdad(respuesta)) {
            iniciarRecuperacion();
        }
    }

    private static void iniciarRecuperacion() {
        System.out.println("Aquí le curaremos");
    }

    private static void ingresarACardiologia() {
        System.out.println("Ha ingresado a cardiología");
        iniciarRecuperacion();
    }

    private static void ingresarATraumatología() {
        System.out.println("Ha ingresado a trauma");
        iniciarRecuperacion();
    }
}