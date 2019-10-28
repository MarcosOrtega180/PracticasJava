package GUIV55;

import javax.swing.*;
import java.awt.*;
/* 57 como colocar el frame en cualqueir punto de la pantalla, para ello usamos Tookit para comunicarnos con el sistema
 * nativo de las ventanas, usamos getDefaultTookit,
 * Toolkit.getDefaultToolkit(); retorna el sistema nativo en el que se está ejecutando el programa*/
public class CreandoMarcoCentrado {
    public static void main(String[] args){
        MarcoCentrado miMarco = new MarcoCentrado();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);
    }
}

class MarcoCentrado extends JFrame{
    public MarcoCentrado(){
        Toolkit miPantalla = Toolkit.getDefaultToolkit();

        Dimension tamanoPantalla = miPantalla.getScreenSize(); // nos regresa el tamaño de la ventana.
        int alturaPantalla = tamanoPantalla.height;
        int anchuraPantalla = tamanoPantalla.width;

        // ahora que tenemos los datos del sistema, voy a crear una ventana que tenga lamitad del ancho y el alto de mi pantalla
        setSize(anchuraPantalla/2, alturaPantalla/2);
        setLocation(anchuraPantalla/4,alturaPantalla/4);

        setTitle("Marco Centrado");
        Image miIcono= miPantalla.getImage("favicon.ico");
        setIconImage(miIcono);
    }
}
