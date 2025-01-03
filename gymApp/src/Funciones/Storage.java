package Funciones;

import Dominio.Usuarios;
import java.util.ArrayList;
import java.util.List;


public class Storage {    
    private List<Usuarios> listaUsuarios;
    private List<Usuarios> listaEntrenadores;    
    private Usuarios entrenador;       
    
    public Storage(){
        listaUsuarios = new ArrayList<Usuarios>();
        listaEntrenadores = new ArrayList<Usuarios>();        
    }
    
    public List<Usuarios> getListaUsuarios(){
        return listaUsuarios;
    } 
   
    public List<Usuarios> getListaEntrenadores(){
        return listaEntrenadores;
    }
    
    public Usuarios getEntrenador(){
        return entrenador;
    }    
        
    public void setEntrenador(Usuarios entrenador){
        this.entrenador = entrenador;
    }      
}
