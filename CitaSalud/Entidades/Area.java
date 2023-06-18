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
 * @author Andres
 */
public class Area {
    private String nombre;
    private String descripcion;

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public static List<Area> cargarArchivoDeTexto() {
        List<Area> areas = new ArrayList<>();
        Path filePath = Paths.get("src/CitaSalud/Archivos/areas.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath.toFile()))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] campos = linea.split(";");
                Area area = new Area();

                area.setNombre(campos[0]);
                area.setDescripcion(campos[1]);

                areas.add(area);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return areas;
    }

    public static void actualizar(List<Area> areas) {
        Path filePath = Paths.get("src/CitaSalud/Archivos/areas.txt");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath.toFile()))) {
            for (Area area : areas) {
                writer.write(area.getNombre() + ";");
                writer.write(area.getDescripcion() + System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
