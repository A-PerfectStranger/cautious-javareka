package PigElCerdo;

import java.util.Random;

public class Computador extends Jugador {

    public boolean continuar() {
        Random eleccion = new Random();
        if (eleccion.nextBoolean()) {
            System.out.println("Decide continuar ");
            return true;
        } 
        System.out.println("Va a la segura, Pasa");
        return false;
    }

}
