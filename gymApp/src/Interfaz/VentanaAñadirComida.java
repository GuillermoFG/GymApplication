package Interfaz;
import Dominio.Comidas;
import Dominio.Sistema;
import Dominio.Usuarios;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VentanaAñadirComida extends javax.swing.JFrame{

    private Sistema sistema;
    private Usuarios userSeleccionado;
    private JFrame ventanaInicial;    
    private String diaSeleccionado;
        
    public VentanaAñadirComida(String dia, Usuarios user, JFrame ventana) {
        initComponents();      
        this.setLocationRelativeTo(null);       
        sistema = Sistema.getInstancia();
        userSeleccionado = user;
        ventanaInicial = ventana;  
        diaSeleccionado = dia;
        lblDia.setText(dia);        
        btnVisualizar.setFocusPainted(false);   
        btnNext.setFocusPainted(false);              
        cargarListas();          
    }

    private void cargarListas(){
        listComidas.setListData(sistema.getServicioDieta().getListaComidasPorDia(userSeleccionado,diaSeleccionado).toArray());                
    }
 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        listComidas = new javax.swing.JList();
        lblDia = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtComida = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnVisualizar = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        jTextField1.setText("jTextField1");

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Información");
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Ej: \"Snack 1\", \"Post Gym\", \"Pre Entreno\"");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(210, 70, 270, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("DESAYUNO");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(200, 240, 110, 20);

        listComidas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane4.setViewportView(listComidas);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(20, 150, 170, 130);

        lblDia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDia.setText("DIA");
        getContentPane().add(lblDia);
        lblDia.setBounds(90, 130, 70, 20);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Ej: si quisieras añadir \"Snack 1\" después");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(200, 200, 280, 20);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("del desayuno, tendrías que seleccionar");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(200, 220, 270, 20);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("COMIDA");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(80, 50, 90, 20);

        txtComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtComidaActionPerformed(evt);
            }
        });
        getContentPane().add(txtComida);
        txtComida.setBounds(20, 70, 170, 30);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Selecciona el lugar para añadir la comida");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(200, 160, 280, 20);

        btnVisualizar.setBackground(new java.awt.Color(0, 20, 20));
        btnVisualizar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnVisualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnVisualizar.setText("VISTA PREVIA");
        btnVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVisualizar);
        btnVisualizar.setBounds(30, 300, 150, 30);

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
        btnNext.setBounds(50, 350, 110, 30);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 490, 450);

        setBounds(0, 0, 506, 459);
    }// </editor-fold>//GEN-END:initComponents

    private void txtComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtComidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtComidaActionPerformed

    private void btnVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarActionPerformed
        String nuevaComida = txtComida.getText();
        if(nuevaComida.isEmpty()){
            JOptionPane.showMessageDialog(null, "Debe ingresar una comida");   
            return;            
        }      
        int indexSeleccionado = listComidas.getSelectedIndex();
        Comidas opcionComida = (Comidas)listComidas.getSelectedValue();     
        
        if(opcionComida==null){
            JOptionPane.showMessageDialog(null, "Debe seleccionar una comida");   
        }else{
            List<Comidas> copia = sistema.getServicioDieta().añadirElementoListaCopiada(opcionComida, nuevaComida, userSeleccionado, diaSeleccionado);
            listComidas.setListData(copia.toArray());
            
            if (indexSeleccionado >= 0 && indexSeleccionado < listComidas.getModel().getSize()) {
                listComidas.setSelectedIndex(indexSeleccionado);
            }              
        }                
    }//GEN-LAST:event_btnVisualizarActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        String nuevaComida = txtComida.getText();
        if(nuevaComida.isEmpty()){
            JOptionPane.showMessageDialog(null, "Debe ingresar una comida");   
            return;            
        }        
     
        Comidas opcionComida = (Comidas)listComidas.getSelectedValue();       
        
        if(opcionComida==null){
            JOptionPane.showMessageDialog(null, "Debe seleccionar una comida");    
        }else{
            sistema.getServicioDieta().añadirComidaAUsuario(userSeleccionado, opcionComida, nuevaComida, diaSeleccionado);
            dispose();        
            if (ventanaInicial instanceof VentanaDieta) {
                ((VentanaDieta) ventanaInicial).recargarListas();
                ventanaInicial.setVisible(true);            
            }          
        }                 
    }//GEN-LAST:event_btnNextActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnVisualizar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblDia;
    private javax.swing.JList listComidas;
    private javax.swing.JTextField txtComida;
    // End of variables declaration//GEN-END:variables
}
