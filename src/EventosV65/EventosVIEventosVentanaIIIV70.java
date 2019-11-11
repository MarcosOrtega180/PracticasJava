package EventosV65;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

/* si queremos saber cuando una ventana cambió de estado necesitamos utilizar WindowStateListener la cual solo tiene una
* interfaz, por lo cual no necesitaremos una clase adaptadora, WindowEvent también es interesante debido a que tiene dos
* métodos, los cuales son getNewState() y getOldState()*/
public class EventosVIEventosVentanaIIIV70 {
    public static void main(String[] args) {
        MarcoEstado mimarco = new MarcoEstado();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class MarcoEstado extends JFrame{
    public MarcoEstado(){
        setVisible(true);
        setBounds(300,300,500,350);
        //aquí ponemos a la escucha a la clase
        addWindowStateListener(new CambioEstado());
    }
}

//implementamos la interfase winowStateListener en la clase CambioEstado
class CambioEstado implements WindowStateListener{
    //esto desencadena una acción cada vez que el estado de la ventana ha sido modificado
    @Override
    public void windowStateChanged(WindowEvent e) {
        System.out.println("La ventana ha cambiado de estado");
        /*para ver el estado actual nosotros podemos consultar directametne las variables de lcase pertenecientes al
        windowEvent
         */
        System.out.println("estado"+ e.getNewState());
        //ahora imprimimos algo cuando la ventana ha sido actualizada
//        if(e.getNewState()==6){
//        esto es lo mismo que lo anterior
        if(e.getNewState()== Frame.MAXIMIZED_BOTH){
            System.out.println("La ventana está a pantalla completa.");
        }else if(e.getNewState()==Frame.NORMAL){
            System.out.println("la ventana está normal");
        }

    }
}