package ComponentesSwing86;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CuatrosDeTextoI_V86 {
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
    JTextField campo1;
    LaminaTexto() {
        JLabel textoUno= new JLabel("Email: ");
        add(textoUno);
        campo1 = new JTextField(20);
        add(campo1);
        System.out.println(campo1.getText().trim());
        JButton miboton= new JButton("Comprobar");
        DameTexto mievento = new DameTexto();
        miboton.addActionListener(mievento);
        add(miboton);
    }

    private class DameTexto implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(campo1.getText() );
        }
    }
}
