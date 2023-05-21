import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class CreacionMarco extends JFrame {
    CreacionMarco(int tam_x,int tam_y){
        this.setSize(tam_x,tam_y);
        this.setVisible(true);
        //Con esto leemos la resolución en pantalla y generamos la creacion de
        //un punto central del que sacar el frame
        Toolkit myScreen = Toolkit.getDefaultToolkit();
        Dimension resolution = myScreen.getScreenSize();
        int resx=resolution.width;
        int resy=resolution.height;
        this.setLocation(resx/2-tam_x/2,resy/2-tam_y/2);
        area51Mouse escuhar = new area51Mouse();
        addMouseListener(escuhar);
    }
}

class area51Mouse implements MouseListener{
    int cont = 0;
    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (cont == 0){
            System.out.printf("Estas entrando en el Area51\n");
        } else if (cont == 1) {
            System.out.printf("Si vuelves a entrar seras disparado\n");
        } else if (cont == 2) {
            cont = 0;
            System.out.printf("BOOM, estas MUERTO por MAMAHUEVO\n");
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        cont +=1;
    }
}

public class Area51 {
    public static void main(String[] args) {
        CreacionMarco marco = new CreacionMarco(500,500);
    }
}
