package EventosV65;

import javax.swing.*;
import java.awt.event.*;

/*para trabajar con los eventos del ratón uno utiliza una interfaz MouseListener que tiene los métodos
 * mouseClicked(MouseEvent e), mouseEntered(MouseEvent e), mouseExited(MouseEvent e), mousePresed(MouseEvent e) y
 * mouseReleased(MouseEvent e) esta interfaz tiene su clase adapter MouseAdapter, por su parte MouseEetn tiene bastantes
 * herramientas propias, verificar en la api*/
public class EventosVIIIEentosDeRatonIV7273 {
    public static void main(String[] args) {
        MarcoBoton miMarco = new MarcoBoton();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

class MarcoBoton extends JFrame {
    MarcoBoton() {
        setVisible(true);
        setBounds(700, 300, 600, 450);
        //aquí creamos nuestro listener
        addMouseListener(new EventosDeRaton2());
        addMouseMotionListener(new EventosDeRaton2());
        addMouseWheelListener(new EventosDeRaton2());
    }
}

class EventosDeRaton implements MouseListener {

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("mouseclicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("mousePressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("mouseReleased");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("mouseEntered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("mouseExited");
    }
}

class EventosDeRaton2 extends MouseAdapter {
//    @Override
//    public void mouseClicked(MouseEvent e) {
//        super.mouseClicked(e);
////        System.out.println("Coordenada X:" + e.getX() + " Coordenada Y: " + e.getY());
//        System.out.println(e.getClickCount());
//    }
//
//    @Override
//    public void mousePressed(MouseEvent e) {
//        super.mousePressed(e);
//        //esto imprime el valor de clase de los botones del mouse
//        System.out.println(e.getModifiersEx());
//    }

    @Override
    public void mousePressed(MouseEvent e) {
        super.mousePressed(e);
        if(e.getModifiersEx()== MouseEvent.BUTTON1_DOWN_MASK){
            System.out.println("has pulsado el izquierdo");
        }else if(e.getModifiersEx()==MouseEvent.BUTTON2_DOWN_MASK){
            System.out.println("has pulsado la rueda del ratón");
        }else if(e.getModifiersEx()==MouseEvent.BUTTON3_DOWN_MASK){
            System.out.println("Has pulsado el botón derecho");
        }

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        super.mouseMoved(e);
        System.out.println("Estás moviendo el mouse"+"x:"+e.getX()+"y:"+e.getY());
    }

    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {
        super.mouseWheelMoved(e);
        System.out.println("la ruedita se mueve");
    }
}