package PigElCerdo;

public abstract class Jugador implements Continuable{
    protected int puntaje;
    protected boolean turno;

    protected Jugador() {
        puntaje = 0;
        turno = false;
    }

    public abstract boolean continuar();

    public void sumarPuntaje(int puntaje) {
        this.puntaje += puntaje;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setTurno(boolean turno) {
        this.turno = turno;
    }

    public boolean getTurno() {
        return turno;
    }

}