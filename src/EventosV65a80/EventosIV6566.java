package EventosV65a80;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventosIV6566 {
    public static void main(String[] args) {
        MarcoBotones mimarco = new MarcoBotones();
        mimarco.setVisible(true);
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoBotones extends JFrame {
    MarcoBotones() {
        setTitle("Botones y Eventos");
        setBounds(700, 300, 500, 300);
        LaminaBotonesII milamina = new LaminaBotonesII();
        add(milamina);
    }
}

class LaminaBotones extends JPanel implements ActionListener {

    JButton botonAzul = new JButton("Azul");
    JButton botonAmarillo = new JButton("Amarillo");
    JButton botonRojo = new JButton("Rojo");

    public LaminaBotones() {
        add(botonAzul);
        add(botonAmarillo);
        add(botonRojo);
//        primero identificamos al oyente, tercer factor el que desencadena la acción
        botonAzul.addActionListener(this);
        botonAmarillo.addActionListener(this);
        botonRojo.addActionListener(this);
    }

    @Override //actionListener requiere que implementemos actionPerformed
    public void actionPerformed(ActionEvent e) {
//        setBackground(Color.blue);
        System.out.println(e.getSource());
        Object botonPulsado = e.getSource();
        if (botonPulsado == botonAzul) {
            setBackground(Color.blue);
        } else if (botonPulsado == botonAmarillo) {
            setBackground(Color.yellow);
        } else if (botonPulsado == botonRojo) {
            setBackground(Color.red);
        }
    }
}