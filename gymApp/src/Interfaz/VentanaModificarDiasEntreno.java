package Interfaz;
import Dominio.Sistema;
import Dominio.Usuarios;
import java.util.Arrays;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;

public class VentanaModificarDiasEntreno extends javax.swing.JFrame{

    private Sistema sistema;
    private Usuarios u;
    private JFrame ventanaInicial;
    private String accion;
    private static final List<String> DIAS_SEMANA = Arrays.asList("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo");
    
    public VentanaModificarDiasEntreno(Usuarios user, JFrame ventana, String accionSeleccionada) {
        initComponents();        
        this.setLocationRelativeTo(null);          
        sistema = Sistema.getInstancia(); 
        u=user;       
        ventanaInicial = ventana;   
        accion = accionSeleccionada;
        btnNext.setFocusPainted(false);            
        cargarLista();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        diasLista = new javax.swing.JList();
        lblDia = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        jTextField1.setText("jTextField1");

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Información");
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Selecciona el día que quieras añadir a tu rutina");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 20, 330, 20);

        diasLista.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane4.setViewportView(diasLista);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(90, 80, 140, 150);

        lblDia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDia.setText("DIA");
        getContentPane().add(lblDia);
        lblDia.setBounds(150, 60, 80, 20);

        btnNext.setBackground(new java.awt.Color(0, 20, 20));
        btnNext.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnNext.setForeground(new java.awt.Color(255, 255, 255));
        btnNext.setText("Siguiente");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        getContentPane().add(btnNext);
        btnNext.setBounds(120, 260, 90, 30);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 330, 340);

        setBounds(0, 0, 345, 345);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        if (diasLista.getSelectedValue() != null) {
            String dia = diasLista.getSelectedValue().toString();
            int pos = DIAS_SEMANA.indexOf(dia);  // Obtiene la posición del día en la lista

            if (pos != -1) { // Verifica que el día esté en la lista
                modificarDiaEntreno(pos);
                recargarVentanaAnterior();
            }
        }
        dispose();        
    }//GEN-LAST:event_btnNextActionPerformed

    private void modificarDiaEntreno(int pos) {
        if (accion.equals("añadir")) {
            u.getDiasEntreno()[pos] = 1;
        } else {
            u.getDiasEntreno()[pos] = 0;
        }
    }

    private void recargarVentanaAnterior() {
        if (ventanaInicial instanceof VentanaRutina) {
            ((VentanaRutina) ventanaInicial).recargarListas();
            ventanaInicial.setVisible(true);
        }
    }    

    private void cargarLista() {
        DefaultListModel<String> modelo = new DefaultListModel<>();
        int[] diasEntreno = u.getDiasEntreno();

        for (int i = 0; i < diasEntreno.length; i++) {
            if (accion.equals("añadir") && diasEntreno[i] == 0) {
                modelo.addElement(DIAS_SEMANA.get(i));
            } else if (!accion.equals("añadir") && diasEntreno[i] == 1) {
                modelo.addElement(DIAS_SEMANA.get(i));
            }
        }

        diasLista.setModel(modelo);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNext;
    private javax.swing.JList diasLista;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblDia;
    // End of variables declaration//GEN-END:variables
}
