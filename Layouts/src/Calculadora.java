import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.geom.Rectangle2D;

class CrearMarcoCentrado extends JFrame{
    CrearMarcoCentrado (int x, int y){
        this.setSize(x,y);
        this.setVisible(true);
        BorderLayout GestorUbiBorder = new BorderLayout();
        setLayout(GestorUbiBorder);
        Toolkit pantalla = Toolkit.getDefaultToolkit();
        Dimension resolucion = pantalla.getScreenSize();
        int resx=resolucion.width;
        int resy=resolucion.height;
        this.setLocation(resx/2-x/2,resy/2-y/2);
        miLamina lamina1= new miLamina();
        add(lamina1,BorderLayout.NORTH);
        miLamina2 lamina2 = new miLamina2();
        add(lamina2,BorderLayout.CENTER);
    }
}


class miLamina extends JPanel {
    public miLamina(){
        JTextField CuadroTexto = new JTextField("");
        add(CuadroTexto);
        CuadroTexto.setColumns(35);
        CuadroTexto.setText("Calculadora Casio");
    }
}
class miLamina2 extends JPanel {
    public miLamina2() {
        setLayout(new GridLayout(5,4,5,5));
        JButton off = new JButton("OFF");
        add(off);
        JButton del = new JButton("DEL");
        add(del);
        JButton ac = new JButton("AC");
        add(ac);
        JButton division = new JButton("/");
        add(division);
        JButton siete = new JButton("7");
        add(siete);
        JButton ocho = new JButton("8");
        add(ocho);
        JButton nueve = new JButton("9");
        add(nueve);
        JButton multi = new JButton("*");
        add(multi);
        JButton cuatro = new JButton("4");
        add(cuatro);
        JButton cinco = new JButton("5");
        add(cinco);
        JButton seis = new JButton("6");
        add(seis);
        JButton menos = new JButton("-");
        add(menos);
        JButton uno = new JButton("1");
        add(uno);
        JButton dos = new JButton("2");
        add(dos);
        JButton tres = new JButton("3");
        add(tres);
        JButton mas = new JButton("+");
        add(mas);
        JButton cero = new JButton("0");
        add(cero);
        JButton doblecero = new JButton("00");
        add(doblecero);
        JButton punto = new JButton(".");
        add(punto);
        JButton igual = new JButton("=");
        add(igual);
    }
}

public class Calculadora {
    public static void main(String[] args) {
        CrearMarcoCentrado Marco = new CrearMarcoCentrado(400,400);
        Marco.setVisible(true);
    }
}
