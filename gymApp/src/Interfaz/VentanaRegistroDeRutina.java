package Interfaz;
import Dominio.Sistema;
import Dominio.Usuarios;
import Funciones.Storage;
import Funciones.ValidationUtils;
import java.util.Optional;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VentanaRegistroDeRutina extends javax.swing.JFrame{

    private Sistema sistema;
    private Storage storage;    
    private Usuarios userSeleccionado;
    private JFrame ventanaInicial;    
    
    public VentanaRegistroDeRutina(Usuarios u, JFrame ventana) {
        initComponents();       
        sistema = Sistema.getInstancia();
        storage = sistema.getStorage();          
        userSeleccionado = u;
        ventanaInicial = ventana;
        this.setLocationRelativeTo(null);
        btnRegister.setFocusPainted(false);  
        btnSalir.setFocusPainted(false);    
        txtUsuario.setText(userSeleccionado.getNombre());
        txtCedula.setText(""+userSeleccionado.getCedula());      
    }

    public VentanaRegistroDeRutina() {
        initComponents();       
        sistema = Sistema.getInstancia();
        storage = sistema.getStorage();
        this.setLocationRelativeTo(null);
        btnRegister.setFocusPainted(false);  
        btnSalir.setFocusPainted(false);          
    }
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbSexo = new javax.swing.JComboBox<>();
        jViernes = new javax.swing.JCheckBox();
        lblIngreseDatos3 = new javax.swing.JLabel();
        jJueves = new javax.swing.JCheckBox();
        jLunes = new javax.swing.JCheckBox();
        jMartes = new javax.swing.JCheckBox();
        jMiercoles = new javax.swing.JCheckBox();
        jSabado = new javax.swing.JCheckBox();
        jDomingo = new javax.swing.JCheckBox();
        lblIngreseDatos4 = new javax.swing.JLabel();
        lblIngreseDatos5 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblIngreseDatos6 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        btnRegister = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de Rutina");
        getContentPane().setLayout(null);

        cbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino","Femenino"}));
        cbSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSexoActionPerformed(evt);
            }
        });
        getContentPane().add(cbSexo);
        cbSexo.setBounds(190, 310, 120, 22);

        jViernes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jViernes.setText("VIERNES");
        jViernes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jViernesActionPerformed(evt);
            }
        });
        getContentPane().add(jViernes);
        jViernes.setBounds(110, 220, 85, 24);

        lblIngreseDatos3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblIngreseDatos3.setText("SEXO");
        getContentPane().add(lblIngreseDatos3);
        lblIngreseDatos3.setBounds(230, 280, 60, 20);

        jJueves.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jJueves.setText("JUEVES");
        jJueves.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jJuevesActionPerformed(evt);
            }
        });
        getContentPane().add(jJueves);
        jJueves.setBounds(330, 190, 85, 20);

        jLunes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLunes.setText("LUNES");
        jLunes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLunesActionPerformed(evt);
            }
        });
        getContentPane().add(jLunes);
        jLunes.setBounds(50, 190, 85, 20);

        jMartes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMartes.setText("MARTES");
        jMartes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMartesActionPerformed(evt);
            }
        });
        getContentPane().add(jMartes);
        jMartes.setBounds(140, 190, 85, 20);

        jMiercoles.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMiercoles.setText("MIÉRCOLES");
        jMiercoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMiercolesActionPerformed(evt);
            }
        });
        getContentPane().add(jMiercoles);
        jMiercoles.setBounds(230, 190, 120, 20);

        jSabado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jSabado.setText("SÁBADO");
        jSabado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSabadoActionPerformed(evt);
            }
        });
        getContentPane().add(jSabado);
        jSabado.setBounds(200, 220, 85, 20);

        jDomingo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jDomingo.setText("DOMINGO");
        jDomingo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDomingoActionPerformed(evt);
            }
        });
        getContentPane().add(jDomingo);
        jDomingo.setBounds(290, 220, 100, 20);

        lblIngreseDatos4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblIngreseDatos4.setText("NOMBRE Y APELLIDO");
        getContentPane().add(lblIngreseDatos4);
        lblIngreseDatos4.setBounds(70, 30, 150, 20);

        lblIngreseDatos5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblIngreseDatos5.setText("DÍAS DE ENTRENAMIENTO");
        getContentPane().add(lblIngreseDatos5);
        lblIngreseDatos5.setBounds(170, 150, 220, 20);

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(60, 60, 160, 40);

        lblIngreseDatos6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblIngreseDatos6.setText("CÉDULA");
        getContentPane().add(lblIngreseDatos6);
        lblIngreseDatos6.setBounds(340, 30, 60, 20);

        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });
        getContentPane().add(txtCedula);
        txtCedula.setBounds(290, 60, 160, 40);

        btnRegister.setBackground(new java.awt.Color(0, 20, 20));
        btnRegister.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("REGISTRAR");
        btnRegister.setBorder(null);
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegister);
        btnRegister.setBounds(150, 400, 190, 40);

        btnSalir.setBackground(new java.awt.Color(155, 0, 0));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("SALIR");
        btnSalir.setBorder(null);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir);
        btnSalir.setBounds(410, 450, 70, 36);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 500, 530);

        setBounds(0, 0, 516, 537);
    }// </editor-fold>//GEN-END:initComponents
          
    private void setearCasillasDefault(){
        txtUsuario.setText("");
        txtCedula.setText("");        
        jLunes.setSelected(false);
        jMartes.setSelected(false);
        jMiercoles.setSelected(false);
        jJueves.setSelected(false);
        jViernes.setSelected(false);
        jSabado.setSelected(false);
        jDomingo.setSelected(false);                   
        cbSexo.setSelectedIndex(0);        
    }
    
    private void registroRutina(){
        try{                    
            String cedula = txtCedula.getText();
            String nombreUsuario = txtUsuario.getText();            
            
            if (!ValidationUtils.esNumeroValido(cedula)) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido para la cédula.", "Error de entrada", JOptionPane.ERROR_MESSAGE);
                return; // Sale del método si no es un número válido
            }            
           
            if (!ValidationUtils.esTextoValido(nombreUsuario)) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un nombre válido (solo letras).", "Error de entrada", JOptionPane.ERROR_MESSAGE);
                return; // Sale del método si el nombre no es válido
            }            
                         
            int cedulaUsuario = Integer.parseInt(cedula);                        
            String sexoUsuario = cbSexo.getSelectedItem().toString();      
            
            int[] diasEntreno = obtenerDiasEntreno();
            if (diasEntreno == null) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar al menos un día de entreno.", "Error de entrada", JOptionPane.ERROR_MESSAGE);
                return;
            }           
       
            Optional<Usuarios> userOptional = sistema.getServicioUsuario().usuarioEncontrado(cedulaUsuario);
            if(userOptional.isPresent()){
                Usuarios user = userOptional.get();
                //permite registrar los parametros al primer usuario que ingrese al sistema y no sea entrenador
                if(user.getDiasEntreno()==null){
                    actualizarUsuario(user, sexoUsuario, diasEntreno);
                    
                    JOptionPane.showMessageDialog(null, "Datos registrados correctamente");                   
                    if (ventanaInicial instanceof VentanaRutina) {
                        ((VentanaRutina) ventanaInicial).recargarListas();
                        ventanaInicial.setVisible(true);                                
                    }                        
                    dispose();
                    return;                   
                }else{
                    JOptionPane.showMessageDialog(null, "La cédula del usuario ya se encuentra registrada.", "Error de entrada", JOptionPane.ERROR_MESSAGE);
                    return;                      
                }                
            }
       
            Usuarios cliente = crearUsuario(nombreUsuario, sexoUsuario, diasEntreno, cedulaUsuario);     
            asociarClienteAEntrenador(cliente);

            JOptionPane.showMessageDialog(null, "Rutina registrada correctamente");          
            String [] botones = {"Si","No"};        
            int eleccion = JOptionPane.showOptionDialog(this, "¿Desea crear otra rutina?", "",0,0,null,botones,this);        
            if(eleccion==JOptionPane.NO_OPTION){       
                dispose();    
            }else{                  
                setearCasillasDefault();
            }                      
        }catch(NumberFormatException ex){
            System.out.println("se cayo");
        }        
    }
 
    private int[] obtenerDiasEntreno() {
        JCheckBox[] checkboxesDias = {jLunes, jMartes, jMiercoles, jJueves, jViernes, jSabado, jDomingo};
        int[] diasEntreno = new int[checkboxesDias.length];
        int contador = 0;

        for (int i = 0; i < checkboxesDias.length; i++) {
            if (checkboxesDias[i].isSelected()) {
                diasEntreno[i] = 1;
                contador++;
            }
        }
        return (contador > 0) ? diasEntreno : null; // Devuelve null si no hay días seleccionados
    }    
    
    private Usuarios crearUsuario(String nombre, String sexo, int[] diasEntreno, int cedula) {
        return sistema.getServicioUsuario().crearUsuario(nombre, sexo, diasEntreno, cedula, 0, 0);
    }

    private void actualizarUsuario(Usuarios user, String sexo, int[] diasEntreno) {
        user.setSexo(sexo);
        user.setDiasEntreno(diasEntreno);
    }

    private void asociarClienteAEntrenador(Usuarios cliente) {
        Usuarios entrenador = storage.getEntrenador();
        if (entrenador != null) {
            sistema.getServicioUsuario().añadirClienteAEntrenador(cliente, entrenador);
            cliente.setEntrenado(1);
        }
    }    

    private void cbSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSexoActionPerformed

    private void jViernesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jViernesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jViernesActionPerformed

    private void jJuevesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jJuevesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jJuevesActionPerformed

    private void jLunesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLunesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLunesActionPerformed

    private void jMartesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMartesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMartesActionPerformed

    private void jMiercolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMiercolesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMiercolesActionPerformed

    private void jSabadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSabadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSabadoActionPerformed

    private void jDomingoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDomingoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDomingoActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        registroRutina();                        
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbSexo;
    private javax.swing.JCheckBox jDomingo;
    private javax.swing.JCheckBox jJueves;
    private javax.swing.JCheckBox jLunes;
    private javax.swing.JCheckBox jMartes;
    private javax.swing.JCheckBox jMiercoles;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox jSabado;
    private javax.swing.JCheckBox jViernes;
    private javax.swing.JLabel lblIngreseDatos3;
    private javax.swing.JLabel lblIngreseDatos4;
    private javax.swing.JLabel lblIngreseDatos5;
    private javax.swing.JLabel lblIngreseDatos6;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
