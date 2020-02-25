package LayoutsV81_85;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LayoutsIII_V83_84_85 {
    public static void main(String[] args) {
        MarcoCalculadora mimarco = new MarcoCalculadora();

        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mimarco.setVisible(true);
    }
}

class MarcoCalculadora extends JFrame {
    public MarcoCalculadora() {
        setTitle("Calculadora");
        setBounds(500, 300, 450, 300);
        LaminaCalculadora miLamina = new LaminaCalculadora();
        add(miLamina);
//        pack(); //usamos en lugar de setBounds para que el Frame se adapte automáticamente al tamaño de su contenido
        // en este caso los botones de la caculadora
    }
}

class LaminaCalculadora extends JPanel {
    private JPanel milamina2;
    private JPanel milamina1;
    JButton pantalla;
    JButton pantallaRes;
    private Boolean principio = true;
    private double resultado = 0;
    private String ultimaOperacion = "";

    public LaminaCalculadora() {
        setLayout(new BorderLayout());
        pantalla = new JButton("0");
        pantalla.setEnabled(false);
//        add(pantalla, BorderLayout.NORTH);
        pantallaRes = new JButton("0.0");
        pantallaRes.setEnabled(false);
//        add(pantallaRes,BorderLayout.NORTH);
        milamina1 = new JPanel();
        milamina1.setLayout(new GridLayout(2, 1));
        milamina1.add(pantalla);
        milamina1.add(pantallaRes);
        add(milamina1, BorderLayout.NORTH);
        //panel calculadora
        milamina2 = new JPanel();
        milamina2.setLayout(new GridLayout(4, 4));

        ActionListener insertar = new InsertarNumero();
        ActionListener orden = new AccionOrden();
        ActionListener limpiar = new AccionLimpiar();
        ActionListener igual = new Final();

        ponerBoton("7", insertar);
        ponerBoton("8", insertar);
        ponerBoton("9", insertar);
        ponerBoton("/", orden);

        ponerBoton("4", insertar);
        ponerBoton("5", insertar);
        ponerBoton("6", insertar);
        ponerBoton("*", orden);

        ponerBoton("1", insertar);
        ponerBoton("2", insertar);
        ponerBoton("3", insertar);
        ponerBoton("-", orden);

        ponerBoton("0", insertar);
        ponerBoton("C", limpiar);
        ponerBoton("=", igual);
        ponerBoton("+", orden);

        add(milamina2, BorderLayout.CENTER);
    }

    private void ponerBoton(String rotulo, ActionListener oyente) {
        JButton boton = new JButton(rotulo);
        boton.addActionListener(oyente);
        milamina2.add(boton);
    }

    private class InsertarNumero implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String entrada = e.getActionCommand();//devuelve el string asociado con la acción. Captura el texto del botón pulsado
            System.out.println("entrada" + entrada);
            if (principio) {
                pantalla.setText("");
                principio = false;
            }
            System.out.println("pantalla: " + pantalla.getText() + " entrada suma: " + entrada);
            pantalla.setText(pantalla.getText() + entrada);
        }
    }

    private class AccionOrden implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String operacion = e.getActionCommand();
            calcular(Double.parseDouble(pantalla.getText()));
            ultimaOperacion = operacion;
            principio = true;
        }
    }

    private class Final implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            calcular(Double.parseDouble(pantalla.getText()));
            pantallaRes.setText("" + resultado);
            principio = true;
            System.out.println("resultado: " + resultado);

        }
    }

    private class AccionLimpiar implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            pantalla.setText("0.0");
            resultado = 0;
            principio = true;
        }
    }

    private void calcular(double x) {
        System.out.println("x " + x + " Operacion " + ultimaOperacion);
        if (ultimaOperacion.equals("+")) {
            resultado += x;
        } else if (ultimaOperacion.equals("-")) {
            resultado -= x;
        } else if (ultimaOperacion.equals("*")) {
            resultado *= x;
        } else if (ultimaOperacion.equals("/")) {
            resultado /= x;
        }
        System.out.println("resulado" + resultado);
        pantallaRes.setText("" + resultado);
    }
}