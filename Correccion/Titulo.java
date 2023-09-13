public class Titulo implements Comparable<Titulo>{
    private String fechaDeGraduacion;
    private String nombreUniversidad;
    private NivelDeTitulo nivel;

    public Titulo(String fechaDeGraduacion, String nombreUniversidad, NivelDeTitulo nivel) {
        this.fechaDeGraduacion = fechaDeGraduacion;
        this.nombreUniversidad = nombreUniversidad;
        this.nivel = nivel;
    }

    @Override
    public int compareTo(Titulo o) {
        return nivel.compareTo(o.nivel);
    }

    @Override
    public String toString() {
        return "Graduado en " + nombreUniversidad 
        + " con titulo de " + nivel.name() + " nivel";
    }

}
