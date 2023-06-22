package CitaSalud.Entidades;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class Salida {
    
    private Paciente paciente;
    private String nombreDeDoctor;
    private String fechaSalida;
    
    @Override
    public String toString(){
        return nombreDeDoctor + ";" + fechaSalida;
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
     * @return the nombreDeDoctor
     */
    public String getNombreDeDoctor() {
        return nombreDeDoctor;
    }

    /**
     * @param nombreDeDoctor the nombreDeDoctor to set
     */
    public void setNombreDeDoctor(String nombreDeDoctor) {
        this.nombreDeDoctor = nombreDeDoctor;
    }

    /**
     * @return the fechaSalida
     */
    public String getFechaSalida() {
        return fechaSalida;
    }

    /**
     * @param fechaSalida the fechaSalida to set
     */
    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
    
    public static List<Salida> cargarArchivoDeTexto() {
        List<Salida> salidas = new ArrayList<>();
        Path filePath = Paths.get("src/CitaSalud/Archivos/salidas.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath.toFile()))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] campos = linea.split(";");
                Salida salida = new Salida();

                salida.setNombreDeDoctor(campos[0]);
                salida.setFechaSalida(campos[1]);

                salidas.add(salida);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return salidas;
    }
    
    public static void actualizar(List<Salida> salidas) {
        Path filePath = Paths.get("src/CitaSalud/Archivos/salidas.txt");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath.toFile()))) {
            for (Salida salida : salidas) {
                writer.write(salida.getNombreDeDoctor() + ";");
                writer.write(salida.getFechaSalida() + System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
