import java.util.*;

public class Competencia implements Comparable<Competencia>{
    private List<String> habilidades;

    public Competencia(List<String> habilidades) {
        this.habilidades = habilidades;
    }

    public int getNumeroCompetencias() {
        return habilidades.size();
    }

    @Override
    public int compareTo(Competencia o) {
        return this.getNumeroCompetencias() - o.getNumeroCompetencias();
    }

    @Override
    public String toString() {
        return Integer.toString(getNumeroCompetencias());
    }

}