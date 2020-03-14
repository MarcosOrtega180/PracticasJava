package ComponentesSwing86;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBox_V92 {
    public static void main(String[] args) {
        MarcoCheck mimarco = new MarcoCheck();
        mimarco.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}

class MarcoCheck extends JFrame {
    public MarcoCheck() {
        setTitle("MarcoCheck");
        setBounds(550, 300, 550, 350);
        LaminaCheck milamina = new LaminaCheck();
        setVisible(true);
        add(milamina);
    }
}

class LaminaCheck extends JPanel {
    LaminaCheck() {
        setLayout(new BorderLayout());

        Font fuente = new Font("Serif", Font.PLAIN, 24);
        texto = new JLabel("En un lugar de la mancha de cuyo nombre ....");
        texto.setFont(fuente);

        JPanel laminaTexto = new JPanel();
        laminaTexto.add(texto);
        add(laminaTexto, BorderLayout.CENTER);

        checkbox1 = new JCheckBox("Negrita");
        checkbox2 = new JCheckBox("Cursiva");
        checkbox1.addActionListener(new ManejaChecks());
        checkbox2.addActionListener(new ManejaChecks());

        JPanel laminaChecks = new JPanel();
        laminaChecks.add(checkbox1);
        laminaChecks.add(checkbox2);

        add(laminaChecks, BorderLayout.SOUTH);
    }

    private class ManejaChecks implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int tipo = 0;
            if(checkbox1.isSelected()) tipo+=Font.BOLD;
            if(checkbox2.isSelected()) tipo+=Font.ITALIC;
            System.out.println(tipo);
            texto.setFont(new Font("Serif",tipo,24));
        }
    }

    private JLabel texto;
    private JCheckBox checkbox1, checkbox2;
}