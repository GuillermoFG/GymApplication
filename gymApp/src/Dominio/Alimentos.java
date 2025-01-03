package Dominio;

public class Alimentos {
    private NodoAlimento cabeza;

    public Alimentos() {
        this.cabeza = null;
    }

    public NodoAlimento getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoAlimento cabeza) {
        this.cabeza = cabeza;
    }

    public void agregarNodo(NodoAlimento nodo) {
        if (cabeza == null) {
            cabeza = nodo;
        } else {
            NodoAlimento temp = cabeza;
            while (temp.getSig() != null) {
                temp = temp.getSig();
            }
            temp.setSig(nodo);
        }
    }
}
