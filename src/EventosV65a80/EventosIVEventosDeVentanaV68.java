package EventosV65a80;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/*todo trabajar con ventanas es un poco más tedioso devido a que hay que implementar la interfaz window listener, en la
*  mi hay un total de 7 metodos que hay que desarrollar*/
//primero imprimimos algo en consola al minimizar la ventana.
public class EventosIVEventosDeVentanaV68 {
    public static void main(String[] args) {
        MarcoBotonesIII mimarco = new MarcoBotonesIII();
        mimarco.setVisible(true);
        mimarco.setTitle("Ventana 1");
        mimarco.setBounds(1, 300, 500, 300);
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        mimarco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        MarcoBotonesIII mimarco2= new MarcoBotonesIII();
        mimarco2.setVisible(true);
        mimarco2.setTitle("Ventana 2");
        mimarco2.setBounds(700, 300, 500, 300);

//        mimarco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mimarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}

class MarcoBotonesIII extends JFrame {
    MarcoBotonesIII() {

//        LaminaBotonesII milamina = new LaminaBotonesII();
//        M_Ventana oyente = new M_Ventana();
        addWindowListener(new M_Ventana());
    }
}
// en lugar de action listener, necesitamos un WindowLIstener

class M_Ventana implements WindowListener{

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Ventana abierta.");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Ventana cerrada.");
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("La ventana ha sido cerrada");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Ventana minimizada");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Ventana restaurada.");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Ventana activada");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
