//Para crear un marco necesitamos importar java.swing
import javax.swing.*;

//Creamos la clase que no crea el marco
class Marco extends JFrame{

    Marco(int tam_x, int tam_y, int loc_x, int loc_y){
        //Tamaño del marco
        this.setSize(tam_x,tam_y);
        //Localización
        this.setLocation(loc_x,loc_y);
        //Que este sea visible o no
        this.setVisible(true);
        //No Resizable
        this.setResizable(false);
    }
}
public class CrearMarco {
    public static void main(String[] args) {
        //Creación de marco básico
        Marco marco1 = new Marco(600,100,0,600);
        Marco marco2 = new Marco(400,400,200,200);
        Marco marco3 = new Marco(500,750,1000,800);
        Marco marco4 = new Marco(350,350,100,750);
        Marco marco5 = new Marco(600,100,500,600);
        //Asignación de titulo a marco5
        marco5.setTitle("Ventana de la muerte");
        //Asignación de kill del programa al marco 5
        marco5.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
