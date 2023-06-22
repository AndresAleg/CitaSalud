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


public class Consultorio {
   private Cita cita;
   private String motivo;
   private String sintoma;
   private String diagnostico;
   private List<Medicamento> medicamentos;

    /**
     * @return the cita
     */
    public Cita getCita() {
        return cita;
    }

    /**
     * @param cita the cita to set
     */
    public void setCita(Cita cita) {
        this.cita = cita;
    }

    /**
     * @return the motivo
     */
    public String getMotivo() {
        return motivo;
    }

    /**
     * @param motivo the motivo to set
     */
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    /**
     * @return the sintoma
     */
    public String getSintoma() {
        return sintoma;
    }

    /**
     * @param sintoma the sintoma to set
     */
    public void setSintoma(String sintoma) {
        this.sintoma = sintoma;
    }

    /**
     * @return the diagnostico
     */
    public String getDiagnostico() {
        return diagnostico;
    }

    /**
     * @param diagnostico the diagnostico to set
     */
    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public List<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(List<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }
    
    public static List<Consultorio> cargarArchivoDeTexto() {
        List<Consultorio> consultorios = new ArrayList<>();
        Path filePath = Paths.get("src/CitaSalud/Archivos/consultorio.txt");
        
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath.toFile()))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] campos = linea.split(";");
                Consultorio consultorio = new Consultorio();

                for (Cita cita : CitaSalud.citas) {
                    if (cita.getCodigo().equals(campos[0])){
                        consultorio.setCita(cita);
                    }
                } 
                
                consultorio.setMotivo(campos[1]);
                consultorio.setSintoma(campos[2]);
                consultorio.setDiagnostico(campos[3]);

                List<Medicamento> medicamentos = new ArrayList<>();
                for (int i = 4; i < campos.length; i++) {
                    
                    String[] medicamentoData = campos[i].split(",");
                    String nombre = medicamentoData[0];
                    int cantidad = Integer.parseInt(medicamentoData[1]);

                    Medicamento medicamento = new Medicamento();
                    medicamento.setNombre(nombre);
                    medicamento.setCantidad(cantidad);
                    medicamentos.add(medicamento);
                }

                consultorio.setMedicamentos(medicamentos);
                consultorios.add(consultorio);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
   
       return consultorios;
    }
    
    public static void actualizar(List<Consultorio> consultorios) {
        Path filePath = Paths.get("src/CitaSalud/Archivos/consultorio.txt");
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath.toFile()))) {
            for (Consultorio consultorio : consultorios) {
                writer.write(consultorio.getCita().getCodigo() + ";");
                writer.write(consultorio.getMotivo() + ";");
                writer.write(consultorio.getSintoma() + ";");
                writer.write(consultorio.getDiagnostico() + ";");
                
                List<Medicamento> medicamentos = consultorio.getMedicamentos();
                for (int i = 0; i < medicamentos.size(); i++) {
                    Medicamento medicamento = medicamentos.get(i);
                    writer.write(medicamento.toString());

                    if (i < medicamentos.size() - 1) {
                        writer.write(";");
                    }
                }
                writer.write(System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
