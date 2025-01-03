package Interfaz;
import Dominio.Sistema;
import javax.swing.JFrame;

public class VentanaConsultarIngredientes extends javax.swing.JFrame{

    private Sistema sistema;
    private JFrame ventanaInicial;

    public VentanaConsultarIngredientes(JFrame ventana) {
        initComponents();        
        sistema = Sistema.getInstancia();
        ventanaInicial = ventana;        
        btnGrupo.setFocusPainted(false);  
        btnSalir.setFocusPainted(false);                           
        this.setLocationRelativeTo(null);                 
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        ingredientesLista = new javax.swing.JList();
        lblDia = new javax.swing.JLabel();
        jGrupoComidas = new javax.swing.JComboBox<>();
        btnGrupo = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        jTextField1.setText("jTextField1");

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Información");
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Selecciona el grupo de alimentos que quieras consultar");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 20, 390, 20);

        ingredientesLista.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane4.setViewportView(ingredientesLista);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(80, 200, 230, 130);

        lblDia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDia.setText("ALIMENTOS/INGREDIENTES");
        getContentPane().add(lblDia);
        lblDia.setBounds(110, 170, 200, 16);

        jGrupoComidas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Carbohidratos", "Grasas", "Proteínas", "Otros" }));
        getContentPane().add(jGrupoComidas);
        jGrupoComidas.setBounds(120, 60, 150, 22);

        btnGrupo.setBackground(new java.awt.Color(0, 20, 20));
        btnGrupo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnGrupo.setForeground(new java.awt.Color(255, 255, 255));
        btnGrupo.setText("Elegir grupo");
        btnGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrupoActionPerformed(evt);
            }
        });
        getContentPane().add(btnGrupo);
        btnGrupo.setBounds(120, 100, 150, 30);

        btnSalir.setBackground(new java.awt.Color(155, 0, 0));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir);
        btnSalir.setBounds(300, 370, 70, 36);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 470);

        setBounds(0, 0, 414, 473);
    }// </editor-fold>//GEN-END:initComponents


    private void btnGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrupoActionPerformed
        cargarLista();
    }//GEN-LAST:event_btnGrupoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();        
        if (ventanaInicial instanceof VentanaDieta) {
            ((VentanaDieta) ventanaInicial).recargarListas();
            ventanaInicial.setVisible(true);            
        }   
    }//GEN-LAST:event_btnSalirActionPerformed
   
    private void cargarLista(){
        String [] empty = {};
        ingredientesLista.setListData(empty); 

        String [] alimentos = sistema.getServicioAlimentos().getAlimentos(jGrupoComidas.getSelectedItem().toString());
        ingredientesLista.setListData(alimentos);
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGrupo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JList ingredientesLista;
    private javax.swing.JComboBox<String> jGrupoComidas;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblDia;
    // End of variables declaration//GEN-END:variables

}
