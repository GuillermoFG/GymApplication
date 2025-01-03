package Interfaz;
import Dominio.Rutina;
import Dominio.Dieta;
import Dominio.Sistema;
import Dominio.Usuarios;
import Funciones.Navegacion;
import Funciones.ServicioUsuario;
import Funciones.Storage;
import Funciones.ValidationUtils;
import java.awt.Color;
import java.util.Optional;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class VentanaConsultaClientes extends javax.swing.JFrame{

    private Sistema sistema;
    private Storage storage;
    private Usuarios userSeleccionado;
    private JLabel lblNombre;
    private JLabel lblGenero;
    private JLabel lblEdad;
    private JLabel lblDiasEntreno;
    private JLabel lblObjetivoDieta;
    private JLabel lblCalorias;    
    private JLabel lblAltura;
    private JLabel lblPeso;        
    private JFrame ventanaInicial;   

    public VentanaConsultaClientes(JFrame ventana) {
        initComponents();        
        sistema = Sistema.getInstancia();
        storage = sistema.getStorage();
        ventanaInicial = ventana;        
        seleccionarUsuario.setFocusPainted(false);  
        filtrarNombre.setFocusPainted(false);  
        eliminarFiltro.setFocusPainted(false);  
        filtrarCedula.setFocusPainted(false);  
        btnSalir.setFocusPainted(false); 
        eliminarUsuario.setFocusPainted(false);         
        this.setLocationRelativeTo(null);
        
        cargarPanelGenerico();                   
        Usuarios entrenador = storage.getEntrenador();
        actualizarListaClientes(entrenador);        
    }
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        seleccionarUsuario = new javax.swing.JButton();
        filtrarCedula = new javax.swing.JButton();
        filtrarNombre = new javax.swing.JButton();
        campoCedula = new javax.swing.JTextField();
        campoNombre = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        listaUsuarios = new javax.swing.JList();
        eliminarFiltro = new javax.swing.JButton();
        eliminarUsuario = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de Dieta");
        getContentPane().setLayout(null);

        seleccionarUsuario.setBackground(new java.awt.Color(0, 20, 20));
        seleccionarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        seleccionarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        seleccionarUsuario.setText("SELECCIONAR USUARIO");
        seleccionarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionarUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(seleccionarUsuario);
        seleccionarUsuario.setBounds(50, 20, 180, 30);

        filtrarCedula.setBackground(new java.awt.Color(0, 20, 20));
        filtrarCedula.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        filtrarCedula.setForeground(new java.awt.Color(255, 255, 255));
        filtrarCedula.setText("FILTRAR CEDULA");
        filtrarCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtrarCedulaActionPerformed(evt);
            }
        });
        getContentPane().add(filtrarCedula);
        filtrarCedula.setBounds(60, 500, 160, 30);

        filtrarNombre.setBackground(new java.awt.Color(0, 20, 20));
        filtrarNombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        filtrarNombre.setForeground(new java.awt.Color(255, 255, 255));
        filtrarNombre.setText("FILTRAR NOMBRE");
        filtrarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtrarNombreActionPerformed(evt);
            }
        });
        getContentPane().add(filtrarNombre);
        filtrarNombre.setBounds(60, 380, 160, 30);

        campoCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCedulaActionPerformed(evt);
            }
        });
        getContentPane().add(campoCedula);
        campoCedula.setBounds(50, 440, 180, 40);

        campoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNombreActionPerformed(evt);
            }
        });
        getContentPane().add(campoNombre);
        campoNombre.setBounds(50, 330, 180, 40);

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
        btnSalir.setBounds(470, 570, 70, 36);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new java.awt.GridLayout(6, 2));
        jPanel1.setLayout(new java.awt.GridLayout(8, 2));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(290, 50, 250, 290);

        listaUsuarios.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane5.setViewportView(listaUsuarios);

        getContentPane().add(jScrollPane5);
        jScrollPane5.setBounds(30, 70, 220, 240);

        eliminarFiltro.setBackground(new java.awt.Color(0, 20, 20));
        eliminarFiltro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        eliminarFiltro.setForeground(new java.awt.Color(255, 255, 255));
        eliminarFiltro.setText("LIMPIAR FILTRO");
        eliminarFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarFiltroActionPerformed(evt);
            }
        });
        getContentPane().add(eliminarFiltro);
        eliminarFiltro.setBounds(330, 410, 170, 30);

        eliminarUsuario.setBackground(new java.awt.Color(155, 0, 0));
        eliminarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        eliminarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        eliminarUsuario.setText("ELIMINAR USUARIO");
        eliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(eliminarUsuario);
        eliminarUsuario.setBounds(330, 470, 170, 30);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 570, 660);

        setBounds(0, 0, 586, 667);
    }// </editor-fold>//GEN-END:initComponents
                
    private void cargarPanelGenerico(){
        Border paddingBorder = BorderFactory.createEmptyBorder(10, 5, 5, 5); // Margen interno
        Border visibleBorder = new LineBorder(Color.GRAY, 1); // Borde visible de color gris con 1 píxel de grosor
        jPanel1.setBorder(BorderFactory.createCompoundBorder(visibleBorder, paddingBorder));
   
        // Añadir JLabels para los campos
        jPanel1.add(new JLabel("Nombre y Apellido:"));
        lblNombre = new JLabel();
        jPanel1.add(lblNombre);

        jPanel1.add(new JLabel("Género:"));
        lblGenero = new JLabel();
        jPanel1.add(lblGenero);

        jPanel1.add(new JLabel("Edad:"));
        lblEdad = new JLabel();
        jPanel1.add(lblEdad);
        
        jPanel1.add(new JLabel("Altura:"));
        lblAltura = new JLabel();
        jPanel1.add(lblAltura);

        jPanel1.add(new JLabel("Peso:"));
        lblPeso = new JLabel();
        jPanel1.add(lblPeso);        

        jPanel1.add(new JLabel("Días de Entreno:"));
        lblDiasEntreno = new JLabel();
        jPanel1.add(lblDiasEntreno);

        jPanel1.add(new JLabel("Objetivo Dieta:"));
        lblObjetivoDieta = new JLabel();
        jPanel1.add(lblObjetivoDieta);

        jPanel1.add(new JLabel("Objetivo Calorías:"));
        lblCalorias = new JLabel();
        jPanel1.add(lblCalorias);        
    }
    
    private void cargarDatosPanel(Usuarios u){
        lblNombre.setText(u.getNombre());
        lblGenero.setText(u.getSexo() != null ? u.getSexo() : "Sexo sin definir");
        lblEdad.setText(u.getFechaNacimiento() != null ? u.calcularEdad() + " años" : "Fecha sin definir");
        lblAltura.setText(u.getAltura() != 0 ? u.getAltura() + "cm" : "Altura sin definir");
        lblPeso.setText(u.getPeso() != 0 ? u.getPeso() + "kg" : "Peso sin definir");

        Rutina r = u.getRutina();
        Dieta d = u.getDieta();

        lblDiasEntreno.setText(u.getDiasEntreno() == null ? "Rutina sin definir" : String.valueOf(sistema.getServicioUsuario().calcularDiasDeEntreno(u)));
        lblObjetivoDieta.setText(d.getObjetivo() != null ? d.getObjetivo() : "Objetivo sin definir");
        lblCalorias.setText(d.getCalorias() != 0 ? String.valueOf(d.getCalorias()) : "Calorías sin definir");
    }
 
    private void actualizarListaClientes(Usuarios entrenador){
        String [] usuariosFiltrados = sistema.getServicioUsuario().usuariosSinFiltro(entrenador);
        listaUsuarios.setListData(usuariosFiltrados);          
    }
  
    private int extraerCedulaDeString(String user) {
        return Integer.parseInt(user.replaceAll("\\D+", ""));
    }

    private void mostrarMensajeError(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Error de entrada", JOptionPane.ERROR_MESSAGE);
    }    
      
    private void seleccionarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionarUsuarioActionPerformed
        if (listaUsuarios.getSelectedValue() == null) {
            mostrarMensajeError("Debe seleccionar un usuario");
            return;
        }        

        String user = (String) listaUsuarios.getSelectedValue();
        int cedula = extraerCedulaDeString(user);
        Optional<Usuarios> userOptional = sistema.getServicioUsuario().usuarioEncontrado(cedula);

        userOptional.ifPresentOrElse(
            this::cargarDatosPanel,
            () -> mostrarMensajeError("Usuario no encontrado.")
        );               
    }//GEN-LAST:event_seleccionarUsuarioActionPerformed

    private void filtrarCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtrarCedulaActionPerformed
        campoNombre.setText("");  
        String cedula = campoCedula.getText();
        
        if (!ValidationUtils.esNumeroValido(cedula)) {
            mostrarMensajeError("Por favor, ingrese un número válido para la cédula.");
            return; // Sale del método si no es un número válido
        }                    

        Usuarios entrenador = storage.getEntrenador();
        String [] usuariosFiltrados = sistema.getServicioUsuario().contieneCedulaUsuario(cedula, entrenador);
        listaUsuarios.setListData(usuariosFiltrados);    
    }//GEN-LAST:event_filtrarCedulaActionPerformed

    private void filtrarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtrarNombreActionPerformed
        campoCedula.setText("");          
        String nombreFiltro = campoNombre.getText();
        
        if (!ValidationUtils.esTextoValido(nombreFiltro)) {
            mostrarMensajeError("Por favor, ingrese un nombre válido (solo letras).");            
            return; // Sale del método si el nombre no es válido
        }                      
                 
        Usuarios entrenador = storage.getEntrenador();
        String [] usuariosFiltrados = sistema.getServicioUsuario().contieneNombreUsuario(nombreFiltro, entrenador);
        listaUsuarios.setListData(usuariosFiltrados);                
    }//GEN-LAST:event_filtrarNombreActionPerformed

    private void campoCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCedulaActionPerformed

    private void campoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNombreActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void eliminarFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarFiltroActionPerformed
        campoCedula.setText("");
        campoNombre.setText("");  

        Usuarios entrenador = storage.getEntrenador();
        String [] usuariosFiltrados = sistema.getServicioUsuario().usuariosSinFiltro(entrenador);
        listaUsuarios.setListData(usuariosFiltrados);                       
    }//GEN-LAST:event_eliminarFiltroActionPerformed

    private void eliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarUsuarioActionPerformed
        if (storage.getEntrenador() == null) {
            JOptionPane.showMessageDialog(null, "Opción solo disponible para entrenadores.", "Error de entrada", JOptionPane.ERROR_MESSAGE);    
            return;
        }
        String[] botones = {"Si", "No"}; 
        String user = (String) listaUsuarios.getSelectedValue();
        int cedulaEntrenador = extraerCedulaDeString(user);
        Usuarios entrenadorSistema = storage.getEntrenador();

        ServicioUsuario funcionesUsuario = sistema.getServicioUsuario();

        // Confirmación para eliminar entrenador y sus clientes
        if (funcionesUsuario.entrenadorEncontrado(cedulaEntrenador).isPresent()) {
            int eleccion = JOptionPane.showOptionDialog(this, "¿Estás seguro de eliminar el usuario entrenador y todos sus clientes?", "", 0, 0, null, botones, this);        
            if (eleccion == JOptionPane.YES_OPTION) {         
                int eleccionDos = JOptionPane.showOptionDialog(this, "Volver a confirmar", "", 0, 0, null, botones, this);      
                if (eleccionDos == JOptionPane.YES_OPTION) {
                    boolean entrenadorEliminado = funcionesUsuario.eliminarEntrenadorYClientes(cedulaEntrenador);
                    if (entrenadorEliminado) {
                        boolean entrenadorLogeadoEliminar = entrenadorSistema.getCedula() == cedulaEntrenador;
                        if (entrenadorLogeadoEliminar) {
                            dispose(); 
                            if (ventanaInicial != null) ventanaInicial.dispose();
                            storage.setEntrenador(null);
                            Navegacion.abrirVentanaLogin();
                            return;              
                        } else {
                            actualizarListaClientes(entrenadorSistema);   
                            cargarPanelGenerico();
                        }
                    }
                }        
            }  
        }

        // Confirmación para eliminar un cliente
        int cedulaUsuario = extraerCedulaDeString(user);
        if (funcionesUsuario.usuarioEncontrado(cedulaUsuario).isPresent()) {       
            int eleccion = JOptionPane.showOptionDialog(this, "¿Estás seguro de eliminar al usuario seleccionado?", "", 0, 0, null, botones, this);        
            if (eleccion == JOptionPane.YES_OPTION) {         
                int eleccionDos = JOptionPane.showOptionDialog(this, "Volver a confirmar", "", 0, 0, null, botones, this);      
                if (eleccionDos == JOptionPane.YES_OPTION) {
                    boolean clienteEliminado = funcionesUsuario.eliminarCliente(cedulaUsuario);
                    if (clienteEliminado) {
                        actualizarListaClientes(storage.getEntrenador());
                        cargarPanelGenerico();
                    }
                }
            }  
        }
    }//GEN-LAST:event_eliminarUsuarioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JTextField campoCedula;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JButton eliminarFiltro;
    private javax.swing.JButton eliminarUsuario;
    private javax.swing.JButton filtrarCedula;
    private javax.swing.JButton filtrarNombre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JList listaUsuarios;
    private javax.swing.JButton seleccionarUsuario;
    // End of variables declaration//GEN-END:variables
}
