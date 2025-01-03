package Dominio;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Usuarios {
    private Rutina rutina;   
    private Dieta dieta;
    private String nombre;
    private String sexo;
    private int [] diasEntreno;
    private double altura;    
    private int edad;
    private double peso;
    private int cedula;
    private LocalDate fechaNacimiento; 
    private ArrayList<Usuarios> listaClientes;
    private int contraseña;
    private int esEntrenador;
    private int esEntrenado;
    
    public void setEntrenador(int num){
        this.esEntrenador = num;
    }
    
    public void setEntrenado(int num){
        this.esEntrenado = num;
    }
    
    public void setContraseña(int contraseña){
        this.contraseña = contraseña;
    }
    
    public void setListaClientes(ArrayList<Usuarios> lista){
        this.listaClientes = lista;
    }
    
    public void setFechaNacimiento(LocalDate fecha){
        this.fechaNacimiento = fecha;
    }
    
    public void setRutina (Rutina r){
        this.rutina = r;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    
    public void setDieta(Dieta d){
        this.dieta = d;
    }
    
    public void setDiasEntreno(int [] dias){
        this.diasEntreno = dias;
    }
    
    public ArrayList<Usuarios> getListaClientes(){
        return listaClientes;
    }
    
    public int getEsEntrenado(){
        return esEntrenado;
    }
    
    public int getEsEntrenador(){
        return esEntrenador;
    }
    
    public int getContraseña(){
        return contraseña;
    }
    
    public LocalDate getFechaNacimiento (){
        return fechaNacimiento;
    }    
    
    public int [] getDiasEntreno (){
        return diasEntreno;
    }
    
    public Rutina getRutina(){
        return rutina;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public double getAltura() {
        return altura;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }
    
    public int getCedula() {
        return cedula;
    }
    
    public Dieta getDieta(){
        return dieta;
    }
    
    public Usuarios(String nombre, String sexo, int[] diasEntreno, int cedula, int esEntrenador, int esEntrenado){
        this.nombre = nombre;
        this.sexo = sexo;
        this.diasEntreno = diasEntreno;
        this.cedula = cedula;
        this.esEntrenador = esEntrenador;
        this.esEntrenado = esEntrenado;
    }
    
    
    public Usuarios(String nombre, int cedula,int contraseña){
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.cedula = cedula;
        this.listaClientes = new ArrayList();
    }
    
    
    public void añadirCliente(Usuarios cliente) {
        if (!this.listaClientes.contains(cliente)) { // Evitar duplicados
            this.listaClientes.add(cliente);
        }
    }    
    
    private int calcularEdad(String diaTexto, String mesTexto, String añoTexto) {
        try {
            // Leer y convertir los valores de los campos de texto
            int dia = Integer.parseInt(diaTexto);
            int mes = Integer.parseInt(mesTexto);
            int año = Integer.parseInt(añoTexto);

            // Crear un objeto LocalDate para la fecha de nacimiento
            LocalDate fechaNacimiento = LocalDate.of(año, mes, dia);
            LocalDate fechaActual = LocalDate.now(); // Obtener la fecha actual

            // Calcular la edad usando la clase Period
            Period periodo = Period.between(fechaNacimiento, fechaActual);
            int edad = periodo.getYears(); // Obtener los años completos
            return edad;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Fecha de nacimiento no válida. Por favor, ingrese una fecha correcta.", "Error de entrada", JOptionPane.ERROR_MESSAGE);
            return -1;
        }
    }        

    // Método para calcular la edad
    public int calcularEdad() {
        if (fechaNacimiento == null) {
            return -1; // Si no hay fecha de nacimiento, devolver -1 o manejar el error según tu necesidad
        }
        LocalDate fechaActual = LocalDate.now();
        return Period.between(fechaNacimiento, fechaActual).getYears();
    }       
}
