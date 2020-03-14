package ComponentesSwing86;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButtonII_V94 {
    public static void main(String[] args) {
        Marco_radio mimarco = new Marco_radio();
        mimarco.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

class Marco_radio extends JFrame {
    Marco_radio() {
        setBounds(400, 300, 500, 300);
        Lamina_radio milamina = new Lamina_radio();
        add(milamina);
        setVisible(true);
    }
}

class Lamina_radio extends JPanel {
    private JLabel texto;
    private JRadioButton boton1, boton2, boton3, boton4;

    Lamina_radio() {
        setLayout(new BorderLayout());
        texto = new JLabel("En un lugar de la mancha de cuyo nombre ...");

        add(texto, BorderLayout.CENTER);

        ButtonGroup migrupo = new ButtonGroup();

        boton1 = new JRadioButton("Pequeño", false);
        boton2 = new JRadioButton("Mediano", false);
        boton3 = new JRadioButton("Grande", true);
        boton4 = new JRadioButton("Muy grande", false);

        JPanel lamina_radio = new JPanel();
        migrupo.add(boton1);
        migrupo.add(boton2);
        migrupo.add(boton3);
        migrupo.add(boton4);
        Evento_radio mievent = new Evento_radio();
        boton1.addActionListener(mievent);
        boton2.addActionListener(mievent);
        boton3.addActionListener(mievent);
        boton4.addActionListener(mievent);
        lamina_radio.add(boton1);
        lamina_radio.add(boton2);
        lamina_radio.add(boton3);
        lamina_radio.add(boton4);

        add(lamina_radio, BorderLayout.SOUTH);
    }

    private class Evento_radio implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource().equals(boton1)) {
                texto.setFont(new Font("Serif", Font.PLAIN, 10));
            } else if (e.getSource().equals(boton2)) {
                texto.setFont(new Font("Serif", Font.PLAIN, 12));
            } else if (e.getSource().equals(boton3)) {
                texto.setFont(new Font("Serif", Font.PLAIN, 18));
            } else if (e.getSource().equals(boton4)){
                texto.setFont(new Font("Serif", Font.PLAIN, 24));
            }
        }
    }
}
