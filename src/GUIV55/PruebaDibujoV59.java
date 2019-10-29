package GUIV55;

import javax.swing.*;
import java.awt.*;


public class PruebaDibujoV59 {
    public static void main(String[] args) {
        MarcoConDibujos miMarco = new MarcoConDibujos();
        miMarco.setVisible(true);
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class MarcoConDibujos extends JFrame {
    MarcoConDibujos() {
        setTitle("Prueba de Dibujo");
        setSize(400, 400);
        LaminaConFiguras miLamina = new LaminaConFiguras();
        add(miLamina);
    }
}

//aquí creamos la lámina
class LaminaConFiguras extends JPanel {
    @Override
    public void paintComponents(Graphics g) {
        super.paintComponents(g);
        g.drawRect(50,50,200,200);
        g.drawLine(100,100,300,200);
        g.drawArc(20,20,32,14,60,15);
    }
}