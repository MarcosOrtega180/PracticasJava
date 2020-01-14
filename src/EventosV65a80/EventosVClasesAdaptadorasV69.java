package EventosV65a80;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*clase adaptadora, hay  ters tipos keyAdapter, WindowAdapter, MouseAdapter
 * WindowAdapter: tiene las siguientes interfaces WindowFocusListener, WindowStateListener, WindowListener (que ya usamos)
 * EventListener. No hemos visto estas clases hasta ahora porque no teníamos la necesidad debido a que solo implementabamos
 * solo uno o dos métodos, las adaptadoras son utilizadas cuando tenemos demasiados métodos a desarrollar dentro de una
 * interfaz, son como clases puente */
public class EventosVClasesAdaptadorasV69 {
    public static void main(String[] args) {
        MarcoBotonesIV mimarco = new MarcoBotonesIV();
        mimarco.setVisible(true);
        mimarco.setTitle("Ventana 1");
        mimarco.setBounds(1, 300, 500, 300);
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        mimarco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        MarcoBotonesIV mimarco2 = new MarcoBotonesIV();
        mimarco2.setVisible(true);
        mimarco2.setTitle("Ventana 2");
        mimarco2.setBounds(700, 300, 500, 300);

//        mimarco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mimarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}

class MarcoBotonesIV extends JFrame {
    MarcoBotonesIV() {

//        LaminaBotonesII milamina = new LaminaBotonesII();
        //este código también es simplificado
//        M_VentanaII oyente = new M_VentanaII();
//        addWindowListener(oyente);
        addWindowListener(new M_VentanaII());
    }
}
/*para simplificar este ejemplo en lugar de un WindowListener utilizamos un WindowAdapter, el cual implementa solo los
* métodos que nosotros vamos necesitando*/
class M_VentanaII extends WindowAdapter {
    @Override
    public void windowIconified(WindowEvent e) {
        super.windowOpened(e);
        System.out.println("Ventana minimizada");
    }

    @Override
    public void windowOpened(WindowEvent e) {
        super.windowOpened(e);
        System.out.println("Ventana abirta");
    }



}
