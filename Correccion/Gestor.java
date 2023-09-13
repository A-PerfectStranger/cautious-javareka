import java.util.*;

public class Gestor {

    private CurriculumVitae cv1;
    private CurriculumVitae cv2;

    public Gestor(CurriculumVitae cv1, CurriculumVitae cv2) {
        this.cv1 = cv1;
        this.cv2 = cv2;
    }

    public void ordenarPorTiempoDeExperiencia() {
        cv1.gestionarTiempoTrabajo();
        cv2.gestionarTiempoTrabajo();
        Collections.sort(cv1.trabajos);
        Collections.sort(cv2.trabajos);
    }

    public void ordenarPorNivelDeTitulacion() {
        Collections.sort(cv1.titulos);
        Collections.sort(cv2.titulos);
    }

    public void ordenarPorCantidadDeCompetencias() {
        Collections.sort(cv1.competencias);
        Collections.sort(cv2.competencias);
    }


}