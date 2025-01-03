package Funciones;

public class ComidasRespaldo {
    private int calorias;
    private int proteinas;
    private int grasas;
    private int carbos;
    private String grupoComida;
    private String ingredientes;

    public ComidasRespaldo(int calorias, int proteinas, int grasas, int carbos, String grupoComida, String ingredientes) {
        this.calorias = calorias;
        this.proteinas = proteinas;
        this.grasas = grasas;
        this.carbos = carbos;
        this.grupoComida = grupoComida;
        this.ingredientes = ingredientes;
    }

    // Getters y Setters
    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public int getProteinas() {
        return proteinas;
    }

    public void setProteinas(int proteinas) {
        this.proteinas = proteinas;
    }

    public int getGrasas() {
        return grasas;
    }

    public void setGrasas(int grasas) {
        this.grasas = grasas;
    }

    public int getCarbos() {
        return carbos;
    }

    public void setCarbos(int carbos) {
        this.carbos = carbos;
    }

    public String getGrupoComida() {
        return grupoComida;
    }

    public void setGrupoComida(String grupoComida) {
        this.grupoComida = grupoComida;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }
}
