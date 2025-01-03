package Dominio;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Dieta {  
    private ArrayList<Dias> listaDias;
    private int calorias;
    private int proteinas;
    private int carbos;
    private int grasas;
    private String objetivo;
    private ArrayList<String[]> datosDinamico;
    
    public void setMacros(int calorias, int prote, int grasa, int carbos){
        this.calorias = calorias;
        this.proteinas=prote;
        this.grasas=grasa;
        this.carbos=carbos;
    }
    
    public void setListaDias(ArrayList<Dias> listaDias) {
        this.listaDias = listaDias;
    }
       
    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public void setProteinas(int proteinas) {
        this.proteinas = proteinas;
    }

    public void setCarbos(int carbos) {
        this.carbos = carbos;
    }

    public void setGrasas(int grasas) {
        this.grasas = grasas;
    }
   
    public void setObjetivo (String objetivo){
        this.objetivo = objetivo;
    }
    
    public void setDatosDinamico(ArrayList<String[]> datos){
        this.datosDinamico = datos;
    }
    
    public ArrayList<String[]> getDatosDinamico(){
        return datosDinamico;
    }      
    
    public ArrayList<Dias> getListaDias() {
        return listaDias;
    }            
                       
    public String getObjetivo(){
        return objetivo;
    }
    
    public int getCalorias() {
        return calorias;
    }

    public int getProteinas() {
        return proteinas;
    }

    public int getCarbos() {
        return carbos;
    }

    public int getGrasas() {
        return grasas;
    }
       
    public int [] getMacros(){
        int [] macros = {calorias,proteinas,grasas,carbos};
        return macros;
    }
           
    public String[] obtenerRegistro(int indice) {
        return datosDinamico.get(indice);
    }    
    
    public int totalRegistros() {
        return datosDinamico.size();
    }    
    
    public void ordenarPorFecha() {
        Collections.sort(datosDinamico, new ComparadorFecha());
    }      
    
    public Dieta(){      
        this.listaDias = new ArrayList<Dias>();        
        this.datosDinamico = new ArrayList<String[]>();
    }
   
    public void inicializarDiasSemana() {
        String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sabado", "Domingo"};       

        for (String dia : diasSemana) {
            Dias d = new Dias(dia);
            this.listaDias.add(d);
        }
    }

    // Clase interna ComparadorFecha
    private class ComparadorFecha implements Comparator<String[]> {
        private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        @Override
        public int compare(String[] registro1, String[] registro2) {
            LocalDate fecha1 = LocalDate.parse(registro1[0], formatter);
            LocalDate fecha2 = LocalDate.parse(registro2[0], formatter);
            return fecha1.compareTo(fecha2);
        }
    }       
}
