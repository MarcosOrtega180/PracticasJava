package EventosV65;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//diseñamos el programa de otra forma, para que el ejecutor y los desencadenantes no estén en el mismo lugar
public class EventosIIIV67 {
    public static void main(String[] args) {
        MarcoBotonesIII mimarco = new MarcoBotonesIII();
        mimarco.setVisible(true);
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoBotonesII extends JFrame {
    MarcoBotonesII() {
        setTitle("Botones y Eventos");
        setBounds(700, 300, 500, 300);
        LaminaBotonesII milamina = new LaminaBotonesII();
        add(milamina);
    }
}

class LaminaBotonesII extends JPanel {

    JButton botonAzul = new JButton("Azul");
    JButton botonAmarillo = new JButton("Amarillo");
    JButton botonRojo = new JButton("Rojo");

    public LaminaBotonesII() {
        add(botonAzul);
        add(botonAmarillo);
        add(botonRojo);
        ColorFondo Azul = new ColorFondo(Color.blue);
        ColorFondo Rojo = new ColorFondo(Color.red);
        ColorFondo Amarillo = new ColorFondo(Color.yellow);
        botonAzul.addActionListener(Azul);
        botonAmarillo.addActionListener(Rojo);
        botonRojo.addActionListener(Amarillo);

    }
    // clase interna
    private class ColorFondo implements ActionListener{
        private Color colorFondo;
        public ColorFondo(Color c){
            colorFondo = c;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            setBackground(colorFondo);
        }
    }

}

