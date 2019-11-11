package EventosV65;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/*esto se utiliza cuando queremos que nuestro programa ejecute algo cuando se presione un botón especial
* Para se utiliza la interfaz KeyListener la cuál tiene tres métodos los cuales son keyPressed(KeyEvent e):cuando
* cualquier tecla es presionada, * keyReleased(KeyEvent e): cuando la tecla ha sido soltada y KeyTyped(KeyEvent e):
* cuando se han dado los dos métodos anteriores, esta interfaz tiene su adaptador que e KeyAdapter*/
public class EventosVIIEventosDeTecladoIV71 {
    public static void main(String[] args) {
        MarcoConTeclas miMarco= new MarcoConTeclas();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

class MarcoConTeclas extends JFrame{
    MarcoConTeclas(){
        setVisible(true);
        setBounds(700,300,600,450);
        //aquí creamos nuestro listener
        addKeyListener(new EventoDeTeclado());
    }
}

//construimos nuestro objeto keyListener
class EventoDeTeclado implements KeyListener {
    EventoDeTeclado(){
        System.out.println();
    }
    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("Keytyped: "+ +e.getKeyCode()+" keyChar: "+e.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("keyPressed: "+e.getKeyCode()+" keyChar: "+e.getKeyChar());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("deyReleased: "+e.getKeyCode()+" keyChar: "+e.getKeyChar());
    }
}
