package ComponentesSwing86;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;

public class EventosEnCuadrosDeTextoII_V89 {
    public static void main(String[] args) {
        MarcoPassword mimarco = new MarcoPassword();
        mimarco.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }
}

class MarcoPassword extends JFrame {
    MarcoPassword() {
        setBounds(500, 200, 600, 500);

        LaminaPassword milamina = new LaminaPassword();
        add(milamina);

        setVisible(true);
    }
}

class LaminaPassword extends JPanel {
    JPasswordField c_contra;

    LaminaPassword() {
        setLayout(new BorderLayout());
        JPanel laminaSuperior = new JPanel();
        laminaSuperior.setLayout(new GridLayout(2, 2));
        add(laminaSuperior, BorderLayout.NORTH);
        JLabel etiqueta1 = new JLabel("Usuario");
        JLabel etiqueta2 = new JLabel("Contraseña");
        JTextField c_usuario = new JTextField(15);
        c_contra = new JPasswordField(15);
        Comprueva_pass mievento = new Comprueva_pass();
        laminaSuperior.add(etiqueta1);
        laminaSuperior.add(c_usuario);
        laminaSuperior.add(etiqueta2);
        laminaSuperior.add(c_contra);

        c_contra.getDocument().addDocumentListener(mievento);
        JButton enviar = new JButton("Enviar");
        add(enviar, BorderLayout.SOUTH);
    }

    private class Comprueva_pass implements DocumentListener {
        private void metodo() {
            char[] contrasena = c_contra.getPassword();
            if (contrasena.length < 8 || contrasena.length > 12) {
                c_contra.setBackground(Color.RED);
            } else {
                c_contra.setBackground(Color.WHITE);
            }
        }

        @Override
        public void insertUpdate(DocumentEvent e) {
            this.metodo();
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            this.metodo();
        }

        @Override
        public void changedUpdate(DocumentEvent e) {

        }
    }
}
