package Interfaz;
import Dominio.Comidas;
import Dominio.Dias;
import Dominio.Sistema;
import Dominio.Usuarios;
import Funciones.ComidasRespaldo;
import Funciones.Navegacion;
import Funciones.ServicioDieta;
import Funciones.Storage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class VentanaDieta extends javax.swing.JFrame{
    private Sistema sistema;
    private Storage storage;
    private Usuarios userSeleccionado;
    private ComidasRespaldo [][] respaldo;

    public VentanaDieta() {
        initComponents();       
        sistema = Sistema.getInstancia();
        storage = sistema.getStorage();
        this.setLocationRelativeTo(null);      
        armarComida.setFocusPainted(false);  
        jUpdate.setFocusPainted(false);   
        consultaIngredientes.setFocusPainted(false);   
        btnAddIngredientes.setFocusPainted(false);  
        btnConsultarMacros.setFocusPainted(false);   
        btnEliminar.setFocusPainted(false);   
        btnResetTable.setFocusPainted(false);   
        
        cargarUsuariosEnComboBox();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtBaja = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jMartes = new javax.swing.JList();
        jScrollPane5 = new javax.swing.JScrollPane();
        jLunes = new javax.swing.JList();
        jScrollPane6 = new javax.swing.JScrollPane();
        jJueves = new javax.swing.JList();
        jScrollPane7 = new javax.swing.JScrollPane();
        jMiercoles = new javax.swing.JList();
        jScrollPane8 = new javax.swing.JScrollPane();
        jDomingo = new javax.swing.JList();
        jScrollPane9 = new javax.swing.JScrollPane();
        jViernes = new javax.swing.JList();
        jScrollPane10 = new javax.swing.JScrollPane();
        jSabado = new javax.swing.JList();
        txtBaja2 = new javax.swing.JLabel();
        txtBaja3 = new javax.swing.JLabel();
        txtBaja4 = new javax.swing.JLabel();
        txtBaja5 = new javax.swing.JLabel();
        txtBaja6 = new javax.swing.JLabel();
        txtBaja7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        comboBoxUsuarios = new javax.swing.JComboBox<>();
        jUpdate = new javax.swing.JButton();
        armarComida = new javax.swing.JButton();
        btnConsultarMacros = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnResetTable = new javax.swing.JButton();
        consultaIngredientes = new javax.swing.JButton();
        btnAddIngredientes = new javax.swing.JButton();
        txtBaja9 = new javax.swing.JLabel();
        btnAddComidas = new javax.swing.JButton();
        armarComida1 = new javax.swing.JButton();
        btnAddComidas2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta de Dieta");
        getContentPane().setLayout(null);

        txtBaja.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtBaja.setText("DOMINGO");
        getContentPane().add(txtBaja);
        txtBaja.setBounds(1340, 150, 80, 30);

        jMartes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane4.setViewportView(jMartes);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(230, 190, 180, 200);

        jLunes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane5.setViewportView(jLunes);

        getContentPane().add(jScrollPane5);
        jScrollPane5.setBounds(20, 190, 180, 200);

        jJueves.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane6.setViewportView(jJueves);

        getContentPane().add(jScrollPane6);
        jScrollPane6.setBounds(650, 190, 180, 200);

        jMiercoles.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane7.setViewportView(jMiercoles);

        getContentPane().add(jScrollPane7);
        jScrollPane7.setBounds(440, 190, 180, 200);

        jDomingo.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane8.setViewportView(jDomingo);

        getContentPane().add(jScrollPane8);
        jScrollPane8.setBounds(1280, 190, 180, 200);

        jViernes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane9.setViewportView(jViernes);

        getContentPane().add(jScrollPane9);
        jScrollPane9.setBounds(860, 190, 180, 200);

        jSabado.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane10.setViewportView(jSabado);

        getContentPane().add(jScrollPane10);
        jScrollPane10.setBounds(1070, 190, 180, 200);

        txtBaja2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtBaja2.setText("LUNES");
        getContentPane().add(txtBaja2);
        txtBaja2.setBounds(90, 150, 70, 30);

        txtBaja3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtBaja3.setText("MARTES");
        getContentPane().add(txtBaja3);
        txtBaja3.setBounds(290, 150, 80, 30);

        txtBaja4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtBaja4.setText("MIERCOLES");
        getContentPane().add(txtBaja4);
        txtBaja4.setBounds(490, 150, 80, 30);

        txtBaja5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtBaja5.setText("VIERNES");
        getContentPane().add(txtBaja5);
        txtBaja5.setBounds(930, 150, 80, 30);

        txtBaja6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtBaja6.setText("JUEVES");
        getContentPane().add(txtBaja6);
        txtBaja6.setBounds(710, 150, 80, 30);

        txtBaja7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtBaja7.setText("SABADO");
        getContentPane().add(txtBaja7);
        txtBaja7.setBounds(1130, 150, 80, 30);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("SELECCIONE SU USUARIO");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 50, 180, 20);

        getContentPane().add(comboBoxUsuarios);
        comboBoxUsuarios.setBounds(200, 50, 270, 22);

        jUpdate.setBackground(new java.awt.Color(0, 20, 20));
        jUpdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jUpdate.setForeground(new java.awt.Color(255, 255, 255));
        jUpdate.setText("CARGAR DIETA");
        jUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(jUpdate);
        jUpdate.setBounds(230, 90, 210, 30);

        armarComida.setBackground(new java.awt.Color(0, 20, 20));
        armarComida.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        armarComida.setForeground(new java.awt.Color(255, 255, 255));
        armarComida.setText("ARMAR COMIDAS");
        armarComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                armarComidaActionPerformed(evt);
            }
        });
        getContentPane().add(armarComida);
        armarComida.setBounds(330, 450, 230, 40);

        btnConsultarMacros.setBackground(new java.awt.Color(0, 20, 20));
        btnConsultarMacros.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnConsultarMacros.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultarMacros.setText("CONSULTAR MACROS");
        btnConsultarMacros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarMacrosActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsultarMacros);
        btnConsultarMacros.setBounds(630, 550, 230, 40);

        btnEliminar.setBackground(new java.awt.Color(0, 20, 20));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("ELIMINAR COMIDAS");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar);
        btnEliminar.setBounds(930, 550, 230, 40);

        btnResetTable.setBackground(new java.awt.Color(155, 0, 0));
        btnResetTable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnResetTable.setForeground(new java.awt.Color(255, 255, 255));
        btnResetTable.setText("RESETEAR DIETA");
        btnResetTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetTableActionPerformed(evt);
            }
        });
        getContentPane().add(btnResetTable);
        btnResetTable.setBounds(630, 650, 230, 40);

        consultaIngredientes.setBackground(new java.awt.Color(0, 20, 20));
        consultaIngredientes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        consultaIngredientes.setForeground(new java.awt.Color(255, 255, 255));
        consultaIngredientes.setText("CONSULTAR INGREDIENTES");
        consultaIngredientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaIngredientesActionPerformed(evt);
            }
        });
        getContentPane().add(consultaIngredientes);
        consultaIngredientes.setBounds(630, 450, 230, 40);

        btnAddIngredientes.setBackground(new java.awt.Color(0, 20, 20));
        btnAddIngredientes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAddIngredientes.setForeground(new java.awt.Color(255, 255, 255));
        btnAddIngredientes.setText("AGREGAR INGREDIENTES");
        btnAddIngredientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddIngredientesActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddIngredientes);
        btnAddIngredientes.setBounds(930, 450, 230, 40);

        txtBaja9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtBaja9.setText("DIETA SEMANAL");
        getContentPane().add(txtBaja9);
        txtBaja9.setBounds(640, 30, 220, 30);

        btnAddComidas.setBackground(new java.awt.Color(0, 20, 20));
        btnAddComidas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAddComidas.setForeground(new java.awt.Color(255, 255, 255));
        btnAddComidas.setText("AGREGAR COMIDAS");
        btnAddComidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddComidasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddComidas);
        btnAddComidas.setBounds(330, 550, 230, 40);

        armarComida1.setBackground(new java.awt.Color(0, 20, 20));
        armarComida1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        armarComida1.setForeground(new java.awt.Color(255, 255, 255));
        armarComida1.setText("ARMAR COMIDAS");
        armarComida1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                armarComida1ActionPerformed(evt);
            }
        });
        getContentPane().add(armarComida1);
        armarComida1.setBounds(330, 450, 230, 40);

        btnAddComidas2.setBackground(new java.awt.Color(0, 20, 20));
        btnAddComidas2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAddComidas2.setForeground(new java.awt.Color(255, 255, 255));
        btnAddComidas2.setText("AGREGAR COMIDAS");
        btnAddComidas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddComidas2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddComidas2);
        btnAddComidas2.setBounds(330, 550, 230, 40);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1500, 750);

        setBounds(0, 0, 1512, 758);
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
  
    //Boton "Cargar rutina"
    private void jUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUpdateActionPerformed
        recargarListas();
    }//GEN-LAST:event_jUpdateActionPerformed

    private void armarComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_armarComidaActionPerformed
        if(userSeleccionado==null){
            JOptionPane.showMessageDialog(null, "Debe seleccionar un usuario y cargar su rutina");    
        }else{
            this.setVisible(false);             
            Navegacion.abrirVentanaModificar("armar", userSeleccionado, this);                                        
        }
    }//GEN-LAST:event_armarComidaActionPerformed

    private void btnConsultarMacrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarMacrosActionPerformed
        if(userSeleccionado==null){
            JOptionPane.showMessageDialog(null, "Debe seleccionar un usuario y cargar su rutina");    
        }else{
            this.setVisible(false);            
            Navegacion.abrirVentanaConsultarMacros(userSeleccionado, this);                                      
        }  
    }//GEN-LAST:event_btnConsultarMacrosActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(userSeleccionado==null){
            JOptionPane.showMessageDialog(null, "Debe seleccionar un usuario y cargar su rutina");    
        }else{
            this.setVisible(false);             
            Navegacion.abrirVentanaModificar("eliminar", userSeleccionado, this);                                     
        }          
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnResetTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetTableActionPerformed
        if(userSeleccionado==null){
            JOptionPane.showMessageDialog(null, "Debe seleccionar un usuario y cargar su rutina");    
        }else{
            String [] botones = {"Si","No"};                 
            int eleccionUno = JOptionPane.showOptionDialog(this, "Si continúa, se le definirá una dieta genérica con: Desayuno, Almuerzo, Merienda y Cena. ¿Desea continuar?", "",0,0,null,botones,this);                          
            if(eleccionUno==JOptionPane.YES_OPTION){                                  
                ServicioDieta funcionesDieta = sistema.getServicioDieta();
                
                respaldo = funcionesDieta.cargarTablaRespaldoComidas(userSeleccionado);      
                funcionesDieta.resetearDieta(userSeleccionado);
                recargarListas(); //Recarga las listas            
                
                int eleccionDos = JOptionPane.showOptionDialog(this, "¿Desea guardar los cambios?", "",0,0,null,botones,this);                       
                if(eleccionDos==JOptionPane.NO_OPTION){         
                    funcionesDieta.recuperarDieta(userSeleccionado, respaldo);
                    recargarListas(); //Actualiza la lista                       
                } 
            }             
        }     
    }//GEN-LAST:event_btnResetTableActionPerformed

    private void consultaIngredientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaIngredientesActionPerformed
        this.setVisible(false);         
        Navegacion.abrirVentanaConsultarIngredientes(this);  
    }//GEN-LAST:event_consultaIngredientesActionPerformed

    private void btnAddIngredientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddIngredientesActionPerformed
        this.setVisible(false);         
        Navegacion.abrirVentanaAgregarAlimento(this);
    }//GEN-LAST:event_btnAddIngredientesActionPerformed

    private void btnAddComidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddComidasActionPerformed
        if(userSeleccionado==null){
            JOptionPane.showMessageDialog(null, "Debe seleccionar un usuario y cargar su rutina");    
        }else{
            this.setVisible(false);             
            Navegacion.abrirVentanaModificar("agregar", userSeleccionado, this);                                     
        }   
    }//GEN-LAST:event_btnAddComidasActionPerformed

    private void armarComida1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_armarComida1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_armarComida1ActionPerformed

    private void btnAddComidas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddComidas2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddComidas2ActionPerformed
   
    //Funcion que carga las listas de la rutina con la nueva informacion
    public void recargarListas(){
        vaciarListas();   
        setearUserSeleccionado();

        // Para la lista de días del usuario seleccionado, va preguntando por el día de la semana
        List<Dias> diasUser = sistema.getServicioDieta().getListaDiasDieta(userSeleccionado);              
        Map<String, JList> diaToComponentMap = new HashMap<>();
        diaToComponentMap.put("Lunes", jLunes);
        diaToComponentMap.put("Martes", jMartes);
        diaToComponentMap.put("Miércoles", jMiercoles);
        diaToComponentMap.put("Jueves", jJueves);
        diaToComponentMap.put("Viernes", jViernes);
        diaToComponentMap.put("Sabado", jSabado);
        diaToComponentMap.put("Domingo", jDomingo);   

        for(Dias d : diasUser){
            JList componente = diaToComponentMap.get(d.getDiaSemana());
            if(componente != null) {
                ArrayList<Comidas> comidas = d.getComidas();
                String[] comidasFormato = new String[comidas.size() + 5]; // +4 para los valores de nutrientes
                int totalProteinas = 0;
                int totalGrasas = 0;
                int totalCarbohidratos = 0;
                int totalCalorias = 0;

                for (int i = 0; i < comidas.size(); i++) {
                    Comidas comida = comidas.get(i);
                    comidasFormato[i] = comida.getGrupoComida();
                
                    // Acumula los valores nutricionales
                    totalProteinas += comida.getProteinas();
                    totalGrasas += comida.getGrasas();
                    totalCarbohidratos += comida.getCarbos();
                    totalCalorias += comida.getCalorias();
                }           
                comidasFormato[comidas.size()] = "----------------------";
                // Agrega los totales al final de la lista
                comidasFormato[comidas.size() + 1] = "Proteínas (g): " + totalProteinas;
                comidasFormato[comidas.size() + 2] = "Carbohidratos (g): " + totalCarbohidratos;
                comidasFormato[comidas.size() + 3] = "Grasas (g): " + totalGrasas;
                comidasFormato[comidas.size() + 4] = "Calorías: " + totalCalorias;
               
                componente.setListData(comidasFormato);
            }
        }       
    }
    
    private void vaciarListas(){      
        ArrayList<Dias>empty = new ArrayList<>();
        jLunes.setListData(empty.toArray());        
        jMartes.setListData(empty.toArray());   
        jMiercoles.setListData(empty.toArray());   
        jJueves.setListData(empty.toArray());   
        jViernes.setListData(empty.toArray());   
        jSabado.setListData(empty.toArray());  
        jDomingo.setListData(empty.toArray());                
    }    

    private void setearUserSeleccionado(){
        String user = comboBoxUsuarios.getSelectedItem().toString();   
        userSeleccionado = sistema.getServicioUsuario().obtenerUsuario(user).get();         
    }    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton armarComida;
    private javax.swing.JButton armarComida1;
    private javax.swing.JButton btnAddComidas;
    private javax.swing.JButton btnAddComidas2;
    private javax.swing.JButton btnAddIngredientes;
    private javax.swing.JButton btnConsultarMacros;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnResetTable;
    private javax.swing.JComboBox<String> comboBoxUsuarios;
    private javax.swing.JButton consultaIngredientes;
    private javax.swing.JList jDomingo;
    private javax.swing.JList jJueves;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList jLunes;
    private javax.swing.JList jMartes;
    private javax.swing.JList jMiercoles;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JList jSabado;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JButton jUpdate;
    private javax.swing.JList jViernes;
    private javax.swing.JLabel txtBaja;
    private javax.swing.JLabel txtBaja2;
    private javax.swing.JLabel txtBaja3;
    private javax.swing.JLabel txtBaja4;
    private javax.swing.JLabel txtBaja5;
    private javax.swing.JLabel txtBaja6;
    private javax.swing.JLabel txtBaja7;
    private javax.swing.JLabel txtBaja9;
    // End of variables declaration//GEN-END:variables
}
