/*
 * Lugar dónde está el archivo
 */
package mipunto;

/*
 * @author aesir
 */
public class MiPunto {

    private int x;   //Atributo coordenada x
    private int y;   //Atributo coordenada y

    /*
     * Constructor sin parámetros 
     * Valores por defecto 0
     */

    public MiPunto() {
        x = 0;
        y = 0;
    }

    /*
     * Constructor con parámetros
     */

    public MiPunto(int cox, int coy) {
        this.x = cox;
        this.y = coy;
    }

    /*
     * Getter del atributo x
     */
    public int DevolverCX() {
        return x;
    }

    /*
     * Lo mismo con y
     */
    public int DevolverCY() {
        return y;
    }

    /*
     * Setter para x
     */
    void FijarCX(int valorX) {
        x = valorX;
    }

    /*
     * Lo de arriba con y
     */
    void FijarCY(int valorY) {
        y = valorY;
    }

    /*
     * main method
     */
    public static void main(String[] args) {
        //Creacion objeto nombre
        MiPunto nombre = new MiPunto();
        
        //Colocar atributos x, y en 30
        nombre.FijarCX(30);
        nombre.FijarCY(30);

        //Obtener la posicion del objeto 
        System.out.println("Posición actual: X:" +  nombre.DevolverCX() + "  Y: " + nombre.DevolverCY());
    }

}