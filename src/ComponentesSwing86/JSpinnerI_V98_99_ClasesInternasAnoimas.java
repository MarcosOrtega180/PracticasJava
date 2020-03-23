package ComponentesSwing86;

import javax.swing.*;
import java.awt.*;

public class JSpinnerI_V98_99_ClasesInternasAnoimas {
    public static void main(String[] args) {
        FrameSpinner mimarco = new FrameSpinner();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

class FrameSpinner extends JFrame {
    FrameSpinner() {
        setBounds(200, 100, 500, 300);
        LaminaSpiner milamina = new LaminaSpiner();
        add(milamina);
        setVisible(true);
    }
}

class LaminaSpiner extends JPanel {
    LaminaSpiner() {
        //@ constructo por defecto
        //constructor con modelo, nos permite representar otros valores dentro del spinner

//        JSpinner control = new JSpinner(new SpinnerDateModel()); //esto es para hacer un spinner con la fecha y la hora
//        String[] lista ={"Enero","Febrero","Marzo","Abril"};

//        String[] lista = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();?
//        JSpinner control = new JSpinner(new SpinnerListModel(lista)); // crea un sopinner con los valore de la lista

        JSpinner control = new JSpinner(new ModelJSpinner());

        Dimension d = new Dimension(200, 20);
        control.setPreferredSize(new Dimension(d));
        add(control);
    }

    private class ModelJSpinner extends SpinnerNumberModel {
        ModelJSpinner() {
            super(5, 0, 10, 1);
        }

        @Override
        public Object getNextValue() {
            return super.getPreviousValue();
        }

        @Override
        public Object getPreviousValue() {
            return super.getNextValue();
        }
    }
}