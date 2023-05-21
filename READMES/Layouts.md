# Layouts tipos

### Tenemos 3 tipos:
- **BorderLayout**
- **GridLayout**
- **FlowLayout**

Para declarar el tipo de layout que queremos usamos **setLayout('tipo layout')**

### FlowLayout:
Este organiza los componentes en flujo de izquierda a derecha de forma centrada.
Cuando queramos modificar el alineado tendremos que usar un constructor

##### FlowLayout(int align, int hgap, int vgap):
- **align:** Alineamiento del layout [CENTER, LEADING, LEFT, RIGHT, TRAILING].
- **hgap:** Espacio entre elementos horizontalmente.
- **vgap:** Espacio entre elementos verticalmente.

### BorderLayout
Este organiza por NORTH, SOUTH, EAST, WEST Y CENTER(automático)

##### add(boton1,BorderLayout.WEST)

### GridLayout
Este es parecido al grid area de css.

[**Ejemplo LayoutGrid**](../Layouts)