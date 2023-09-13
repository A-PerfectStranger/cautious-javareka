import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;


public class Trabajo implements Comparable<Trabajo>{
    private String fechaDeIngreso;
    private String fechaDeSalida;
    private String nombreEmpresa;
    private LocalDate fechaIngreso;
    private LocalDate fechaSalida;
    public Period tiempoDeEstadia; 

    public Trabajo(String fechaDeIngreso, String fechaDeSalida, String nombreEmpresa) {
        this.fechaDeIngreso = fechaDeIngreso;
        this.fechaDeSalida = fechaDeSalida;
        this.nombreEmpresa = nombreEmpresa;
        this.tiempoDeEstadia = null;
    }

    public void gestionarTiempoTrabajo() {
        if (esTrabajoValido()) {
            asignarTiempoDeExperiencia();
        }
        return;
    }

    public boolean esTrabajoValido() {
        transformarFecha();
        return validarTrabajo();
    }

    private void transformarFecha() {
        fechaIngreso = LocalDate.parse(fechaDeIngreso, DateTimeFormatter.ISO_DATE);
        fechaSalida = LocalDate.parse(fechaDeSalida, DateTimeFormatter.ISO_DATE);
    }

    private boolean validarTrabajo() {
        return fechaIngreso.isBefore(fechaSalida);
    }

    public void asignarTiempoDeExperiencia() {
        tiempoDeEstadia = Period.between(fechaIngreso, fechaSalida);

    }

    @Override
    public int compareTo(Trabajo o) {
        int diasEsteTrabajo = tiempoDeEstadia.getDays() + tiempoDeEstadia.getMonths() * 12 + tiempoDeEstadia.getYears() * 365;
        int diasOtroTrabajo = o.tiempoDeEstadia.getDays() + o.tiempoDeEstadia.getMonths() * 12 + o.tiempoDeEstadia.getYears() * 365;
        return Integer.compare(diasEsteTrabajo, diasOtroTrabajo);
    }

    @Override
    public String toString() {
        return "Empresa: " + nombreEmpresa + ", Tiempo de Estancia: " + tiempoDeEstadia.toString();
    }

}
