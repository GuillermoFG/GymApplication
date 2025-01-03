package Interfaz;
import Dominio.Musculos;
import Dominio.Sistema;
import Dominio.Usuarios;
import javax.swing.JFrame;

public class VentanaSetearEjercicios extends javax.swing.JFrame{

    private Sistema sistema;
    private Usuarios u;
    private String dia;
    private JFrame ventanaInicial;

    public VentanaSetearEjercicios(String diaDato, Usuarios user, JFrame ventana) {
        initComponents();        
        this.setLocationRelativeTo(null);        
        sistema = Sistema.getInstancia();
        btnEjercicios.setFocusPainted(false);  
        btnSeleccionEj.setFocusPainted(false);  
        btnNext.setFocusPainted(false);          
        ventanaInicial = ventana;
        lblDia.setText(dia);
        u=user;
        dia=diaDato;
        cargarLista();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jExercise = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        musculosLista = new javax.swing.JList();
        lblDia = new javax.swing.JLabel();
        btnEjercicios = new javax.swing.JButton();
        btnSeleccionEj = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        jTextField1.setText("jTextField1");

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Información");
        getContentPane().setLayout(null);

        jExercise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExerciseActionPerformed(evt);
            }
        });
        getContentPane().add(jExercise);
        jExercise.setBounds(300, 120, 160, 22);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Selecciona el músculo que quieras modificar");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 30, 320, 20);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Ejercicio a añadir");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(320, 160, 130, 20);

        musculosLista.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane4.setViewportView(musculosLista);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(60, 80, 180, 130);

        lblDia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDia.setText("DIA");
        getContentPane().add(lblDia);
        lblDia.setBounds(140, 60, 70, 20);

        btnEjercicios.setBackground(new java.awt.Color(0, 20, 20));
        btnEjercicios.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEjercicios.setForeground(new java.awt.Color(255, 255, 255));
        btnEjercicios.setText("Cargar lista de ejercicios");
        btnEjercicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEjerciciosActionPerformed(evt);
            }
        });
        getContentPane().add(btnEjercicios);
        btnEjercicios.setBounds(280, 80, 200, 30);

        btnSeleccionEj.setBackground(new java.awt.Color(0, 20, 20));
        btnSeleccionEj.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSeleccionEj.setForeground(new java.awt.Color(255, 255, 255));
        btnSeleccionEj.setText("Seleccionar ejercicio");
        btnSeleccionEj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionEjActionPerformed(evt);
            }
        });
        getContentPane().add(btnSeleccionEj);
        btnSeleccionEj.setBounds(290, 190, 180, 30);

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
        btnNext.setBounds(100, 230, 100, 30);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 510, 320);

        setBounds(0, 0, 524, 326);
    }// </editor-fold>//GEN-END:initComponents

    private void jExerciseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExerciseActionPerformed
    }//GEN-LAST:event_jExerciseActionPerformed

    private void btnEjerciciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjerciciosActionPerformed
        if(musculosLista.getSelectedValue()!=null){
            cargarEjerciciosPorMusculo();           
        }  
    }//GEN-LAST:event_btnEjerciciosActionPerformed

    private void cargarEjerciciosPorMusculo(){
        jExercise.removeAllItems();        
        Musculos musculoSeleccionado = (Musculos)musculosLista.getSelectedValue();      
        String [] ejercicios = sistema.getServicioEjercicios().getEjercicios(musculoSeleccionado.getNombre());   
        for(int i=0; i<ejercicios.length;i++){
            jExercise.addItem(ejercicios[i]);
        }         
    }
      
    private void btnSeleccionEjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionEjActionPerformed
        if(jExercise.getSelectedItem()!=null){        
            Musculos musculoSeleccionado = (Musculos) musculosLista.getSelectedValue();
            String exercise = jExercise.getSelectedItem().toString();
            musculoSeleccionado.setNombre(exercise);
            cargarLista();
        }
    }//GEN-LAST:event_btnSeleccionEjActionPerformed

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
            .ifPresent(d ->  musculosLista.setListData(d.getMusculos().toArray()));                
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEjercicios;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnSeleccionEj;
    private javax.swing.JComboBox<String> jExercise;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblDia;
    private javax.swing.JList musculosLista;
    // End of variables declaration//GEN-END:variables

}
