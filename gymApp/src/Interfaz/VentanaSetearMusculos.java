package Interfaz;
import Dominio.Dias;
import Dominio.Musculos;
import Dominio.Sistema;
import Dominio.Usuarios;
import java.util.ArrayList;
import javax.swing.JFrame;

public class VentanaSetearMusculos extends javax.swing.JFrame {

    private Sistema sistema;
    private Usuarios u;
    private String dia;
    private JFrame ventanaInicial;

    public VentanaSetearMusculos(String diaDato, Usuarios user, JFrame ventana) {
        initComponents();  
        this.setLocationRelativeTo(null);             
        sistema = Sistema.getInstancia();
        btnSeleccionM.setFocusPainted(false);  
        btnNext.setFocusPainted(false);           
        dia = diaDato;
        u=user;       
        ventanaInicial = ventana;   
        lblDia.setText(dia);        
        cargarLista();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jMusculo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        musculosLista = new javax.swing.JList();
        lblDia = new javax.swing.JLabel();
        btnSeleccionM = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        jTextField1.setText("jTextField1");

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Información");
        getContentPane().setLayout(null);

        jMusculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pecho", "Biceps", "Espalda", "Triceps", "Hombros", "Quads", "Aductores", "Femorales", "Gluteos", "Abs", "Gemelos" }));
        jMusculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMusculoActionPerformed(evt);
            }
        });
        getContentPane().add(jMusculo);
        jMusculo.setBounds(280, 130, 120, 22);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Selecciona el músculo que quieras modificar");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 30, 320, 20);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Músculo a añadir");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(280, 100, 130, 20);

        musculosLista.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane4.setViewportView(musculosLista);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(60, 80, 170, 130);

        lblDia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDia.setText("DIA");
        getContentPane().add(lblDia);
        lblDia.setBounds(130, 60, 70, 20);

        btnSeleccionM.setBackground(new java.awt.Color(0, 20, 20));
        btnSeleccionM.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSeleccionM.setForeground(new java.awt.Color(255, 255, 255));
        btnSeleccionM.setText("Seleccionar músculo");
        btnSeleccionM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionMActionPerformed(evt);
            }
        });
        getContentPane().add(btnSeleccionM);
        btnSeleccionM.setBounds(260, 170, 160, 30);

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
        btnNext.setBounds(100, 230, 90, 30);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 460, 310);

        setBounds(0, 0, 474, 318);
    }// </editor-fold>//GEN-END:initComponents

    private void jMusculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMusculoActionPerformed
    }//GEN-LAST:event_jMusculoActionPerformed

    private void btnSeleccionMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionMActionPerformed
        if(musculosLista.getSelectedValue()!=null){
            actualizarMusculo();       
        }
    }//GEN-LAST:event_btnSeleccionMActionPerformed

    private void actualizarMusculo(){
        Musculos musculoSeleccionado = (Musculos) musculosLista.getSelectedValue();
        String exercise = jMusculo.getSelectedItem().toString();
        musculoSeleccionado.setNombre(exercise);            
        cargarLista();         
    }
    
    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        dispose();     
        if (ventanaInicial instanceof VentanaRutina) {
            ((VentanaRutina) ventanaInicial).recargarListas();
            ventanaInicial.setVisible(true);            
        } 
    }//GEN-LAST:event_btnNextActionPerformed

    private void cargarLista(){
        sistema.getServicioRutina().getListaDiasRutina(u).stream()
            .filter(d -> d.getDiaSemana().equals(dia))
            .findFirst()
            .ifPresent(d -> musculosLista.setListData(d.getMusculos().toArray()));             
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnSeleccionM;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JComboBox<String> jMusculo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblDia;
    private javax.swing.JList musculosLista;
    // End of variables declaration//GEN-END:variables

}
