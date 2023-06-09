package CitaSalud.pantallas;

import CitaSalud.CitaSalud;
import CitaSalud.Entidades.Paciente;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Andres
 */
public class JPanelPaciente extends javax.swing.JPanel {

    /**
     * Creates new form JPanelPaciente
     */
    public JPanelPaciente() {
        initComponents();
        inicializarTabla();
        limpiarControles();
    }
    
    private void inicializarTabla() {
        DefaultTableModel model = (DefaultTableModel) tbPaciente.getModel();
        model.setRowCount(0);
        
        for (Paciente paciente : CitaSalud.pacientes) {
            Date fechaActual = new Date();
            long diferenciaMilisegundos = fechaActual.getTime() - paciente.getFechaNacimiento().getTime();
            long milisegundosPorAnio = 1000L * 60 * 60 * 24 * 365;
            long edadEnAnios = diferenciaMilisegundos / milisegundosPorAnio;
            
            Object[] fila = {
                paciente.getDni(),
                paciente.getNombre(),
                paciente.getApellido(),
                edadEnAnios,
                paciente.getCelular()
            };
            model.addRow(fila);
        }
        
        TableColumnModel columnModel = tbPaciente.getColumnModel();
        
        columnModel.getColumn(0).setPreferredWidth(70);
        columnModel.getColumn(1).setPreferredWidth(200);
        columnModel.getColumn(2).setPreferredWidth(200);
        columnModel.getColumn(3).setPreferredWidth(70);
        columnModel.getColumn(4).setPreferredWidth(150);
        
        tbPaciente.updateUI();
    }
    
    private boolean verificarControlesVacio() {
        
        String dni = txtDni.getText();
        String nombres = txtNombres.getText();
        String apellidos = txtApellidos.getText();
        String fechaNacimiento = txtFechaNacimiento.getText();
        String celular = txtCelular.getText();
        
        if (dni.isEmpty() ||
                nombres.isEmpty() ||
                apellidos.isEmpty() ||
                fechaNacimiento.isEmpty() ||
                celular.isEmpty()) {
            return true;
        }
        return false;
    }
    
    private boolean existePaciente(String dni) {
        for (Paciente paciente : CitaSalud.pacientes) {
            if (paciente.getDni().equals(dni)) {
                return true;
            }
        }
        return false;
    }
     
    private void limpiarControles() {
        txtDni.setText("");
        txtNombres.setText("");
        txtApellidos.setText("");
        txtCelular.setText("");
        txtFechaNacimiento.setText("dd/MM/yyyy");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Encabezado = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblFechaNacimiento = new javax.swing.JLabel();
        txtFechaNacimiento = new javax.swing.JTextField();
        lblDni = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        lblNombres = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        lblApellidos = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        lblCelular = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPaciente = new javax.swing.JTable();
        lblIconBuscar = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();

        setDoubleBuffered(false);
        setMaximumSize(new java.awt.Dimension(1200, 900));
        setPreferredSize(new java.awt.Dimension(1200, 900));

        Encabezado.setBackground(new java.awt.Color(27, 29, 61));

        lblTitulo.setFont(new java.awt.Font("Century Gothic", 0, 60)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("PACIENTE");

        javax.swing.GroupLayout EncabezadoLayout = new javax.swing.GroupLayout(Encabezado);
        Encabezado.setLayout(EncabezadoLayout);
        EncabezadoLayout.setHorizontalGroup(
            EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        EncabezadoLayout.setVerticalGroup(
            EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
        );

        lblFechaNacimiento.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblFechaNacimiento.setText("FECHA NACIMIENTO:");

        txtFechaNacimiento.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        lblDni.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblDni.setText("DNI:");

        txtDni.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        lblNombres.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblNombres.setText("NOMBRES:");

        txtNombres.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        lblApellidos.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblApellidos.setText("APELLIDOS:");

        txtApellidos.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        lblCelular.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblCelular.setText("CELULAR");

        txtCelular.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        btnRegistrar.setBackground(new java.awt.Color(153, 255, 153));
        btnRegistrar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(255, 255, 204));
        btnEditar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 204, 204));
        btnEliminar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        tbPaciente.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        tbPaciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "DNI", "NOMBRES", "APELLIDOS", "EDAD", "CELULAR"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbPaciente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tbPaciente.getTableHeader().setReorderingAllowed(false);
        tbPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPacienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbPaciente);

        lblIconBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CitaSalud/Imagenes/buscar32.png"))); // NOI18N

        txtBuscar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Encabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(901, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtCelular)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblFechaNacimiento)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtApellidos, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombres, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDni, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNombres, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblApellidos, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDni, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(lblCelular)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblIconBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(41, 41, 41))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Encabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 172, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDni)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNombres)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblApellidos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFechaNacimiento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCelular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblIconBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addComponent(btnRegistrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminar)
                .addGap(147, 147, 147))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
       if (verificarControlesVacio()) {
            JOptionPane.showMessageDialog(this, "Debe completar los campos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String dni = txtDni.getText();
        if (existePaciente(dni)) {
            JOptionPane.showMessageDialog(this, "El DNI del paciente ya existe.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Paciente nuevoPaciente = new Paciente();
        nuevoPaciente.setDni(dni);
        nuevoPaciente.setNombre(txtNombres.getText());
        nuevoPaciente.setApellido(txtApellidos.getText());
        nuevoPaciente.setCelular(txtCelular.getText());
        
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            nuevoPaciente.setFechaNacimiento(dateFormat.parse(txtFechaNacimiento.getText()));
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "El formato de fecha es incorrecto.", "Error de formato", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        CitaSalud.pacientes.add(nuevoPaciente);
        Paciente.actualizar(CitaSalud.pacientes);
        inicializarTabla();
        limpiarControles();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        if (verificarControlesVacio()) {
            JOptionPane.showMessageDialog(this, "Debe completar los campos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        int indiceFilaSeleccionada = tbPaciente.getSelectedRow();
        
        if (indiceFilaSeleccionada >= 0) {
            Paciente pacienteSeleccionado = CitaSalud.pacientes.get(indiceFilaSeleccionada);
            pacienteSeleccionado.setNombre(txtNombres.getText());
            pacienteSeleccionado.setApellido(txtApellidos.getText());
            pacienteSeleccionado.setCelular(txtCelular.getText());
            
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                pacienteSeleccionado.setFechaNacimiento(dateFormat.parse(txtFechaNacimiento.getText()));
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(null, "El formato de fecha es incorrecto.", "Error de formato", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            Paciente.actualizar(CitaSalud.pacientes);
            inicializarTabla();
            limpiarControles();
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona una fila.", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        String dni = txtDni.getText();
        
        if (existePaciente(dni)) {
            int opcion = JOptionPane.showConfirmDialog(this, "¿Estás seguro de eliminar el paciente?", "Confirmación", JOptionPane.YES_NO_OPTION);
            
            if (opcion == JOptionPane.YES_OPTION) {
                for (Paciente paciente :CitaSalud.pacientes) {
                    if (paciente.getDni().equals(dni)) {
                        CitaSalud.pacientes.remove(paciente);
                        break;
                    }
                }
                
                Paciente.actualizar(CitaSalud.pacientes);
                inicializarTabla();
                limpiarControles();
            }
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró el paciente", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tbPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPacienteMouseClicked
        // TODO add your handling code here:
        int filaSeleccionada = tbPaciente.getSelectedRow();
        
        if (filaSeleccionada != -1) {
            Object valor = tbPaciente.getValueAt(filaSeleccionada, 0);
            
            for (Paciente paciente : CitaSalud.pacientes) {
                if (paciente.getDni().equals(valor)) {
                    
                    txtDni.setText(paciente.getDni());
                    txtNombres.setText(paciente.getNombre());
                    txtApellidos.setText(paciente.getApellido());
                    txtCelular.setText(paciente.getCelular());
                    
                    String fechaString = paciente.getFechaNacimiento().toString();
                    SimpleDateFormat formatoEntrada = new SimpleDateFormat("E MMM dd hh:mm:ss z yyyy", Locale.ENGLISH);
                    try {
                        Date fechaFormato = formatoEntrada.parse(fechaString);
                        SimpleDateFormat formatoSalida = new SimpleDateFormat("dd/MM/yyyy");
                        txtFechaNacimiento.setText(formatoSalida.format(fechaFormato));
                    } catch (ParseException ex) {
                        java.util.logging.Logger.getLogger(JPanelMedico.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }//GEN-LAST:event_tbPacienteMouseClicked

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        // TODO add your handling code here:
        if (txtBuscar.getText().isEmpty()) {
            inicializarTabla();
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tbPaciente.getModel();
        model.setRowCount(0);

        for (Paciente paciente : CitaSalud.pacientes) {
            if (paciente.getDni().contains(txtBuscar.getText())) {
                Date fechaActual = new Date();
                long diferenciaMilisegundos = fechaActual.getTime() - paciente.getFechaNacimiento().getTime();
                long milisegundosPorAnio = 1000L * 60 * 60 * 24 * 365;
                long edadEnAnios = diferenciaMilisegundos / milisegundosPorAnio;

                Object[] fila = {
                    paciente.getDni(),
                    paciente.getNombre(),
                    paciente.getApellido(),
                    edadEnAnios,
                    paciente.getCelular()
                };
                model.addRow(fila);
            }
        }
    }//GEN-LAST:event_txtBuscarKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Encabezado;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblDni;
    private javax.swing.JLabel lblFechaNacimiento;
    private javax.swing.JLabel lblIconBuscar;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tbPaciente;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtFechaNacimiento;
    private javax.swing.JTextField txtNombres;
    // End of variables declaration//GEN-END:variables
}
