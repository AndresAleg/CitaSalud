package CitaSalud.Entidades;


public class Salida {
    
    private Paciente paciente;
    private String nombreDeDoctor;
    private String fechaSalida;

    /**
     * @return the paciente
     */
    public Paciente getPaciente() {
        return paciente;
    }

    /**
     * @param paciente the paciente to set
     */
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    /**
     * @return the nombreDeDoctor
     */
    public String getNombreDeDoctor() {
        return nombreDeDoctor;
    }

    /**
     * @param nombreDeDoctor the nombreDeDoctor to set
     */
    public void setNombreDeDoctor(String nombreDeDoctor) {
        this.nombreDeDoctor = nombreDeDoctor;
    }

    /**
     * @return the fechaSalida
     */
    public String getFechaSalida() {
        return fechaSalida;
    }

    /**
     * @param fechaSalida the fechaSalida to set
     */
    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
}
