package Funciones;

import Dominio.Alimentos;
import Dominio.NodoAlimento;
import java.util.ArrayList;
import java.util.List;

public class ServicioAlimentos {

    private final Alimentos alimentos;

    public ServicioAlimentos() {
        this.alimentos = new Alimentos();
    }

    public String[] getAlimentos(String alimento) {
        String grupoComida = pertenece(alimento);
        NodoAlimento puntero = alimentos.getCabeza();
        List<String> listaAlimentos = new ArrayList<>();

        while (puntero != null) {
            if (puntero.getAlimento().equals(grupoComida) || puntero.getGrupoAlimento().equals(grupoComida)) {
                listaAlimentos.add(puntero.getAlimento());
            }
            puntero = puntero.getSig();
        }
        return listaAlimentos.toArray(new String[0]);
    }

    public void setAlimentos(String grupoAlimento, String alimento) {
        agregar(alimento, grupoAlimento);
    }

    public String pertenece(String alimentoOGrupo) {
        NodoAlimento puntero = alimentos.getCabeza();
        String perteneceGrupoAlimento = "";

        while (puntero != null) {
            if (puntero.getAlimento().equals(alimentoOGrupo) || puntero.getGrupoAlimento().equals(alimentoOGrupo)) {
                perteneceGrupoAlimento = puntero.getGrupoAlimento();
            }
            puntero = puntero.getSig();
        }
        return perteneceGrupoAlimento;
    }

    public void agregar(String alimento, String grupoAlimento) {
        NodoAlimento nuevoNodo = new NodoAlimento(alimento, grupoAlimento);
        alimentos.agregarNodo(nuevoNodo);
    }

    public void iniciarListaAlimentos() {
        String[] listaAlimentos = new String[]{"Carne de Vaca", "Pollo", "Pez", "Proteína en polvo", "Frutos Secos", "Aceite de Oliva", "Salmon", "Semillas", "Fideos", "Arroz", "Papa", "Boniato", "Condimentos", "Especies", "Salsas", "Mermeladas"};
        String[] grupoAlimentos = new String[]{"Proteínas", "Grasas", "Carbohidratos", "Otros"};
        int j = 0;
        for (int i = 0; i < listaAlimentos.length; i++) {
            agregar(listaAlimentos[i], grupoAlimentos[j]);
            if ((i + 1) % 4 == 0) {
                j++;
            }
        }
    }
}
