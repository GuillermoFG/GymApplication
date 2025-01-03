package Interfaz;
import Dominio.Sistema;
import Dominio.Usuarios;
import Funciones.Storage;
import Funciones.ValidationUtils;
import java.awt.Color;
import java.awt.Image;
import java.util.Optional;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class VentanaLogin extends javax.swing.JFrame{

    private Sistema sistema;
    private Storage storage;
    private Usuarios userSeleccionado;

    public VentanaLogin() {
        initComponents();       
        sistema = Sistema.getInstancia();
        storage = sistema.getStorage();    
        this.setLocationRelativeTo(null);  
        btnLogin.setFocusPainted(false);  
        btnRegister.setFocusPainted(false);     
        cargarImagen();
    }
    
    
    public VentanaLogin(Usuarios user) {
        initComponents();       
        sistema = Sistema.getInstancia();
        storage = sistema.getStorage();
        userSeleccionado = user;
        this.setLocationRelativeTo(null);  
        btnLogin.setFocusPainted(false);  
        btnRegister.setFocusPainted(false);     
        cargarImagen();
    }    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelInicio = new javax.swing.JLabel();
        lblCedula = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        lblContraseña = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();
        lblCuenta = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio Programa");
        getContentPane().setLayout(null);

        labelInicio.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        labelInicio.setForeground(new java.awt.Color(0, 102, 102));
        labelInicio.setText("INICIO");
        getContentPane().add(labelInicio);
        labelInicio.setBounds(390, 20, 150, 50);

        lblCedula.setText("Cédula");
        getContentPane().add(lblCedula);
        lblCedula.setBounds(330, 100, 150, 16);
        getContentPane().add(txtCedula);
        txtCedula.setBounds(330, 130, 240, 30);

        lblContraseña.setText("Contraseña");
        getContentPane().add(lblContraseña);
        lblContraseña.setBounds(330, 190, 150, 16);
        getContentPane().add(txtContraseña);
        txtContraseña.setBounds(330, 220, 240, 30);

        btnLogin.setBackground(new java.awt.Color(0, 20, 20));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("INICIAR");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin);
        btnLogin.setBounds(330, 290, 190, 40);

        btnRegister.setBackground(new java.awt.Color(0, 72, 79));
        btnRegister.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("REGISTRAR");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegister);
        btnRegister.setBounds(460, 370, 110, 30);

        lblCuenta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCuenta.setText("No tengo una cuenta");
        getContentPane().add(lblCuenta);
        lblCuenta.setBounds(330, 370, 120, 30);

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 290, 450);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel2);
        jPanel2.setBounds(290, 0, 300, 450);

        setBounds(0, 0, 607, 457);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String cedulaTexto = txtCedula.getText();
        String contraseñaTexto = txtContraseña.getText();           
        
        if (!ValidationUtils.validarEntrada(cedulaTexto, "cedula") || !ValidationUtils.validarEntrada(contraseñaTexto, "contraseña")) {
            JOptionPane.showMessageDialog(null, "Contraseña o Cédula contiene símbolos inválidos.", "Error de entrada", JOptionPane.ERROR_MESSAGE);             
            return;
        }    
        
        int cedula = Integer.parseInt(txtCedula.getText());
        int contraseña = Integer.parseInt(txtContraseña.getText());
        
        if(sistema.getServicioUsuario().verificarUsuarioYaLogeado(userSeleccionado,cedula)){
            JOptionPane.showMessageDialog(null, "Usuario con sesión ya iniciada en sistema.", "Error de entrada", JOptionPane.ERROR_MESSAGE);    
            dispose();
            Menu menu = new Menu(userSeleccionado);
            menu.setVisible(true);            
        }
          
        //chequea si el usuario que va a iniciar sesion es un entrenador
        Usuarios entrenador = null;      
        Optional<Usuarios> entrenadorOptional = sistema.getServicioUsuario().entrenadorEncontrado(cedula);  
        if(entrenadorOptional.isPresent()){
            entrenador = entrenadorOptional.get();
        }       
        storage.setEntrenador(entrenador);   //si el usuario logeando es entrenador, setea dicho user en el sistema como entrenador actual, si no, entrenador queda en null         

        
        //chequea si existe usuario en sistema
        Optional<Usuarios> userOptional = sistema.getServicioUsuario().usuarioEncontrado(cedula);                                  
        if(userOptional.isPresent()){
            Usuarios user = userOptional.get();
            if(user.getContraseña()==contraseña){                             
                dispose();
                Menu menu = new Menu(user);
                menu.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "Contraseña incorrecta.", "Error de entrada", JOptionPane.ERROR_MESSAGE);                
            }           
        }else{
            JOptionPane.showMessageDialog(null, "Usuario no registrado.", "Error de entrada", JOptionPane.ERROR_MESSAGE);             
        }      
    }//GEN-LAST:event_btnLoginActionPerformed

    
    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        dispose();
        VentanaSignUp ventana = new VentanaSignUp(userSeleccionado);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnRegisterActionPerformed
       
    
    private void cargarImagen(){
        // Crear un JLabel para el logo
        JLabel logoLabel = new JLabel();
        ImageIcon logo = new ImageIcon(getClass().getResource("/resources/logo2.png"));

        // Redimensionar la imagen a un tamaño deseado (ejemplo: 200x200 píxeles)
        Image image = logo.getImage();
        Image scaledImage = image.getScaledInstance(180, 180, java.awt.Image.SCALE_SMOOTH);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelInicio;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblCuenta;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtContraseña;
    // End of variables declaration//GEN-END:variables
}
