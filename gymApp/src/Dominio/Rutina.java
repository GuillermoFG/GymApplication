package Dominio;
import java.util.ArrayList;

public class Rutina {  
    private ArrayList<Dias> listaDias;

    public Rutina (){
        this.listaDias = new ArrayList<Dias>();
    }
      
    public void inicializarDiasSemana() {
        String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sabado", "Domingo"};       

        for (String dia : diasSemana) {
            Dias d = new Dias(dia);
            this.listaDias.add(d);
        }
    }    
       
    public void setListaDias(ArrayList<Dias> listaDias) {
        this.listaDias = listaDias;
    }
    
    public ArrayList<Dias> getListaDias() {
        return listaDias;
    }
    

    
    
    
    
    
    
    
    
    
    
    
    
    

    public String toString(String dia) {
        for(Dias d:listaDias){
            if(d.getDiaSemana().equals(dia)){
                return d.getMusculos().toString();
            }
        }
        return "";
    }
}
