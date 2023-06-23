/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CitaSalud.pantallas;


import CitaSalud.CitaSalud;
import CitaSalud.Entidades.Consultorio;
import CitaSalud.Entidades.Farmacia;
import CitaSalud.Entidades.Medicamento;
import CitaSalud.Entidades.Paciente;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;






/**
 *
 * @author USER
 */
public class JPanelFarmacia extends javax.swing.JPanel {

    Paciente pacienteEncontrado;
    Consultorio consultorioEncontrado;

    /**
     * Creates new form JPanelFarmacia
     */
    public JPanelFarmacia() {
        initComponents();
        inicializarTabla();
    }
      
    private void inicializarTabla() {
        
        DefaultTableModel model = (DefaultTableModel) tbMedicamento.getModel();
        model.setRowCount(0);
    }
    
    private void limpiarControles() {
        pacienteEncontrado = null;
        consultorioEncontrado = null;
        
        txtBuscarPaciente.setText("");
        txtBuscarConsultorio.setText("");
        
        
        txtDni.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtEdad.setText("");
        inicializarTabla();
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
        Encabezado = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblConsultorio = new javax.swing.JLabel();
        lblDatosPaciente = new javax.swing.JLabel();
        pDatosPaciente = new javax.swing.JPanel();
        txtDni = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnBuscarPaciente = new javax.swing.JButton();
        btnBuscarConsultorio = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbMedicamento = new javax.swing.JTable();
        lblMedicamentos = new javax.swing.JLabel();
        txtBuscarConsultorio = new javax.swing.JTextField();
        txtBuscarPaciente = new javax.swing.JTextField();

        setLayout(null);

        btnRegistrar.setBackground(new java.awt.Color(153, 255, 153));
        btnRegistrar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        add(btnRegistrar);
        btnRegistrar.setBounds(200, 640, 140, 31);

        Encabezado.setBackground(new java.awt.Color(27, 29, 61));
        Encabezado.setMaximumSize(new java.awt.Dimension(199, 99));
        Encabezado.setMinimumSize(new java.awt.Dimension(199, 99));
        Encabezado.setPreferredSize(new java.awt.Dimension(199, 99));

        lblTitulo.setFont(new java.awt.Font("Century Gothic", 0, 60)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("FARMACIA");

        javax.swing.GroupLayout EncabezadoLayout = new javax.swing.GroupLayout(Encabezado);
        Encabezado.setLayout(EncabezadoLayout);
        EncabezadoLayout.setHorizontalGroup(
            EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EncabezadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 1300, Short.MAX_VALUE)
                .addContainerGap())
        );
        EncabezadoLayout.setVerticalGroup(
            EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EncabezadoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        add(Encabezado);
        Encabezado.setBounds(0, 0, 1320, 99);

        lblNombre.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblNombre.setText("PACIENTE:");
        add(lblNombre);
        lblNombre.setBounds(90, 320, 92, 23);

        lblConsultorio.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblConsultorio.setText("CONSULTORIO:");
        add(lblConsultorio);
        lblConsultorio.setBounds(90, 390, 134, 23);

        lblDatosPaciente.setBackground(new java.awt.Color(204, 204, 204));
        lblDatosPaciente.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblDatosPaciente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDatosPaciente.setText("DATOS PACIENTE:");
        lblDatosPaciente.setToolTipText("");
        lblDatosPaciente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblDatosPaciente.setOpaque(true);
        add(lblDatosPaciente);
        lblDatosPaciente.setBounds(540, 180, 640, 20);

        pDatosPaciente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        txtDni.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        txtNombre.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        txtEdad.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        txtApellido.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel1.setText("DNI:");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setText("APELLIDO:");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel4.setText("NOMBRE:");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel5.setText("EDAD:");

        javax.swing.GroupLayout pDatosPacienteLayout = new javax.swing.GroupLayout(pDatosPaciente);
        pDatosPaciente.setLayout(pDatosPacienteLayout);
        pDatosPacienteLayout.setHorizontalGroup(
            pDatosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatosPacienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDatosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(pDatosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(pDatosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(pDatosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );
        pDatosPacienteLayout.setVerticalGroup(
            pDatosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pDatosPacienteLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(pDatosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGap(10, 10, 10)
                .addGroup(pDatosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        add(pDatosPaciente);
        pDatosPaciente.setBounds(540, 200, 640, 143);

        btnBuscarPaciente.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnBuscarPaciente.setText("Buscar");
        btnBuscarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPacienteActionPerformed(evt);
            }
        });
        add(btnBuscarPaciente);
        btnBuscarPaciente.setBounds(330, 350, 107, 31);

        btnBuscarConsultorio.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnBuscarConsultorio.setText("Buscar");
        btnBuscarConsultorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarConsultorioActionPerformed(evt);
            }
        });
        add(btnBuscarConsultorio);
        btnBuscarConsultorio.setBounds(330, 420, 107, 31);

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

        add(jScrollPane4);
        jScrollPane4.setBounds(580, 430, 530, 400);

        lblMedicamentos.setBackground(new java.awt.Color(204, 204, 204));
        lblMedicamentos.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblMedicamentos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMedicamentos.setText("MEDICAMENTOS");
        lblMedicamentos.setToolTipText("");
        lblMedicamentos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblMedicamentos.setOpaque(true);
        add(lblMedicamentos);
        lblMedicamentos.setBounds(580, 410, 530, 20);

        txtBuscarConsultorio.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        add(txtBuscarConsultorio);
        txtBuscarConsultorio.setBounds(90, 420, 201, 31);

        txtBuscarPaciente.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        add(txtBuscarPaciente);
        txtBuscarPaciente.setBounds(90, 350, 201, 29);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        
        if (pacienteEncontrado != null && consultorioEncontrado != null) {
            
            for (Farmacia farmacia : CitaSalud.farmacias) {
                if (farmacia.getPaciente().getDni()
                        .equals(pacienteEncontrado.getDni())&&
                        farmacia.getConsultorio().getCita().getCodigo()
                                .equals(consultorioEncontrado.getCita().getCodigo())) {
                    JOptionPane.showMessageDialog(this, "Esta farmacia ya ha estado registrado antes.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
            
            Farmacia nuevaFarmacia = new Farmacia();
            nuevaFarmacia.setPaciente(pacienteEncontrado);
            nuevaFarmacia.setConsultorio(consultorioEncontrado);
            CitaSalud.farmacias.add(nuevaFarmacia);
            Farmacia.actualizar(CitaSalud.farmacias);
            JOptionPane.showMessageDialog(this, "Se ha registrado correctamente en Farmacia.", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(this, "Paciente o Consultorio no se han definido", "Error", JOptionPane.ERROR_MESSAGE);
        }
        limpiarControles();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnBuscarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPacienteActionPerformed
        // TODO add your handling code here:
        String dniBuscado = txtBuscarPaciente.getText();
        
        for (Paciente paciente : CitaSalud.pacientes) {
            if (paciente.getDni().contains(dniBuscado)) {
                
                pacienteEncontrado = paciente;
                txtDni.setText(paciente.getDni());
                txtNombre.setText(paciente.getNombre());
                txtApellido.setText(paciente.getApellido());
                
                Date fechaActual = new Date();
                long diferenciaMilisegundos = fechaActual.getTime() - paciente.getFechaNacimiento().getTime();
                long milisegundosPorAnio = 1000L * 60 * 60 * 24 * 365;
                long edadEnAnios = diferenciaMilisegundos / milisegundosPorAnio; 
                String edad = edadEnAnios + "";
                txtEdad.setText(edad);
            }
        }
    }//GEN-LAST:event_btnBuscarPacienteActionPerformed

    private void btnBuscarConsultorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarConsultorioActionPerformed
        // TODO add your handling code here:
        
        inicializarTabla();
        
        List<Medicamento> medicamentos = new ArrayList<>();
        String codigoCita = txtBuscarConsultorio.getText();
        
        for (Consultorio consultorio : CitaSalud.consultorios) {
            if (consultorio.getCita().getCodigo().equals(codigoCita)) {
                consultorioEncontrado = consultorio;
                medicamentos = consultorio.getMedicamentos();
                break;
            }
        }
        
        DefaultTableModel model = (DefaultTableModel) tbMedicamento.getModel();
        for (Medicamento medicamento : medicamentos) {
            Object[] fila = {
                medicamento.getNombre(),
                medicamento.getCantidad()
            };
            model.addRow(fila);
        }
    }//GEN-LAST:event_btnBuscarConsultorioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Encabezado;
    private javax.swing.JButton btnBuscarConsultorio;
    private javax.swing.JButton btnBuscarPaciente;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblConsultorio;
    private javax.swing.JLabel lblDatosPaciente;
    private javax.swing.JLabel lblMedicamentos;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pDatosPaciente;
    private javax.swing.JTable tbMedicamento;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtBuscarConsultorio;
    private javax.swing.JTextField txtBuscarPaciente;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
