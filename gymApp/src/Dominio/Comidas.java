package Dominio;

public class Comidas{
    private int calorias; //cantidad de calorias en esa comida
    private int proteinas;
    private int grasas;
    private int carbos;    
    private String grupoComida; //desayuno, almuerzo, merienda, cena
    private String ingredientes;

    public int getCalorias() {
        return calorias;
    }

    public int getProteinas() {
        return proteinas;
    }

    public int getGrasas() {
        return grasas;
    }

    public int getCarbos() {
        return carbos;
    }

    public String getGrupoComida() {
        return grupoComida;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public void setProteinas(int proteinas) {
        this.proteinas = proteinas;
    }

    public void setGrasas(int grasas) {
        this.grasas = grasas;
    }

    public void setCarbos(int carbos) {
        this.carbos = carbos;
    }

    public void setGrupoComida(String grupoComida) {
        this.grupoComida = grupoComida;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void resetearComida(Comidas comida, String grupoComida){
        comida.calorias = 0;
        comida.proteinas = 0;
        comida.grasas = 0;
        comida.carbos = 0;
        comida.grupoComida = grupoComida;      
        comida.ingredientes = "";        
    }
    
    //Se crea el Override correspondiente para generar la comparación de clientes y su cedula.
    /*
    @Override
    public boolean equals(Object obj) {
        return this.cedula == ((Dias) obj).getCedula();
    }
        */
    
    @Override
    public String toString() {
        return (grupoComida + ": " + ingredientes);
    }

    
    public Comidas(String grupoComida, String ingredientes, int calorias, int proteinas, int grasas, int carbos){
        this.grupoComida = grupoComida;
        this.ingredientes = ingredientes;      
        this.calorias = calorias;
        this.proteinas = proteinas; 
        this.grasas = grasas;
        this.carbos = carbos;         
    }
    
    public Comidas(String grupoComida){
        this.grupoComida=grupoComida;
    }  
}
