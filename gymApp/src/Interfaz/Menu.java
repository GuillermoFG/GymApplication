package Interfaz;
import Dominio.Sistema;
import Dominio.Usuarios;
import Funciones.Navegacion;
import Funciones.UIUtils;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Menu extends javax.swing.JFrame {

    private static Sistema sistema;
    private Usuarios userSeleccionado;
    
    public Menu (Usuarios user){
        sistema = Sistema.getInstancia();
        userSeleccionado = user;
        //JFrame frame = new JFrame("Maximizar Logo");
        //JPanel panel = new JPanel();
        
        initComponents();
        this.setLocationRelativeTo(null);   
        //UIUtils.test(this,jPanel1,"/resources/logo2.png");
        //UIUtils.configurarLogo(jPanel1, "/resources/logo2.png");       
        //UIUtils.casi(this,jPanel1, "/resources/logo2.png");
        UIUtils.config(jPanel1, "/resources/logo2.png");
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        menuBar = new javax.swing.JMenuBar();
        itmConsultaCliente = new javax.swing.JMenu();
        itmRegistroDeRutina = new javax.swing.JMenuItem();
        itmRegistroDeDieta = new javax.swing.JMenuItem();
        itmRegistroDeCliente = new javax.swing.JMenuItem();
        itmIniciarSesion = new javax.swing.JMenuItem();
        itmRutina = new javax.swing.JMenu();
        itmConsultaRutina = new javax.swing.JMenuItem();
        itmDieta = new javax.swing.JMenu();
        itmConsultaDieta = new javax.swing.JMenuItem();
        itmChequeoPeso = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HIUCH");
        getContentPane().setLayout(null);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1600, 890);

        itmConsultaCliente.setMnemonic('f');
        itmConsultaCliente.setText("Registros");

        itmRegistroDeRutina.setMnemonic('o');
        itmRegistroDeRutina.setText("Registro de rutina");
        itmRegistroDeRutina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmRegistroDeRutinaActionPerformed(evt);
            }
        });
        itmConsultaCliente.add(itmRegistroDeRutina);

        itmRegistroDeDieta.setMnemonic('s');
        itmRegistroDeDieta.setText("Registro de dieta");
        itmRegistroDeDieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmRegistroDeDietaActionPerformed(evt);
            }
        });
        itmConsultaCliente.add(itmRegistroDeDieta);

        itmRegistroDeCliente.setMnemonic('a');
        itmRegistroDeCliente.setText("Consulta de clientes");
        itmRegistroDeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmRegistroDeClienteActionPerformed(evt);
            }
        });
        itmConsultaCliente.add(itmRegistroDeCliente);

        itmIniciarSesion.setText("Iniciar sesión");
        itmIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmIniciarSesionActionPerformed(evt);
            }
        });
        itmConsultaCliente.add(itmIniciarSesion);

        menuBar.add(itmConsultaCliente);

        itmRutina.setMnemonic('e');
        itmRutina.setText("Rutina");

        itmConsultaRutina.setMnemonic('d');
        itmConsultaRutina.setText("Consulta de Rutina");
        itmConsultaRutina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmConsultaRutinaActionPerformed(evt);
            }
        });
        itmRutina.add(itmConsultaRutina);

        menuBar.add(itmRutina);

        itmDieta.setMnemonic('h');
        itmDieta.setText("Dieta");

        itmConsultaDieta.setMnemonic('c');
        itmConsultaDieta.setText("Consulta de Dieta");
        itmConsultaDieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmConsultaDietaActionPerformed(evt);
            }
        });
        itmDieta.add(itmConsultaDieta);

        itmChequeoPeso.setMnemonic('a');
        itmChequeoPeso.setText("Chequeo de Peso Corporal");
        itmChequeoPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmChequeoPesoActionPerformed(evt);
            }
        });
        itmDieta.add(itmChequeoPeso);

        menuBar.add(itmDieta);

        setJMenuBar(menuBar);

        setBounds(0, 0, 1615, 922);
    }// </editor-fold>//GEN-END:initComponents

    private void itmRegistroDeRutinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmRegistroDeRutinaActionPerformed
        Navegacion.abrirVentanaRegistroDeRutina();     
    }//GEN-LAST:event_itmRegistroDeRutinaActionPerformed

    private void itmRegistroDeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmRegistroDeClienteActionPerformed
        Navegacion.abrirVentanaConsultaClientes(this);     
    }//GEN-LAST:event_itmRegistroDeClienteActionPerformed

    private void itmRegistroDeDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmRegistroDeDietaActionPerformed
        Navegacion.abrirVentanaRegistroDeDieta();     
    }//GEN-LAST:event_itmRegistroDeDietaActionPerformed

    private void itmConsultaRutinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmConsultaRutinaActionPerformed
        Navegacion.abrirVentanaRutina();     
    }//GEN-LAST:event_itmConsultaRutinaActionPerformed

    private void itmConsultaDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmConsultaDietaActionPerformed
        Navegacion.abrirVentanaDieta();     
    }//GEN-LAST:event_itmConsultaDietaActionPerformed

    private void itmChequeoPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmChequeoPesoActionPerformed
        Navegacion.abrirVentanaChequeoPesajes();     
    }//GEN-LAST:event_itmChequeoPesoActionPerformed

    private void itmIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmIniciarSesionActionPerformed
        dispose();
        Navegacion.abrirVentanaLogin();     
    }//GEN-LAST:event_itmIniciarSesionActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itmChequeoPeso;
    private javax.swing.JMenu itmConsultaCliente;
    private javax.swing.JMenuItem itmConsultaDieta;
    private javax.swing.JMenuItem itmConsultaRutina;
    private javax.swing.JMenu itmDieta;
    private javax.swing.JMenuItem itmIniciarSesion;
    private javax.swing.JMenuItem itmRegistroDeCliente;
    private javax.swing.JMenuItem itmRegistroDeDieta;
    private javax.swing.JMenuItem itmRegistroDeRutina;
    private javax.swing.JMenu itmRutina;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
