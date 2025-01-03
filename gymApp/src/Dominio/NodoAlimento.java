package Dominio;

public class NodoAlimento {
    private String alimento;
    private String grupoAlimento;
    private NodoAlimento sig;

    public NodoAlimento(String alimento, String tipo) {
        this.alimento = alimento;
        this.grupoAlimento = tipo;
        this.sig = null;
    }
    
    public NodoAlimento getSig() {
        return sig;
    }
    
    public String getAlimento() {
        return alimento;
    }
    
    public String getGrupoAlimento() {
        return grupoAlimento;
    }    

    public void setSig(NodoAlimento sig) {
        this.sig = sig;
    }
    
    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }
    
    public void setGrupoAlimento(String grupoAlimento) {
        this.grupoAlimento = grupoAlimento;
    }
}
