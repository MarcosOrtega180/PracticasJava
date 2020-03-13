package ComponentesSwing86;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

public class EventosEncuadrosDeTextoI_V88 {
    public static void main(String[] args) {
        Marco mimarco = new Marco();
        mimarco.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }
}
class Marco extends JFrame{
    Marco(){
        setBounds(500,300,500,350);
        Lamina milamina = new Lamina();
        add(milamina);
        setVisible(true);
    }
}

class Lamina extends JPanel{
    Lamina(){
        JTextField micampo = new JTextField(20);
        EscuchaTexto  el_evento = new EscuchaTexto();
        Document midoc = micampo.getDocument();
        midoc.addDocumentListener(el_evento);
        add(micampo);
    }
    private class EscuchaTexto implements DocumentListener{

        @Override
        public void insertUpdate(DocumentEvent e) {
            System.out.println("Has insertado texto");
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            System.out.println("Has borrado texto");
        }

        @Override
        public void changedUpdate(DocumentEvent e) {

        }
    }
}