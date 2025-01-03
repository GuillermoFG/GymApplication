package Interfaz;
import Dominio.Dias;
import Dominio.Musculos;
import Dominio.Sistema;
import Dominio.Usuarios;
import Funciones.ServicioRutina;
import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.swing.JFrame;

public class VentanaEliminarMusculo extends javax.swing.JFrame{

    private Sistema sistema;
    private Usuarios userSeleccionado;    
    private JFrame ventanaInicial;    
    private String diaSeleccionado;
    
    
    public VentanaEliminarMusculo(String dia, Usuarios user, JFrame ventana) {
        initComponents();       
        this.setLocationRelativeTo(null);         
        sistema = Sistema.getInstancia();
        userSeleccionado = user;
        ventanaInicial = ventana;  
        btnNext.setFocusPainted(false);     
        diaSeleccionado = dia;
        lblDia.setText(dia);  
        
        Optional<Dias> diaEncontrado = sistema.getServicioRutina().getListaDiasRutina(user).stream()
                .filter(d -> d.getDiaSemana().equals(dia))
                .findFirst();
        
        diaEncontrado.ifPresent(d -> listMusculos.setListData(d.getMusculos().toArray()));            
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        listMusculos = new javax.swing.JList();
        lblDia = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        jTextField1.setText("jTextField1");

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Información");
        getContentPane().setLayout(null);

        listMusculos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane4.setViewportView(listMusculos);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(50, 80, 170, 140);

        lblDia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDia.setText("DIA");
        getContentPane().add(lblDia);
        lblDia.setBounds(120, 60, 70, 20);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Selecciona el músculo a eliminar");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 30, 230, 16);

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
        btnNext.setBounds(80, 250, 110, 30);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 280, 340);

        setBounds(0, 0, 291, 345);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        eliminarMusculo();
        dispose();        
        if (ventanaInicial instanceof VentanaRutina) {
            ((VentanaRutina) ventanaInicial).recargarListas();
            ventanaInicial.setVisible(true);            
        }  
    }//GEN-LAST:event_btnNextActionPerformed
   
    private void eliminarMusculo(){
        Musculos musculoAEliminar = (Musculos)listMusculos.getSelectedValue();
        if (listMusculos.getSelectedValue() == null) {
            return;
        }           
        
        String posicion = musculoAEliminar.getNombre();
        ServicioRutina funcionesRutina = sistema.getServicioRutina();
        
        funcionesRutina.getListaDiasRutina(userSeleccionado).forEach(d -> {
            if (d.getDiaSemana().equals(diaSeleccionado)) {
                d.setMusculos(d.getMusculos().stream()
                        .filter(m -> !m.getNombre().equals(posicion))
                        .collect(Collectors.toCollection(ArrayList::new)));                       
                        funcionesRutina.actualizarOrdenMusculos(d);                
            }
        });                         
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNext;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblDia;
    private javax.swing.JList listMusculos;
    // End of variables declaration//GEN-END:variables

}
