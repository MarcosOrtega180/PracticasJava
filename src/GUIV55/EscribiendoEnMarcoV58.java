package GUIV55;

import javax.swing.*;
import java.awt.*;

public class EscribiendoEnMarcoV58 {
    public static void main(String[] args) {
        MarcoConTexto miMarco = new MarcoConTexto();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class MarcoConTexto extends JFrame {
    public MarcoConTexto() {
        setVisible(true);
        setSize(600, 450);
        setLocation(400, 200); // en lugar de los dos anteriores ude haber utilizado setBounds
        setTitle("Primer texto");
        Laminas miLamina = new Laminas(); //así agregamos la lámina tipo JPanel en
        add(miLamina);
    }
}

// para crear un marco creeamos la clase que herede de jpanel
class Laminas extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("Este es mi string", 100,100);
    }
}