import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Candidato candidato = new Candidato("Juan Anju");
        ArrayList<Titulo> titulosCV1 = new ArrayList<>();
        ArrayList<Trabajo> trabajosCV1 = new ArrayList<>();
        ArrayList<Competencia> competenciasCV1 = new ArrayList<>();
        List<String> habilidades = List.of("Sociabilidad", "Liderazgo", "Proactividad", "Creatividad");

        titulosCV1.add(new Titulo("2020-06-12", "Universidad de Loja", NivelDeTitulo.TERCER));
        trabajosCV1.add(new Trabajo("2020-07-01", "2021-07-01", "Ecuatecnology"));
        competenciasCV1.add(new Competencia(habilidades));


        Candidato candidato2 = new Candidato("Rosa Tulipán");
        ArrayList<Titulo> titulosCV2 = new ArrayList<>();
        ArrayList<Trabajo> trabajosCV2 = new ArrayList<>();
        ArrayList<Competencia> competenciasCV2 = new ArrayList<>();
        List<String> habilidades2 = List.of("Trabajo en equipo", "Alto nivel de Inglés", "Ortografía");

        titulosCV2.add(new Titulo("2021-01-16", "UTPL", NivelDeTitulo.CUARTO));
        trabajosCV2.add(new Trabajo("2021-03-15", "2022-09-23", "NombreEmpresa"));
        competenciasCV2.add(new Competencia(habilidades2));


        CurriculumVitae cv1 = new CurriculumVitae(candidato, titulosCV1, trabajosCV1, competenciasCV1);
        CurriculumVitae cv2 = new CurriculumVitae(candidato2, titulosCV2, trabajosCV2, competenciasCV2);

        Gestor gestor = new Gestor(cv1, cv2);

        gestor.ordenarPorTiempoDeExperiencia();
        gestor.ordenarPorNivelDeTitulacion();
        gestor.ordenarPorCantidadDeCompetencias();   
    }
}