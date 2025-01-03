package Dominio;

public class Ejercicios {
    private NodoEjercicios cabeza;

    public Ejercicios() {
        this.cabeza = null;
    }

    public NodoEjercicios getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoEjercicios cabeza) {
        this.cabeza = cabeza;
    }

    public void agregarNodo(NodoEjercicios nodo) {
        if (cabeza == null) {
            cabeza = nodo;
        } else {
            NodoEjercicios temp = cabeza;
            while (temp.getSig() != null) {
                temp = temp.getSig();
            }
            temp.setSig(nodo);
        }
    }    
}
