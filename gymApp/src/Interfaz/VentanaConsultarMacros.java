package Interfaz;
import Dominio.Dieta;
import Dominio.Sistema;
import Dominio.Usuarios;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class VentanaConsultarMacros extends javax.swing.JFrame{

    private Sistema sistema;
    private Usuarios userSeleccionado;    
    private JFrame ventanaInicial;    
    private JLabel lblCalorias;
    private JLabel lblProteinas;
    private JLabel lblGrasas;
    private JLabel lblCarbohidratos;
    
    public VentanaConsultarMacros(Usuarios user, JFrame ventana) {
        initComponents();     
        btnSalir.setFocusPainted(false);
        this.setLocationRelativeTo(null);        
        sistema = Sistema.getInstancia();
        userSeleccionado = user;
        ventanaInicial = ventana; 
        cargarPanelGenerico();
        cargarDatosPanel(user);
    }

    private void cargarPanelGenerico(){
        // Crear un borde para padding interno con más espacio en la parte superior
        Border paddingBorder = BorderFactory.createEmptyBorder(20, 10, 10, 10); // Más espacio en todos los lados
        Border visibleBorder = new LineBorder(Color.GRAY, 1); // Borde visible de color gris con 1 píxel de grosor
        jPanel1.setBorder(BorderFactory.createCompoundBorder(visibleBorder, paddingBorder));

        // Establecer un layout de tipo GridBagLayout
        jPanel1.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 15); // Añadir espacio entre componentes (top, left, bottom, right)
    
        // Crear una fuente más grande
        Font font = new Font("Arial", Font.PLAIN, 14);

        // Añadir JLabels para los campos con fuente aumentada
        JLabel caloriasLabel = new JLabel("-Calorías:");
        caloriasLabel.setFont(font);
        gbc.gridx = 0; gbc.gridy = 0; // Posición (columna 0, fila 0)
        gbc.anchor = GridBagConstraints.WEST;
        jPanel1.add(caloriasLabel, gbc);

        lblCalorias = new JLabel();
        lblCalorias.setFont(font);
        gbc.gridx = 1; gbc.gridy = 0; // Posición (columna 1, fila 0)
        gbc.anchor = GridBagConstraints.WEST;
        jPanel1.add(lblCalorias, gbc);

        JLabel proteinasLabel = new JLabel("-Proteínas:");
        proteinasLabel.setFont(font);
        gbc.gridx = 0; gbc.gridy = 1; // Posición (columna 0, fila 1)
        gbc.anchor = GridBagConstraints.WEST;
        jPanel1.add(proteinasLabel, gbc);

        lblProteinas = new JLabel();
        lblProteinas.setFont(font);
        gbc.gridx = 1; gbc.gridy = 1; // Posición (columna 1, fila 1)
        gbc.anchor = GridBagConstraints.WEST;
        jPanel1.add(lblProteinas, gbc);

        JLabel grasasLabel = new JLabel("-Grasas:");
        grasasLabel.setFont(font);
        gbc.gridx = 0; gbc.gridy = 2; // Posición (columna 0, fila 2)
        gbc.anchor = GridBagConstraints.WEST;
        jPanel1.add(grasasLabel, gbc);

        lblGrasas = new JLabel();
        lblGrasas.setFont(font);
        gbc.gridx = 1; gbc.gridy = 2; // Posición (columna 1, fila 2)
        gbc.anchor = GridBagConstraints.WEST;
        jPanel1.add(lblGrasas, gbc);

        JLabel carbohidratosLabel = new JLabel("-Carbohidratos:");
        carbohidratosLabel.setFont(font);
        gbc.gridx = 0; gbc.gridy = 3; // Posición (columna 0, fila 3)
        gbc.anchor = GridBagConstraints.WEST;
        jPanel1.add(carbohidratosLabel, gbc);

        lblCarbohidratos = new JLabel();
        lblCarbohidratos.setFont(font);
        gbc.gridx = 1; gbc.gridy = 3; // Posición (columna 1, fila 3)
        gbc.anchor = GridBagConstraints.WEST;
        jPanel1.add(lblCarbohidratos, gbc);
    }    
    
    private void cargarDatosPanel(Usuarios u){
        Dieta d = u.getDieta();
        lblCalorias.setText(""+d.getCalorias());
        lblProteinas.setText(""+d.getProteinas()+"g");
        lblGrasas.setText(""+d.getGrasas()+"g");
        lblCarbohidratos.setText(""+d.getCarbos()+"g");              
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        jTextField1.setText("jTextField1");

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Información");
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("OBJETIVOS");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(80, 20, 140, 16);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new java.awt.GridLayout(6, 2));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 50, 210, 130);

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
        btnSalir.setBounds(90, 200, 70, 36);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 250, 280);

        setBounds(0, 0, 267, 287);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
        if (ventanaInicial instanceof VentanaDieta) {
            ((VentanaDieta) ventanaInicial).recargarListas();
            ventanaInicial.setVisible(true);
        }
    }//GEN-LAST:event_btnSalirActionPerformed
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

}
