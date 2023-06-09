package CitaSalud.pantallas;

import CitaSalud.CitaSalud;
import CitaSalud.Entidades.Area;
import CitaSalud.Entidades.Medico;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Andres
 */
public class JPanelMedico extends javax.swing.JPanel {

    /**
     * Creates new form JPanelMedico
     */
    public JPanelMedico() {
        initComponents();
        inicializarComboBox();
        inicializarTabla();
        limpiarControles();
    }
    
    private void inicializarComboBox() {
        cbArea.removeAllItems();
        
        for (Area area : CitaSalud.areas) {
            cbArea.addItem(area.getNombre());
        }
    }
    
    private void inicializarTabla() {
        DefaultTableModel model = (DefaultTableModel) tbMedico.getModel();
        model.setRowCount(0);
        
        for (Medico medico : CitaSalud.medicos) {
            Date fechaActual = new Date();
            long diferenciaMilisegundos = fechaActual.getTime() - medico.getFechaNacimiento().getTime();
            long milisegundosPorAnio = 1000L * 60 * 60 * 24 * 365;
            long edadEnAnios = diferenciaMilisegundos / milisegundosPorAnio;

            Object[] fila = { 
                medico.getDni(), 
                medico.getNombre(), 
                medico.getApellido(),
                medico.getEmail(),
                edadEnAnios
            };
            
            model.addRow(fila);
        }
        
        TableColumnModel columnModel = tbMedico.getColumnModel();

        columnModel.getColumn(0).setPreferredWidth(70);
        columnModel.getColumn(1).setPreferredWidth(150);
        columnModel.getColumn(2).setPreferredWidth(150);
        columnModel.getColumn(3).setPreferredWidth(250);
        columnModel.getColumn(4).setPreferredWidth(70);

        tbMedico.updateUI();
    }
    
    private boolean verificarControlesVacio() {

        String dni = txtDni.getText();
        String nombres = txtNombres.getText();
        String apellidos = txtApellidos.getText();
        String fechaNacimiento = txtFechaNacimiento.getText();
        String email = txtEmail.getText();
        
        
        if (dni.isEmpty() || 
                nombres.isEmpty() ||
                apellidos.isEmpty() ||
                fechaNacimiento.isEmpty() ||
                email.isEmpty()) {
            return true;
        }
        return false;
    }
    
    private boolean existeMedico(String dni) {
        for (Medico medico : CitaSalud.medicos) {
            if (medico.getDni().equals(dni)) {
                return true;
            }
        }
        return false;
    }
    
    private void limpiarControles() {
        txtDni.setText("");
        txtNombres.setText("");
        txtApellidos.setText("");
        txtEmail.setText("");
        txtFechaNacimiento.setText("dd/MM/yyyy");
        cbArea.getItemAt(1);
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
        lblDni = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        lblNombres = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        lblApellidos = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        lblFechaNacimiento = new javax.swing.JLabel();
        txtFechaNacimiento = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblArea = new javax.swing.JLabel();
        cbArea = new javax.swing.JComboBox<>();
        btnRegistrar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbMedico = new javax.swing.JTable();
        lblIconBuscar = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();

        setMaximumSize(new java.awt.Dimension(1200, 900));
        setMinimumSize(new java.awt.Dimension(1200, 900));
        setPreferredSize(new java.awt.Dimension(1200, 900));

        Encabezado.setBackground(new java.awt.Color(27, 29, 61));

        lblTitulo.setFont(new java.awt.Font("Century Gothic", 0, 60)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("MÉDICO");

        javax.swing.GroupLayout EncabezadoLayout = new javax.swing.GroupLayout(Encabezado);
        Encabezado.setLayout(EncabezadoLayout);
        EncabezadoLayout.setHorizontalGroup(
            EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        EncabezadoLayout.setVerticalGroup(
            EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
        );

        lblDni.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblDni.setText("DNI:");

        txtDni.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        lblNombres.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblNombres.setText("NOMBRES:");

        txtNombres.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        lblApellidos.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblApellidos.setText("APELLIDOS:");

        txtApellidos.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        lblFechaNacimiento.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblFechaNacimiento.setText("FECHA NACIMIENTO:");

        txtFechaNacimiento.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        lblEmail.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblEmail.setText("EMAIL:");

        txtEmail.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        lblArea.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblArea.setText("AREA:");

        cbArea.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        cbArea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAreaActionPerformed(evt);
            }
        });

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

        tbMedico.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        tbMedico.setModel(new javax.swing.table.DefaultTableModel(
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
                "DNI", "NOMBRES", "APELLIDOS", "EMAIL", "EDAD"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbMedico.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tbMedico.getTableHeader().setReorderingAllowed(false);
        tbMedico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbMedicoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbMedico);

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
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombres)
                            .addComponent(txtApellidos)
                            .addComponent(txtFechaNacimiento)
                            .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbArea, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDni)
                                    .addComponent(lblNombres)
                                    .addComponent(lblApellidos)
                                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblArea))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(72, 72, 72))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFechaNacimiento)
                            .addComponent(lblEmail))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblIconBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Encabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDni)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblIconBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
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
                        .addComponent(lblEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblArea)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnRegistrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminar)
                .addContainerGap(138, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        if (verificarControlesVacio()) {
            JOptionPane.showMessageDialog(this, "Debe completar los campos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String dni = txtDni.getText();
        if (existeMedico(dni)) {
            JOptionPane.showMessageDialog(this, "El DNI del médico ya existe.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Medico nuevoMedico = new Medico();
        nuevoMedico.setDni(dni);
        nuevoMedico.setNombre(txtNombres.getText());
        nuevoMedico.setApellido(txtApellidos.getText());
        nuevoMedico.setEmail(txtEmail.getText());
        
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            nuevoMedico.setFechaNacimiento(dateFormat.parse(txtFechaNacimiento.getText()));
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "El formato de fecha es incorrecto.", "Error de formato", JOptionPane.ERROR_MESSAGE);
            return;
        }
 
        String nombreArea = (String) cbArea.getSelectedItem();
        for (Area area : CitaSalud.areas) {
            if (area.getNombre().equals(nombreArea)) {
                nuevoMedico.getArea().add(area);
                break;
            }
        }

        CitaSalud.medicos.add(nuevoMedico);
        Medico.actualizar(CitaSalud.medicos);
        inicializarTabla();
        limpiarControles();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        if (verificarControlesVacio()) {
            JOptionPane.showMessageDialog(this, "Debe completar los campos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        int indiceFilaSeleccionada = tbMedico.getSelectedRow();
        
        if (indiceFilaSeleccionada >= 0) {
            
            Medico medicoSeleccionado = CitaSalud.medicos.get(indiceFilaSeleccionada);
            medicoSeleccionado.setNombre(txtNombres.getText());
            medicoSeleccionado.setApellido(txtApellidos.getText());
            medicoSeleccionado.setEmail(txtEmail.getText());
            
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                medicoSeleccionado.setFechaNacimiento(dateFormat.parse(txtFechaNacimiento.getText()));
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(null, "El formato de fecha es incorrecto.", "Error de formato", JOptionPane.ERROR_MESSAGE);
                return;
            }
            Medico.actualizar(CitaSalud.medicos);
            inicializarTabla();
            limpiarControles();
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona una fila.", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        String dni = txtDni.getText();
        
        if (existeMedico(dni)) {
            int opcion = JOptionPane.showConfirmDialog(this, "¿Estás seguro de eliminar el médico?", "Confirmación", JOptionPane.YES_NO_OPTION);
            
            if (opcion == JOptionPane.YES_OPTION) {
                for (Medico medico : CitaSalud.medicos) {
                    if (medico.getDni().equals(dni)) {
                        CitaSalud.medicos.remove(medico);
                        break;
                    }
                }
                Medico.actualizar(CitaSalud.medicos);
                inicializarTabla();
                limpiarControles();
            }
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró el médico", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tbMedicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbMedicoMouseClicked
        // TODO add your handling code here:
        
        int filaSeleccionada = tbMedico.getSelectedRow();
        
        if (filaSeleccionada != -1) {
            Object valor = tbMedico.getValueAt(filaSeleccionada, 0);
            
            for (Medico medico: CitaSalud.medicos) {
                if (medico.getDni().equals(valor)) {

                    txtDni.setText(medico.getDni());
                    txtNombres.setText(medico.getNombre());
                    txtApellidos.setText(medico.getApellido());
                    txtEmail.setText(medico.getEmail());
                    
                    String fechaString = medico.getFechaNacimiento().toString();
                    SimpleDateFormat formatoEntrada = new SimpleDateFormat("E MMM dd hh:mm:ss z yyyy", Locale.ENGLISH);
                    try {
                        Date fechaFormato = formatoEntrada.parse(fechaString);
                        SimpleDateFormat formatoSalida = new SimpleDateFormat("dd/MM/yyyy");
                        txtFechaNacimiento.setText(formatoSalida.format(fechaFormato));
                    } catch (ParseException ex) {
                        Logger.getLogger(JPanelMedico.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }//GEN-LAST:event_tbMedicoMouseClicked

    private void cbAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAreaActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        // TODO add your handling code here:
        if (txtBuscar.getText().isEmpty()) {
            inicializarTabla();
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tbMedico.getModel();
        model.setRowCount(0);

        for (Medico medico : CitaSalud.medicos) {
            if (medico.getDni()
                .contains(txtBuscar.getText())) {
                    Date fechaActual = new Date();
                    long diferenciaMilisegundos = fechaActual.getTime() - medico.getFechaNacimiento().getTime();
                    long milisegundosPorAnio = 1000L * 60 * 60 * 24 * 365;
                    long edadEnAnios = diferenciaMilisegundos / milisegundosPorAnio;

                    Object[] fila = { 
                        medico.getDni(), 
                        medico.getNombre(), 
                        medico.getApellido(),
                        medico.getEmail(),
                        edadEnAnios
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
    private javax.swing.JComboBox<String> cbArea;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblArea;
    private javax.swing.JLabel lblDni;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFechaNacimiento;
    private javax.swing.JLabel lblIconBuscar;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tbMedico;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFechaNacimiento;
    private javax.swing.JTextField txtNombres;
    // End of variables declaration//GEN-END:variables
}
