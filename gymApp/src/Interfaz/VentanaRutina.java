package Interfaz;
import Dominio.Dias;
import Dominio.Musculos;
import Dominio.Sistema;
import Dominio.Usuarios;
import Funciones.MusculosRespaldo;
import Funciones.Navegacion;
import Funciones.ServicioRutina;
import Funciones.Storage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class VentanaRutina extends javax.swing.JFrame{
    
    private Sistema sistema;
    private Storage storage;    
    private Usuarios userSeleccionado;
    private MusculosRespaldo [][] respaldo;
    
    public VentanaRutina() {
        initComponents();       
        sistema = Sistema.getInstancia();
        storage = sistema.getStorage();          
        this.setLocationRelativeTo(null);      
        jUpdate.setFocusPainted(false);  
        setMusculos.setFocusPainted(false);  
        setEjercicios.setFocusPainted(false);  
        setSeriesRepes.setFocusPainted(false);  
        eliminarDias.setFocusPainted(false);  
        btnAdd.setFocusPainted(false);    
        btnResetTable.setFocusPainted(false);            
        //Llama a la lista de usuarios y los carga en el combobox
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
        txtBaja1 = new javax.swing.JLabel();
        txtBaja2 = new javax.swing.JLabel();
        txtBaja3 = new javax.swing.JLabel();
        txtBaja4 = new javax.swing.JLabel();
        txtBaja5 = new javax.swing.JLabel();
        txtBaja6 = new javax.swing.JLabel();
        txtBaja7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        comboBoxUsuarios = new javax.swing.JComboBox<>();
        jUpdate = new javax.swing.JButton();
        setMusculos = new javax.swing.JButton();
        eliminarDias = new javax.swing.JButton();
        setEjercicios = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        setSeriesRepes = new javax.swing.JButton();
        btnResetTable = new javax.swing.JButton();
        añadirDias = new javax.swing.JButton();
        añadirMusculo = new javax.swing.JButton();
        eliminarMusculo = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta de Rutina");
        getContentPane().setLayout(null);

        txtBaja.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtBaja.setText("DOMINGO");
        getContentPane().add(txtBaja);
        txtBaja.setBounds(1330, 150, 100, 30);

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

        txtBaja1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtBaja1.setText("RUTINA SEMANAL");
        getContentPane().add(txtBaja1);
        txtBaja1.setBounds(600, 10, 250, 30);

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
        txtBaja5.setText("JUEVES");
        getContentPane().add(txtBaja5);
        txtBaja5.setBounds(710, 150, 80, 30);

        txtBaja6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtBaja6.setText("VIERNES");
        getContentPane().add(txtBaja6);
        txtBaja6.setBounds(910, 150, 80, 30);

        txtBaja7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtBaja7.setText("SABADO");
        getContentPane().add(txtBaja7);
        txtBaja7.setBounds(1120, 150, 80, 30);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("SELECCIONAR USUARIO");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 50, 180, 20);

        getContentPane().add(comboBoxUsuarios);
        comboBoxUsuarios.setBounds(200, 50, 270, 22);

        jUpdate.setBackground(new java.awt.Color(0, 20, 20));
        jUpdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jUpdate.setForeground(new java.awt.Color(255, 255, 255));
        jUpdate.setText("CARGAR RUTINA");
        jUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(jUpdate);
        jUpdate.setBounds(230, 90, 210, 30);

        setMusculos.setBackground(new java.awt.Color(0, 20, 20));
        setMusculos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        setMusculos.setForeground(new java.awt.Color(255, 255, 255));
        setMusculos.setText("FIJAR MÚSCULOS");
        setMusculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setMusculosActionPerformed(evt);
            }
        });
        getContentPane().add(setMusculos);
        setMusculos.setBounds(180, 440, 230, 40);

        eliminarDias.setBackground(new java.awt.Color(0, 20, 20));
        eliminarDias.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        eliminarDias.setForeground(new java.awt.Color(255, 255, 255));
        eliminarDias.setText("ELIMINAR DÍAS DE ENTRENO");
        eliminarDias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarDiasActionPerformed(evt);
            }
        });
        getContentPane().add(eliminarDias);
        eliminarDias.setBounds(1080, 530, 230, 40);

        setEjercicios.setBackground(new java.awt.Color(0, 20, 20));
        setEjercicios.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        setEjercicios.setForeground(new java.awt.Color(255, 255, 255));
        setEjercicios.setText("FIJAR EJERCICIOS");
        setEjercicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setEjerciciosActionPerformed(evt);
            }
        });
        getContentPane().add(setEjercicios);
        setEjercicios.setBounds(480, 440, 230, 40);

        btnAdd.setBackground(new java.awt.Color(0, 20, 20));
        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("AÑADIR NUEVOS EJERCICIOS");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd);
        btnAdd.setBounds(1080, 440, 230, 40);

        setSeriesRepes.setBackground(new java.awt.Color(0, 20, 20));
        setSeriesRepes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        setSeriesRepes.setForeground(new java.awt.Color(255, 255, 255));
        setSeriesRepes.setText("FIJAR SERIES Y REPETICIONES");
        setSeriesRepes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setSeriesRepesActionPerformed(evt);
            }
        });
        getContentPane().add(setSeriesRepes);
        setSeriesRepes.setBounds(780, 440, 230, 40);

        btnResetTable.setBackground(new java.awt.Color(155, 0, 0));
        btnResetTable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnResetTable.setForeground(new java.awt.Color(255, 255, 255));
        btnResetTable.setText("RESETEAR RUTINA");
        btnResetTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetTableActionPerformed(evt);
            }
        });
        getContentPane().add(btnResetTable);
        btnResetTable.setBounds(630, 610, 230, 40);

        añadirDias.setBackground(new java.awt.Color(0, 20, 20));
        añadirDias.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        añadirDias.setForeground(new java.awt.Color(255, 255, 255));
        añadirDias.setText("AÑADIR DÍAS DE ENTRENO");
        añadirDias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirDiasActionPerformed(evt);
            }
        });
        getContentPane().add(añadirDias);
        añadirDias.setBounds(780, 530, 230, 40);

        añadirMusculo.setBackground(new java.awt.Color(0, 20, 20));
        añadirMusculo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        añadirMusculo.setForeground(new java.awt.Color(255, 255, 255));
        añadirMusculo.setText("AÑADIR MÚSCULOS");
        añadirMusculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirMusculoActionPerformed(evt);
            }
        });
        getContentPane().add(añadirMusculo);
        añadirMusculo.setBounds(180, 530, 230, 40);

        eliminarMusculo.setBackground(new java.awt.Color(0, 20, 20));
        eliminarMusculo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        eliminarMusculo.setForeground(new java.awt.Color(255, 255, 255));
        eliminarMusculo.setText("ELIMINAR MÚSCULOS");
        eliminarMusculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarMusculoActionPerformed(evt);
            }
        });
        getContentPane().add(eliminarMusculo);
        eliminarMusculo.setBounds(480, 530, 230, 40);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1490, 710);

        setBounds(0, 0, 1496, 718);
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
        setearUserSeleccionado();
        vaciarListas();
        if(userSeleccionado.getDiasEntreno()==null){
            this.setVisible(false);
            Navegacion.abrirVentanaRegistroDeRutina(userSeleccionado,this);
        }else{
            recargarListas();            
        }
    }//GEN-LAST:event_jUpdateActionPerformed

    private void setMusculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setMusculosActionPerformed
        if(userSeleccionado==null){
            JOptionPane.showMessageDialog(null, "Debe seleccionar un usuario y cargar su rutina");    
        }else{
            this.setVisible(false);             
            Navegacion.abrirVentanaModificar("modificar", userSeleccionado, this);        
        } 
    }//GEN-LAST:event_setMusculosActionPerformed

    private void eliminarDiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarDiasActionPerformed
        if(userSeleccionado==null){
            JOptionPane.showMessageDialog(null, "Debe seleccionar un usuario y cargar su rutina");    
        }else{
            this.setVisible(false);           
            Navegacion.abrirVentanaModificarDiasEntreno(userSeleccionado,this,"eliminar");                                  
        }   
    }//GEN-LAST:event_eliminarDiasActionPerformed

    private void setEjerciciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setEjerciciosActionPerformed
        if(userSeleccionado==null){
            JOptionPane.showMessageDialog(null, "Debe seleccionar un usuario y cargar su rutina");    
        }else{
            this.setVisible(false);             
            Navegacion.abrirVentanaModificar("rellenar", userSeleccionado, this);                                     
        }   
    }//GEN-LAST:event_setEjerciciosActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        this.setVisible(false);   
        Navegacion.abrirVentanaAgregarEjercicio(sistema, this);
    }//GEN-LAST:event_btnAddActionPerformed

    private void setSeriesRepesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setSeriesRepesActionPerformed
        if(userSeleccionado==null){
            JOptionPane.showMessageDialog(null, "Debe seleccionar un usuario y cargar su rutina");    
        }else{
            this.setVisible(false);             
            Navegacion.abrirVentanaModificar("seriesRepes", userSeleccionado, this);                                        
        }   
    }//GEN-LAST:event_setSeriesRepesActionPerformed

    private void btnResetTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetTableActionPerformed
        if(userSeleccionado==null){
            JOptionPane.showMessageDialog(null, "Debe seleccionar un usuario y cargar su rutina");    
        }else{
            String [] botones = {"Si","No"};                 
            int eleccionUno = JOptionPane.showOptionDialog(this, "Si continúa, se le una rutina genérica con 6 músculos. ¿Desea continuar?", "",0,0,null,botones,this);                          
            if(eleccionUno==JOptionPane.YES_OPTION){                                  
                ServicioRutina funcionesRutina = sistema.getServicioRutina();
                
                respaldo = funcionesRutina.cargarTablaRespaldo(userSeleccionado);      
                funcionesRutina.resetearRutina(userSeleccionado);
                recargarListas(); //Recarga las listas            
                
                int eleccionDos = JOptionPane.showOptionDialog(this, "¿Desea guardar los cambios?", "",0,0,null,botones,this);                       
                if(eleccionDos==JOptionPane.NO_OPTION){         
                    funcionesRutina.recuperarRutina(userSeleccionado, respaldo);
                    recargarListas(); //Actualiza la lista                       
                } 
            }             
        }   
    }//GEN-LAST:event_btnResetTableActionPerformed

    private void añadirDiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirDiasActionPerformed
        if(userSeleccionado==null){
            JOptionPane.showMessageDialog(null, "Debe seleccionar un usuario y cargar su rutina");    
        }else{
            this.setVisible(false);           
            Navegacion.abrirVentanaModificarDiasEntreno(userSeleccionado,this,"añadir");           
        }          
    }//GEN-LAST:event_añadirDiasActionPerformed

    private void añadirMusculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirMusculoActionPerformed
            this.setVisible(false);             
            Navegacion.abrirVentanaModificar("añadirMusculo", userSeleccionado, this);                                       
         
    }//GEN-LAST:event_añadirMusculoActionPerformed

    private void eliminarMusculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarMusculoActionPerformed
            this.setVisible(false);             
            Navegacion.abrirVentanaModificar("eliminarMusculo", userSeleccionado, this); 
    }//GEN-LAST:event_eliminarMusculoActionPerformed
  
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

    //Funcion que carga las listas de la rutina
    public void recargarListas(){
        vaciarListas();
        setearUserSeleccionado();
            
        //Para la lista de dias del usuario seleccionado, va preguntnado por el dia de la semana
        //Segun el dia, elije una lista especifica, y setea los musculos que tenga cargados el usuario    
        List<Dias> diasUser = sistema.getServicioRutina().getListaDiasRutina(userSeleccionado);
        Map<String, JList> diaToComponentMap = new HashMap<>();
        diaToComponentMap.put("Lunes", jLunes);
        diaToComponentMap.put("Martes", jMartes);
        diaToComponentMap.put("Miércoles", jMiercoles);
        diaToComponentMap.put("Jueves", jJueves);
        diaToComponentMap.put("Viernes", jViernes);
        diaToComponentMap.put("Sabado", jSabado);
        diaToComponentMap.put("Domingo", jDomingo);
               
        int contador = 0;       
        for(Dias d : diasUser){
            JList componente = diaToComponentMap.get(d.getDiaSemana());
            if(componente != null && userSeleccionado.getDiasEntreno()[contador] == 1) {
                ArrayList<Musculos> musculos = d.getMusculos();
                // Crear un array para almacenar los strings formateados
                String[] musculosFormateados = new String[musculos.size()];
                for (int i = 0; i < musculos.size(); i++) {
                    Musculos musculo = musculos.get(i);
                    // Formatear la cadena como "Musculo, Series x Repeticiones"
                    musculosFormateados[i] = musculo.getNombre() + ", " + musculo.getSeries() + "x" + musculo.getRepeticiones();
                }
                // Cargar los strings formateados en la JList
                componente.setListData(musculosFormateados);
            }
            contador++;
        }    
    }         
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton añadirDias;
    private javax.swing.JButton añadirMusculo;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnResetTable;
    private javax.swing.JComboBox<String> comboBoxUsuarios;
    private javax.swing.JButton eliminarDias;
    private javax.swing.JButton eliminarMusculo;
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
    private javax.swing.JButton setEjercicios;
    private javax.swing.JButton setMusculos;
    private javax.swing.JButton setSeriesRepes;
    private javax.swing.JLabel txtBaja;
    private javax.swing.JLabel txtBaja1;
    private javax.swing.JLabel txtBaja2;
    private javax.swing.JLabel txtBaja3;
    private javax.swing.JLabel txtBaja4;
    private javax.swing.JLabel txtBaja5;
    private javax.swing.JLabel txtBaja6;
    private javax.swing.JLabel txtBaja7;
    // End of variables declaration//GEN-END:variables
}
