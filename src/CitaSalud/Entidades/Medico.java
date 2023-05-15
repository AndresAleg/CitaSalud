package CitaSalud.Entidades;

import java.util.List;

/**
 *
 * @author Andres
 */
public class Medico {
    private String dni;
    private String nombre;
    private String apellido;
    private String email;
    private List<Area> area;
    
    /**
     * @return the dni
     */
    private String getDni() {
        return dni;
    }
    
    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the area
     */
    public List<Area> getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(List<Area> area) {
        this.area = area;
    }
}
