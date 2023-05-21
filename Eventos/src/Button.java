import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MarcoButton extends JFrame{
    MarcoButton (int x, int y){
        this.setSize(x,y);
        this.setVisible(true);
        Toolkit pantalla = Toolkit.getDefaultToolkit();
        Dimension resolucion = pantalla.getScreenSize();
        int resx=resolucion.width;
        int resy=resolucion.height;
        this.setLocation(resx/2-x/2,resy/2-y/2);
        LaminaButton lamina = new LaminaButton();
        add(lamina);
    }
}

class LaminaButton extends JPanel implements ActionListener{

    //NO utilizamos paint component si no JButton ya que hacemos botones no dibujamos cosas
    JButton boton = new JButton("Pulsa para cambiar el color de fondo");
    public LaminaButton(){
        this.add(boton);
        boton.addActionListener(this);//Lo que ocurra en dicho boton es capturado por la lamina en la que se encuntra
    }

    public void actionPerformed(ActionEvent evento){
        //Genero colores aleatorios randoms
        Color color= new Color((int) (Math.random()*256 + 1),(int) (Math.random()*256 + 1),(int) (Math.random()*256 + 1));
        this.setBackground(color);
    }
}

public class Button {
    public static void main(String[] args) {
        MarcoButton Marco = new MarcoButton(500,500);
        Marco.setVisible(true);
    }
}