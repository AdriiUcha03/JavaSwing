import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;

class CrearWindow extends JFrame {
    //Inicializador que genera el marco hace la creacion de la lamina
    CrearWindow(int tam_x,int tam_y){
        this.setSize(tam_x,tam_y);
        this.setVisible(true);
        //Con esto leemos la resolución en pantalla y generamos la creacion de
        //un punto central del que sacar el frame
        Toolkit myScreen = Toolkit.getDefaultToolkit();
        Dimension resolution = myScreen.getScreenSize();
        int resx=resolution.width;
        int resy=resolution.height;
        this.setLocation(resx/2-tam_x/2,resy/2-tam_y/2);
        laminaEvent lamina = new laminaEvent();
        add(lamina);
    }
}

//Clase lamina
class laminaEvent extends JPanel implements ActionListener{
    //Botones para las acciones
    JButton boton1 = new JButton("Cambia a color azul");
    JButton boton2 = new JButton("Cambia a color aleatorio");
    JButton boton3 = new JButton("Agregar imagen");

    //Boolean para checkear si se lanza el drawImage
    boolean BotonImagen = false;
    //Inicializador de los botonos con sus escuchadores
    public laminaEvent(){
        this.add(boton1);
        boton1.addActionListener(this);
        this.add(boton2);
        boton2.addActionListener(this);
        this.add(boton3);
        boton3.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) { //Este método se ejecuta cuando ocurra el evento ActionEvent
        Object fuente = e.getSource();
        if (fuente == boton1){
            BotonImagen = false;
            this.setBackground(Color.BLUE);
        } else if (fuente == boton2) {
            BotonImagen = false;
            //Genero colores aleatorios randoms
            Color color = new Color((int) (Math.random() * 256 + 1), (int) (Math.random() * 256 + 1), (int) (Math.random() * 256 + 1));
            this.setBackground(color);
        } else if (fuente == boton3) {
            BotonImagen = true;
            this.repaint();
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2D = (Graphics2D) g; // Conversion de Graphics en Graphics2D
        Image myImagen = new ImageIcon("C:\\Users\\adria\\Desktop\\EJERCICIOS JAVA\\JavaSwing\\Eventos\\src\\barcelona.png").getImage();

        if (BotonImagen) {
            g2D.drawImage(myImagen, 100, 100, 256, 256, this);
        }
    }
}

class CodigoRespondeVentana implements WindowStateListener{
    public void windowStateChanged(WindowEvent e){
        System.out.println("La ventana ha cambiado de estado");
        System.out.println("Estado anterior: " + e.getOldState());
        System.out.println("Estado actual: " + e.getNewState());
    }
}

public class EventWindow {
    public static void main(String[] args) {
        CrearWindow window = new CrearWindow(900,700);
        window.setVisible(true);
        CodigoRespondeVentana check = new CodigoRespondeVentana();
        window.addWindowStateListener(check);
    }

}