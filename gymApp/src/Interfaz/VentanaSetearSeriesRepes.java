package Interfaz;
import java.util.*;
import Dominio.Dias;
import Dominio.Musculos;
import Dominio.Sistema;
import Dominio.Usuarios;
import Funciones.ValidationUtils;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VentanaSetearSeriesRepes extends javax.swing.JFrame {

    private Sistema sistema;
    private Usuarios u;
    private String dia;
    private JFrame ventanaInicial;
    private Map<String, Musculos> musculosMap = new HashMap<>();    

    public VentanaSetearSeriesRepes(String diaDato, Usuarios user, JFrame ventana) {
        initComponents();   
        this.setLocationRelativeTo(null);             
        sistema = Sistema.getInstancia();
        btnModificar.setFocusPainted(false);  
        btnNext.setFocusPainted(false);               
        dia = diaDato;
        u=user;       
        ventanaInicial = ventana;        
        txtSeries.setText("4");
        txtRepes.setText("12");
        lblDia.setText(dia);         
        cargarLista();       
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        musculosLista = new javax.swing.JList();
        lblDia = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSeries = new javax.swing.JTextField();
        txtRepes = new javax.swing.JTextField();
        btnNext = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnMenosRepes = new javax.swing.JButton();
        btnMenosSeries = new javax.swing.JButton();
        btnMasRepes = new javax.swing.JButton();
        btnMasSeries = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        jTextField1.setText("jTextField1");

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Información");
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Selecciona el ejercicio y define las series y repeticiones");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 20, 390, 20);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Repeticiones");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(350, 140, 100, 20);

        musculosLista.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane4.setViewportView(musculosLista);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(90, 80, 190, 140);

        lblDia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDia.setText("DIA");
        getContentPane().add(lblDia);
        lblDia.setBounds(170, 50, 70, 20);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Series");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(370, 70, 60, 20);

        txtSeries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSeriesActionPerformed(evt);
            }
        });
        getContentPane().add(txtSeries);
        txtSeries.setBounds(370, 90, 40, 30);

        txtRepes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRepesActionPerformed(evt);
            }
        });
        getContentPane().add(txtRepes);
        txtRepes.setBounds(370, 160, 40, 30);

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
        btnNext.setBounds(140, 240, 90, 30);

        btnModificar.setBackground(new java.awt.Color(0, 20, 20));
        btnModificar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar);
        btnModificar.setBounds(340, 210, 110, 30);

        btnMenosRepes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnMenosRepes.setText("-");
        btnMenosRepes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosRepesActionPerformed(evt);
            }
        });
        getContentPane().add(btnMenosRepes);
        btnMenosRepes.setBounds(320, 160, 40, 30);

        btnMenosSeries.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnMenosSeries.setText("-");
        btnMenosSeries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosSeriesActionPerformed(evt);
            }
        });
        getContentPane().add(btnMenosSeries);
        btnMenosSeries.setBounds(320, 90, 40, 30);

        btnMasRepes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnMasRepes.setText("+");
        btnMasRepes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasRepesActionPerformed(evt);
            }
        });
        getContentPane().add(btnMasRepes);
        btnMasRepes.setBounds(420, 160, 40, 30);

        btnMasSeries.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnMasSeries.setText("+");
        btnMasSeries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasSeriesActionPerformed(evt);
            }
        });
        getContentPane().add(btnMasSeries);
        btnMasSeries.setBounds(420, 90, 40, 30);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 480, 330);

        setBounds(0, 0, 491, 333);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSeriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSeriesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSeriesActionPerformed

    private void txtRepesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRepesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRepesActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        dispose();     
        if (ventanaInicial instanceof VentanaRutina) {
            ((VentanaRutina) ventanaInicial).recargarListas();
            ventanaInicial.setVisible(true);            
        }  
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if (musculosLista.getSelectedValue() != null) {
            String selectedValue = musculosLista.getSelectedValue().toString();
            int selectedIndex = musculosLista.getSelectedIndex(); // Obtiene el índice seleccionado
            Musculos musculoSeleccionado = musculosMap.get(selectedValue + "_" + selectedIndex); // Usa el índice para obtener el músculo correcto

            String repes = txtRepes.getText();
            String series = txtSeries.getText();

            if (!ValidationUtils.esNumeroValido(repes) || !ValidationUtils.esNumeroValido(series)) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido.", "Error de entrada", JOptionPane.ERROR_MESSAGE);
                return; // Sale del método si no es un número válido
            }

            if (musculoSeleccionado != null) {
                musculoSeleccionado.setRepeticiones(Integer.parseInt(repes));
                musculoSeleccionado.setSeries(Integer.parseInt(series));                     
                cargarLista(); 
            }
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnMenosRepesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosRepesActionPerformed
        int repes = Integer.parseInt(txtRepes.getText())-1;
        txtRepes.setText(""+repes);
    }//GEN-LAST:event_btnMenosRepesActionPerformed

    private void btnMenosSeriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosSeriesActionPerformed
        int series = Integer.parseInt(txtSeries.getText())-1;
        txtSeries.setText(""+series); 
    }//GEN-LAST:event_btnMenosSeriesActionPerformed

    private void btnMasRepesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasRepesActionPerformed
        int repes = Integer.parseInt(txtRepes.getText())+1;
        txtRepes.setText(""+repes);
    }//GEN-LAST:event_btnMasRepesActionPerformed

    private void btnMasSeriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasSeriesActionPerformed
        int series = Integer.parseInt(txtSeries.getText())+1;
        txtSeries.setText(""+series);
    }//GEN-LAST:event_btnMasSeriesActionPerformed
    
    private void cargarLista(){
        DefaultListModel<String> model = sistema.getServicioRutina().cargarListaRutina(u, dia, musculosMap);
        musculosLista.setModel(model);                
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMasRepes;
    private javax.swing.JButton btnMasSeries;
    private javax.swing.JButton btnMenosRepes;
    private javax.swing.JButton btnMenosSeries;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNext;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblDia;
    private javax.swing.JList musculosLista;
    private javax.swing.JTextField txtRepes;
    private javax.swing.JTextField txtSeries;
    // End of variables declaration//GEN-END:variables

}
