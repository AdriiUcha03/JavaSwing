import javax.swing.*;
import java.awt.*;

class MarcoCentrado extends JFrame{
    int resx;
    int resy;
    MarcoCentrado(int tam_x,int tam_y){
        this.setSize(tam_x,tam_y);
        this.setVisible(true);
        Toolkit myScreen = Toolkit.getDefaultToolkit();
        Dimension resolution = myScreen.getScreenSize();
        resx=resolution.width;
        resy=resolution.height;
        this.setLocation(resx/2-tam_x/2,resy/2-tam_y/2);
        //En el marco que creamos agregamos el objeto lamina.
        //De normal lo hacemos aqui en este caso como le pasamos un parametro
        //al constructor es mejor hacerlo en el instanciamiento
    }
}

class CrearLamina extends JPanel{
    String parametro;
    CrearLamina(String parametro){
        this.parametro = parametro;
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        if (parametro == "circulo"){
            g.drawOval(50,50,50,50);
            g.drawString("Circulo",50,80);
        }else if (parametro == "cuadrado"){
            g.drawRect(50,50,50,50);
            g.drawString("Cuadrado",50,80);
        }else if (parametro == "ovalo"){
            g.drawOval(50,50,100,50);
            g.drawString("Ovalo",50,80);
        }
    }
}




public class Paneles_paintComponent {
    public static void main(String[] args) {
        MarcoCentrado marco1 = new MarcoCentrado(950,600);
        marco1.setLocation(0,0);
        CrearLamina lamina1 = new CrearLamina("circulo");
        //Agregamos la lamina al marco1
        marco1.add(lamina1);
        //Lo volvemos a poner para evitar que se rallesi no falla mucho
        marco1.setVisible(true);
        MarcoCentrado marco2 = new MarcoCentrado(950,550);
        marco2.setLocation(marco1.resx/2,0);
        CrearLamina lamina2 = new CrearLamina("cuadrado");
        //Agregamos la lamina al marco2
        marco2.add(lamina2);
        marco2.setVisible(true);
        MarcoCentrado marco3 = new MarcoCentrado(950,550);
        marco3.setLocation(0,marco1.resy/2);
        CrearLamina lamina3 = new CrearLamina("ovalo");
        //Agregamos la lamina al marco3
        marco3.add(lamina3);
        marco3.setVisible(true);
        MarcoCentrado marco4 = new MarcoCentrado(950,550);
        marco4.setLocation(marco1.resx/2,marco1.resy/2);
        CrearLamina lamina4 = new CrearLamina("circulo");
        //Agregamos la lamina al marco4
        marco4.add(lamina4);
        marco2.setVisible(true);
    }
}