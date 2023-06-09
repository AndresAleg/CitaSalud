/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CitaSalud.pantallas;

import CitaSalud.CitaSalud;
import CitaSalud.Entidades.Camilla;
import CitaSalud.Entidades.Paciente;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ronaldo
 */
public class JPanelCamilla extends javax.swing.JPanel {

    /**
     * Creates new form JPaneCamillal
     */
    public JPanelCamilla() {
        initComponents();
        inicializarTabla();
    }
    
     private void inicializarTabla() {
        DefaultTableModel model = (DefaultTableModel) tbCamilla.getModel();
        model.setRowCount(0);

        for (Camilla camilla : CitaSalud.camillas) {
            Object[] fila = { camilla.getPaciente(),
                camilla.getNumeroDeCamilla(),camilla.getTipo() };
            model.addRow(fila);
        }
    }
     
     private boolean existeCamilla(String numeroDeCamilla) {
        for (Camilla camilla : CitaSalud.camillas) {
            if (camilla.getNumeroDeCamilla().equals(numeroDeCamilla)) {
                return true;
            }
        }
        return false;
    }
     
     private void limpiarControles() {
        txtCelularDePaciente.setText("");
        txtNumeroDeCamilla.setText("");
        txtTipo.setText("");
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegistrar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        Encabezado = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbCamilla = new javax.swing.JTable();
        txtCelularDePaciente = new javax.swing.JTextField();
        lblDescripcion1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNumeroDeCamilla = new javax.swing.JTextField();
        txtTipo = new javax.swing.JTextField();
        lblIconBuscar = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();

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

        lblNombre.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblNombre.setText("CELULAR DE PACIENTE:");

        lblDescripcion.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblDescripcion.setText("NUMERO DE CAMILLA:");

        Encabezado.setBackground(new java.awt.Color(27, 29, 61));
        Encabezado.setPreferredSize(new java.awt.Dimension(199, 99));

        lblTitulo.setFont(new java.awt.Font("Century Gothic", 0, 60)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("CAMILLA");

        javax.swing.GroupLayout EncabezadoLayout = new javax.swing.GroupLayout(Encabezado);
        Encabezado.setLayout(EncabezadoLayout);
        EncabezadoLayout.setHorizontalGroup(
            EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(EncabezadoLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        EncabezadoLayout.setVerticalGroup(
            EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(EncabezadoLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        tbCamilla.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        tbCamilla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "PACIENTE", "NUMERO DE CAMILLA", "TIPO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbCamilla.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tbCamilla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbCamillaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbCamilla);

        lblDescripcion1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblDescripcion1.setText("TIPO:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

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
            .addComponent(Encabezado, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombre)
                            .addComponent(txtCelularDePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblDescripcion)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(lblDescripcion1))
                                .addComponent(txtTipo)
                                .addComponent(txtNumeroDeCamilla, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblIconBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(172, 172, 172)
                    .addComponent(jLabel2)
                    .addContainerGap(1028, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Encabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(lblNombre)
                        .addGap(11, 11, 11)
                        .addComponent(txtCelularDePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblDescripcion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNumeroDeCamilla, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDescripcion1)
                        .addGap(11, 11, 11)
                        .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRegistrar)
                            .addComponent(btnEditar))
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 236, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIconBuscar)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(252, 252, 252))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(412, 412, 412)
                    .addComponent(jLabel2)
                    .addContainerGap(488, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:  
        
        
        String celularDePaciente = txtCelularDePaciente.getText();
        String numeroDeCamilla = txtNumeroDeCamilla.getText();
        String tipo = txtTipo.getText();
        
        //Buscar Paciente por celular
        Paciente pacienteEnecontrado = null;
        for(int i=0;i<CitaSalud.pacientes.size()-1;i++){
            if(CitaSalud.pacientes.get(i).getCelular() == celularDePaciente){
                pacienteEnecontrado = CitaSalud.pacientes.get(i);
                break;
            }
        }
        
        if (numeroDeCamilla.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar una camilla.", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (existeCamilla(numeroDeCamilla)) {
            JOptionPane.showMessageDialog(this, "La Camilla ya existe.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            Camilla nuevaCamilla = new Camilla();
            nuevaCamilla.setPaciente(pacienteEnecontrado);
            nuevaCamilla.setNumeroDeCamilla(numeroDeCamilla);
            nuevaCamilla.setTipo(tipo);

            CitaSalud.camillas.add(nuevaCamilla);
            Camilla.actualizar(CitaSalud.camillas);
            inicializarTabla(); 
            limpiarControles();
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
      int indiceFilaSeleccionada = tbCamilla.getSelectedRow();

        if (indiceFilaSeleccionada >= 0) {
            
            String celularDePaciente = txtCelularDePaciente.getText();
            String camilla = txtNumeroDeCamilla.getText();
            String tipo = txtTipo.getText();
            
            //Buscar paciente por celular
            Paciente paciente = null;
            for(int i=0;i<CitaSalud.pacientes.size()-1;i++){
                if(CitaSalud.pacientes.get(i).getCelular() == celularDePaciente){
                    paciente = CitaSalud.pacientes.get(i);
                    break;
                }
            }

            Camilla camillaSeleccionada = CitaSalud.camillas.get(indiceFilaSeleccionada);
            camillaSeleccionada.setPaciente(paciente);
            camillaSeleccionada.setNumeroDeCamilla(camilla);
            camillaSeleccionada.setTipo(tipo);
            Camilla.actualizar(CitaSalud.camillas);
            inicializarTabla();
            limpiarControles();
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona una fila.", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        String camillaNumero = txtNumeroDeCamilla.getText();

        if (existeCamilla(camillaNumero)) {
            int opcion = JOptionPane.showConfirmDialog(this, "¿Estás seguro de eliminar la camilla?", "Confirmación", JOptionPane.YES_NO_OPTION);

            if (opcion == JOptionPane.YES_OPTION) {
                for (Camilla camilla : CitaSalud.camillas) {
                    if (camilla.getNumeroDeCamilla().equals(camilla)) {
                        CitaSalud.camillas.remove(camilla);
                        break;
                    }
                }
                Camilla.actualizar(CitaSalud.camillas);
                inicializarTabla();
                limpiarControles();
            }
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró la camilla.", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tbCamillaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbCamillaMouseClicked
        // TODO add your handling code here:
        int filaSeleccionada = tbCamilla.getSelectedRow();

        if (filaSeleccionada != -1) {
            Object valor = tbCamilla.getValueAt(filaSeleccionada, 0);

            Camilla camillaEncontrada = null;

            for (Camilla camilla : CitaSalud.camillas) {
                if (camilla.getNumeroDeCamilla().equals(valor)) {
                    camillaEncontrada = camilla;
                    break;
                }
            }
            
            txtCelularDePaciente.setText(camillaEncontrada.getPaciente().getCelular());
            txtNumeroDeCamilla.setText(camillaEncontrada.getNumeroDeCamilla());
            txtTipo.setText(camillaEncontrada.getTipo());
            
        }
    }//GEN-LAST:event_tbCamillaMouseClicked

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        // TODO add your handling code here:
        if (txtBuscar.getText().isEmpty()) {
            inicializarTabla();
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tbCamilla.getModel();
        model.setRowCount(0);

        for (Camilla camilla : CitaSalud.camillas) {
            if (camilla.getNumeroDeCamilla()
                .toLowerCase()
                .contains(txtBuscar.getText()
                    .toLowerCase())) {
                Object[] fila = { camilla.getPaciente(),camilla.getNumeroDeCamilla(), camilla.getTipo() };
                model.addRow(fila);
            }
        }
    }//GEN-LAST:event_txtBuscarKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Encabezado;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblDescripcion1;
    private javax.swing.JLabel lblIconBuscar;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tbCamilla;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCelularDePaciente;
    private javax.swing.JTextField txtNumeroDeCamilla;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}
