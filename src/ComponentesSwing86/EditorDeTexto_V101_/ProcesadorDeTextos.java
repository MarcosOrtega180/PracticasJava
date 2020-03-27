package ComponentesSwing86.EditorDeTexto_V101_;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProcesadorDeTextos {
    public static void main(String[] args) {
        MenuProcesador_II mimenu = new MenuProcesador_II();
        mimenu.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

class MenuProcesador_II extends JFrame {
    MenuProcesador_II() {
        setBounds(500, 300, 550, 400);
        LaminaProceador_II milamina = new LaminaProceador_II();
        add(milamina);
        setVisible(true);
    }
}

class LaminaProceador_II extends JPanel {
    JTextPane miarea;
    JMenu fuente, estilo, tamagno;

    LaminaProceador_II() {
        setLayout(new BorderLayout());
        JPanel laminamenu = new JPanel();

        JMenuBar mibarra = new JMenuBar();

        fuente = new JMenu("Fuente");
        estilo = new JMenu("Estilo");
        tamagno = new JMenu("Tamaño");
        //------------------------------------------------
//        Gestionar_menus gestionamenus = new Gestionar_menus();
        //------------------------------------------------
//        JMenuItem arial = new JMenuItem("Arial");
//        JMenuItem courier = new JMenuItem("Courier");
////        courier.addActionListener(gestionamenus);
//        JMenuItem verdana = new JMenuItem("Verdana");
//        fuente.add(arial);
//        fuente.add(courier);
//        fuente.add(verdana);
//        //------------------------------------------------
//        JMenuItem negrita = new JMenuItem("Negrita");
//        JMenuItem cursiva = new JMenuItem("Cursiva");
//        estilo.add(negrita);
//        estilo.add(cursiva);
//        //------------------------------------------------
//        JMenuItem tam_12 = new JMenuItem("12");
//        JMenuItem tam_14 = new JMenuItem("14");
//        JMenuItem tam_16 = new JMenuItem("16");
//        JMenuItem tam_20 = new JMenuItem("20");
//        JMenuItem tam_24 = new JMenuItem("24");
//        tamagno.add(tam_12);
//        tamagno.add(tam_14);
//        tamagno.add(tam_16);
//        tamagno.add(tam_20);
//        tamagno.add(tam_24);
//        //------------------------------------------------
        configura_menu("Arial","fuente", "",1,1);
        configura_menu("Courier","fuente", "",1,1);
        configura_menu("Verdana","fuente", "",1,1);
        //--------------------------------------------------
        configura_menu("Negrita","estilo", "",1,1);
        configura_menu("Cursiva","estilo", "",1,1);
        //------------------------------------------------
        configura_menu("12","tamaño", "",1,1);
        configura_menu("14","tamaño", "",1,1);
        configura_menu("16","tamaño", "",1,1);
        configura_menu("20","tamaño", "",1,1);
        //------------------------------------------------
        mibarra.add(fuente);
        mibarra.add(estilo);
        mibarra.add(tamagno);
        laminamenu.add(mibarra);
        add(laminamenu, BorderLayout.NORTH);



        miarea = new JTextPane();
        add(miarea, BorderLayout.CENTER);
    }

    public void configura_menu(String rotulo, String menu, String tipo_letra, int estilos, int tam){
        JMenuItem elem_menu = new JMenuItem(rotulo);
        if(menu.equals("fuente")){
            fuente.add(elem_menu);
        }else if(menu.equals("estilo")){
            estilo.add(elem_menu);
        }else if(menu.equals("tamaño")){
            tamagno.add(elem_menu);
        }
    }

//    private class Gestionar_menus implements ActionListener {
//
//        Gestionar_menus(ActionEvent e, String tipoLetra, Integer tamagno) {
//
//        }
//
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            miarea.setFont(new Font("Courier", Font.PLAIN, 12));
//        }
//    }
}
