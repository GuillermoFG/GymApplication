package Funciones;

import Dominio.Comidas;
import Dominio.Dias;
import Dominio.Dieta;
import Dominio.Usuarios;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberTickUnit;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.RectangleInsets;

public class ServicioDieta {

    public Dieta crearDieta() {
        return new Dieta();
    }

    public void añadirDietaAUsuario(Usuarios u, Dieta d) {
        u.setDieta(d);
    }
           
    public void crearComida(Comidas comidaSeleccionada, String comida, String proteinasTexto, String grasasTexto, String carbosTexto, String dia, boolean semana, Usuarios user){  
        String comidaOriginal = comidaSeleccionada.getGrupoComida();                                
        int proteinas = Integer.parseInt(proteinasTexto);
        int grasas = Integer.parseInt(grasasTexto);
        int carbos = Integer.parseInt(carbosTexto);
        int calorias = (proteinas*4) + (grasas*9) + (carbos*4);

        for (Dias d: getListaDiasDieta(user)){
            if(semana || d.getDiaSemana().equals(dia)){         
                for(Comidas c:d.getComidas()){                    
                    if(c.getGrupoComida().equals(comidaOriginal)){
                        c.setGrupoComida(comida);
                        c.setProteinas(proteinas);
                        c.setGrasas(carbos);
                        c.setCarbos(grasas);
                        c.setCalorias(calorias);                        
                    }
                }
            }
        }                           
    }
    
    public void añadirComidaAUsuario(Usuarios user, Comidas comida, String nuevaComida, String diaSeleccionado){
        String comidaSeleccionada = comida.getGrupoComida();                                   
        for (Dias d: getListaDiasDieta(user)){      
            ArrayList<Comidas> copia = new ArrayList<Comidas>();              
            if(d.getDiaSemana().equals(diaSeleccionado)){
                for(Comidas c:d.getComidas()){
                    copia.add(c);
                    if(c.getGrupoComida().equals(comidaSeleccionada)){
                        copia.add(new Comidas(nuevaComida));
                    }
                }
                d.setComidas(copia);
            }
        }                  
    }
    
    
    private boolean esNumeroValido(String texto) {
        try {
            Integer.parseInt(texto);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }      
    
    public List<Dias>getListaDiasDieta(Usuarios u){
        return u.getDieta().getListaDias();
    }
    
    public ArrayList<String[]> getDatosDinamico(Usuarios user){
        return user.getDieta().getDatosDinamico();
    }        
    
    public String[] getRegistros(Usuarios user, int indice) {
        return user.getDieta().getDatosDinamico().get(indice);
    }    
    
    public void añadirRegistro(Usuarios user, String fecha, String hora, String peso){
        String[] registro = new String[3];
        registro[0] = fecha;
        registro[1] = hora;
        registro[2] = peso;
        user.getDieta().getDatosDinamico().add(registro);        
    }
    
    public List<Comidas> añadirElementoListaCopiada(Comidas comidaSeleccionada, String comida, Usuarios user, String diaSeleccionado){
        String nombreComidaSeleccionada = comidaSeleccionada.getGrupoComida();
        for (Dias d: getListaDiasDieta(user)){         
            ArrayList<Comidas> copia = new ArrayList<Comidas>();             
            if(d.getDiaSemana().equals(diaSeleccionado)){
                for(Comidas c:d.getComidas()){
                    copia.add(c);
                    if(c.getGrupoComida().equals(nombreComidaSeleccionada)){
                        copia.add(new Comidas(comida)); //creo un objeto comida solo para ponerlo en una jlist?
                    }
                }
                return copia;
            }
        } 
        return null;
    }
    
    public List<Comidas> getListaComidasPorDia(Usuarios user, String dia){
        ArrayList<Comidas> listaComidas = new ArrayList<Comidas>();
        for(Dias d:getListaDiasDieta(user)){
            if(d.getDiaSemana().equals(dia)){
                listaComidas = d.getComidas();
                break;
            }
        }     
        return listaComidas;
    }
     
    
    public void resetearDieta (Usuarios user){
        String [] listaComidas = {"Desayuno","Almuerzo","Merienda","Cena"};
        for(Dias d:getListaDiasDieta(user)){
            ArrayList<Comidas> objetosComida = new ArrayList<>();  
            for (String comida : listaComidas) {
                Comidas c = new Comidas(comida);
                objetosComida.add(c);
            }            
            d.setComidas(objetosComida);                     
        }           
    }
    
    public ComidasRespaldo[][] cargarTablaRespaldoComidas(Usuarios user) {
        List<Dias> listaDiasDieta = getListaDiasDieta(user);       
        int cantidadComidas = 0;

        for (Dias d : listaDiasDieta) {
            if (d.getComidas().size() > cantidadComidas) {
                cantidadComidas = d.getComidas().size();
            }
        }

        ComidasRespaldo[][] respaldo = new ComidasRespaldo[cantidadComidas][7]; // Ajusta el tamaño de respaldo

        int i = 0;
        int j = 0;

        for (Dias d : listaDiasDieta) {        
            for (Comidas c : d.getComidas()) {
                respaldo[i][j] = new ComidasRespaldo(
                    c.getCalorias(), 
                    c.getProteinas(), 
                    c.getGrasas(), 
                    c.getCarbos(),
                    c.getGrupoComida(),
                    c.getIngredientes()
                );
                i++;
            }
            i = 0;
            j++;     
        } 
        return respaldo;
    }
    
    public void recuperarDieta(Usuarios user, ComidasRespaldo[][] respaldo) {
        int j = 0;
        for(Dias d:getListaDiasDieta(user)){
            ArrayList<Comidas> objetosComida = new ArrayList<>();           
            for(int i=0;i<respaldo.length;i++){
                if(respaldo[i][j]!=null){
                    Comidas c = new Comidas(respaldo[i][j].getGrupoComida());
                    c.setCalorias(respaldo[i][j].getCalorias());
                    c.setProteinas(respaldo[i][j].getProteinas());
                    c.setGrasas(respaldo[i][j].getGrasas());
                    c.setCarbos(respaldo[i][j].getCarbos());
                    c.setIngredientes(respaldo[i][j].getIngredientes());                    
                    objetosComida.add(c);                   
                }
            }
            d.setComidas(objetosComida);
            j++;
        }            
    }

    public void setearMacrosParaUsuario(Usuarios user, String fecha, String pesoTexto, String alturaTexto, String dia, String mes, String año, String frecuencia, String objetivo){
        double peso = Double.parseDouble(pesoTexto.replace(',', '.'));
        double altura = Double.parseDouble(alturaTexto.replace(',', '.'));
        
        user.setFechaNacimiento(LocalDate.of(Integer.parseInt(año), Integer.parseInt(mes), Integer.parseInt(dia)));
        int edad = user.calcularEdad();
      
        //Calcula las calorias segun el sexo, esto se hace con una formula matematica
        int calorias = 0;
        if (user.getSexo().equals("Masculino")) {
            calorias = (int)(10 * peso + (6.25 * altura) - (5 * edad) + 5);
        } else {
            calorias = (int)(10 * peso + (6.25 * altura) - (5 * edad) - 161);
        } 
        
        calorias = ajustarCaloriasPorFrecuencia(calorias, frecuencia);
        calorias = ajustarCaloriasPorObjetivo(calorias, objetivo);
        
        int proteinas = (int)(peso * 2); // Mejor x 1.85
        int grasas = (int)peso;
        int carbos = (calorias - (proteinas * 4 + grasas * 9)) / 4;  
        
        user.setAltura(altura);
        user.setPeso(peso);
        Dieta d = user.getDieta();
        d.setMacros(calorias,proteinas,grasas,carbos);
        d.setObjetivo(objetivo);           
    }
    
    private int ajustarCaloriasPorFrecuencia(int calorias, String frecuencia) {
        switch (frecuencia) {
            case "Sedentario(no entrenas)" -> calorias *= 1.2;
            case "Poco frecuente (1-2 días por semana)" -> calorias *= 1.375;
            case "Moderado(3-5 días por semana)" -> calorias *= 1.55;
            case "Muy frecuente (6-7 veces por semana)" -> calorias *= 1.725;
            case "Atleta (2 veces por día)" -> calorias *= 1.9;
        }
        return calorias;
    }

    private int ajustarCaloriasPorObjetivo(int calorias, String objetivo) {
        switch (objetivo) {
            case "Perder peso" -> calorias -= 250;
            case "Ganar peso" -> calorias += 250;
        }
        return calorias;
    }    
    
    public void graficarPesajes(Usuarios user){      
        // Obtener los datos de la dieta del usuario seleccionado
        List<String[]> datosDinamico = getDatosDinamico(user);

        // Crear una serie de datos para el gráfico
        XYSeries series = new XYSeries("Peso en el tiempo");

        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");

        // Variables para encontrar el peso mínimo y máximo
        double pesoMin = Double.MAX_VALUE;
        double pesoMax = Double.MIN_VALUE;

        // Recorrer los datos y agregarlos a la serie
        for (String[] registro : datosDinamico) {
            try {
                Date fecha = formatoFecha.parse(registro[0]); // Parsear solo la fecha (dd/MM/yyyy)
                double peso = Double.parseDouble(registro[2]); // Convertir el peso a tipo double
                series.add(fecha.getTime(), peso); // Añadir los datos a la serie, usando el tiempo en milisegundos como X

                // Actualizar peso mínimo y máximo
                if (peso < pesoMin) pesoMin = peso;
                if (peso > pesoMax) pesoMax = peso;
            } catch (Exception e) {
                e.printStackTrace(); // Manejar errores de parsing o conversión
            }
        }

        // Crear un dataset con la serie de datos
        XYSeriesCollection dataset = new XYSeriesCollection(series);

        // Crear el gráfico de línea
        JFreeChart chart = ChartFactory.createXYLineChart(
                "Evolución del Peso",
                "Fecha",
                "Peso (kg)",
                dataset
        );

        // Añadir padding al gráfico
        chart.setPadding(new RectangleInsets(10, 10, 25, 35)); // Añadir márgenes de 10 píxeles en cada lado

        // Configurar el eje X para mostrar fechas
        XYPlot plot = chart.getXYPlot();
        DateAxis ejeX = new DateAxis("Fecha");
        ejeX.setDateFormatOverride(new SimpleDateFormat("dd/MM/yyyy"));
        ejeX.setTickLabelFont(new Font("SansSerif", Font.BOLD, 12)); // Aumentar tamaño y poner en negrita los números de las fechas
        ejeX.setTickLabelInsets(new RectangleInsets(5, 0, 10, 0)); // Añadir más espacio debajo de los números de las fechas
        plot.setDomainAxis(ejeX);

        // Configurar el eje Y para tener un rango entre el peso mínimo y máximo
        NumberAxis ejeY = (NumberAxis) plot.getRangeAxis();
        ejeY.setRange(pesoMin - 5, pesoMax + 5); // Ajusta el rango con un pequeño margen de 5 unidades
        ejeY.setTickUnit(new NumberTickUnit(5)); // Ajusta los ticks del eje Y a intervalos de 5 en 5
        ejeY.setLabelFont(new Font("SansSerif", Font.BOLD, 16)); // Aumentar el tamaño del subtítulo "Peso (kg)" y poner en negrita
        ejeY.setLabelInsets(new RectangleInsets(10, 20, 0, 0)); // Añadir más espacio entre el subtítulo y el borde izquierdo

        // Crear un renderizador para la línea y los puntos
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        renderer.setSeriesShapesVisible(0, true); // Hacer visibles los puntos
        renderer.setSeriesLinesVisible(0, true); // Hacer visible la línea
        plot.setRenderer(renderer);

        // Crear el panel del gráfico
        ChartPanel chartPanel = new ChartPanel(chart);

        // Mostrar el gráfico en un nuevo JFrame
        JFrame frame = new JFrame("Gráfico de Peso");
        frame.setContentPane(chartPanel);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);        
    }
    
    public void ordenarPorFecha(Usuarios user) {
        Collections.sort(user.getDieta().getDatosDinamico(), new ServicioDieta.ComparadorFecha());
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
