package Video52_53_54_InterfacesYClasesInternas;
/*Qué son?
 * Las clases internas locales son clases dentro de un método.
 *   Cuánndo se utilizan estos tipos de clases y por qué?
 *       Son útiles cuando solo se va a utilizar (instanciar) la clase interna una vez. El objetivo es simplicar aún más
 *       él código.
 *       Sú ámbito queda restrigido al método donde son declarados.
 *       No llevan modificadores de acceso.
 *   Ventajas
 *       Están muy "encapsuladas". Ni siquiera la clase a la que pertenecen pueden acceder a ellas. Tan solo pueden ser
 *       accedidas por los métodos en las cuales se han declarado. */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class V54ClaseInternaLocal {
    public static void main(String[] args) {
    /*Reloj2 miReloj = new Reloj2(2000, true); ya que eliminamos el constructor, ya no podemos realizar invocaiones del método
    *  así que enviamos los parametros utilizados en el método miReloj.enMarcha()*/
        Reloj2 miReloj = new Reloj2();
        miReloj.enMarcha(3000, true);
        JOptionPane.showMessageDialog(null, "Pulsar Aceptar para terminar la ejecución.");
        System.exit(0);
    }
}

class Reloj2 {
//    public Reloj2(int intervalo, boolean sonido) { prescindimos del constructor
//        this.intervalo = intervalo;
//        this.sonido = sonido;
//    }

    public void enMarcha(int intervalo, final boolean sonido) {
        /*private class DameLaHora2 implements ActionListener { esta linea queda comentada debido a que las clases
        * internas locales no tienen que usar modificadores de acceso*/
        class DameLaHora2 implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {
                Date ahora = new Date();
                System.out.println("Te pongo la hora de cada 3 sg" + ahora);
                if (sonido) {
                    Toolkit.getDefaultToolkit().beep();
                }
            }
        }
        ActionListener oyente = new DameLaHora2();
        Timer miTemporizador = new Timer(intervalo, oyente);
        miTemporizador.start();
    }

//    private int intervalo; prescindimos los de estas declaraciones
//    private boolean sonido;

}


