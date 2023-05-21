import javax.swing.*;
import java.awt.*;
//Con toolkit podemos hacer una clase que nos permita ponernos el marco
// de forma centrada
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
    }
}

public class CrearMarcoCentrado {
    public static void main(String[] args) {
        MarcoCentrado marco1 = new MarcoCentrado(500,500);
    }
}
