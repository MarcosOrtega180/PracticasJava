package ComponentesSwing86;

import javax.swing.*;
import java.awt.*;

public class RadioButtonI_V93 {
    public static void main(String[] args) {
        Marco_radio_sintaxis mimarco = new Marco_radio_sintaxis();
        mimarco.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

class Marco_radio_sintaxis extends JFrame {
    Marco_radio_sintaxis() {
        setBounds(500, 300, 500, 300);
        Lamina_radio_sintaxis milamina = new Lamina_radio_sintaxis();
        setVisible(true);

        add(milamina);
    }
}

class Lamina_radio_sintaxis extends JPanel {
    Lamina_radio_sintaxis() {
        ButtonGroup migrupo1 = new ButtonGroup();
        ButtonGroup migrupo2 = new ButtonGroup();
        JRadioButton boton1=new JRadioButton("Azul",false);
        JRadioButton boton2=new JRadioButton("Rojo", true);
        JRadioButton boton3=new JRadioButton("Verde",false);
        JRadioButton boton4=new JRadioButton("Masculino",false);
        JRadioButton boton5=new JRadioButton("Femenino",false);
        migrupo1.add(boton1);
        migrupo1.add(boton2);
        migrupo1.add(boton3);
        migrupo2.add(boton4);
        migrupo2.add(boton5);
        add(boton1);
        add(boton2);
        add(boton3);
        add(boton4);
        add(boton5);
    }
}