package CitaSalud.pantallas;

import CitaSalud.CitaSalud;
import CitaSalud.Entidades.Cita;
import CitaSalud.Entidades.Consultorio;
import CitaSalud.Entidades.Medico;
import CitaSalud.Entidades.Paciente;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Andres
 */
public class JPanelHistorialConsultorio extends javax.swing.JPanel {

    /**
     * Creates new form JPanelHistorialConsultorio
     */
    public JPanelHistorialConsultorio() {
        initComponents();
        inicializarTabla();
    }

    private void inicializarTabla() {
        DefaultTableModel model = (DefaultTableModel) tbConsultorio.getModel();
        model.setRowCount(0);

        for (Consultorio consultorio : CitaSalud.consultorios) {

            Medico medico = consultorio.getCita().getMedico();
            Paciente paciente = consultorio.getCita().getPaciente();
            Cita cita = consultorio.getCita();

            Object[] fila = {
                medico.getNombre() + " " + medico.getApellido(),
                cita.getFecha(),
                consultorio.getMotivo(),
                paciente.getNombre() + " " + paciente.getApellido()
            };

            model.addRow(fila);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Encabezado = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        lblDniPaciente = new javax.swing.JLabel();
        lblIconBuscar = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbConsultorio = new javax.swing.JTable();
        lblDatosPaciente = new javax.swing.JLabel();
        pDatosPaciente = new javax.swing.JPanel();
        txtDni = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        txtFechaNacimiento = new javax.swing.JTextField();
        lblSintoma = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaSintoma = new javax.swing.JTextArea();
        lblDiagnostico = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txaDiagnostico = new javax.swing.JTextArea();
        lblMedicamentos = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbMedicamento = new javax.swing.JTable();

        setMaximumSize(new java.awt.Dimension(1200, 900));
        setMinimumSize(new java.awt.Dimension(1200, 900));

        Encabezado.setBackground(new java.awt.Color(27, 29, 61));

        lblTitulo.setFont(new java.awt.Font("Century Gothic", 0, 60)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("HISTORIAL CONSULTORIO");

        javax.swing.GroupLayout EncabezadoLayout = new javax.swing.GroupLayout(Encabezado);
        Encabezado.setLayout(EncabezadoLayout);
        EncabezadoLayout.setHorizontalGroup(
            EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        EncabezadoLayout.setVerticalGroup(
            EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EncabezadoLayout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        txtBuscar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        lblDniPaciente.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblDniPaciente.setText("DNI PACIENTE");

        lblIconBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CitaSalud/Imagenes/buscar32.png"))); // NOI18N

        btnBuscar.setBackground(new java.awt.Color(153, 204, 255));
        btnBuscar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        tbConsultorio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Médico", "Fecha", "Consulta", "Paciente"
            }
        ));
        tbConsultorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbConsultorioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbConsultorio);

        lblDatosPaciente.setBackground(new java.awt.Color(204, 204, 204));
        lblDatosPaciente.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblDatosPaciente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDatosPaciente.setText("DATOS PACIENTE:");
        lblDatosPaciente.setToolTipText("");
        lblDatosPaciente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblDatosPaciente.setOpaque(true);

        pDatosPaciente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        txtDni.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtDni.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDni.setText("[dni]");

        txtNombre.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombre.setText("[nombre]");

        txtApellido.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtApellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtApellido.setText("[apellido]");

        txtCelular.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtCelular.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCelular.setText("[celular]");

        txtFechaNacimiento.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtFechaNacimiento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFechaNacimiento.setText("[F. Nac.]");

        javax.swing.GroupLayout pDatosPacienteLayout = new javax.swing.GroupLayout(pDatosPaciente);
        pDatosPaciente.setLayout(pDatosPacienteLayout);
        pDatosPacienteLayout.setHorizontalGroup(
            pDatosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatosPacienteLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(pDatosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                    .addComponent(txtDni)
                    .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(37, 37, 37)
                .addGroup(pDatosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(txtCelular))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pDatosPacienteLayout.setVerticalGroup(
            pDatosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatosPacienteLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pDatosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pDatosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        lblSintoma.setBackground(new java.awt.Color(204, 204, 204));
        lblSintoma.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblSintoma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSintoma.setText("SINTOMA");
        lblSintoma.setToolTipText("");
        lblSintoma.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblSintoma.setOpaque(true);

        txaSintoma.setColumns(20);
        txaSintoma.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txaSintoma.setRows(5);
        jScrollPane2.setViewportView(txaSintoma);

        lblDiagnostico.setBackground(new java.awt.Color(204, 204, 204));
        lblDiagnostico.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblDiagnostico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDiagnostico.setText("DIAGNOSTICO");
        lblDiagnostico.setToolTipText("");
        lblDiagnostico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblDiagnostico.setOpaque(true);

        txaDiagnostico.setColumns(20);
        txaDiagnostico.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txaDiagnostico.setRows(5);
        jScrollPane3.setViewportView(txaDiagnostico);

        lblMedicamentos.setBackground(new java.awt.Color(204, 204, 204));
        lblMedicamentos.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblMedicamentos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMedicamentos.setText("MEDICAMENTOS");
        lblMedicamentos.setToolTipText("");
        lblMedicamentos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblMedicamentos.setOpaque(true);

        tbMedicamento.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        tbMedicamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tbMedicamento);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Encabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblIconBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnBuscar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDniPaciente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDatosPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pDatosPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(95, 95, 95))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2)
                            .addComponent(lblSintoma, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3)
                            .addComponent(lblDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMedicamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(79, 79, 79))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Encabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(lblDniPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnBuscar))
                            .addComponent(lblIconBuscar))
                        .addGap(70, 70, 70)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(37, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(lblDatosPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(pDatosPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblSintoma, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblMedicamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:

        if (txtBuscar.getText().isEmpty()) {
            inicializarTabla();
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tbConsultorio.getModel();
        model.setRowCount(0);

        for (Consultorio consultorio : CitaSalud.consultorios) {
            if (consultorio.getCita().getPaciente().getDni().
                    equals(txtBuscar.getText())) {

                Medico medico = consultorio.getCita().getMedico();
                Paciente paciente = consultorio.getCita().getPaciente();
                Cita cita = consultorio.getCita();

                Object[] fila = {
                    medico.getNombre() + " " + medico.getApellido(),
                    cita.getFecha(),
                    consultorio.getMotivo(),
                    paciente.getNombre() + " " + paciente.getApellido()
                };
                
                model.addRow(fila);
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tbConsultorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbConsultorioMouseClicked
        // TODO add your handling code here:
        
        int filaSeleccionada = tbConsultorio.getSelectedRow();
        
        if (filaSeleccionada != -1) {
            
            
        } 
    }//GEN-LAST:event_tbConsultorioMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Encabezado;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblDatosPaciente;
    private javax.swing.JLabel lblDiagnostico;
    private javax.swing.JLabel lblDniPaciente;
    private javax.swing.JLabel lblIconBuscar;
    private javax.swing.JLabel lblMedicamentos;
    private javax.swing.JLabel lblSintoma;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pDatosPaciente;
    private javax.swing.JTable tbConsultorio;
    private javax.swing.JTable tbMedicamento;
    private javax.swing.JTextArea txaDiagnostico;
    private javax.swing.JTextArea txaSintoma;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtFechaNacimiento;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
