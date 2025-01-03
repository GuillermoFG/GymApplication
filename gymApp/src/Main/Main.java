
package Main;
import Dominio.Dias;
import Dominio.Dieta;
import Dominio.Rutina;
import Dominio.Sistema;
import Dominio.Usuarios;
import Interfaz.VentanaLogin;
import java.time.LocalDate;

public class Main {
    
    private final Sistema sistema;    
    
    public Main(){
        sistema = Sistema.getInstancia();
        sistema.iniciarServicios();
        cargarSistema();    
        VentanaLogin ventana = new VentanaLogin();
        ventana.setVisible(true);        
    }    
  
    private void cargarSistema(){
        int [] datos = new int [] {1,0,1,0,1,0,1};       
        Usuarios u = new Usuarios("Guille", "Masculino", datos,50945050,0,0);            
        Rutina r = new Rutina();
        Dieta diet = new Dieta();
        u.setRutina(r);
        u.setDieta(diet);       
        String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sabado", "Domingo"};       
        for (String dia : diasSemana) {
            Dias d = new Dias(dia);
            u.getRutina().getListaDias().add(d);
            u.getDieta().getListaDias().add(d);            
        }

               
        String fecha = ("01" +"/" + "01" + "/" + "2001");
        String hora = ("20" + ":" + "20");
        String peso = "50";

        String fecha1 = ("01" +"/" + "01" + "/" + "2003");
        String hora1 = ("20" + ":" + "20");
        String peso1 = "55";
        
        String fecha2 = ("01" +"/" + "01" + "/" + "2005");
        String hora2 = ("20" + ":" + "20");
        String peso2 = "59";

        String fecha3 = ("01" +"/" + "01" + "/" + "2007");
        String hora3 = ("20" + ":" + "20");
        String peso3 = "59";
        
        String fecha4 = ("01" +"/" + "01" + "/" + "2008");
        String hora4 = ("20" + ":" + "20");
        String peso4 = "59";

        String fecha5 = ("01" +"/" + "01" + "/" + "2014");
        String hora5 = ("20" + ":" + "20");
        String peso5 = "67";
        
        String fecha6 = ("01" +"/" + "01" + "/" + "2016");
        String hora6 = ("20" + ":" + "20");
        String peso6 = "69";

        String fecha7 = ("01" +"/" + "01" + "/" + "2020");
        String hora7 = ("20" + ":" + "20");
        String peso7 = "68";
                
        String fecha8 = ("01" +"/" + "01" + "/" + "2021");
        String hora8 = ("20" + ":" + "20");
        String peso8 = "74";
        
        String fecha9 = ("01" +"/" + "01" + "/" + "2022");
        String hora9 = ("20" + ":" + "20");
        String peso9 = "79";

        String fecha10 = ("01" +"/" + "01" + "/" + "2024");
        String hora10 = ("20" + ":" + "20");
        String peso10 = "85";
            
        sistema.getServicioDieta().añadirRegistro(u, fecha, hora, peso);
        sistema.getServicioDieta().añadirRegistro(u, fecha1, hora1, peso1);
        sistema.getServicioDieta().añadirRegistro(u, fecha2, hora2, peso2);        
        sistema.getServicioDieta().añadirRegistro(u, fecha3, hora3, peso3);
        sistema.getServicioDieta().añadirRegistro(u, fecha4, hora4, peso4);
        sistema.getServicioDieta().añadirRegistro(u, fecha5, hora5, peso5);  
        sistema.getServicioDieta().añadirRegistro(u, fecha6, hora6, peso6);
        sistema.getServicioDieta().añadirRegistro(u, fecha7, hora7, peso7);
        sistema.getServicioDieta().añadirRegistro(u, fecha8, hora8, peso8);  
        sistema.getServicioDieta().añadirRegistro(u, fecha9, hora9, peso9);
        sistema.getServicioDieta().añadirRegistro(u, fecha10, hora10, peso10);  
        u.setAltura(180);
        u.setPeso(85.5);
        Dieta d = u.getDieta();
        d.setMacros(2800,180,90,300);
        d.setObjetivo("Ganar peso");       
        u.setFechaNacimiento(LocalDate.of(2000, 03, 10));        
        u.setContraseña(123);
        sistema.getServicioUsuario().getListaUsuarios().add(u);        
    }    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Configura el Look and Feel de la interfaz gráfica
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
        }
        // Inicia la aplicación
        new Main(); // Crea una instancia de la clase Main, que carga el sistema y lanza la ventana de login
    }      
}
