import javax.swing.JOptionPane;

public class MenuV2 {
    public static void main(String[] args) {
        String tamaño = JOptionPane.showInputDialog("Tamaño de la bicola: ");
        BicolaEntradaRestringida bicola = new BicolaEntradaRestringida(Integer.parseInt(tamaño));

        String menu = "MENU BICOLA SALIDA RESTRINGIDA\n" +
                          "1. INSERCION\n" +
                          "2. ELIMINACION\n" +
                          "3. VER\n" +
                          "4. SALIR\n";

        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, menu));

            switch (opcion) {
                case 1:
                    String opcionEliminacion = JOptionPane.showInputDialog("¿Qué extremo desea insertar?\n" +
                    "1. En el frente\n" +
                    "2. En el final\nIngrese una opción: ");
                    int opcionEliminacionInt = Integer.parseInt(opcionEliminacion);
                    
                    if (opcionEliminacionInt == 1) {
                        bicola.insertarAlFrente(Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor a ingresar: ")));
                    } else if (opcionEliminacionInt == 2) {
                        bicola.insertarAlFinal(Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor a ingresar: ")));
                    } else {
                        JOptionPane.showMessageDialog(null, "Opción inválida");
                    }
                    break;
                case 2:
                    bicola.extraerDesdeFrente();
                    break;
                case 3:
                    bicola.mostrarCola();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Saliendo...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida");
                    break;
            }
        } while (opcion != 4);
    }
}
