package CitaSalud.Entidades;

import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 *
 * @author Andres
 */
public class Cita {
    
    private String codigo;
    private Paciente paciente;
    private Area area;
    private Medico medico;
    private String fecha;
    private String hora;
    private Boolean atendido = false;
    
    
    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

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
     * @return the area
     */
    public Area getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(Area area) {
        this.area = area;
    }

    /**
     * @return the medico
     */
    public Medico getMedico() {
        return medico;
    }

    /**
     * @param medico the medico to set
     */
    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the hora
     */
    public String getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(String hora) {
        this.hora = hora;
    }

    /**
     * @return the atendido
     */
    public Boolean getAtendido() {
        return atendido;
    }

    /**
     * @param atendido the activo to set
     */
    public void setAtendido(Boolean atendido) {
        this.atendido = atendido;
    }
    
    public boolean validarFormatoFecha() {
        try {
            DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            formatoFecha.parse(fecha);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }
    
    public boolean validarFormatoHora() {
        try {
            DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");
            formatoHora.parse(hora);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }
}
