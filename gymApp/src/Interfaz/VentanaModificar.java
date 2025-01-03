package Interfaz;
import Dominio.Sistema;
import Dominio.Usuarios;
import java.util.List;
import javax.swing.JFrame;

public class VentanaModificar extends javax.swing.JFrame{

    private Usuarios userSeleccionado;
    private Sistema sistema;
    private JFrame ventanaInicial;
    private String tareaSeleccionada;
    
    public VentanaModificar(String tarea, Usuarios user, JFrame ventana) {
        initComponents();      
        userSeleccionado= user;
        sistema = Sistema.getInstancia();
        ventanaInicial = ventana;
        btnNext.setFocusPainted(false); 
        tareaSeleccionada = tarea;        
        this.setLocationRelativeTo(null);
        cargarDiasComboBox();
    }
 
    private void cargarDiasComboBox() {
        String[] diasSemana = new String[]{"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};

        if (isTareaDeRutina()) {
            agregarDiasEntrenoComboBox(diasSemana);
        } else {
            userSeleccionado.getDieta().getListaDias().forEach(d -> jDays.addItem(d.getDiaSemana()));
        }
    }

    private boolean isTareaDeRutina() {
        return List.of("rellenar", "modificar", "seriesRepes", "eliminarMusculo", "añadirMusculo").contains(tareaSeleccionada);
    }

    private void agregarDiasEntrenoComboBox(String[] diasSemana) {
        int cont = 0;
        for (int i : userSeleccionado.getDiasEntreno()) {
            if (i == 1) {
                jDays.addItem(diasSemana[cont]);
            }
            cont++;
        }
    }    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDays = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Información");
        getContentPane().setLayout(null);

        jDays.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDaysActionPerformed(evt);
            }
        });
        getContentPane().add(jDays);
        jDays.setBounds(90, 70, 110, 22);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("       Selecciona el día que quieras modificar");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 20, 310, 30);

        btnNext.setBackground(new java.awt.Color(0, 20, 20));
        btnNext.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnNext.setForeground(new java.awt.Color(255, 255, 255));
        btnNext.setText("Siguiente");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        getContentPane().add(btnNext);
        btnNext.setBounds(180, 120, 90, 30);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 310, 190);

        setBounds(0, 0, 326, 198);
    }// </editor-fold>//GEN-END:initComponents

    private void jDaysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDaysActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDaysActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        String dia = jDays.getSelectedItem().toString();          
        abrirVentanaCorrespondiente(dia);
        dispose(); 
    }//GEN-LAST:event_btnNextActionPerformed

    
    private void abrirVentanaCorrespondiente(String dia) {
        switch (tareaSeleccionada) {
            case "rellenar" -> abrirVentana(new VentanaSetearEjercicios(dia, userSeleccionado, ventanaInicial));
            case "modificar" -> abrirVentana(new VentanaSetearMusculos(dia, userSeleccionado, ventanaInicial));
            case "agregar" -> abrirVentana(new VentanaAñadirComida(dia, userSeleccionado, ventanaInicial));
            case "armar" -> abrirVentana(new VentanaArmarComida(dia, userSeleccionado, ventanaInicial));
            case "seriesRepes" -> abrirVentana(new VentanaSetearSeriesRepes(dia, userSeleccionado, ventanaInicial));
            case "añadirMusculo" -> {
                sistema.getServicioRutina().añadirMusculos(userSeleccionado, dia);
                recargarVentanaRutina();
            }
            case "eliminarMusculo" -> abrirVentana(new VentanaEliminarMusculo(dia, userSeleccionado, ventanaInicial));
            default -> abrirVentana(new VentanaEliminarComida(dia, userSeleccionado, ventanaInicial));
        }
    }    

    private void abrirVentana(JFrame ventana) {
        ventana.setVisible(true);
    }    
    
    private void recargarVentanaRutina() {
        if (ventanaInicial instanceof VentanaRutina) {
            ((VentanaRutina) ventanaInicial).recargarListas();
            ventanaInicial.setVisible(true);
        }
    }    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNext;
    private javax.swing.JComboBox<String> jDays;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
