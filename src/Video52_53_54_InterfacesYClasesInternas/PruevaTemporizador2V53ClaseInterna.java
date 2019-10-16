package Video52_53_54_InterfacesYClasesInternas;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;

class PruevaTemporizador2V53 {
    public static void main(String[] args) {
        Reloj miReloj = new Reloj(2000, true);
        miReloj.enMarcha();
        JOptionPane.showMessageDialog(null, "Pulsar Aceptar para terminar la ejecución.");
        System.exit(0);
    }
}

class Reloj {
    public Reloj(int intervalo, boolean sonido) {
        this.intervalo = intervalo;
        this.sonido = sonido;
    }

    public void enMarcha() {
        ActionListener oyente = new DameLaHora2();
        Timer miTemporizador = new Timer(intervalo, oyente);
        miTemporizador.start();
    }

    private int intervalo;
    private boolean sonido;

    /* la ventaja que tiene la clase interna es que puede acceder a las variables de la clase que la contiene de forma
     * directa, esto permite trabajar sin contar con métodos de acceso (seters y geters).*/
    private class DameLaHora2 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Date ahora = new Date();
            System.out.println("Te pongo la hora de cada 3 sg" + ahora);
            if (sonido) {
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }
}

