package ComponentesSwing86;

import javax.swing.*;

public class MenusI_V100 {
    public static void main(String[] args) {
        MenuFrame mimarco = new MenuFrame();
        mimarco.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

class MenuFrame extends JFrame{
    MenuFrame(){
        setBounds(500,300,550,400);
        MenuLamina milamina = new MenuLamina();
        add(milamina);
        setVisible(true);
    }
}

class MenuLamina extends JPanel{
    MenuLamina(){
        JMenuBar mibarra = new JMenuBar();
        JMenu archivo = new JMenu("Archivo");
        JMenu edicion = new JMenu("Edición");
        JMenu herramientas = new JMenu("Herramientas");
        JMenu opciones = new JMenu("Opciones");

        JMenuItem guardar = new JMenuItem("Guardar");
        JMenuItem guardarComo = new JMenuItem("Guardar como");

        JMenuItem  cortar= new JMenuItem("Cortar");
        JMenuItem copiar = new JMenuItem("Copiar");
        JMenuItem pegar = new JMenuItem("Pegar");

        JMenuItem generales = new JMenuItem("Generales");

        JMenuItem opcion1 = new JMenuItem("Opción1");
        JMenuItem opcion2 = new JMenuItem("Opción2");

        opciones.add(opcion1);
        opciones.add(opcion2);

        archivo.add(guardar);
        archivo.add(guardarComo);

        edicion.add(copiar);
        edicion.add(cortar);
        edicion.add(pegar);
        edicion.addSeparator();
        edicion.add(opciones);

        herramientas.add(generales);

        mibarra.add(archivo);
        mibarra.add(edicion);
        mibarra.add(herramientas);
        add(mibarra);
    }
}