import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

class MarcoBandera extends JFrame{
    int resx;
    int resy;
    MarcoBandera(int tam_x,int tam_y){
        this.setSize(tam_x,tam_y);
        this.setVisible(true);
        Toolkit myScreen = Toolkit.getDefaultToolkit();
        Dimension resolution = myScreen.getScreenSize();
        resx=resolution.width;
        resy=resolution.height;
        this.setLocation(resx/2-tam_x/2,resy/2-tam_y/2);
        crearLaminaBandera lamina = new crearLaminaBandera(resx,resy);
        add(lamina);
    }
}

class crearLaminaBandera extends JPanel{
    int res_x;
    int res_y;
    crearLaminaBandera(int x, int y){
        this.res_x = x;
        this.res_y = y;
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        //Hacemos la converaion hacia abjo del graphics al graphics2D
        Graphics2D graphics2D = (Graphics2D)g;
        //Creamos el objeto rectangulo en 2D
        Rectangle2D rectangulo = new Rectangle2D.Double(0,0,res_x,res_y);
        //Creo el color Gualda
        Color gualda = new Color(255,255,0);
        graphics2D.setPaint(Color.RED);
        graphics2D.fill(rectangulo);
        //Asi estaría centrada se ve unas decimas mas hacia bajo por la barra de tareas de windows que coge parte de
        //los pixeles de la resolución
        Rectangle2D rectangulo_gualda = new Rectangle2D.Double(0,(res_y/2)/2,res_x,res_y/2);
        graphics2D.setPaint(gualda);
        graphics2D.fill(rectangulo_gualda);
        //Le agregamos un detalle de tipo string para probar el setFont
        Font ComicSans = new Font("Comic Sans",Font.BOLD,50);
        graphics2D.setFont(ComicSans);
        graphics2D.drawString("Bandera Española",20,80);
        Image imagen = new ImageIcon("C:\\Users\\adria\\Desktop\\EJERCICIOS JAVA\\JavaSwing\\Paneles\\src\\icono.png").getImage();
        graphics2D.drawImage(imagen,50,350,263,378,this);
        //Para que la imagen se vea
        setOpaque(false);
    }
}
public class Paneles_Bandera {
    public static void main(String[] args) {
        MarcoBandera marco = new MarcoBandera(800,600);
        //Para poner a pantalla completa
        marco.setExtendedState(Frame.MAXIMIZED_BOTH);
    }
}