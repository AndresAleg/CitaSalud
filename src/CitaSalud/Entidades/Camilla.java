package CitaSalud.Entidades;

public class Camilla {
    
    private Paciente paciente;
    private String numeroDeCamilla;
    private String tipo;
    
    
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
     * @return the numeroDeCamilla
     */
    public String getNumeroDeCamilla() {
        return numeroDeCamilla;
    }

    /**
     * @param numeroDeCamilla the numeroDeCamilla to set
     */
    public void setNumeroDeCamilla(String numeroDeCamilla) {
        this.numeroDeCamilla = numeroDeCamilla;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }  
}
