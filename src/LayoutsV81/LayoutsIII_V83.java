package LayoutsV81;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LayoutsIII_V83 {
    public static void main(String[] args) {
        MarcoCalculadora mimarco = new MarcoCalculadora();

        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mimarco.setVisible(true);
    }
}

class MarcoCalculadora extends JFrame {
    public MarcoCalculadora() {
        setTitle("Calculadora");
//        setBounds(500, 300, 450, 300);
        LaminaCalculadora miLamina = new LaminaCalculadora();
        add(miLamina);
        pack(); //usamos en lugar de setBounds para que el Frame se adapte automáticamente al tamaño de su contenido
        // en este caso los botones de la caculadora
    }
}

class LaminaCalculadora extends JPanel {
    private JPanel milamina2;
    JButton pantalla;
    private Boolean principio = true;
    public LaminaCalculadora() {
        setLayout(new BorderLayout());
        pantalla = new JButton("0");
        pantalla.setEnabled(false);
        add(pantalla, BorderLayout.NORTH);
        //panel calculadora
        milamina2 = new JPanel();
        milamina2.setLayout(new GridLayout(4, 4));
        ActionListener insertar = new InsertarNumero();
        ponerBoton("7", insertar);
        ponerBoton("8", insertar);
        ponerBoton("9", insertar);
        ponerBoton("/", insertar);

        ponerBoton("4", insertar);
        ponerBoton("5", insertar);
        ponerBoton("6", insertar);
        ponerBoton("*", insertar);

        ponerBoton("1", insertar);
        ponerBoton("2", insertar);
        ponerBoton("3", insertar);
        ponerBoton("-", insertar);

        ponerBoton("0", insertar);
        ponerBoton(".", insertar);
        ponerBoton("=", insertar);
        ponerBoton("+", insertar);

        add(milamina2, BorderLayout.CENTER);
    }

    private void ponerBoton(String rotulo, ActionListener oyente){
        JButton boton = new JButton(rotulo);
        boton.addActionListener(oyente);
        milamina2.add(boton);
    }

    private class InsertarNumero implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String entrada = e.getActionCommand();//devuelve el string asociado con la acción. Captura el texto del botón pulsado
            if(principio){
                pantalla.setText("");
                principio = false;
            }

            pantalla.setText(pantalla.getText()+entrada);
        }
    }

}