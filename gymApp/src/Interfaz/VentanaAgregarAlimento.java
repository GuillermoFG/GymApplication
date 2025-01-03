package Interfaz;
import Dominio.Sistema;
import Funciones.ValidationUtils;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VentanaAgregarAlimento extends javax.swing.JFrame{

    private Sistema sistema;  
    private JFrame ventanaInicial;

    public VentanaAgregarAlimento(JFrame ventana) {
        initComponents();        
        sistema = Sistema.getInstancia();       
        ventanaInicial = ventana;       
        btnNext.setFocusPainted(false);    
        this.setLocationRelativeTo(null);  
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jGrupoComidas = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jAlimento = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Información");
        getContentPane().setLayout(null);

        jGrupoComidas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Carbohidratos", "Grasas", "Proteinas", "Otros" }));
        getContentPane().add(jGrupoComidas);
        jGrupoComidas.setBounds(150, 50, 140, 22);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Alimento");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(190, 100, 90, 30);
        getContentPane().add(jAlimento);
        jAlimento.setBounds(120, 130, 190, 40);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("       Selecciona el grupo de comida para añadirle un alimento");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 10, 430, 30);

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
        btnNext.setBounds(320, 190, 90, 30);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 440, 270);

        setBounds(0, 0, 456, 279);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        String ingrediente = jAlimento.getText();          
        if (!ValidationUtils.esTextoValido(ingrediente)) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un nombre válido (solo letras).", "Error de entrada", JOptionPane.ERROR_MESSAGE);
            return;
        }          
              
        String grupoComida = jGrupoComidas.getSelectedItem().toString();             
        sistema.getServicioAlimentos().setAlimentos(grupoComida,ingrediente);
        dispose();        
        if (ventanaInicial instanceof VentanaDieta) {
            ((VentanaDieta) ventanaInicial).recargarListas();
            ventanaInicial.setVisible(true);            
        }           
    }//GEN-LAST:event_btnNextActionPerformed
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNext;
    private javax.swing.JFormattedTextField jAlimento;
    private javax.swing.JComboBox<String> jGrupoComidas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
