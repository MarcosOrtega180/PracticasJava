package ComponentesSwing86;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.Callable;

public class JSliderI_V96 {
    public static void main(String[] args) {
        MarcoSlider mimarco = new MarcoSlider();
        mimarco.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}


class MarcoSlider extends JFrame {
    MarcoSlider() {
        setBounds(300, 300, 550, 350);
        LaminaSlider milamina = new LaminaSlider();
        setVisible(true);
        add(milamina);
    }
}

class LaminaSlider extends JPanel {
    public LaminaSlider() {
        JSlider control = new JSlider(0,30,25);
//        control.setOrientation(SwingConstants.VERTICAL);

        control.setMajorTickSpacing(15);
        control.setMinorTickSpacing(5);
        control.setPaintTicks(true);
        control.setFont(new Font("Seriv",Font.ITALIC,5));
        control.setSnapToTicks(true);
        control.setPaintLabels(true);

        System.out.println(control.getOrientation());
        add(control);
    }
}