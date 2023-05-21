# Eventos

### Principales *Eventos* generados por componentes

| **Tipo de Evento**       | Interfaz            | Métodos                                                                              |
|--------------------------|---------------------|--------------------------------------------------------------------------------------|
| ActionEvent <br> JBUTTON | ActionListener      | actionPerformed                                                                      |
| TextEvent                | TextListener        | textValueChanged                                                                     |
| ItemEvent                | ItemListener        | itemStatedChanged                                                                    |
| ChangeEvent <br> SLIDER  | ChangeListener      | stateChanged                                                                         |
| FocusEvent               | FocusListener       | focusGained <br> focusLost                                                           |
| KeyEvent                 | KayListener         | keyPressed <br> keyReleased <br> keyTyped                                            |
| MouseEvent               | MouseListener       | mouseClicked <br> mouseEntered <br> mouseExited <br> mousePressed <br> mouseReleased |
| MouseEvent               | MouseMotionListener | mouseDragged <br> mouseMoved                                                         |

### Metodo repaint()

El metodo **repaint()** se utiliza para reprintear un componente, este es util con **paintComponent(Graprics2D)**, para dibujar elementos conbinados con **actionListener** y diferentes **botones**.

[**Ejemplos**](../Eventos)