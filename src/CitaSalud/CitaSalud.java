package CitaSalud;

import CitaSalud.Entidades.Area;
import CitaSalud.Entidades.Cita;
import CitaSalud.Entidades.Medicamento;
import CitaSalud.Entidades.Medico;
import CitaSalud.Entidades.Paciente;
import CitaSalud.Entidades.Usuario;
import CitaSalud.pantallas.JFrameLogin;
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
    public static List<Medicamento> medicamentos = new ArrayList<>();
    public static List<Cita> citas = new ArrayList<>();
    public static Usuario usuario = new Usuario();
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Abrir JFramePrincipal:
        JFrameLogin frameLogin = new JFrameLogin();
        frameLogin.setVisible(true);
    }
}