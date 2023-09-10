public class Jugador {

    private String nombreApellido;
    private String equipo;
    private short dorsal;
    private int altura;  //Medido en cm
    private float puntosPorPartido;
    private boolean lesionado;

    public Jugador(String nombre, String equipo, short dorsal, int altura, float puntosPorPartido, boolean lesionado) {
        this.nombreApellido = nombre;
        this.equipo = equipo;
        this.dorsal = dorsal;
        this.altura = altura;
        this.puntosPorPartido = puntosPorPartido;
        this.lesionado = lesionado;
    }

    private String estaLesionado() {
        return (lesionado) ? "Está lesionado": "Se encuentra en perfectas condiciones";
    }

    @Override
    public String toString(){
        return "[" + nombreApellido + " jugador de: " + equipo + 
        " con el numero de dorsal: " + dorsal + ". Ha ganado por partido: " 
        + puntosPorPartido + " puntos. " + estaLesionado() + "]";
    }
}