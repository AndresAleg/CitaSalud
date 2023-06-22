/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
/**
 *
 * @author USER
 */
public class Farmacia {
    
    private Paciente paciente;
    private Consultorio consultorio;
    

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Consultorio getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(Consultorio consultorio) {
        this.consultorio = consultorio;
    }
    
    public static List<Farmacia> cargarArchivoDeTexto() {
        List<Farmacia> farmacias = new ArrayList<>();
        Path filePath = Paths.get("src/CitaSalud/Archivos/farmacias.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath.toFile()))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] campos = linea.split(";");
                Farmacia farmacia = new Farmacia();

                for (Paciente paciente : CitaSalud.pacientes) {
                    
                    if (paciente.getDni().contains(campos[0])) {
                        farmacia.setPaciente(paciente);
                        break;
                    }
                }
                
                for (Consultorio consultorio : CitaSalud.consultorios) {
                   
                    if (consultorio.getCita().getCodigo().contains(campos[1])) {
                        farmacia.setConsultorio(consultorio);
                        break;
                    }
                }
                farmacias.add(farmacia);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return farmacias;
    }

    public static void actualizar(List<Farmacia> farmacias) {
        Path filePath = Paths.get("src/CitaSalud/Archivos/farmacias.txt");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath.toFile()))) {
            for (Farmacia farmacia : farmacias) {
                writer.write(farmacia.getPaciente().getDni() + ";");
                writer.write(farmacia.getConsultorio().getCita().getCodigo() + System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
