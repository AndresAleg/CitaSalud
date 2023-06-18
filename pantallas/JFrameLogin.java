package CitaSalud.pantallas;

import CitaSalud.CitaSalud;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Andres
 */
public class JFrameLogin extends javax.swing.JFrame {

    /**
     * Creates new form JFrameLogin
     */
    public JFrameLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblIconLogo = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblContraseña = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        btnIniciarSesion = new javax.swing.JButton();
        lblIconSalir = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setOpacity(0.85F);
        setResizable(false);

        lblIconLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CitaSalud/Imagenes/logo.png"))); // NOI18N

        lblUsuario.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblUsuario.setText("Usuario:");

        txtUsuario.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        lblContraseña.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblContraseña.setText("Contraseña:");

        txtContraseña.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        btnIniciarSesion.setBackground(new java.awt.Color(153, 255, 153));
        btnIniciarSesion.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnIniciarSesion.setText("Iniciar Sesión");
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });

        lblIconSalir.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblIconSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CitaSalud/Imagenes/salir32.png"))); // NOI18N
        lblIconSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIconSalirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblIconSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addComponent(btnIniciarSesion)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblContraseña)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblUsuario)
                                .addComponent(txtUsuario)
                                .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(lblIconLogo))
                .addGap(85, 85, 85))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(lblIconSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(lblIconLogo)
                .addGap(18, 18, 18)
                .addComponent(lblUsuario)
                .addGap(4, 4, 4)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblContraseña)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnIniciarSesion)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed

         String username = txtUsuario.getText();
        String password = txtContraseña.getText();

        String url = System.getProperty("url");
        String query = "SELECT username, role FROM users WHERE username = ? AND password = ?";

        try (Connection connection = DriverManager.getConnection(url);
                PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setString(1, username);
            statement.setString(2, password);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                // Los datos son correctos
                String retrievedUsername = resultSet.getString("username");
                String retrievedRole = resultSet.getString("role");

                JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso");

                // Guarda el nombre de usuario y el rol en tu objeto Usuario o donde sea necesario
                CitaSalud.usuario.setUsername(retrievedUsername);
                CitaSalud.usuario.setRole(retrievedRole);

                JFramePrincipal principal = new JFramePrincipal();
                principal.setVisible(true);
                this.dispose();
            } else {
                // Los datos son incorrectos
                JOptionPane.showMessageDialog(null, "Nombre de usuario o contraseña incorrectos");
            }
        } catch (SQLException e) {
            // Manejo de errores de la base de datos
            JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos: " + e.getMessage());
        }

    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void lblIconSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconSalirMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_lblIconSalirMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblIconLogo;
    private javax.swing.JLabel lblIconSalir;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
