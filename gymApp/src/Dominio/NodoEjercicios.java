package Dominio;

public class NodoEjercicios {
    private String ejercicio;
    private String musculoFocalizado;
    private NodoEjercicios sig;

    public NodoEjercicios(String ejercicio, String musculoFocalizado) {
        this.ejercicio = ejercicio;
        this.musculoFocalizado = musculoFocalizado;
        this.sig = null;
    }
    
    public NodoEjercicios getSig() {
        return sig;
    }
    
    public String getEjercicio() {
        return ejercicio;
    }
    
    public String getMusculoFocalizado() {
        return musculoFocalizado;
    }    

    public void setSig(NodoEjercicios sig) {
        this.sig = sig;
    }
    
    public void setEjercicio(String ejercicio) {
        this.ejercicio = ejercicio;
    }
    
    public void setMusculoFocalizado(String musculoFocalizado) {
        this.musculoFocalizado = musculoFocalizado;
    }
}
