import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Array;
import java.util.concurrent.TimeUnit;

class MarcoSlider extends JFrame{
    MarcoSlider (int x,int y) throws InterruptedException{
        this.setSize(x,y);
        this.setVisible(true);
        this.setExtendedState(Frame.MAXIMIZED_BOTH);
        Toolkit centrar = Toolkit.getDefaultToolkit();
        Dimension resolucion = centrar.getScreenSize();
        int resx = resolucion.width;
        int resy = resolucion.height;
        this.setLocation(0, 0);
        LaminaSlider lamina1 = new LaminaSlider("C:\\Users\\adria\\Desktop\\EJERCICIOS JAVA\\JavaSwing\\Paneles\\src\\32ba4257d34e7e063cccf2a04b30a651.jpg", "Mamahuevo");
        LaminaSlider lamina2 = new LaminaSlider("C:\\Users\\adria\\Desktop\\EJERCICIOS JAVA\\JavaSwing\\Paneles\\src\\images.jpeg", "");
        LaminaSlider lamina3 = new LaminaSlider("C:\\Users\\adria\\Desktop\\EJERCICIOS JAVA\\JavaSwing\\Paneles\\src\\NVIDIA-RTX-4060-Ti.jpg", "Ahhh q buenos los gráficos");
        LaminaSlider lamina4 = new LaminaSlider("C:\\Users\\adria\\Desktop\\EJERCICIOS JAVA\\JavaSwing\\Paneles\\src\\sdfsdfsdfsd.jpeg", "GLU GLU");
        LaminaSlider lamina5 = new LaminaSlider("C:\\Users\\adria\\Desktop\\EJERCICIOS JAVA\\JavaSwing\\Paneles\\src\\índice.jpeg", "CONCHE TU MAREEEE");
        LaminaSlider[] laminas = {lamina1,lamina2,lamina3,lamina4,lamina5};
        while (true) {
            //for each
            for (LaminaSlider lamina: laminas) {
                this.setContentPane(lamina);
                this.setVisible(true);
                Thread.sleep(3000);
            }

        }
    }
}

class LaminaSlider extends JPanel {
    String url;
    String frase;
    LaminaSlider(String url, String frase){
        this.url = url;
        this.frase = frase;
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2D=(Graphics2D)g;
        Image imagen1 = new ImageIcon(url).getImage();
        g2D.drawImage(imagen1, 0,0, getWidth(),getHeight(),this);
        setOpaque(true);
        Font fuente = new Font("Comic Sans",Font.BOLD,100);
        g2D.setFont(fuente);
        g2D.drawString(frase,250,900);
    }
}

public class Paneles_Slider {

    public static void main(String[] args) throws InterruptedException{
        MarcoSlider Marco = new MarcoSlider(450,900);
        Marco.setVisible(true);
    }
}