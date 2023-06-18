package CitaSalud.pantallas;

import CitaSalud.CitaSalud;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;

/**
 *
 * @author Andres
 */
public class JPanelHome extends javax.swing.JPanel {

    private final Timer timer; // Timer para actualizar la hora cada segundo

    /**
     * Creates new form JPanelHome
     */
    public JPanelHome() {
        initComponents();
        lblRolValor.setText(CitaSalud.usuario.getRole());
        lblUsernameValor.setText(CitaSalud.usuario.getUsername());
        lblIconLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CitaSalud/Imagenes/" + CitaSalud.usuario.getRole() + "logo96.png")));
                
        Date fechaActual = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("EEEE, d 'de' MMMM 'de' yyyy");
        String fechaFormateada = formatoFecha.format(fechaActual);
        lblFecha.setText(fechaFormateada);

        actualizarHora();

        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actualizarHora();
            }
        });

        timer.start();
    }

    private void actualizarHora() {
        Date horaActual = new Date();
        SimpleDateFormat formatoHora = new SimpleDateFormat("hh:mm:ss a");
        String horaFormateada = formatoHora.format(horaActual);
        lblHora.setText(horaFormateada);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblRol = new javax.swing.JLabel();
        lblRolValor = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblUsernameValor = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        lblIconLogo = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1200, 900));
        setMinimumSize(new java.awt.Dimension(1200, 900));
        setPreferredSize(new java.awt.Dimension(1200, 900));
        setLayout(null);

        lblTitulo.setFont(new java.awt.Font("Century Gothic", 0, 70)); // NOI18N
        lblTitulo.setText("Bienvenido a CitaSalud");
        add(lblTitulo);
        lblTitulo.setBounds(160, 70, 910, 87);

        lblRol.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        lblRol.setText("rol:");
        add(lblRol);
        lblRol.setBounds(590, 430, 52, 45);

        lblRolValor.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        lblRolValor.setText("{rol}");
        add(lblRolValor);
        lblRolValor.setBounds(680, 430, 300, 45);

        lblUsername.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        lblUsername.setText("usuario:");
        add(lblUsername);
        lblUsername.setBounds(510, 480, 140, 45);

        lblUsernameValor.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        lblUsernameValor.setText("{username}");
        add(lblUsernameValor);
        lblUsernameValor.setBounds(680, 480, 300, 45);

        lblFecha.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        lblFecha.setText("[EEEE, d 'de' MMMM 'de' yyyy]");
        add(lblFecha);
        lblFecha.setBounds(380, 710, 520, 45);

        lblHora.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        lblHora.setText("[hh:mm:ss tt]");
        add(lblHora);
        lblHora.setBounds(530, 770, 220, 45);

        lblIconLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CitaSalud/Imagenes/asistentelogo96.png"))); // NOI18N
        add(lblIconLogo);
        lblIconLogo.setBounds(340, 400, 150, 170);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblIconLogo;
    private javax.swing.JLabel lblRol;
    private javax.swing.JLabel lblRolValor;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblUsernameValor;
    // End of variables declaration//GEN-END:variables
}
