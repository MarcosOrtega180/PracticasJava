package ComponentesSwing86;

import javax.swing.*;
import java.awt.*;

public class MenusEmergentes_V109 {
    public static void main(String[] args) {
        MarcoEmergente mimarco = new MarcoEmergente();
        mimarco.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

class MarcoEmergente extends JFrame{
    MarcoEmergente(){
        setBounds(100,100,300,250);
        LaminaEmergente milamina = new LaminaEmergente();
        add(milamina);
        setVisible(true);
    }
}

class LaminaEmergente extends JPanel{
    LaminaEmergente(){
        setLayout(new BorderLayout());
        JPanel laminaMenu = new JPanel();
        JMenuBar miBarra = new JMenuBar();
        JMenu fuente = new JMenu("Fuente");
        JMenu estilo = new JMenu("Fuente");
        JMenu tamagno = new JMenu("Tamaño");
        miBarra.add(fuente);
        miBarra.add(estilo);
        miBarra.add(tamagno);
        laminaMenu.add(miBarra);
        add(laminaMenu,BorderLayout.NORTH);
        JTextPane miarea = new JTextPane();
        add(miarea, BorderLayout.CENTER);

        //-----------------------------------------------
        JPopupMenu menuEmergente = new JPopupMenu();
        JMenuItem opcion1 = new JMenuItem("Opcion1");
        JMenuItem opcion2 = new JMenuItem("Opcion2");
        JMenuItem opcion3 = new JMenuItem("Opcion3");
        menuEmergente.add(opcion1);
        menuEmergente.add(opcion2);
        menuEmergente.add(opcion3);
        setComponentPopupMenu(menuEmergente);
        miarea.setComponentPopupMenu(menuEmergente);
    }
}
