package Interfaz;
import Dominio.Sistema;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import Funciones.ValidationUtils;

public class VentanaAgregarEjercicio extends javax.swing.JFrame{

    private Sistema sistema;   
    private JFrame ventanaInicial;

    public VentanaAgregarEjercicio( JFrame ventana) {
        initComponents();
        sistema = Sistema.getInstancia();     
        ventanaInicial = ventana;       
        btnNext.setFocusPainted(false);            
        this.setLocationRelativeTo(null);  
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMuscle = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jExercise = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Información");
        getContentPane().setLayout(null);

        jMuscle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quads", "Aductores", "Femorales", "Gluteos", "Pecho", "Espalda", "Hombros", "Triceps", "Biceps", "Abs", "Gemelos" }));
        getContentPane().add(jMuscle);
        jMuscle.setBounds(140, 50, 120, 22);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Ejercicio");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 100, 70, 30);
        getContentPane().add(jExercise);
        jExercise.setBounds(90, 130, 210, 40);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("       Selecciona el músculo para añadirle un ejercicio");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 10, 370, 30);

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
        btnNext.setBounds(290, 210, 90, 30);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 410, 290);

        setBounds(0, 0, 425, 298);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        String musculo = jMuscle.getSelectedItem().toString(); 
        String ejercicio = jExercise.getText();            
        
        if (!ValidationUtils.esTextoValido(ejercicio)) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un nombre válido (solo letras).", "Error de entrada", JOptionPane.ERROR_MESSAGE);
            return;
        }           
 
        if(!ejercicio.isBlank()){
            sistema.getServicioEjercicios().setEjercicios(musculo,ejercicio);
        }
        dispose();         
        if (ventanaInicial instanceof VentanaRutina) {
            ((VentanaRutina) ventanaInicial).recargarListas();
            ventanaInicial.setVisible(true);            
        }    
    }//GEN-LAST:event_btnNextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNext;
    private javax.swing.JFormattedTextField jExercise;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JComboBox<String> jMuscle;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
