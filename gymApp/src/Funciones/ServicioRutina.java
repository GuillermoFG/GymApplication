package Funciones;

import Dominio.Dias;
import Dominio.Musculos;
import Dominio.Rutina;
import Dominio.Usuarios;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.DefaultListModel;

public class ServicioRutina {

    public Rutina crearRutina() {
        return new Rutina();
    }

    public void añadirRutinaAUsuario(Usuarios user, Rutina r) {
        user.setRutina(r);
    }
    
    public List<Dias>getListaDiasRutina(Usuarios user){
        return user.getRutina().getListaDias();
    }    
    
    
    public void actualizarOrdenMusculos(Dias dia) {
        ArrayList<Musculos> listaMusculos = dia.getMusculos();
        int pos = 0;       
        for (Musculos m : listaMusculos) {
            if (m.getNombre().contains("Músculo")) {
                m.setNombre("Músculo " + pos);
            }
            pos++;
        }
    }    
 
    public void añadirMusculos(Usuarios user, String dia){
        List<Dias> listaDias = getListaDiasRutina(user);    
        for(Dias d:listaDias){
            if(d.getDiaSemana().equals(dia)){
                Dias diaSeleccionado = d;
                ArrayList<Musculos> listaMusculos = diaSeleccionado.getMusculos();
                Musculos m = new Musculos ("Músculo " + listaMusculos.size());
                listaMusculos.add(m);                             
                break;
            }
        }        
    }
    
    public void resetearRutina (Usuarios user){
        for(Dias d:getListaDiasRutina(user)){
            ArrayList<Musculos> objetosMusculos = new ArrayList<>();           
            for(int i=0;i<6;i++){
                Musculos m = new Musculos("Músculo " + i);
                objetosMusculos.add(m);
            }
            d.setMusculos(objetosMusculos);
        }              
    }
    
    public MusculosRespaldo [][] cargarTablaRespaldo(Usuarios user) {
        List<Dias> listaDiasRutina = getListaDiasRutina(user);       
        int cantidadMusculos = 0;
        for (Dias d : listaDiasRutina) {
            if (d.getMusculos().size() > cantidadMusculos) {
                cantidadMusculos = d.getMusculos().size();
            }
        }
        System.out.println(cantidadMusculos);
        
        MusculosRespaldo [][] respaldo = new MusculosRespaldo[cantidadMusculos][7]; // Ajusta el tamaño de respaldo

        int i = 0;            
        int j = 0;             
        for (Dias d : listaDiasRutina) {        
            for (Musculos m : d.getMusculos()) {
                respaldo[i][j] = new MusculosRespaldo(m.getNombre(), m.getSeries(), m.getRepeticiones());
                i++;
            }
            System.out.println(i);
            i = 0;
            j++;     
        } 
        
        for(int n=0;n<respaldo[0].length;n++){
            for(int m=0;m<respaldo.length;m++){
                if(respaldo[m][n]!=null){
                    //System.out.println(respaldo[m][n].getNombre());                   
                }else{
                    //System.out.println("null");                    
                }

            }
        }
        return respaldo;
    }    
    
    public void recuperarRutina(Usuarios user, MusculosRespaldo[][] respaldo) { 
        int j = 0;
        for(Dias d:getListaDiasRutina(user)){
            ArrayList<Musculos> objetosMusculos = new ArrayList<>();           
            for(int i=0;i<respaldo.length;i++){
                if(respaldo[i][j]!=null){
                    Musculos m = new Musculos(respaldo[i][j].getNombre());
                    m.setSeries(respaldo[i][j].getSeries());
                    m.setRepeticiones(respaldo[i][j].getRepeticiones());
                    objetosMusculos.add(m);                   
                }
            }
            d.setMusculos(objetosMusculos);
            j++;
        }            
    }    
    
    
    
    public DefaultListModel<String> cargarListaRutina(Usuarios u, String dia, Map<String, Musculos> musculosMap) {
        // Limpiar el mapa de músculos
        musculosMap.clear();
        // Crear un modelo de lista para almacenar los datos
        DefaultListModel<String> model = new DefaultListModel<>();
        
        // Obtener la lista de días de la rutina del usuario
        for (Dias d : getListaDiasRutina(u)) {
            if (d.getDiaSemana().equals(dia)) {
                ArrayList<Musculos> listaMusculos = d.getMusculos();
                for (int i = 0; i < listaMusculos.size(); i++) {
                    Musculos musculo = listaMusculos.get(i);
                    String formattedString = musculo.getNombre() + ", " + musculo.getSeries() + "x" + musculo.getRepeticiones();
                    model.addElement(formattedString);
                    musculosMap.put(formattedString + "_" + i, musculo); 
                }
            }
        }
        
        // Retornar el modelo de lista
        return model;
    }    
    
    
    
    
    
    
    
    
}
