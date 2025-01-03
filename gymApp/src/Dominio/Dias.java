package Dominio;
import java.util.ArrayList;

public class Dias{
    private String diaSemana;
    private ArrayList<Comidas> comidas;
    private ArrayList<Musculos> musculos;


    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public void setMusculos(ArrayList<Musculos> musculos) {
        this.musculos = musculos;
    }

    public void setComidas(ArrayList<Comidas> comidas) {
        this.comidas = comidas;
    }    
    
    public String getDiaSemana() {
        return diaSemana;
    }

    public ArrayList<Musculos> getMusculos() {
        return musculos;
    }

    public ArrayList<Comidas> getComidas() {
        return comidas;
    }
     
    public Dias(String diaSemana){    
        this.diaSemana=diaSemana;
        
        ArrayList<Comidas> objetosComida = new ArrayList<>();
        String [] listaComidas = {"Desayuno","Almuerzo","Merienda","Cena"};
        for (String comida : listaComidas) {
            Comidas c = new Comidas(comida);
            objetosComida.add(c);
        }
        this.comidas=objetosComida;     
        
        ArrayList<Musculos> listaMusculos = new ArrayList<>();       
        for (int i=0; i<6;i++){
            Musculos m = new Musculos ("Músculo " + i);
            listaMusculos.add(m);
        }
        this.musculos = listaMusculos;        
    }     
}
