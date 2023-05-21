import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;
import java.util.Random;

class MarcoCentrado extends JFrame{
    MarcoCentrado(int tam_x,int tam_y){
        this.setSize(tam_x,tam_y);
        this.setVisible(true);
        //Con esto leemos la resolución en pantalla y generamos la creacion de
        //un punto central del que sacar el frame
        Toolkit myScreen = Toolkit.getDefaultToolkit();
        Dimension resolution = myScreen.getScreenSize();
        int resx=resolution.width;
        int resy=resolution.height;
        this.setLocation(resx/2-tam_x/2,resy/2-tam_y/2);
        juegoLetraAleatoria teclado = new juegoLetraAleatoria();
        addKeyListener(teclado);
    }
}

class juegoLetraAleatoria implements KeyListener{
    Random r = new Random();
    //Generar una letra Aleatoria de la A a la Z
    char letra = (char)(r.nextInt(26) + 'A');
    char teclapulsada;
    juegoLetraAleatoria(){
        System.out.println("Intenta adivinar la letra: ");
        System.out.println("Nota**: La letra es en mayusucula");
    }

    @Override
    public void keyTyped(KeyEvent event){//Para los caracteres
    }

    @Override
    public void keyPressed(KeyEvent event){
        teclapulsada=event.getKeyChar();
        if (teclapulsada == letra){
            System.out.printf("Congratulations\n");
        }else {
            System.out.printf("You missed it, try again\n");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

}

public class LetraRandom {
    public static void main(String[] args) {
        MarcoCentrado marco = new MarcoCentrado(500,500);
    }
}
