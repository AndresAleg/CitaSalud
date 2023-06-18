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
    
    public static List<Medico> cargarArchivoDeTexto() {
        List<Medico> medicos = new ArrayList<>();
        Path filePath = Paths.get("src/CitaSalud/Archivos/medicos.txt");
        
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath.toFile()))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] campos = linea.split(";");
                Medico medico = new Medico();
                
                medico.setDni(campos[0]);
                medico.setNombre(campos[1]);
                medico.setApellido(campos[2]);
                
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                medico.setFechaNacimiento(dateFormat.parse(campos[3]));
                medico.setEmail(campos[4]);
                
                for (Area area : CitaSalud.areas) {
                    if (area.getNombre().equals(campos[5])) {
                        medico.getArea().add(area);
                    }
                }      
                medicos.add(medico);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException ex) {
            Logger.getLogger(Medico.class.getName()).log(Level.SEVERE, null, ex);
        }
        return medicos;
    }
    
    public static void actualizar(List<Medico> medicos) {
        Path filePath = Paths.get("src/CitaSalud/Archivos/medicos.txt");
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath.toFile()))) {
            for (Medico medico : CitaSalud.medicos) {
                writer.write(medico.getDni() + ";");
                writer.write(medico.getNombre() + ";");
                writer.write(medico.getApellido() + ";");
                
                SimpleDateFormat formatoEntrada = new SimpleDateFormat("E MMM dd hh:mm:ss z yyyy", Locale.ENGLISH);
                Date fechaFormato = formatoEntrada.parse(medico.getFechaNacimiento().toString());
                SimpleDateFormat formatoSalida = new SimpleDateFormat("dd/MM/yyyy");
                writer.write(formatoSalida.format(fechaFormato) + ";");
                
                writer.write(medico.getEmail() + ";");
                writer.write(medico.getArea().get(0).getNombre() + System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException ex) {
            Logger.getLogger(Medico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
