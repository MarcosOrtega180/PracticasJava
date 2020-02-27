package ComponentesSwing86;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CuatrosDeTextoI_V8687 {
    public static void main(String[] args) {
        MarcoTexto mimarco = new MarcoTexto();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoTexto extends JFrame {
    MarcoTexto() {
        setBounds(600, 300, 600, 500);
        LaminaTexto milamina = new LaminaTexto();
        add(milamina);
        setVisible(true);
    }
}

class LaminaTexto extends JPanel {
    private JTextField campo1;
    private JLabel resultado;

    LaminaTexto() {
        setLayout(new BorderLayout());
        JPanel milamina2 = new JPanel();
        milamina2.setLayout(new FlowLayout());
        JLabel textoUno = new JLabel("Email: ");
        resultado = new JLabel("",SwingConstants.CENTER);
        milamina2.add(textoUno);
        campo1 = new JTextField(20);
        milamina2.add(campo1);
        add(resultado, BorderLayout.CENTER);
        System.out.println(campo1.getText().trim());
        JButton miboton = new JButton("Comprobar");
        DameTexto mievento = new DameTexto();
        miboton.addActionListener(mievento);
        milamina2.add(miboton);
        add(milamina2, BorderLayout.NORTH);

    }

    private class DameTexto implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int correcto = 0;
            String email = campo1.getText();
            for (int i = 0; i < email.length(); i++) {
                if (email.charAt(i) == '@') {
                    correcto++;
                }
            }
            if (correcto != 1) {
                System.out.println("Incorrecto");
                resultado.setText("Incorrecto");
            } else {
                resultado.setText("Correcto");
                System.out.println("Correcto");
            }
            System.out.println(campo1.getText());
        }
    }
}
