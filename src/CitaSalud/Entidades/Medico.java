package CitaSalud.Entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andres
 */
public class Medico extends Persona {
    private String email;
    private List<Area> area;
    
    public Medico() {
        this.area = new ArrayList<>();
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
