package EventosV65;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

/*los eventos relacionados con el foco se encuentran relacionados con la interfaz FocusListener, tiene dos métodos
 * focusGained(FocusEvent e) y focus (FocusEvent e), su adaptador el el método Focus Adapter, Focus Event también tiene
 * sus métodos propios #verEnLaApi, los fotos pueden etar relacionados a ventanas, cuadros de texto, botones y en general
 * cualquier tipo de objeto con gui sobre el cual el foco se pueda posicionar*/
public class EventosXEventosDeFocoV74 {
    public static void main(String[] args) {

        MarcoFoco miMarco = new MarcoFoco();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoFoco extends JFrame {
    MarcoFoco() {
        setVisible(true);
        setBounds(300, 300, 600, 450);
        add(new LaminaFoco());
    }
}

class LaminaFoco extends JPanel {
    private JTextField cuadro1;
    private JTextField cuadro2;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        setLayout(null);
        cuadro1 = new JTextField();
        cuadro2 = new JTextField();
        cuadro1.setBounds(120, 10, 150, 20);
        cuadro2.setBounds(120, 50, 150, 20);
        add(cuadro1);
        add(cuadro2);
        LanzaFocos elFoco = new LanzaFocos();
        cuadro1.addFocusListener(elFoco);
        cuadro2.addFocusListener(elFoco);
    }

    private class LanzaFocos implements FocusListener {
        @Override
        public void focusGained(FocusEvent e) {
            cuadro1.setEnabled(true);
            System.out.println("Foco ganado");
        }

        @Override
        public void focusLost(FocusEvent e) {
            System.out.println("Foco perdido");

            String email = cuadro1.getText();
            boolean comprobacion = false;
            for (int i = 0; i < email.length(); i++) {
                if(email.charAt(i)=='@'){
                    comprobacion=true;
                }
            }
            if(comprobacion){
                System.out.println("Correcto");;
            }else{
                System.out.println("Incorrecto");
                cuadro2.setEnabled(false);
            }
        }
    }
}


