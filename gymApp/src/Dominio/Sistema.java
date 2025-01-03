package Dominio;
import Funciones.ServicioEjercicios;
import Funciones.ServicioAlimentos;
import Funciones.ServicioDieta;
import Funciones.ServicioRutina;
import Funciones.ServicioUsuario;
import Funciones.Storage;

public class Sistema {

    // Instancia única del Singleton
    private static Sistema instancia;
    
    private ServicioAlimentos servicioAlimentos;  
    private ServicioDieta servicioDieta;      
    private ServicioEjercicios servicioEjercicios;      
    private ServicioRutina servicioRutina;
    private ServicioUsuario servicioUsuario;
    private Storage storage;
       
    public Sistema() {      
        this.storage = new Storage();                    
    }
   
    // Método estático para obtener la instancia única
    public static Sistema getInstancia() {
        if (instancia == null) {
            instancia = new Sistema();
        }
        return instancia;
    }    
    
    public void iniciarServicios() {
        this.servicioAlimentos = new ServicioAlimentos();    
        this.servicioDieta = new ServicioDieta();
        this.servicioEjercicios = new ServicioEjercicios();   
        this.servicioRutina = new ServicioRutina();
        this.servicioUsuario = new ServicioUsuario();

        servicioAlimentos.iniciarListaAlimentos();
        servicioEjercicios.iniciarListaEjercicios(); 
    }    
    

    public Storage getStorage(){
        return storage;
    }
    
    public ServicioAlimentos getServicioAlimentos(){
        return servicioAlimentos;
    }
    
    
    public ServicioDieta getServicioDieta(){
        return servicioDieta;
    } 
   
    public ServicioEjercicios getServicioEjercicios(){
        return servicioEjercicios;
    }
    
    public ServicioRutina getServicioRutina(){
        return servicioRutina;
    }
    
    public ServicioUsuario getServicioUsuario(){
        return servicioUsuario;
    }       
}
