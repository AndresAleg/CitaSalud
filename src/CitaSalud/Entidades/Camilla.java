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

public class Camilla {
    
    private Paciente paciente;
    private String numeroDeCamilla;
    private String tipo;
    
    @Override
    public String toString() {
        return numeroDeCamilla + ";" + tipo;
    }
    
    public Paciente getPaciente() {
        return paciente;
    }
    
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    public String getNumeroDeCamilla() {
        return numeroDeCamilla;
    }
   
    public void setNumeroDeCamilla(String numeroDeCamilla) {
        this.numeroDeCamilla = numeroDeCamilla;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }  
    
    
    public static List<Camilla> cargarArchivoDeTexto() {
        List<Camilla> camillas = new ArrayList<>();
        Path filePath = Paths.get("src/CitaSalud/Archivos/camillas.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath.toFile()))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] campos = linea.split(";");
                Camilla camilla = new Camilla();

                camilla.setNumeroDeCamilla(campos[0]);
                camilla.setTipo(campos[1]);

                camillas.add(camilla);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return camillas;
    }

    public static void actualizar(List<Camilla> camillas) {
        Path filePath = Paths.get("src/CitaSalud/Archivos/camillas.txt");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath.toFile()))) {
            for (Camilla camilla : camillas) {
                writer.write(camilla.getNumeroDeCamilla() + ";");
                writer.write(camilla.getTipo() + System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
