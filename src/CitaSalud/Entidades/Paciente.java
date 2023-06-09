package CitaSalud.Entidades;

import CitaSalud.CitaSalud;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andres
 */
public class Paciente extends Persona {
    private String celular;

    /**
     * @return the celular
     */
    public String getCelular() {
        return celular;
    }

    /**
     * @param celular the celular to set
     */
    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    public static List<Paciente> cargarArchivoDeTexto() {
        List<Paciente> pacientes = new ArrayList<>();
        Path filePath = Paths.get("src/CitaSalud/Archivos/pacientes.txt");
        
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath.toFile()))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] campos = linea.split(";");
                Paciente paciente = new Paciente();
                
                paciente.setDni(campos[0]);
                paciente.setNombre(campos[1]);
                paciente.setApellido(campos[2]);
                
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                paciente.setFechaNacimiento(dateFormat.parse(campos[3]));
                
                paciente.setCelular(campos[4]);
                pacientes.add(paciente);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException ex) {
            Logger.getLogger(Medico.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pacientes;
    }
    
    public static void actualizar(List<Paciente> pacientes) {
        Path filePath = Paths.get("src/CitaSalud/Archivos/pacientes.txt");
        
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath.toFile()))) {
            for (Paciente paciente : CitaSalud.pacientes) {
                writer.write(paciente.getDni() + ";");
                writer.write(paciente.getNombre() + ";");
                writer.write(paciente.getApellido() + ";");
                
                SimpleDateFormat formatoEntrada = new SimpleDateFormat("E MMM dd hh:mm:ss z yyyy", Locale.ENGLISH);
                Date fechaFormato = formatoEntrada.parse(paciente.getFechaNacimiento().toString());
                SimpleDateFormat formatoSalida = new SimpleDateFormat("dd/MM/yyyy");
                writer.write(formatoSalida.format(fechaFormato) + ";");
                
                writer.write(paciente.getCelular() + System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException ex) {
            Logger.getLogger(Medico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
