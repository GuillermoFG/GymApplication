package Funciones;

public class ValidationUtils {
    
    
    public static boolean esTextoValido(String texto) {
        return texto.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+");
    }     
    
    public static boolean esNumeroValido(String texto) {
        try {
            Integer.parseInt(texto);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }      
    
    public static boolean esFechaValida(String fecha) {
        // Expresión regular para validar formato de fecha DD/MM/YYYY
        if (!fecha.matches("^\\d{2}/\\d{2}/\\d{4}$")) {
            return false;
        }

        // Dividir la fecha en día, mes y año
        String[] partes = fecha.split("/");
        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int año = Integer.parseInt(partes[2]);

        // Verificar que el mes esté en el rango de 1 a 12
        if (mes < 1 || mes > 12) {
            return false;
        }
        
        if (dia < 1 || dia > 31) {
            return false;
        }        
        return true;
    }

    public static boolean esHoraValida(String hora) {
        // Expresión regular para validar formato de hora HH:MM
        return hora.matches("^\\d{2}:\\d{2}$");
    }     
    
    
    public static boolean validarEntrada(String entrada, String tipo) {
        if (entrada.isEmpty() || !esNumeroValido(entrada)) {
            return false;
        }
        return true;
    }       
    
    
    
    
    
    
}
