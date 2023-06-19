/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

/**
 *
 * @author Eusebio
 */
public class Medicamento {
    
    private String nombre;
    private String descripcion;
    private int cantidad = 1;
    
    
    @Override
    public String toString() {
        return nombre + ";" + cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public static List<Medicamento> cargarArchivoDeTexto() {
        List<Medicamento> medicamentos = new ArrayList<>();
        Path filePath = Paths.get("src/CitaSalud/Archivos/medicamentos.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath.toFile()))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] campos = linea.split(";");
                Medicamento medicamento = new Medicamento();

                medicamento.setNombre(campos[0]);
                medicamento.setDescripcion(campos[1]);

                medicamentos.add(medicamento);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return medicamentos;
    }

    public static void actualizar(List<Medicamento> medicamentos) {
        Path filePath = Paths.get("src/CitaSalud/Archivos/medicamentos.txt");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath.toFile()))) {
            for (Medicamento medicamento : medicamentos) {
                writer.write(medicamento.getNombre() + ";");
                writer.write(medicamento.getDescripcion() + System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
