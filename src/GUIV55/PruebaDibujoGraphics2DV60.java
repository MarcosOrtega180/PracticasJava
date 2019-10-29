package GUIV55;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class PruebaDibujoGraphics2DV60 {
    public static void main(String[] args){

        Marco2D miMarco = new Marco2D();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
class Marco2D extends JFrame{
    public Marco2D(){
        setVisible(true);
        setSize(1000,700);
        setTitle("Mi lámina 2D");
        LaminaConFiguras2 miLamina =new LaminaConFiguras2();
        add(miLamina);
    }

}
class LaminaConFiguras2 extends JPanel{
    @Override
    public void paintComponents(Graphics g) {
        super.paintComponents(g);
        Graphics2D g2 =(Graphics2D) g;
        Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200,150);
        System.out.println(rectangulo);
        Ellipse2D elipse = new Ellipse2D.Double();
        g2.draw(rectangulo);
        g2.draw(elipse);
    }
}
