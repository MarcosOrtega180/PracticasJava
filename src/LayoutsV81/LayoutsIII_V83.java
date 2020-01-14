package LayoutsV81;

import javax.swing.*;
import java.awt.*;

public class LayoutsIII_V83 {
    public static void main(String[] args) {
        MarcoCalculadora mimarco = new MarcoCalculadora();

        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mimarco.setVisible(true);
    }
}

class MarcoCalculadora extends JFrame {
    public MarcoCalculadora() {
        setTitle("Calculadora");
        setBounds(500, 300, 450, 300);
        LaminaCalculadora miLamina = new LaminaCalculadora();
        add(miLamina);
    }
}

class LaminaCalculadora extends JPanel {
    private JPanel milamina2;
    public LaminaCalculadora() {
        setLayout(new BorderLayout());
        JButton pantalla = new JButton("0");
        pantalla.setEnabled(false);
        add(pantalla, BorderLayout.NORTH);
        //panel calculadora
        milamina2 = new JPanel();
        milamina2.setLayout(new GridLayout(4, 4));
        ponerBoton("7");
        ponerBoton("8");
        ponerBoton("9");
        ponerBoton("/");

        ponerBoton("4");
        ponerBoton("5");
        ponerBoton("6");
        ponerBoton("*");

        ponerBoton("1");
        ponerBoton("2");
        ponerBoton("3");
        ponerBoton("-");

        ponerBoton("0");
        ponerBoton(".");
        ponerBoton("=");
        ponerBoton("+");

        add(milamina2, BorderLayout.CENTER);
    }

    private void ponerBoton(String rotulo){
        JButton boton = new JButton(rotulo);
        milamina2.add(boton);
    }

}