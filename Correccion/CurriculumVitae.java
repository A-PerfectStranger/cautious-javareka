import java.util.ArrayList;

public class CurriculumVitae{
    private Candidato candidato;
    public ArrayList<Titulo> titulos;
    public ArrayList<Trabajo> trabajos;
    public ArrayList<Competencia> competencias;

    public CurriculumVitae(Candidato Candidato, ArrayList<Titulo> titulos, ArrayList<Trabajo> trabajos, ArrayList<Competencia> competencias) {
        this.candidato = candidato;
        this.titulos = titulos;
        this.trabajos = trabajos;
        this.competencias = competencias;
    }

    public void gestionarTiempoTrabajo() {
        for(Trabajo trabajo : trabajos) {
            trabajo.gestionarTiempoTrabajo();
        }
    }

 


}