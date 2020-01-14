package EventosV65;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*Podemos tener muchas fuentes (disparador) para ejecutar el mismo oyente, para el control de los múltiples eventos fuente
 * se utiliza la interfaz Action que hereda el método actionPerformed(ActionEvent e) y sus métodos propios son
 * setEnabled(boolean b), isEnabled(boolean b), putValue(String clave, Object valor), getValue(String clave),
 * addPropertyChangedListener(PropertyChangeListener oyente) y removePropertyChangedListener(PropertyChangeListenerOgente).
 * No tiene una clase adaptadora pero podemos utilizar AbstractAction para algo similar.
 * obs: Una abstract action básicamente busca ser capaz de actuar en respuesta a */


public class EventosXIMultiplesFuentesDeEventosIV76777879 {
    public static void main(String[] args) {
        MarcoAccion marco = new MarcoAccion();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
}

class MarcoAccion extends JFrame {
    MarcoAccion() {
        setVisible(true);
        setBounds(600, 350, 600, 300);
        add(new PanelAction());
    }
}


class PanelAction extends JPanel {
    PanelAction() {
        //las siguientes son acciones
        AccionColor accionAmarillo = new AccionColor("Amarillo ", new ImageIcon("src/favicon.ico"), Color.yellow);
        AccionColor accionRojo = new AccionColor("Rojo ", new ImageIcon("src/favicon.ico"), Color.red);
        AccionColor accionAzul = new AccionColor("Azul ", new ImageIcon("src/favicon.ico"), Color.blue);
        //ahora creamos botones enviando como parámetros a las acciones creadas anteriormente
        add(new JButton(accionAmarillo));
        add(new JButton(accionRojo));
        add(new JButton(accionAzul));
//        JButton botonAmarillo = new JButton("Amarillo");
//        JButton botonRojo = new JButton("Rojo");
//        JButton botonAzul = new JButton("Azul");
//        add(botonAmarillo);
//        add(botonAzul);
//        add(botonRojo);
        InputMap mapaEntrada = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
//        KeyStroke tecladoAmarillo = KeyStroke.getKeyStroke("ctrl A");
        mapaEntrada.put(KeyStroke.getKeyStroke("ctrl A"), "fondo_amarillo");
        mapaEntrada.put(KeyStroke.getKeyStroke("ctrl B"), "fondo_azul");
        mapaEntrada.put(KeyStroke.getKeyStroke("ctrl R"), "fondo_rojo");
        ActionMap mapaAccion = getActionMap();
        mapaAccion.put("fondo_amarillo", accionAmarillo);
        mapaAccion.put("fondo_azul", accionAzul);
        mapaAccion.put("fondo_rojo", accionRojo);
    }

    private class AccionColor extends AbstractAction { //declaramos la clase con el modificador de acceso private para qeu no sea accesible desde otros lugares
        AccionColor(String nombre, Icon icono, Color color_boton) {
            /*al tulizar putValue lo que estamos haciendo es definir variables de clase, igual a aquellas que estan precentes dentro de las diferentes librerías
             * de java, para obtener los valores basta con poner NombreDeClase.getValue() */
            putValue(Action.NAME, nombre); //le ponemos un nombre a una acción
            putValue(Action.SMALL_ICON, icono); //le ponemos el icono
            putValue(Action.SHORT_DESCRIPTION, "La lámina es de color: " + nombre); //le ponemos una descripción
            putValue("color_de_fondo", color_boton); // yo mismo defino un nomre de clabe y le doy valor
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            Color c = (Color) getValue("color_de_fondo");
            setBackground(c); //esto es posible solo porque AccionColor es una clase interna
            System.out.println("Nombre: " + getValue(Action.NAME) + " Descripción: " + getValue(Action.SHORT_DESCRIPTION));
        }
    }
}

