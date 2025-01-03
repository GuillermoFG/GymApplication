package Interfaz;
import Dominio.Sistema;
import Dominio.Usuarios;
import Funciones.Storage;
import Funciones.ValidationUtils;
import java.util.List;
import javax.swing.JOptionPane;

public class VentanaRegistroDeDieta extends javax.swing.JFrame{

    private Sistema sistema;
    private Storage storage;    
    private Usuarios userSeleccionado;

    public VentanaRegistroDeDieta() {
        initComponents();        
        sistema = Sistema.getInstancia();
        storage = sistema.getStorage();        
        this.setLocationRelativeTo(null);
        btnRegister.setFocusPainted(false); 
        btnSalir.setFocusPainted(false);         
        
        cargarUsuariosEnComboBox();   
    }
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        comboBoxUsuarios = new javax.swing.JComboBox<>();
        lblIngreseDatos6 = new javax.swing.JLabel();
        txtAltura = new javax.swing.JTextField();
        lblIngreseDatos7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblIngreseDatos8 = new javax.swing.JLabel();
        lblIngreseDatos9 = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        lblIngreseDatos12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        comboBoxObjetivos = new javax.swing.JComboBox<>();
        comboBoxFrecuencia = new javax.swing.JComboBox<>();
        btnRegister = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblIngreseDatos10 = new javax.swing.JLabel();
        lblIngreseDatos14 = new javax.swing.JLabel();
        lblIngreseDatos11 = new javax.swing.JLabel();
        lblIngreseDatos15 = new javax.swing.JLabel();
        txtDia = new javax.swing.JTextField();
        lblIngreseDatos16 = new javax.swing.JLabel();
        txtMes = new javax.swing.JTextField();
        lblIngreseDatos17 = new javax.swing.JLabel();
        txtAño = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de Dieta");
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("FRECUENCIA DE ENTRENO");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 340, 190, 20);

        getContentPane().add(comboBoxUsuarios);
        comboBoxUsuarios.setBounds(190, 20, 260, 22);

        lblIngreseDatos6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblIngreseDatos6.setText("KG");
        getContentPane().add(lblIngreseDatos6);
        lblIngreseDatos6.setBounds(60, 170, 40, 20);

        txtAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlturaActionPerformed(evt);
            }
        });
        getContentPane().add(txtAltura);
        txtAltura.setBounds(160, 120, 50, 40);

        lblIngreseDatos7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblIngreseDatos7.setText("FECHA DE NACIMIENTO");
        getContentPane().add(lblIngreseDatos7);
        lblIngreseDatos7.setBounds(260, 90, 170, 20);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("SELECCIONAR USUARIO");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 20, 160, 20);

        lblIngreseDatos8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblIngreseDatos8.setText("PESO");
        getContentPane().add(lblIngreseDatos8);
        lblIngreseDatos8.setBounds(60, 90, 60, 20);

        lblIngreseDatos9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblIngreseDatos9.setText("ALTURA");
        getContentPane().add(lblIngreseDatos9);
        lblIngreseDatos9.setBounds(160, 90, 90, 20);

        txtPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesoActionPerformed(evt);
            }
        });
        getContentPane().add(txtPeso);
        txtPeso.setBounds(50, 120, 50, 40);

        lblIngreseDatos12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblIngreseDatos12.setText("CM");
        getContentPane().add(lblIngreseDatos12);
        lblIngreseDatos12.setBounds(170, 170, 40, 20);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("OBJETIVOS");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 280, 100, 20);

        comboBoxObjetivos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Perder peso","Mantener peso","Ganar peso"}));
        comboBoxObjetivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxObjetivosActionPerformed(evt);
            }
        });
        getContentPane().add(comboBoxObjetivos);
        comboBoxObjetivos.setBounds(110, 280, 150, 22);

        comboBoxFrecuencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sedentario(no entrenas)","Poco frecuente (1-2 días por semana)", "Moderado(3-5 días por semana)","Muy frecuente (6-7 veces por semana)","Atleta (2 veces por día)"}));
        comboBoxFrecuencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxFrecuenciaActionPerformed(evt);
            }
        });
        getContentPane().add(comboBoxFrecuencia);
        comboBoxFrecuencia.setBounds(210, 340, 240, 22);

        btnRegister.setBackground(new java.awt.Color(0, 20, 20));
        btnRegister.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("REGISTRAR");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegister);
        btnRegister.setBounds(150, 430, 190, 40);

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
        btnSalir.setBounds(390, 480, 70, 36);

        lblIngreseDatos10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblIngreseDatos10.setText("Ej: 180 ; 172");
        getContentPane().add(lblIngreseDatos10);
        lblIngreseDatos10.setBounds(150, 200, 100, 20);

        lblIngreseDatos14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblIngreseDatos14.setText("Ej: 85 ; 83.5");
        getContentPane().add(lblIngreseDatos14);
        lblIngreseDatos14.setBounds(40, 200, 100, 20);

        lblIngreseDatos11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblIngreseDatos11.setText("DD/MM/YYYY");
        getContentPane().add(lblIngreseDatos11);
        lblIngreseDatos11.setBounds(310, 160, 90, 40);

        lblIngreseDatos15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblIngreseDatos15.setText("Ej: 01/01/2000");
        getContentPane().add(lblIngreseDatos15);
        lblIngreseDatos15.setBounds(300, 200, 110, 20);

        txtDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiaActionPerformed(evt);
            }
        });
        getContentPane().add(txtDia);
        txtDia.setBounds(250, 120, 50, 40);

        lblIngreseDatos16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblIngreseDatos16.setText("/");
        getContentPane().add(lblIngreseDatos16);
        lblIngreseDatos16.setBounds(310, 120, 10, 40);

        txtMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMesActionPerformed(evt);
            }
        });
        getContentPane().add(txtMes);
        txtMes.setBounds(330, 120, 50, 40);

        lblIngreseDatos17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblIngreseDatos17.setText("/");
        getContentPane().add(lblIngreseDatos17);
        lblIngreseDatos17.setBounds(390, 120, 10, 40);

        txtAño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAñoActionPerformed(evt);
            }
        });
        getContentPane().add(txtAño);
        txtAño.setBounds(410, 120, 50, 40);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 500, 580);

        setBounds(0, 0, 515, 584);
    }// </editor-fold>//GEN-END:initComponents
 
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

    private void setearUserSeleccionado(){
        String user = comboBoxUsuarios.getSelectedItem().toString();   
        userSeleccionado = sistema.getServicioUsuario().obtenerUsuario(user).get();         
    }  
        
    private void registroDieta(){
        setearUserSeleccionado();       
        calcularMacros(userSeleccionado); //Calcula los macros para la dieta del usuario, y los setea en la misma      
    }
    
    private void calcularMacros(Usuarios userSeleccionado){;       
        String dia = txtDia.getText();
        String mes = txtMes.getText();
        String año = txtAño.getText();
        String fecha = (dia + "/" + mes + "/" + año);    
        String pesoTexto = txtPeso.getText();
        String alturaTexto = txtAltura.getText();
        String frecuencia = comboBoxFrecuencia.getSelectedItem().toString();
        String objetivo = comboBoxObjetivos.getSelectedItem().toString();
              
        if (ValidationUtils.esTextoValido(pesoTexto) || ValidationUtils.esTextoValido(alturaTexto)) {
            JOptionPane.showMessageDialog(null, "No puede ingresar letras.", "Error de entrada", JOptionPane.ERROR_MESSAGE);
            return; // Sale del método si el nombre no es válido
        }            
        
        if (!ValidationUtils.esFechaValida(fecha)) {
            JOptionPane.showMessageDialog(null, "Fecha inválida. Ingrese una fecha en el formato DD/MM/YYYY.", "Error de entrada", JOptionPane.ERROR_MESSAGE);
            return;
        }        
        
        sistema.getServicioDieta().setearMacrosParaUsuario(userSeleccionado, fecha, pesoTexto, alturaTexto, dia, mes, año, frecuencia, objetivo);
        
        JOptionPane.showMessageDialog(null, "Datos registrados correctamente");  
                
        String [] botones = {"Si","No"};        
        int eleccion = JOptionPane.showOptionDialog(this, "¿Desea crear otra dieta?", "",0,0,null,botones,this);        
        if(eleccion==JOptionPane.NO_OPTION){       
            dispose();    
        }else{
            setearCamposVacios();                                      
        }             
    }
        
    private void setearCamposVacios(){
        txtPeso.setText("");
        txtAltura.setText("");
        txtDia.setText("");  
        txtMes.setText("");
        txtAño.setText("");
        comboBoxObjetivos.setSelectedIndex(0);
        comboBoxFrecuencia.setSelectedIndex(0);       
        comboBoxUsuarios.setSelectedIndex(0);           
    }
            
    private void txtAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlturaActionPerformed

    private void txtPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesoActionPerformed

    private void comboBoxObjetivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxObjetivosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxObjetivosActionPerformed

    private void comboBoxFrecuenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxFrecuenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxFrecuenciaActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        registroDieta(); 
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiaActionPerformed

    private void txtMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMesActionPerformed

    private void txtAñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAñoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAñoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> comboBoxFrecuencia;
    private javax.swing.JComboBox<String> comboBoxObjetivos;
    private javax.swing.JComboBox<String> comboBoxUsuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblIngreseDatos10;
    private javax.swing.JLabel lblIngreseDatos11;
    private javax.swing.JLabel lblIngreseDatos12;
    private javax.swing.JLabel lblIngreseDatos14;
    private javax.swing.JLabel lblIngreseDatos15;
    private javax.swing.JLabel lblIngreseDatos16;
    private javax.swing.JLabel lblIngreseDatos17;
    private javax.swing.JLabel lblIngreseDatos6;
    private javax.swing.JLabel lblIngreseDatos7;
    private javax.swing.JLabel lblIngreseDatos8;
    private javax.swing.JLabel lblIngreseDatos9;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtAño;
    private javax.swing.JTextField txtDia;
    private javax.swing.JTextField txtMes;
    private javax.swing.JTextField txtPeso;
    // End of variables declaration//GEN-END:variables
}
