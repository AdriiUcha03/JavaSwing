# La clase JPanel

### Con JPanel podemos crear laminas para insertar en los Marcos

Creamos un clase que hereda JPanel y con eso inicializamos la lamina donde hacemos todo.

Hay multiples metodos que podemos añadir en laminas de JPanel para realizar multiples cosas.

- Tenemos **PainComponent**, con lo que generamos un objeto **Graphics** con el que podemos pintar, lineas,textos,figuras

Metodos **PainComponent con graphics**;
- **drawString:** Para escribir texto.
- **drawOval:** Dibujar una ovalo.
- **drawRect:** Dibujar un rectangulo/cuadrado.
- **fillOval:** Dibuja un ovalo relleno.
- **drawLine:** Dibujar una linea.

Metodos **PainComponent con graphics2D**;

- **draw:** Dibujamos objetos como en los de graphics.
- **setPaint(Color.'Color'):** Para pintar de un color el objeto graphics2D.
- **fill;** Para dibujar objetos tambien.
- **setFont;** Para asignar tipografias a las letras junto **drawString**
- Con la clase **Image** podemos insetar iamgenes en nuestras laminas

[**Ejemplos**](../Paneles)