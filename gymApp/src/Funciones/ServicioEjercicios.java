package Funciones;

import Dominio.Ejercicios;
import Dominio.NodoEjercicios;
import java.util.ArrayList;
import java.util.List;


public class ServicioEjercicios {

    private final Ejercicios ejercicios;

    public ServicioEjercicios() {
        this.ejercicios = new Ejercicios();
    }
    
    public String [] getEjercicios(String musculo){    
        String grupoMusculo = pertenece(musculo);
        NodoEjercicios puntero = ejercicios.getCabeza();
        List<String> listaEjercicios = new ArrayList<>();

        while (puntero != null) {
            if (puntero.getEjercicio().equals(grupoMusculo) || puntero.getMusculoFocalizado().equals(grupoMusculo)) {
                listaEjercicios.add(puntero.getEjercicio());
            }
            puntero = puntero.getSig();
        }
        return listaEjercicios.toArray(new String[0]);             
    }    
    
    public void setEjercicios(String musculo, String ejercicio){
        agregar(ejercicio, musculo);           
    }         
     
        
    public String pertenece (String ejercicioOMusculo){
        NodoEjercicios puntero = ejercicios.getCabeza();
        String pertenceMusculoFocalizado = "";

        while (puntero != null) {
            if (puntero.getEjercicio().equals(ejercicioOMusculo) || puntero.getMusculoFocalizado().equals(ejercicioOMusculo)) {
                pertenceMusculoFocalizado = puntero.getMusculoFocalizado();
            }
            puntero = puntero.getSig();
        }
        return pertenceMusculoFocalizado;         
    }
       
    public void agregar(String ejercicio, String musculo) {
        NodoEjercicios nuevoNodo = new NodoEjercicios(ejercicio, musculo);
        ejercicios.agregarNodo(nuevoNodo);            
    }
      
    public void iniciarListaEjercicios(){
        String [] trenInferior = new String []{"Squats","Prensa","Extension de Cuadriceps","Romanian Deadlift","Hamstring Curls","Leg Curls Single/Normal","En Maquina", "Hip thrust", "Patada de Caballo","En Maquina" , "Copenhagen adduction", "Aductor en Polea","En maquina", "En hack","En rack"};
        String [] trenSuperior = new String []{"Pecho Plano", "Pecho Inclinado", "Pecho en Polea","Press Militar" , "Lateral Flies", "Jalon con Polea","Extension en Polea", "Skull Crusher", "Pecho Frances","Curl de Biceps", "Biceps con Barra", "Martillo","Lat Pulldown","Deadlift","Barbell Row"};
        String [] tipos = new String []{"Quads","Femorales","Gluteos","Aductores","Gemelos","Pecho","Hombros","Triceps","Biceps","Espalda"};

        int j=0;
        for (int i=0;i<trenInferior.length;i++){
            agregar(trenInferior[i],tipos[j]);
            if ((i + 1) % 3 == 0) {
                j++;
            }           
        }
        for (int i=0;i<trenSuperior.length;i++){
            agregar(trenSuperior[i],tipos[j]);
            if ((i + 1) % 3 == 0) {
                j++;
            }           
        }       
    }
}
