package CitaSalud;

import CitaSalud.Entidades.Area;
import CitaSalud.Entidades.Medico;
import CitaSalud.Entidades.Paciente;
import CitaSalud.pantallas.JFramePrincipal;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @autor Andres
 */
public class CitaSalud {
    public static List<Medico> medicos = new ArrayList<>();
    public static List<Paciente> pacientes = new ArrayList<>();
    public static List<Area> areas = new ArrayList<>();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Abrir JFramePrincipal:
        JFramePrincipal framePrincipal = new JFramePrincipal();
        framePrincipal.setVisible(true);
    }
}