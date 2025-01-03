package Dominio;

public class Musculos {
    private int repeticiones;
    private int series;
    private String nombre;

    public int getRepeticiones() {
        return repeticiones;
    }

    public int getSeries() {
        return series;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setRepeticiones(int repeticiones) {
        this.repeticiones = repeticiones;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        return nombre;
    }

    
    public Musculos(String nombre){
        this.nombre = nombre;
    }
    
    
}
