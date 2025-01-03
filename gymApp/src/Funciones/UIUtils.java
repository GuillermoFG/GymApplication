package Funciones;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class UIUtils {
    
    public static void configurarLogo(JPanel panel, String rutaLogo) {
        // Crear un JLabel para el logo
        JLabel logoLabel = new JLabel();
        ImageIcon logo = new ImageIcon(UIUtils.class.getResource(rutaLogo));

        // Redimensionar la imagen a un tamaño deseado (ejemplo: 200x200 píxeles)
        Image image = logo.getImage();
        Image scaledImage = image.getScaledInstance(470, 470, java.awt.Image.SCALE_SMOOTH);
        ImageIcon scaledLogo = new ImageIcon(scaledImage);
        logoLabel.setIcon(scaledLogo);
        logoLabel.setHorizontalAlignment(JLabel.CENTER);

        // Crear un JPanel para la imagen con un margen alrededor
        JPanel logoPanel = new JPanel();
        logoPanel.setBackground(new Color(19,29,35));
        logoPanel.setLayout(new java.awt.BorderLayout());
        logoPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 85, 20)); // Márgenes: arriba, izquierda, abajo, derecha
        logoPanel.add(logoLabel, java.awt.BorderLayout.CENTER);
        
        // Añadir el panel con la imagen redimensionada al panel principal
        panel.setLayout(new java.awt.BorderLayout());
        panel.add(logoPanel, java.awt.BorderLayout.CENTER);      
        panel.revalidate();
        panel.repaint();
    }        
    
    
    
    public static void test (JFrame frame,JPanel panel, String rutaLogo){
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        panel.setBackground(new Color(19, 29, 35)); // Color de fondo
        frame.setLayout(new BorderLayout());
        
        JLabel logoLabel = new JLabel();
        ImageIcon logo = new ImageIcon(UIUtils.class.getResource(rutaLogo));

        // Redimensionar la imagen a un tamaño deseado (ejemplo: 200x200 píxeles)
        Image image = logo.getImage();
        Image scaledImage = image.getScaledInstance(470, 470, java.awt.Image.SCALE_SMOOTH);
        ImageIcon scaledLogo = new ImageIcon(scaledImage);
        logoLabel.setIcon(scaledLogo);
        logoLabel.setHorizontalAlignment(JLabel.CENTER);

        // Crear un JPanel para la imagen con un margen alrededor
        JPanel logoPanel = new JPanel();
        logoPanel.setBackground(new Color(19,29,35));
        logoPanel.setLayout(new java.awt.BorderLayout());
        logoPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 15, 0)); // Márgenes: arriba, izquierda, abajo, derecha
        logoPanel.add(logoLabel, java.awt.BorderLayout.CENTER);           
        
        panel.setLayout(new java.awt.BorderLayout());
        panel.add(logoPanel, java.awt.BorderLayout.CENTER);           
        frame.getContentPane().add(panel, BorderLayout.CENTER);
    }
    
    public static void casi(JFrame frame, JPanel panel, String rutaLogo){
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        panel.setBackground(new Color(19, 29, 35)); // Color de fondo
        frame.setLayout(new BorderLayout());
        
        JLabel logoLabel = new JLabel();
        ImageIcon logo = new ImageIcon(UIUtils.class.getResource(rutaLogo));
        Image image = logo.getImage();
        
        JPanel logoPanel = new JPanel();
        logoPanel.setBackground(new Color(19,29,35));
        logoPanel.setLayout(new java.awt.BorderLayout());
        logoPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 15, 0)); // Márgenes: arriba, izquierda, abajo, derecha
        
        logoPanel.add(logoLabel, java.awt.BorderLayout.CENTER);            
        

        Image scaledImage = image.getScaledInstance((int)(frame.getWidth()/3.5), frame.getHeight()/2, java.awt.Image.SCALE_SMOOTH);
        ImageIcon scaledLogo = new ImageIcon(scaledImage);
        logoLabel.setIcon(scaledLogo);
        logoLabel.setHorizontalAlignment(JLabel.CENTER);

        panel.setLayout(new java.awt.BorderLayout());
        panel.add(logoPanel, java.awt.BorderLayout.CENTER);           
        frame.getContentPane().add(panel, BorderLayout.CENTER);
    }
    
    public static void config(JPanel panel, String rutaLogo){
                // Crear un JLabel para el logo
        JLabel logoLabel = new JLabel();
        ImageIcon logo = new ImageIcon(UIUtils.class.getResource(rutaLogo));

        // Redimensionar la imagen a un tamaño deseado (ejemplo: 200x200 píxeles)
        Image image = logo.getImage();
        Image scaledImage = image.getScaledInstance(470, 470, java.awt.Image.SCALE_SMOOTH);
        ImageIcon scaledLogo = new ImageIcon(scaledImage);
        logoLabel.setIcon(scaledLogo);
        logoLabel.setHorizontalAlignment(JLabel.CENTER);

        // Crear un JPanel para la imagen con un margen alrededor
        JPanel logoPanel = new JPanel();
        logoPanel.setBackground(new Color(19,29,35));
        logoPanel.setLayout(new java.awt.BorderLayout());
        logoPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 85, 20)); // Márgenes: arriba, izquierda, abajo, derecha
        logoPanel.add(logoLabel, java.awt.BorderLayout.CENTER);

        // Añadir el panel con la imagen redimensionada al panel principal
        panel.setLayout(new java.awt.BorderLayout());
        panel.add(logoPanel, java.awt.BorderLayout.CENTER); 
    }
}
