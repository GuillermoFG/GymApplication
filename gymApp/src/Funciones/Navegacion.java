
package Funciones;

import Dominio.Sistema;
import Dominio.Usuarios;
import Interfaz.VentanaAgregarAlimento;
import Interfaz.VentanaAgregarEjercicio;
import Interfaz.VentanaChequeoPesajes;
import Interfaz.VentanaConsultaClientes;
import Interfaz.VentanaConsultarIngredientes;
import Interfaz.VentanaConsultarMacros;
import Interfaz.VentanaDieta;
import Interfaz.VentanaLogin;
import Interfaz.VentanaModificar;
import Interfaz.VentanaModificarDiasEntreno;
import Interfaz.VentanaRegistroDeDieta;
import Interfaz.VentanaRegistroDeRutina;
import Interfaz.VentanaRutina;
import javax.swing.JFrame;

public class Navegacion {
    
    public static void abrirVentanaRegistroDeRutina() {
        VentanaRegistroDeRutina registroRutina = new VentanaRegistroDeRutina();
        registroRutina.setVisible(true);
    }

    public static void abrirVentanaRegistroDeRutina(Usuarios user, JFrame ventana) {
        VentanaRegistroDeRutina registroRutina = new VentanaRegistroDeRutina(user, ventana);
        registroRutina.setVisible(true);
    }
    
    public static void abrirVentanaConsultaClientes(JFrame ventana) {
        VentanaConsultaClientes registroCliente = new VentanaConsultaClientes(ventana);
        registroCliente.setVisible(true);
    }

    public static void abrirVentanaRegistroDeDieta() {
        VentanaRegistroDeDieta registroDieta = new VentanaRegistroDeDieta();
        registroDieta.setVisible(true);
    }

    public static void abrirVentanaRutina() {
        VentanaRutina ventanaRutina = new VentanaRutina();
        ventanaRutina.setVisible(true);
    }

    public static void abrirVentanaDieta() {
        VentanaDieta ventanaDieta = new VentanaDieta();
        ventanaDieta.setVisible(true);
    }

    public static void abrirVentanaChequeoPesajes() {
        VentanaChequeoPesajes ventanaChequeoPesajes = new VentanaChequeoPesajes();
        ventanaChequeoPesajes.setVisible(true);
    }

    public static void abrirVentanaLogin() {
        VentanaLogin ventanaLogin = new VentanaLogin();
        ventanaLogin.setVisible(true);
    }
    
    public static void abrirVentanaModificar(String tarea, Usuarios user, JFrame ventana) {
        VentanaModificar ventanaModificar = new VentanaModificar(tarea, user, ventana);
        ventanaModificar.setVisible(true);
    }    
     
    public static void abrirVentanaConsultarMacros(Usuarios user, JFrame ventana) {
        VentanaConsultarMacros ventanaConsultarMacros = new VentanaConsultarMacros(user, ventana);
        ventanaConsultarMacros.setVisible(true);
    }   

    public static void abrirVentanaConsultarIngredientes(JFrame ventana) {
        VentanaConsultarIngredientes ventanaConsultarIngredientes = new VentanaConsultarIngredientes(ventana);
        ventanaConsultarIngredientes.setVisible(true);
    }      

    public static void abrirVentanaAgregarAlimento(JFrame ventana) {
        VentanaAgregarAlimento ventanaAgregarAlimento = new VentanaAgregarAlimento(ventana);
        ventanaAgregarAlimento.setVisible(true);
    }   
    
    public static void abrirVentanaModificarDiasEntreno(Usuarios user, JFrame ventana, String accion) {
        VentanaModificarDiasEntreno ventanaModificarDiasEntreno = new VentanaModificarDiasEntreno(user, ventana, accion);
        ventanaModificarDiasEntreno.setVisible(true);
    }  
    
    public static void abrirVentanaAgregarEjercicio(Sistema unSistema, JFrame ventana) {
        VentanaAgregarEjercicio ventanaAgregarEjercicio = new VentanaAgregarEjercicio(ventana);
        ventanaAgregarEjercicio.setVisible(true);
    }        
}
