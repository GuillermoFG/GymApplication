package Funciones;

import Dominio.Dieta;
import Dominio.Rutina;
import Dominio.Sistema;
import Dominio.Usuarios;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ServicioUsuario {

    private Sistema sistema;
    private Storage storage;
    
    public ServicioUsuario(){
        sistema = Sistema.getInstancia();
        storage = sistema.getStorage();
    }
    
    public List<Usuarios> getListaUsuarios() {
        return storage.getListaUsuarios();
    }

    public List<Usuarios> getListaEntrenadores() {
        return storage.getListaEntrenadores();
    }    
       
    public Usuarios crearUsuario(String nombre, String sexo, int[] diasEntreno, int cedula, int esEntrenador, int esEntrenado) {
        Usuarios u = new Usuarios(nombre, sexo, diasEntreno, cedula, esEntrenador, esEntrenado);
        setearParametrosUsuario(u);
        getListaUsuarios().add(u);
        return u;
    }

    public Usuarios crearUsuario(String nombre, int cedula, int contraseña) {
        Usuarios u = new Usuarios(nombre, cedula, contraseña);
        setearParametrosUsuario(u);
        getListaUsuarios().add(u);
        return u;
    }
    

    public boolean eliminarEntrenadorYClientes(int cedulaEntrenador) {
        Optional<Usuarios> entrenadorOptional = entrenadorEncontrado(cedulaEntrenador);
        if (entrenadorOptional.isPresent()) {
            Usuarios entrenador = entrenadorOptional.get();
            
            Iterator<Usuarios> iterator = entrenador.getListaClientes().iterator();
            while (iterator.hasNext()) {
                Usuarios cliente = iterator.next();
                iterator.remove();
                eliminarDeListaClientes(cliente);
            }
            
            eliminarDeListaEntrenadores(entrenador);
            eliminarDeListaClientes(entrenador);

            return true; 
        }
        return false; 
    }    
    
    
    public boolean eliminarCliente(int cedulaUsuario) {
        Optional<Usuarios> usuarioOptional = usuarioEncontrado(cedulaUsuario);
        Usuarios entrenador = storage.getEntrenador();
        
        if (usuarioOptional.isPresent()) {
            Usuarios u = usuarioOptional.get();
            elminarClienteDeEntrenador(u, entrenador);
            eliminarDeListaClientes(u);
            return true; 
        }
        return false; 
    }
    
    public boolean verificarUsuarioYaLogeado(Usuarios user, int cedula){
        if(user!=null){
            if(user.getCedula()==cedula){
                return true;
            }            
        }        
        return false;
    }    
    
    

    private void setearParametrosUsuario(Usuarios u){
        Rutina rutina = new Rutina();
        Dieta dieta = new Dieta();
        
        rutina.inicializarDiasSemana();
        dieta.inicializarDiasSemana();        
               
        u.setRutina(rutina);
        u.setDieta(dieta);                
    }
      
    public int calcularDiasDeEntreno(Usuarios u){
        int contador = 0;
        for(int i:u.getDiasEntreno()){
            if(i==1){
                contador++;
            }
        }
        return contador;
    }
    
    public void añadirAListaEntrenadores(Usuarios u) {
        this.getListaEntrenadores().add(u);
    }
    
    public void eliminarDeListaClientes(Usuarios u){
        getListaUsuarios().remove(u);
    }
    
    public void eliminarDeListaEntrenadores(Usuarios e){
        this.getListaEntrenadores().remove(e);
    }

    public void añadirClienteAEntrenador(Usuarios usuario, Usuarios entrenador){
        entrenador.añadirCliente(usuario);
    }    
    
    public void elminarClienteDeEntrenador(Usuarios usuario, Usuarios entrenador){
        entrenador.getListaClientes().remove(usuario);
    }
    
    // Método genérico para buscar un usuario en una lista
    private Optional<Usuarios> buscarUsuarioPorCedula(List<Usuarios> lista, int cedula) {
        return lista.stream()
                .filter(user -> user.getCedula() == cedula)
                .findFirst();
    }

    // Método para buscar un entrenador por cédula
    public Optional<Usuarios> entrenadorEncontrado(int cedula) {
        return buscarUsuarioPorCedula(getListaEntrenadores(), cedula);
    }

    // Método para buscar un usuario por cédula
    public Optional<Usuarios> usuarioEncontrado(int cedula) {
        return buscarUsuarioPorCedula(getListaUsuarios(), cedula);
    }    

    public Optional<Usuarios> obtenerUsuario(String user){
        int cedula = Integer.parseInt(user.replaceAll("\\D+", ""));             
        return buscarUsuarioPorCedula(getListaUsuarios(), cedula);
    }
    
    public String [] contieneCedulaUsuario(String cedula, Usuarios entrenador) {
        List<Usuarios> resultado = new ArrayList<>();

         // Filtrar la lista de clientes del entrenador, si existe
        if (entrenador != null) {
            resultado = entrenador.getListaClientes().stream()
                    .filter(u -> ("" + u.getCedula()).contains(cedula))
                    .collect(Collectors.toList());
            if (("" + entrenador.getCedula()).contains(cedula)) {
                resultado.add(entrenador);
            }
        } else {
            resultado = getListaUsuarios().stream()
                    .filter(u -> u.getEsEntrenador() == 0 && u.getEsEntrenado() == 0)
                    .filter(u -> ("" + u.getCedula()).contains(cedula))
                    .collect(Collectors.toList());
        }
        
        String[] datosUsuarios = resultado.stream()
            .map(u -> u.getNombre() + ", " + u.getCedula())
            .toArray(String[]::new);        
        
        return datosUsuarios;
    }

    public String [] contieneNombreUsuario(String nombre, Usuarios entrenador) {        
        List<Usuarios> resultado = new ArrayList<>();
        String nombreFormato = nombre.toLowerCase();
        
        // Filtrar la lista de clientes del entrenador, si existe
        if (entrenador != null) {
            resultado = entrenador.getListaClientes().stream()
                    .filter(u -> (u.getNombre().toLowerCase()).contains(nombreFormato))
                    .collect(Collectors.toList());
            if (entrenador.getNombre().toLowerCase().contains(nombreFormato)) {
                resultado.add(entrenador);
            }
        } else {
            resultado = getListaUsuarios().stream()
                    .filter(u -> u.getEsEntrenador() == 0 && u.getEsEntrenado() == 0)
                    .filter(u -> (u.getNombre().toLowerCase()).contains(nombreFormato))
                    .collect(Collectors.toList());
        }     
        String[] datosUsuarios = resultado.stream()
            .map(u -> u.getNombre() + ", " + u.getCedula())
            .toArray(String[]::new);        
        
        return datosUsuarios;
    }
    
    public String [] usuariosSinFiltro(Usuarios entrenador){
        List<Usuarios> resultado = new ArrayList<>();
        
        // Filtrar la lista de clientes del entrenador, si existe
        if (entrenador != null) {
            resultado = entrenador.getListaClientes().stream()
                    .collect(Collectors.toList());
                    resultado.add(entrenador);
        } else {
            // Filtrar usuarios en listaUsuarios que no son entrenadores ni están entrenados
            resultado = getListaUsuarios().stream()
                    .filter(u -> u.getEsEntrenador() == 0 && u.getEsEntrenado() == 0)
                    .collect(Collectors.toList());
        }     
        String[] datosUsuarios = resultado.stream()
            .map(u -> u.getNombre() + ", " + u.getCedula())
            .toArray(String[]::new);        
        
        return datosUsuarios;        
    }
     
    public Dieta obtenerDieta(Usuarios user){
        return user.getDieta();
    }    
}
