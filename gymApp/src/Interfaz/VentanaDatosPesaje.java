package Interfaz;
import Dominio.Sistema;
import Dominio.Usuarios;
import Funciones.ValidationUtils;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VentanaDatosPesaje extends javax.swing.JFrame{

    private Usuarios userSeleccionado;
    private Sistema sistema;
    private JFrame ventanaInicial;

    public VentanaDatosPesaje(Usuarios user, JFrame ventana) {      
        initComponents();        
        userSeleccionado= user;
        sistema = Sistema.getInstancia();     
        ventanaInicial = ventana;
        btnRegister.setFocusPainted(false);  
        this.setLocationRelativeTo(null);     
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblIngreseDatos6 = new javax.swing.JLabel();
        lblIngreseDatos7 = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        lblIngreseDatos8 = new javax.swing.JLabel();
        lblIngreseDatos9 = new javax.swing.JLabel();
        lblIngreseDatos11 = new javax.swing.JLabel();
        lblIngreseDatos12 = new javax.swing.JLabel();
        lblIngreseDatos10 = new javax.swing.JLabel();
        lblIngreseDatos13 = new javax.swing.JLabel();
        lblIngreseDatos14 = new javax.swing.JLabel();
        txtDia = new javax.swing.JTextField();
        lblIngreseDatos15 = new javax.swing.JLabel();
        txtMes = new javax.swing.JTextField();
        lblIngreseDatos16 = new javax.swing.JLabel();
        txtAño = new javax.swing.JTextField();
        txtHora = new javax.swing.JTextField();
        lblIngreseDatos19 = new javax.swing.JLabel();
        txtMinuto = new javax.swing.JTextField();
        btnRegister = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de Datos");
        getContentPane().setLayout(null);

        lblIngreseDatos6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblIngreseDatos6.setText("Ej: 85 ; 83.5");
        getContentPane().add(lblIngreseDatos6);
        lblIngreseDatos6.setBounds(350, 150, 100, 20);

        lblIngreseDatos7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblIngreseDatos7.setText("PESO");
        getContentPane().add(lblIngreseDatos7);
        lblIngreseDatos7.setBounds(370, 40, 50, 20);

        txtPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesoActionPerformed(evt);
            }
        });
        getContentPane().add(txtPeso);
        txtPeso.setBounds(360, 70, 60, 30);

        lblIngreseDatos8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblIngreseDatos8.setText("FECHA DEL PESAJE");
        getContentPane().add(lblIngreseDatos8);
        lblIngreseDatos8.setBounds(30, 40, 130, 20);

        lblIngreseDatos9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblIngreseDatos9.setText("HORA DEL PESAJE");
        getContentPane().add(lblIngreseDatos9);
        lblIngreseDatos9.setBounds(210, 40, 140, 20);

        lblIngreseDatos11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblIngreseDatos11.setText("KG");
        getContentPane().add(lblIngreseDatos11);
        lblIngreseDatos11.setBounds(370, 110, 40, 30);

        lblIngreseDatos12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblIngreseDatos12.setText("HH:MM");
        getContentPane().add(lblIngreseDatos12);
        lblIngreseDatos12.setBounds(240, 110, 80, 30);

        lblIngreseDatos10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblIngreseDatos10.setText("DD/MM/YYYY");
        getContentPane().add(lblIngreseDatos10);
        lblIngreseDatos10.setBounds(40, 110, 90, 30);

        lblIngreseDatos13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblIngreseDatos13.setText("Ej: 01/01/2023 ");
        getContentPane().add(lblIngreseDatos13);
        lblIngreseDatos13.setBounds(40, 150, 110, 20);

        lblIngreseDatos14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblIngreseDatos14.setText("Ej: 20:55");
        getContentPane().add(lblIngreseDatos14);
        lblIngreseDatos14.setBounds(240, 150, 60, 20);

        txtDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiaActionPerformed(evt);
            }
        });
        getContentPane().add(txtDia);
        txtDia.setBounds(10, 70, 40, 30);

        lblIngreseDatos15.setText("/");
        getContentPane().add(lblIngreseDatos15);
        lblIngreseDatos15.setBounds(60, 70, 10, 30);

        txtMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMesActionPerformed(evt);
            }
        });
        getContentPane().add(txtMes);
        txtMes.setBounds(70, 70, 40, 30);

        lblIngreseDatos16.setText("/");
        getContentPane().add(lblIngreseDatos16);
        lblIngreseDatos16.setBounds(120, 70, 10, 30);

        txtAño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAñoActionPerformed(evt);
            }
        });
        getContentPane().add(txtAño);
        txtAño.setBounds(130, 70, 50, 30);

        txtHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoraActionPerformed(evt);
            }
        });
        getContentPane().add(txtHora);
        txtHora.setBounds(220, 70, 40, 30);

        lblIngreseDatos19.setText(":");
        getContentPane().add(lblIngreseDatos19);
        lblIngreseDatos19.setBounds(270, 70, 10, 30);

        txtMinuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMinutoActionPerformed(evt);
            }
        });
        getContentPane().add(txtMinuto);
        txtMinuto.setBounds(280, 70, 40, 30);

        btnRegister.setBackground(new java.awt.Color(0, 20, 20));
        btnRegister.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("REGISTRAR");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegister);
        btnRegister.setBounds(140, 210, 160, 30);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 430, 290);

        setBounds(0, 0, 447, 296);
    }// </editor-fold>//GEN-END:initComponents
    
    private void txtPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesoActionPerformed

    private void txtDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiaActionPerformed

    private void txtMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMesActionPerformed

    private void txtAñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAñoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAñoActionPerformed

    private void txtHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoraActionPerformed

    private void txtMinutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMinutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMinutoActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        String fecha = (txtDia.getText() + "/" + txtMes.getText() + "/" + txtAño.getText());
        String hora = (txtHora.getText() + ":" + txtMinuto.getText());
        String peso = txtPeso.getText().replace(',', '.');
        
        if (ValidationUtils.esTextoValido(peso) || ValidationUtils.esTextoValido(hora)||ValidationUtils.esTextoValido(fecha)) {
            JOptionPane.showMessageDialog(null, "No puede ingresar letras.", "Error de entrada", JOptionPane.ERROR_MESSAGE);
            return; // Sale del método si el nombre no es válido
        }           

        if (!ValidationUtils.esFechaValida(fecha)) {
            JOptionPane.showMessageDialog(null, "Fecha inválida. Ingrese una fecha en el formato DD/MM/YYYY.", "Error de entrada", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!ValidationUtils.esHoraValida(hora)) {
            JOptionPane.showMessageDialog(null, "Hora inválida. Ingrese una hora en el formato HH:MM.", "Error de entrada", JOptionPane.ERROR_MESSAGE);
            return;
        }    
 
        sistema.getServicioDieta().añadirRegistro(userSeleccionado, fecha, hora, peso);
      
        dispose();        
        if (ventanaInicial instanceof VentanaChequeoPesajes) {
            ((VentanaChequeoPesajes) ventanaInicial).cargarTabla();
            ventanaInicial.setVisible(true);            
        }          
    }//GEN-LAST:event_btnRegisterActionPerformed
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegister;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblIngreseDatos10;
    private javax.swing.JLabel lblIngreseDatos11;
    private javax.swing.JLabel lblIngreseDatos12;
    private javax.swing.JLabel lblIngreseDatos13;
    private javax.swing.JLabel lblIngreseDatos14;
    private javax.swing.JLabel lblIngreseDatos15;
    private javax.swing.JLabel lblIngreseDatos16;
    private javax.swing.JLabel lblIngreseDatos19;
    private javax.swing.JLabel lblIngreseDatos6;
    private javax.swing.JLabel lblIngreseDatos7;
    private javax.swing.JLabel lblIngreseDatos8;
    private javax.swing.JLabel lblIngreseDatos9;
    private javax.swing.JTextField txtAño;
    private javax.swing.JTextField txtDia;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtMes;
    private javax.swing.JTextField txtMinuto;
    private javax.swing.JTextField txtPeso;
    // End of variables declaration//GEN-END:variables

}
