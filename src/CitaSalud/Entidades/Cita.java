package CitaSalud.Entidades;

import CitaSalud.CitaSalud;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
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
    
    public static List<Cita> cargarArchivoDeTexto() {
        List<Cita> citas = new ArrayList<>();
        Path filePath = Paths.get("src/CitaSalud/Archivos/citas.txt");
        
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath.toFile()))) {
            
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] campos = linea.split(";");
                Cita cita = new Cita();
                
                cita.setCodigo(campos[0]);
                
                for (Paciente paciente : CitaSalud.pacientes) {
                    if ((paciente.getNombre() + " " + paciente.getApellido())
                            .equals(campos[1])) {
                        cita.setPaciente(paciente);
                        break;
                    }
                }
                
                for (Area area : CitaSalud.areas) {
                    if ((area.getNombre().equals(campos[2]))) {
                        cita.setArea(area);
                        break;
                    }
                }
                
                for (Medico medico : CitaSalud.medicos) {
                    if ((medico.getNombre() + " " + medico.getApellido())
                            .equals(campos[3])) {
                        cita.setMedico(medico);
                    }
                }
                
                cita.setFecha(campos[4]);
                cita.setHora(campos[5]);
                cita.setAtendido(Boolean.parseBoolean(campos[6]));
                citas.add(cita);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return citas;
    }
    
    public static void actualizar(List<Cita> citas) {
        Path filePath = Paths.get("src/CitaSalud/Archivos/citas.txt");
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath.toFile()))) {
            for (Cita cita : citas) {
                writer.write(cita.getCodigo() + ";");
                writer.write(cita.getPaciente().getNombre() 
                        + " " 
                        + cita.getPaciente().getApellido() + ";");
                writer.write(cita.getArea().getNombre() + ";");
                writer.write(cita.getMedico().getNombre()
                        + " " 
                        + cita.getMedico().getApellido() + ";");
                writer.write(cita.getFecha() + ";");
                writer.write(cita.getHora() + ";");
                writer.write(cita.getAtendido().toString() + System.lineSeparator());
            } 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
