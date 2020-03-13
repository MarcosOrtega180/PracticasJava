package ComponentesSwing86;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AreasDeTextoI_V90 {
    public static void main(String[] args) {
        MarcoArea mimarco = new MarcoArea();

        mimarco.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }
}

class MarcoArea extends JFrame {
    MarcoArea() {
        setBounds(500, 300, 500, 350);
        LaminaArea milamina = new LaminaArea();
        add(milamina);
        setVisible(true);
    }
}

class LaminaArea extends JPanel {
    JScrollPane laminaBarras;
    JTextArea area;

    LaminaArea() {
        area = new JTextArea(8, 20);
        area.setLineWrap(true);
        //para que el area de texto no siga creciendo cuando le damos enter pues hay que crear una lámina especial para el
        //cuadro de texto
        laminaBarras = new JScrollPane(area);

        JButton boton = new JButton("Botón");
        Oyente oyente =new Oyente();
        boton.addActionListener(oyente);
        add(laminaBarras);
        add(boton);
    }

    private class Oyente implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(area.getText());
        }
    }

}
