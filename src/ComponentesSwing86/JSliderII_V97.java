package ComponentesSwing86;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class JSliderII_V97 {
    public static void main(String[] args) {
        Frame_slider mimarco = new Frame_slider();
        mimarco.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

class Frame_slider extends JFrame {
    Frame_slider() {
        setBounds(200, 300, 550, 500);
        Lamina_slider milamina = new Lamina_slider();
        add(milamina);
        setVisible(true);
    }
}

class Lamina_slider extends JPanel {
    private JLabel rotulo;
    private JSlider control;

    Lamina_slider() {
        setLayout(new BorderLayout());
        rotulo = new JLabel("En un lugar de la mancha..");
        add(rotulo, BorderLayout.CENTER);

        control = new JSlider(8, 50, 12);
        control.setMajorTickSpacing(20);
        control.setMinorTickSpacing(5);
        control.setSnapToTicks(true);
        control.setFont(new Font("Serif", Font.ITALIC, 10));
        control.setPaintLabels(true);
        control.setPaintTicks(true);
        control.setPaintTrack(true);
        control.addChangeListener(new EventoSlider());

        JPanel laminaSlider = new JPanel();
        laminaSlider.add(control);
        add(laminaSlider, BorderLayout.NORTH);
    }

    private class EventoSlider implements ChangeListener {

        @Override
        public void stateChanged(ChangeEvent e) {
            System.out.println("estas manipulando el slider");
            rotulo.setFont(new Font("Serif",Font.ITALIC, control.getValue()));
        }
    }
}