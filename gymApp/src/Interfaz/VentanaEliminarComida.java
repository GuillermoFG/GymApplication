package Interfaz;
import Dominio.Comidas;
import Dominio.Dias;
import Dominio.Sistema;
import Dominio.Usuarios;
import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.swing.JFrame;

public class VentanaEliminarComida extends javax.swing.JFrame{

    private Sistema sistema;
    private Usuarios userSeleccionado;    
    private JFrame ventanaInicial;    
    private String diaSeleccionado;
    
    public VentanaEliminarComida(String dia, Usuarios user, JFrame ventana) {
        initComponents();   
        this.setLocationRelativeTo(null);           
        sistema = Sistema.getInstancia();
        userSeleccionado = user;
        ventanaInicial = ventana;  
        diaSeleccionado=dia;
        btnNext.setFocusPainted(false);          
        lblDia.setText(dia);       
        
        Optional<Dias> diaEncontrado = sistema.getServicioDieta().getListaDiasDieta(user).stream()
                .filter(d -> d.getDiaSemana().equals(dia))
                .findFirst();
        
        diaEncontrado.ifPresent(d -> listComidas.setListData(d.getComidas().toArray()));                 
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        listComidas = new javax.swing.JList();
        lblDia = new javax.swing.JLabel();
        jEliminar = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        jTextField1.setText("jTextField1");

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Información");
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Eliminar la comida en los otros días");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 250, 280, 20);

        listComidas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane4.setViewportView(listComidas);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(70, 80, 170, 150);

        lblDia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDia.setText("DIA");
        getContentPane().add(lblDia);
        lblDia.setBounds(140, 60, 70, 20);

        jEliminar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jEliminar.setText("Eliminar");
        jEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(jEliminar);
        jEliminar.setBounds(110, 280, 85, 20);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Selecciona la comida que quieras eliminar");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 30, 290, 16);

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
        btnNext.setBounds(90, 320, 120, 30);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 320, 410);

        setBounds(0, 0, 337, 412);
    }// </editor-fold>//GEN-END:initComponents

    private void jEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jEliminarActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        eliminarComida();
        dispose();        
        if (ventanaInicial instanceof VentanaDieta) {
            ((VentanaDieta) ventanaInicial).recargarListas();
            ventanaInicial.setVisible(true);            
        }  
    }//GEN-LAST:event_btnNextActionPerformed

    private void eliminarComida(){
        Comidas comidaAEliminar = (Comidas)listComidas.getSelectedValue();
        if (listComidas.getSelectedValue() == null) {
            return;
        }        
        
        String posicion = comidaAEliminar.getGrupoComida();                     

        sistema.getServicioDieta().getListaDiasDieta(userSeleccionado).forEach(d -> {
            if (jEliminar.isSelected() || d.getDiaSemana().equals(diaSeleccionado)) {
                d.setComidas(d.getComidas().stream()
                        .filter(c -> !c.getGrupoComida().equals(posicion))
                        .collect(Collectors.toCollection(ArrayList::new)));
            }
        });          
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNext;
    private javax.swing.JCheckBox jEliminar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblDia;
    private javax.swing.JList listComidas;
    // End of variables declaration//GEN-END:variables

}
