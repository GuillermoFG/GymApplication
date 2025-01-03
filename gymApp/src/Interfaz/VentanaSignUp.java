package Interfaz;
import Dominio.Sistema;
import Dominio.Usuarios;
import Funciones.ValidationUtils;
import java.awt.Color;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class VentanaSignUp extends javax.swing.JFrame {

    private Sistema sistema;
    private Usuarios userSeleccionado;
       
    public VentanaSignUp(Usuarios user) {
        initComponents();   
        sistema = Sistema.getInstancia();
        userSeleccionado = user;
        this.setLocationRelativeTo(null);  
        btnRegister.setFocusPainted(false);  
        btnLogin.setFocusPainted(false);   
        cargarImagen();
    }    

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelInicio = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblCedula = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        lblContraseña = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JTextField();
        btnRegister = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        lblCuenta = new javax.swing.JLabel();
        checkEntrenador = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio Programa");
        getContentPane().setLayout(null);

        labelInicio.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        labelInicio.setForeground(new java.awt.Color(0, 102, 102));
        labelInicio.setText("REGISTRO");
        getContentPane().add(labelInicio);
        labelInicio.setBounds(360, 20, 190, 50);

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 300, 610);

        lblNombre.setText("Nombre Completo");
        getContentPane().add(lblNombre);
        lblNombre.setBounds(330, 100, 150, 16);
        getContentPane().add(txtNombre);
        txtNombre.setBounds(330, 130, 240, 30);

        lblCedula.setText("Cédula");
        getContentPane().add(lblCedula);
        lblCedula.setBounds(330, 190, 150, 16);
        getContentPane().add(txtCedula);
        txtCedula.setBounds(330, 220, 240, 30);

        lblContraseña.setText("Contraseña");
        getContentPane().add(lblContraseña);
        lblContraseña.setBounds(330, 280, 150, 16);
        getContentPane().add(txtContraseña);
        txtContraseña.setBounds(330, 310, 240, 30);

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
        btnRegister.setBounds(330, 440, 190, 40);

        btnLogin.setBackground(new java.awt.Color(0, 72, 79));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("INICIAR");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin);
        btnLogin.setBounds(460, 520, 110, 30);

        lblCuenta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCuenta.setText("Ya tengo una cuenta");
        getContentPane().add(lblCuenta);
        lblCuenta.setBounds(330, 520, 170, 30);

        checkEntrenador.setText("Entrenador");
        getContentPane().add(checkEntrenador);
        checkEntrenador.setBounds(330, 380, 100, 20);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel2);
        jPanel2.setBounds(300, 0, 300, 610);

        setBounds(0, 0, 616, 618);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        String nombreTexto = txtNombre.getText();
        String cedulaTexto = txtCedula.getText();
        String contraseñaTexto = txtContraseña.getText();
        
        if (!ValidationUtils.validarEntrada(cedulaTexto, "cedula") || !ValidationUtils.validarEntrada(contraseñaTexto, "contraseña")) {
            JOptionPane.showMessageDialog(null, "Contraseña o Cédula contiene símbolos inválidos.", "Error de entrada", JOptionPane.ERROR_MESSAGE);              
            return;
        }            
        
        if(nombreTexto.isEmpty()||(!ValidationUtils.esTextoValido(nombreTexto))){
            JOptionPane.showMessageDialog(null, "Ingrese un nombre válido.", "Error de entrada", JOptionPane.ERROR_MESSAGE);
             return;            
        }         

        int cedula = Integer.parseInt(cedulaTexto);
        int contraseña = Integer.parseInt(contraseñaTexto);
        
        if(!sistema.getServicioUsuario().usuarioEncontrado(cedula).isPresent()){                      
            if(checkEntrenador.isSelected()){
                Usuarios u = sistema.getServicioUsuario().crearUsuario(nombreTexto, cedula, contraseña);                    
                sistema.getServicioUsuario().añadirAListaEntrenadores(u);
                u.setEntrenador(1);
                u.setEntrenado(0);
                cerrarVentana();           
            }else{
                if(sistema.getServicioUsuario().getListaUsuarios().isEmpty()){
                    Usuarios u = sistema.getServicioUsuario().crearUsuario(nombreTexto, cedula, contraseña);                    
                    u.setEntrenador(0);
                    u.setEntrenado(0);
                    JOptionPane.showMessageDialog(null, "Usuario registrado correctamente");                                              
                    cerrarVentana();                          
                }else{
                    JOptionPane.showMessageDialog(null, "Interfaz permitida para un solo registro de usuario no entrenador.", "Error de entrada", JOptionPane.ERROR_MESSAGE);                   
                }
            }            
        }else{
            JOptionPane.showMessageDialog(null, "Usuario ya registrado.", "Error de entrada", JOptionPane.ERROR_MESSAGE);            
        }     
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void cerrarVentana(){
        dispose();
        VentanaLogin ventana = new VentanaLogin(userSeleccionado);
        ventana.setVisible(true);         
    }
    
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        dispose();
        VentanaLogin ventana = new VentanaLogin(userSeleccionado);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnLoginActionPerformed
 
    private void cargarImagen(){
        // Crear un JLabel para el logo
        JLabel logoLabel = new JLabel();
        ImageIcon logo = new ImageIcon(getClass().getResource("/resources/logo2.png"));

        // Redimensionar la imagen a un tamaño deseado (ejemplo: 200x200 píxeles)
        Image image = logo.getImage();
        Image scaledImage = image.getScaledInstance(210, 210, java.awt.Image.SCALE_SMOOTH);
        ImageIcon scaledLogo = new ImageIcon(scaledImage);
        logoLabel.setIcon(scaledLogo);
        logoLabel.setHorizontalAlignment(JLabel.CENTER);

        // Crear un JPanel para la imagen con un margen alrededor
        JPanel logoPanel = new JPanel();
        logoPanel.setBackground(new Color(15,45,55));
        logoPanel.setLayout(new java.awt.BorderLayout());
        logoPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 85, 20)); // Márgenes: arriba, izquierda, abajo, derecha
        logoPanel.add(logoLabel, java.awt.BorderLayout.CENTER);

        // Añadir el panel con la imagen redimensionada al panel principal
        jPanel3.setLayout(new java.awt.BorderLayout());
        jPanel3.add(logoPanel, java.awt.BorderLayout.CENTER);       
    }    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegister;
    private javax.swing.JCheckBox checkEntrenador;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelInicio;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblCuenta;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
