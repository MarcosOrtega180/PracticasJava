package Video52_53_54_InterfacesYClasesInternas;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

// ver anotacioness originales en el video anterior
public class PruebaTemporizador {
    public static void main(String[] args) {

        DameLaHora oyente = new DameLaHora();
        Timer miTemporizador = new Timer(2000, oyente);
        miTemporizador.start();
        JOptionPane.showMessageDialog(null,"Pulsa aceptar para detener.");
        // esto hace que se cierre el programa
        System.exit(0);
    }
}
class DameLaHora implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        Date ahora= new Date();
        System.out.println("Te pongo la hora cada 5 sg: "+ ahora);
        Toolkit.getDefaultToolkit().beep();
    }
}
