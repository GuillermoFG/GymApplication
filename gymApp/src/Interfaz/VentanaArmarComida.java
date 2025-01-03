package Interfaz;
import Dominio.Comidas;
import Dominio.Sistema;
import Dominio.Usuarios;
import Funciones.ValidationUtils;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VentanaArmarComida extends javax.swing.JFrame{

    private Sistema sistema;
    private Usuarios userSeleccionado;  
    private JFrame ventanaInicial;    
    private String diaSeleccionado;

    public VentanaArmarComida(String dia, Usuarios user, JFrame ventana) {
        initComponents();           
        this.setLocationRelativeTo(null);         
        sistema = Sistema.getInstancia();
        userSeleccionado = user;
        ventanaInicial = ventana;   
        diaSeleccionado = dia;         
        lblDia.setText(dia);
        btnCrear.setFocusPainted(false);                 
        cargarLista();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        listComidas = new javax.swing.JList();
        lblDia = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jEliminar = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jComida = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jProteina = new javax.swing.JFormattedTextField();
        jCarbos = new javax.swing.JFormattedTextField();
        jGrasas = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnCrear = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        jTextField1.setText("jTextField1");

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Información");
        getContentPane().setLayout(null);

        listComidas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane4.setViewportView(listComidas);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(20, 110, 170, 180);

        lblDia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDia.setText("DIA");
        getContentPane().add(lblDia);
        lblDia.setBounds(90, 80, 70, 20);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Crear la misma comida para el resto de la semana");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 410, 370, 20);

        jEliminar.setText("AGREGAR");
        jEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(jEliminar);
        jEliminar.setBounds(180, 440, 110, 20);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Comida");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(300, 30, 90, 30);
        getContentPane().add(jComida);
        jComida.setBounds(220, 60, 210, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Grasas (gramos)");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(270, 280, 130, 30);
        getContentPane().add(jProteina);
        jProteina.setBounds(220, 140, 210, 30);
        getContentPane().add(jCarbos);
        jCarbos.setBounds(220, 230, 210, 30);
        getContentPane().add(jGrasas);
        jGrasas.setBounds(220, 310, 210, 30);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Proteínas (gramos)");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(260, 110, 130, 30);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Carbohidratos (gramos)");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(250, 200, 170, 30);

        btnCrear.setBackground(new java.awt.Color(0, 20, 20));
        btnCrear.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCrear.setForeground(new java.awt.Color(255, 255, 255));
        btnCrear.setText("CREAR COMIDA");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        getContentPane().add(btnCrear);
        btnCrear.setBounds(120, 520, 210, 30);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 470, 610);

        setBounds(0, 0, 485, 614);
    }// </editor-fold>//GEN-END:initComponents

    private void jEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jEliminarActionPerformed
   
    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        if(listComidas.getSelectedValue()!=null){
            Comidas comidaSeleccionada = (Comidas)listComidas.getSelectedValue();    
            String comida = jComida.getText();
            String proteinasTexto = jProteina.getText();
            String grasasTexto = jGrasas.getText();
            String carbosTexto = jCarbos.getText();
            boolean diasSemana = false;
            
            if (!ValidationUtils.esNumeroValido(proteinasTexto) || !ValidationUtils.esNumeroValido(grasasTexto) || !ValidationUtils.esNumeroValido(carbosTexto)) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido.", "Error de entrada", JOptionPane.ERROR_MESSAGE);
                return; // Sale del método si no es un número válido
            }             
            
            if(jEliminar.isSelected()){
                diasSemana = true;
            }
                                   
            sistema.getServicioDieta().crearComida(comidaSeleccionada, comida, proteinasTexto, grasasTexto, carbosTexto,diaSeleccionado,diasSemana,userSeleccionado);           
            dispose();        
            if (ventanaInicial instanceof VentanaDieta) {
                ((VentanaDieta) ventanaInicial).recargarListas();
                ventanaInicial.setVisible(true);            
            }                      
        }else{
            JOptionPane.showMessageDialog(null, "Debe seleccionar una comida");              
        }
    }//GEN-LAST:event_btnCrearActionPerformed

    private void cargarLista(){
        listComidas.setListData(sistema.getServicioDieta().getListaComidasPorDia(userSeleccionado,diaSeleccionado).toArray());        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JFormattedTextField jCarbos;
    private javax.swing.JFormattedTextField jComida;
    private javax.swing.JCheckBox jEliminar;
    private javax.swing.JFormattedTextField jGrasas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JFormattedTextField jProteina;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblDia;
    private javax.swing.JList listComidas;
    // End of variables declaration//GEN-END:variables

}
