package Interfaz;
import Dominio.Sistema;
import Dominio.Usuarios;
import Funciones.ServicioDieta;
import Funciones.Storage;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VentanaChequeoPesajes extends javax.swing.JFrame{
    
    private Sistema sistema;
    private Storage storage;
    private Usuarios userSeleccionado;
    
    public VentanaChequeoPesajes() {
        initComponents();       
        sistema = Sistema.getInstancia();
        storage = sistema.getStorage();
        this.setLocationRelativeTo(null);
        configurarBotones();
        cargarUsuariosEnComboBox();  
    }
       
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        comboBoxUsuarios = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        lblPesajes = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jUpdate = new javax.swing.JButton();
        añadirPesaje = new javax.swing.JButton();
        grafica = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Control de Pesajes");
        getContentPane().setLayout(null);

        getContentPane().add(comboBoxUsuarios);
        comboBoxUsuarios.setBounds(180, 20, 250, 22);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("SELECCIONAR USUARIO");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 20, 170, 20);

        lblPesajes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPesajes.setText("HISTORIAL DE PESAJES");
        getContentPane().add(lblPesajes);
        lblPesajes.setBounds(170, 130, 180, 20);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "Hora", "Peso"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(20, 170, 450, 290);

        jUpdate.setBackground(new java.awt.Color(0, 20, 20));
        jUpdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jUpdate.setForeground(new java.awt.Color(255, 255, 255));
        jUpdate.setText("CARGAR HISTORIAL");
        jUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(jUpdate);
        jUpdate.setBounds(180, 60, 170, 30);

        añadirPesaje.setBackground(new java.awt.Color(0, 20, 20));
        añadirPesaje.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        añadirPesaje.setForeground(new java.awt.Color(255, 255, 255));
        añadirPesaje.setText("AÑADIR PESAJE");
        añadirPesaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirPesajeActionPerformed(evt);
            }
        });
        getContentPane().add(añadirPesaje);
        añadirPesaje.setBounds(40, 490, 190, 30);

        grafica.setBackground(new java.awt.Color(0, 20, 20));
        grafica.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        grafica.setForeground(new java.awt.Color(255, 255, 255));
        grafica.setText("GRÁFICA DE HISTORIAL");
        grafica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graficaActionPerformed(evt);
            }
        });
        getContentPane().add(grafica);
        grafica.setBounds(260, 490, 190, 30);

        btnsalir.setBackground(new java.awt.Color(155, 0, 0));
        btnsalir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnsalir.setForeground(new java.awt.Color(255, 255, 255));
        btnsalir.setText("SALIR");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnsalir);
        btnsalir.setBounds(380, 560, 70, 36);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 500, 650);

        setBounds(0, 0, 513, 658);
    }// </editor-fold>//GEN-END:initComponents

    private void jUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUpdateActionPerformed
        cargarTabla();
    }//GEN-LAST:event_jUpdateActionPerformed

    private void añadirPesajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirPesajeActionPerformed
        if(comboBoxUsuarios.getSelectedItem()==null){
            JOptionPane.showMessageDialog(null, "Debe seleccionar un usuario");    
        }else{
            setearUserSeleccionado();       
            this.setVisible(false);                           
            VentanaDatosPesaje ventana = new VentanaDatosPesaje(userSeleccionado, this);
            ventana.setVisible(true);              
        }                                           
    }//GEN-LAST:event_añadirPesajeActionPerformed

    private void graficaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graficaActionPerformed
        if(comboBoxUsuarios.getSelectedItem()==null){
            JOptionPane.showMessageDialog(null, "Debe seleccionar un usuario");    
        }else{           
            setearUserSeleccionado();            
            if(sistema.getServicioDieta().getDatosDinamico(userSeleccionado).isEmpty()){
                JOptionPane.showMessageDialog(null, "No hay datos cargados aún");                                         
            }else{
                sistema.getServicioDieta().graficarPesajes(userSeleccionado);            
            }
        }        
    }//GEN-LAST:event_graficaActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnsalirActionPerformed
   
    private void setearUserSeleccionado(){
        String user = comboBoxUsuarios.getSelectedItem().toString();   
        userSeleccionado = sistema.getServicioUsuario().obtenerUsuario(user).get();         
    }
    
    private void configurarBotones(){
        jUpdate.setFocusPainted(false);  
        añadirPesaje.setFocusPainted(false);  
        grafica.setFocusPainted(false);    
        btnsalir.setFocusPainted(false);         
    }
    
    private void cargarUsuariosEnComboBox() {
        List<Usuarios> listaUsuarios = sistema.getServicioUsuario().getListaUsuarios();       
        Usuarios entrenador = storage.getEntrenador();     

        if (entrenador != null) {
            entrenador.getListaClientes().forEach(this::agregarUsuariosAlComboBox);
            agregarUsuariosAlComboBox(entrenador);
        }else {
            listaUsuarios.stream()
                    .filter(u -> u.getEsEntrenador() == 0 && u.getEsEntrenado() == 0)
                    .forEach(this::agregarUsuariosAlComboBox);
        }   
    }
    
    private void agregarUsuariosAlComboBox(Usuarios user){
        comboBoxUsuarios.addItem(user.getNombre() + ", " + user.getCedula());   
    }
    
    public void cargarTabla(){             
        if(comboBoxUsuarios.getSelectedItem()==null){
            JOptionPane.showMessageDialog(null, "Debe seleccionar un usuario"); 
            return;
        }else{
            DefaultTableModel tblModel = (DefaultTableModel)jTable2.getModel();  
            tblModel.setRowCount(0);            
            setearUserSeleccionado();
            ServicioDieta funcionesDieta = sistema.getServicioDieta();
            ArrayList<String[]> datosDieta = funcionesDieta.getDatosDinamico(userSeleccionado);
            
            if(datosDieta.isEmpty()){
                JOptionPane.showMessageDialog(null, "No hay datos cargados aún");
                return;            
            }

            funcionesDieta.ordenarPorFecha(userSeleccionado);       
            for (String[] datos:datosDieta){
                tblModel.addRow(datos);
            }                                   
        }  
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton añadirPesaje;
    private javax.swing.JButton btnsalir;
    private javax.swing.JComboBox<String> comboBoxUsuarios;
    private javax.swing.JButton grafica;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton jUpdate;
    private javax.swing.JLabel lblPesajes;
    // End of variables declaration//GEN-END:variables
}
