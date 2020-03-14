package ComponentesSwing86;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadiButtonII_V94Optimizado {
    public static void main(String[] args) {
        Marco_radioOptimizado mimarco = new Marco_radioOptimizado();
        mimarco.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

class Marco_radioOptimizado extends JFrame {
    Marco_radioOptimizado() {
        setBounds(400, 300, 500, 300);
        Lamina_radioOptimizado milamina = new Lamina_radioOptimizado();
        add(milamina);
        setVisible(true);
    }
}

class Lamina_radioOptimizado extends JPanel {
    private JLabel texto;
    private ButtonGroup grupo;
    private JPanel lamina_botones;

    Lamina_radioOptimizado() {
        setLayout(new BorderLayout());
        texto = new JLabel("En un lugar de la mancha de cuyo nombre ...");
        texto.setFont(new Font("Serif", Font.PLAIN, 12));
        add(texto, BorderLayout.CENTER);
        lamina_botones = new JPanel();
        grupo = new ButtonGroup();
        colocarBotones("Pequeño", false,10);
        colocarBotones("Mediano", true,12);
        colocarBotones("Grande", false,18);
        colocarBotones("Muy Grande", false,24);

        add(lamina_botones, BorderLayout.SOUTH);
    }

    public void colocarBotones(String nombre, boolean seleccionado, final int tamagno) {
        JRadioButton boton = new JRadioButton(nombre, seleccionado);
        grupo.add(boton);
        lamina_botones.add(boton);
        ActionListener mievento = e -> texto.setFont(new Font("Serif", Font.PLAIN, tamagno));
        boton.addActionListener(mievento);
    }
}