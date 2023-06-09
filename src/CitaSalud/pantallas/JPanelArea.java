package CitaSalud.pantallas;

import CitaSalud.CitaSalud;
import CitaSalud.Entidades.Area;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Andres
 */
public class JPanelArea extends javax.swing.JPanel {

    /** Creates new form JPanelArea */
    public JPanelArea() {
        initComponents();
        inicializarTabla();
    }
    
    private void inicializarTabla() {
        DefaultTableModel model = (DefaultTableModel) tbArea.getModel();
        model.setRowCount(0);

        for (Area area : CitaSalud.areas) {
            Object[] fila = { area.getNombre(), area.getDescripcion() };
            model.addRow(fila);
        }
    }
    
    private boolean existeArea(String nombre) {
        for (Area area : CitaSalud.areas) {
            if (area.getNombre().equals(nombre)) {
                return true;
            }
        }
        return false;
    }
    
    private void limpiarControles() {
        txtNombre.setText("");
        txaDescripcion.setText("");
    }
    

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Encabezado = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblDescripcion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaDescripcion = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbArea = new javax.swing.JTable();
        btnRegistrar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        lblIconBuscar = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1200, 900));
        setMinimumSize(new java.awt.Dimension(1200, 900));
        setPreferredSize(new java.awt.Dimension(1200, 900));

        Encabezado.setBackground(new java.awt.Color(27, 29, 61));

        lblTitulo.setFont(new java.awt.Font("Century Gothic", 0, 60)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("ÁREA");

        javax.swing.GroupLayout EncabezadoLayout = new javax.swing.GroupLayout(Encabezado);
        Encabezado.setLayout(EncabezadoLayout);
        EncabezadoLayout.setHorizontalGroup(
            EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        EncabezadoLayout.setVerticalGroup(
            EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EncabezadoLayout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        lblNombre.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblNombre.setText("NOMBRE:");

        txtNombre.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        lblDescripcion.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblDescripcion.setText("DESCRIPCIÓN:");

        txaDescripcion.setColumns(20);
        txaDescripcion.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txaDescripcion.setRows(5);
        jScrollPane1.setViewportView(txaDescripcion);

        tbArea.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        tbArea.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "NOMBRE", "DESCRIPCIÓN"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbArea.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tbArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbAreaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbArea);

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

        txtBuscar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        lblIconBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CitaSalud/Imagenes/buscar32.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Encabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblIconBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(135, 135, 135)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1)
                                    .addComponent(lblDescripcion)
                                    .addComponent(lblNombre)
                                    .addComponent(txtNombre))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(74, 74, 74)
                                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(125, 125, 125)))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(102, 102, 102))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Encabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(lblNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblDescripcion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRegistrar)
                            .addComponent(btnEditar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar)
                        .addGap(0, 223, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblIconBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(231, 231, 231))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        
        String nombre = txtNombre.getText();
        String descripcion = txaDescripcion.getText();

        if (nombre.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un nombre.", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (existeArea(nombre)) {
            JOptionPane.showMessageDialog(this, "El área ya existe.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            Area nuevoArea = new Area();
            nuevoArea.setNombre(nombre);
            nuevoArea.setDescripcion(descripcion);

            CitaSalud.areas.add(nuevoArea);
            Area.actualizar(CitaSalud.areas);
            inicializarTabla();
            limpiarControles();
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        int indiceFilaSeleccionada = tbArea.getSelectedRow();
        
        if (indiceFilaSeleccionada >= 0) {
            
            String nombre = txtNombre.getText();
            String descripcion = txaDescripcion.getText();
            
            Area areaSeleccionada = CitaSalud.areas.get(indiceFilaSeleccionada);
            areaSeleccionada.setNombre(nombre);
            areaSeleccionada.setDescripcion(descripcion);
            Area.actualizar(CitaSalud.areas);
            inicializarTabla();
            limpiarControles();
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona una fila.", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        String nombre = txtNombre.getText();

       if (existeArea(nombre)) {
           int opcion = JOptionPane.showConfirmDialog(this, "¿Estás seguro de eliminar el área?", "Confirmación", JOptionPane.YES_NO_OPTION);

           if (opcion == JOptionPane.YES_OPTION) {
               for (Area area : CitaSalud.areas) {
                   if (area.getNombre().equals(nombre)) {
                       CitaSalud.areas.remove(area);
                       break;
                   }
               }
               Area.actualizar(CitaSalud.areas);
               inicializarTabla();
               limpiarControles();
           }
       } else {
           JOptionPane.showMessageDialog(this, "No se encontró el área.", "Información", JOptionPane.INFORMATION_MESSAGE);
       }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tbAreaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbAreaMouseClicked
        // TODO add your handling code here:
        int filaSeleccionada = tbArea.getSelectedRow();
        
        if (filaSeleccionada != -1) {
            Object valor = tbArea.getValueAt(filaSeleccionada, 0);
            
            Area areaEncontrada = null;
            
            for (Area area : CitaSalud.areas) {
                if (area.getNombre().equals(valor)) {
                    areaEncontrada = area;
                    break;
                }
            }
            
            txtNombre.setText(areaEncontrada.getNombre());
            txaDescripcion.setText(areaEncontrada.getDescripcion());
        }
    }//GEN-LAST:event_tbAreaMouseClicked

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        // TODO add your handling code here:
        if (txtBuscar.getText().isEmpty()) {
            inicializarTabla();
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tbArea.getModel();
        model.setRowCount(0);
        
        for (Area area : CitaSalud.areas) {
            if (area.getNombre()
                    .toLowerCase()
                    .contains(txtBuscar.getText()
                        .toLowerCase())) {
                Object[] fila = { area.getNombre(), area.getDescripcion() };
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblIconBuscar;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tbArea;
    private javax.swing.JTextArea txaDescripcion;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

}
