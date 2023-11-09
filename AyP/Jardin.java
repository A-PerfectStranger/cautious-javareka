package AyP;

public class Jardin {
    
    private float area;
    private int numeroDePlantas;
    private String tipoDeSuelo;
    private String modeloDeRiego;
    private boolean sistemaRiegoeIluminacion;
    
    Jardin(float area, int numPlantas, String tipoSuelo, String modeloRiego, boolean sistemas) {
        this.area = area;
        this.numeroDePlantas = numPlantas;
        this.tipoDeSuelo = tipoSuelo;
        this.modeloDeRiego = modeloRiego;
        this.sistemaRiegoeIluminacion = sistemas;
    }

    public int obtenerNumeroDePlantas() {
        return numeroDePlantas;
    }

    public float obtenerAreaDelJardin() {
        return area;
    }

    public void encender() {
        sistemaRiegoeIluminacion =  true;
    }

    public void apagar() {
        sistemaRiegoeIluminacion = false;
    }

    public String mostrarEstado() {
        return (sistemaRiegoeIluminacion) ? "Sistemas Encendidos" : "Sistemas Apagados";
    }

}
