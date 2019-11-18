package EventosV65;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

public class EventosXEventosDEFocoVentanaV75 extends JFrame implements WindowFocusListener {

    EventosXEventosDEFocoVentanaV75 marco1;
    EventosXEventosDEFocoVentanaV75 marco2;

    public static void main(String[] args) {
        EventosXEventosDEFocoVentanaV75 miv = new EventosXEventosDEFocoVentanaV75();
        miv.iniciar();
    }

    public void iniciar() {
        marco1 = new EventosXEventosDEFocoVentanaV75();
        marco2 = new EventosXEventosDEFocoVentanaV75();
        marco1.setVisible(true);
        marco2.setVisible(true);
        marco1.setBounds(300, 100, 600, 350);
        marco2.setBounds(1200, 100, 600, 350);
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco1.addWindowFocusListener(this);
        marco2.addWindowFocusListener(this);
    }

    @Override
    public void windowGainedFocus(WindowEvent e) {
        if (e.getSource() == marco1) {
            marco1.setTitle("Tengo el foco!!");
        } else {
            marco2.setTitle("Tengo el foco!!");
        }
    }

    @Override
    public void windowLostFocus(WindowEvent e) {
        if (e.getSource() == marco1) {
            marco1.setTitle("Perdí el foco!!");
        } else {
            marco2.setTitle("Perdí el foco!!");
        }
    }
}
