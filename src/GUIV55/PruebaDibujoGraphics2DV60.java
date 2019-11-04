package GUIV55;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

public class PruebaDibujoGraphics2DV60 {
    public static void main(String[] args) {

        Marco2D miMarco = new Marco2D();
        miMarco.setVisible(true);
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

class Marco2D extends JFrame {
    Marco2D() {
        setTitle("Mi lámina 2D");
        setSize(1000, 700);
        LaminaConFiguras2 miLamina2 = new LaminaConFiguras2();
        add(miLamina2);
    }

}

class LaminaConFiguras2 extends JPanel {
    @Override
    public void paintComponents(Graphics g) {
        super.paintComponents(g);
        Graphics2D g2 = (Graphics2D) g;
        Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 150);
        g2.draw(rectangulo);
//        System.out.println(rectangulo);
        Ellipse2D elipse = new Ellipse2D.Double();
        elipse.setFrame(rectangulo);
        g2.draw(elipse);
        g2.draw(new Line2D.Double(100, 100, 300, 250));

        double CentroenX = rectangulo.getCenterX();
        double CentroenY = rectangulo.getCenterY();
        double radio = 150;
        Ellipse2D circulo = new Ellipse2D.Double();
        circulo.setFrameFromCenter(CentroenX,CentroenY,CentroenX+radio,CentroenY+radio);
        g2.draw(circulo);
    }
}
