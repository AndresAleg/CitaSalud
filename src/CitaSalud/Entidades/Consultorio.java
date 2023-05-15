package CitaSalud.Entidades;

/**
 *
 * @author Andres
 */
public class Consultorio {
   private Cita cita;
   private String motivo;
   private String sintoma;
   private String diagnostico;
   private String medicacion;

    /**
     * @return the cita
     */
    public Cita getCita() {
        return cita;
    }

    /**
     * @param cita the cita to set
     */
    public void setCita(Cita cita) {
        this.cita = cita;
    }

    /**
     * @return the motivo
     */
    public String getMotivo() {
        return motivo;
    }

    /**
     * @param motivo the motivo to set
     */
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    /**
     * @return the sintoma
     */
    public String getSintoma() {
        return sintoma;
    }

    /**
     * @param sintoma the sintoma to set
     */
    public void setSintoma(String sintoma) {
        this.sintoma = sintoma;
    }

    /**
     * @return the diagnostico
     */
    public String getDiagnostico() {
        return diagnostico;
    }

    /**
     * @param diagnostico the diagnostico to set
     */
    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    /**
     * @return the medicacion
     */
    public String getMedicacion() {
        return medicacion;
    }

    /**
     * @param medicacion the medicacion to set
     */
    public void setMedicacion(String medicacion) {
        this.medicacion = medicacion;
    }
}
