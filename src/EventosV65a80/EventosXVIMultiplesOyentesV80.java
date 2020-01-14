package EventosV65;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventosXVIMultiplesOyentesV80 {
    public static void main(String[] args) {
        Marco_Principal mimarco = new Marco_Principal();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mimarco.setVisible(true);
    }
}

class Marco_Principal extends JFrame {
    Marco_Principal() {
        setTitle("Prueba varios");
        setBounds(900, 60, 300, 200);
        Lamina_Principal lamina = new Lamina_Principal();
        add(lamina);
    }
}

class Lamina_Principal extends JPanel {
    JButton boton_cerrar;

    Lamina_Principal() {
        JButton boton_nuevo = new JButton("Nuevo");
        add(boton_nuevo);
        boton_cerrar = new JButton("Botón cerrar");
        add(boton_cerrar);
        OyenteNuevo miOyente = new OyenteNuevo();
        boton_nuevo.addActionListener(miOyente);
    }

    private class OyenteNuevo implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Marco_Emergente marco = new Marco_Emergente(boton_cerrar);
            marco.setVisible(true);
        }
    }


}

class Marco_Emergente extends JFrame {
    private static int contador = 0; //reutilizamos una variable estatica la cual será compartida entre todas las instancias de la clase

    Marco_Emergente(JButton bonton_de_principal) { //pasamos el botón por parametros para poder agregarle el
        contador++;
        setTitle("Ventana " + contador);
        setBounds(40 * contador, 500, 300, 150);
        CierraTodos oyenteCerrar = new CierraTodos();
        bonton_de_principal.addActionListener(oyenteCerrar);
    }
    private class CierraTodos implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            dispose();
        }
    }
}