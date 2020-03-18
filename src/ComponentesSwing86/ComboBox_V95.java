package ComponentesSwing86;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBox_V95 {
    public static void main(String[] args) {
        MarcoCombo mimarco = new MarcoCombo();
        mimarco.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

class MarcoCombo extends JFrame {
    MarcoCombo() {
        setBounds(550, 300, 550, 400);
        LaminaCombo milamina = new LaminaCombo();
        add(milamina);
        setVisible(true);
    }
}

class LaminaCombo extends JPanel {
    private JLabel texto;
    private JComboBox micombo;
    LaminaCombo() {
        setLayout(new BorderLayout());
        texto = new JLabel("En un lugar de la mancha de cuyo nombre...");
        texto.setFont(new Font("Serif", Font.PLAIN, 18));
        add(texto, BorderLayout.CENTER);
        JPanel laminaNote = new JPanel();

        micombo = new JComboBox();
        micombo.setEditable(true);
        micombo.addItem("Serif");
        micombo.addItem("Harrington");
        micombo.addItem("Algerian");
        micombo.addItem("Arial Black");
        micombo.addItem("Times New Roman");
        EventoCombo mievento = new EventoCombo();
        micombo.addActionListener(mievento);

        laminaNote.add(micombo);
        add(laminaNote, BorderLayout.NORTH);
    }
    private class EventoCombo implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            texto.setFont(new Font(micombo.getSelectedItem().toString(),Font.PLAIN,18));
        }
    }
}