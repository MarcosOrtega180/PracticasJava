package GUIV55;

import javax.swing.*;
import java.awt.*;

/*55, creación de la clase miMarco(), uso de setVisible(), setDefaultCloseOperation(), setSize()k
 * 56 set location y setbounds permite establecer las coordenadas de las ventanas, set location siempre toma como referencia
 * a la ventana padre
 * 57 como colocar el frame en cualqueir punto de la pantalla, para ello usamos Tookit para comunicarnos con el sistema
 * nativo de las ventanas, usamos getDefaultTookit*/
public class CreandoMarcosV55 {
    public static void main(String[] args) {
        miMarco marco1 = new miMarco();
        marco1.setVisible(true);
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class miMarco extends JFrame {
    public miMarco() {
//        setSize(500,600);
//        setLocation(500,0);
        setBounds(500, 300, 250, 250);
//        setResizable(false); // est true por defecto
        setExtendedState(Frame.MAXIMIZED_BOTH); // pantalla completa
//        Point hola = getLocation();// lee la posición actual
//        System.out.println(hola);
        setTitle("Mi ventana");
    }
}