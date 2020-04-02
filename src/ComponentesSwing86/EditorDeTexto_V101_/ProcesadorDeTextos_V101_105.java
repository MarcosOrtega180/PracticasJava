package ComponentesSwing86.EditorDeTexto_V101_;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProcesadorDeTextos_V101_105 {
    public static void main(String[] args) {
        MenuProcesador_III mimenu = new MenuProcesador_III();
        mimenu.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

class MenuProcesador_II extends JFrame {
    MenuProcesador_II() {
        setBounds(500, 300, 550, 400);
        LaminaProceador_III milamina = new LaminaProceador_III();
        add(milamina);
        setVisible(true);
    }
}

class LaminaProceador_II extends JPanel {
    JTextPane miarea;
    JMenu fuente, estilo, tamagno;
    Font letra;

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
//        JMenuItem courier = new JMenuItem("Harrington");
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
        configura_menu("Arial", "fuente", "Arial", 9, 10);
        configura_menu("Harrington", "fuente", "Harrington", 9, 10);
        configura_menu("Verdana", "fuente", "Verdana", 9, 10);
        //--------------------------------------------------
        configura_menu("Negrita", "estilo", "", Font.BOLD, 1);
        configura_menu("Cursiva", "estilo", "", Font.ITALIC, 1);
        //------------------------------------------------
        configura_menu("12", "tamaño", "", 1, 12);
        configura_menu("14", "tamaño", "", 1, 14);
        configura_menu("16", "tamaño", "", 1, 16);
        configura_menu("20", "tamaño", "", 1, 20);
        //------------------------------------------------
        mibarra.add(fuente);
        mibarra.add(estilo);
        mibarra.add(tamagno);
        laminamenu.add(mibarra);
        add(laminamenu, BorderLayout.NORTH);


        miarea = new JTextPane();
        add(miarea, BorderLayout.CENTER);
    }

    public void configura_menu(String rotulo, String menu, String tipo_letra, int estilos, int tam) {
        JMenuItem elem_menu = new JMenuItem(rotulo);
        if (menu.equals("fuente")) {
            fuente.add(elem_menu);
        } else if (menu.equals("estilo")) {
            estilo.add(elem_menu);
        } else if (menu.equals("tamaño")) {
            tamagno.add(elem_menu);
        }
        elem_menu.addActionListener(new Gestiona_Eventos(tipo_letra, rotulo, estilos, tam));
    }

    private class Gestiona_Eventos implements ActionListener {
        String tipo_letra, rotulo;
        int estilos, tam;

        Gestiona_Eventos(String tipo_letra, String rotulo, int estilos, int tam) {
            this.tipo_letra = tipo_letra;
            this.rotulo = rotulo;
            this.estilos = estilos;
            this.tam = tam;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            letra = miarea.getFont();
            if (rotulo.equals("Arial") || rotulo.equals("Harrington") || rotulo.equals("Verdana")) {
                estilos = letra.getStyle();
                tam = letra.getSize();
            } else if (rotulo.equals("Negrita") || rotulo.equals("Cursiva")) {
                if (letra.getStyle() == Font.BOLD || letra.getStyle() == Font.ITALIC) {
                    estilos = 3;
                }
                tipo_letra = letra.getFontName();
                tam = letra.getSize();
            } else if (rotulo.equals("12") || rotulo.equals("14") || rotulo.equals("16") || rotulo.equals("20")) {
                estilos = letra.getStyle();
                tipo_letra = letra.getFontName();
            }
            miarea.setFont(new Font(tipo_letra, estilos, tam));
            System.out.println("tipo: " + tipo_letra + " estilo: " + estilos + " tamaño: " + tam);
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
//            miarea.setFont(new Font("Harrington", Font.PLAIN, 12));
//        }
//    }
}
