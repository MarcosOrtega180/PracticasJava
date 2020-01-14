package LayoutsV81;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
/* en el vídeo 81 lo que hice fue modificar la alineacion del layout en (1)
 * en el vídeo 82 empecé modificando la distancia entre los botones, la misa era de 5 px por defecto, esto se hace utilizando
 * el tercer constructor de FlowLayout, el cual incluye las distancias
 * (3) cambiamos el FloatLayout por border layout, agregamos al método add un segundo parámetro, el mismo permite ubicar
 * los botones correspondientes en las posiciones específicas de layout*/


public class LayoutsI_II_V81_82 {
    public static void main(String[] args) {
        Marco_Layout marco = new Marco_Layout();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
}

class Marco_Layout extends JFrame {
    Marco_Layout() {
        setName("Pruea acciones");
        setBounds(600, 350, 600, 300);
        Panel_Layout lamina = new Panel_Layout();
        Panel_Layout2 lamina2 = new Panel_Layout2();
//      (1)  FlowLayout disposicion = new FlowLayout(FlowLayout.LEFT)
//      (2)  lamina.setLayout( new FlowLayout(FlowLayout.LEFT, 75,100));
//      (3)  lamina.setLayout(new BorderLayout());
        add(lamina, BorderLayout.NORTH);
        add(lamina2, BorderLayout.SOUTH);
    }
}

class Panel_Layout extends JPanel {
    Panel_Layout() {
        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(new JButton("Amarillo"));
        add(new JButton("Rojo"));
        add(new JButton("Amarillo"));
        add(new JButton("Purpura"));
        add(new JButton("Negro"));
        //esto es lo que queda en el centro, el valor center es el que un elemento tien por efecto
    }
}

class Panel_Layout2 extends JPanel {
    Panel_Layout2(){
        setLayout(new BorderLayout());
        add(new JButton("Amarillo"), BorderLayout.NORTH);
        add(new JButton("Rojo"), BorderLayout.SOUTH);
        add(new JButton("Amarillo"), BorderLayout.EAST);
        add(new JButton("Negro"), BorderLayout.CENTER);
        add(new JButton("Azul"), BorderLayout.WEST);
    }
}