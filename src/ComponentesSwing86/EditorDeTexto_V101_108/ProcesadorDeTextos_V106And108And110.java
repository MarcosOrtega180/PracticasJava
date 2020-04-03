package ComponentesSwing86.EditorDeTexto_V101_108;

import javax.swing.*;
import javax.swing.text.StyledEditorKit;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;


public class ProcesadorDeTextos_V106And108And110 {
    public static void main(String[] args) {
        MenuProcesador_III mimenu = new MenuProcesador_III();
        mimenu.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

class MenuProcesador_III extends JFrame {
    MenuProcesador_III() {
        setBounds(500, 300, 550, 400);
        LaminaProceador_III milamina = new LaminaProceador_III();
        add(milamina);
        setVisible(true);
    }
}

class LaminaProceador_III extends JPanel {
    JTextPane miarea;
    JMenu fuente, estilo, tamagno, tamagno2, archivo, estilo2;
    JMenuBar mibarra;

    LaminaProceador_III() {
        setLayout(new BorderLayout());
        JPanel laminamenu = new JPanel();
        mibarra = new JMenuBar();

        fuente = new JMenu("Fuente");
        estilo = new JMenu("Estilo");
        tamagno = new JMenu("Tamaño");
        tamagno2 = new JMenu("Tamaño2");
        archivo = new JMenu("Archivo");
        estilo2 = new JMenu("Estilo2");

        //------------------------------------------------
        configura_menu("Arial", "fuente", "Arial", 9, 10);
        configura_menu("Harrington", "fuente", "Harrington", 9, 10);
        configura_menu("Verdana", "fuente", "Verdana", 9, 10);
        //--------------------------------------------------
        configura_menu("Negrita", "estilo", "", Font.BOLD, 1);
        configura_menu("Cursiva", "estilo", "", Font.ITALIC, 1);
        //------------------------------------------------
        /*Agrego check box para poder escoger negrita o cursiva*/
        JCheckBox negrita = new JCheckBox("Negrita");
        JCheckBox cursiva = new JCheckBox("Cursiva");
        //video 110 accesos del teclado
        negrita.addActionListener(new StyledEditorKit.BoldAction());
        cursiva.addActionListener(new StyledEditorKit.ItalicAction());
        estilo2.add(negrita);
        estilo2.add(cursiva);
        //------------------------------------------------
        configura_menu("12", "tamaño", "", 1, 12);
        configura_menu("14", "tamaño", "", 1, 14);
        configura_menu("16", "tamaño", "", 1, 16);
        configura_menu("20", "tamaño", "", 1, 20);
        //------------------------------------------------
        //creamos una segundaopción para cambiar los tamaños, ahora con radiobuttons
        JRadioButtonMenuItem btn12 = new JRadioButtonMenuItem("12");
        JRadioButtonMenuItem btn14 = new JRadioButtonMenuItem("14");
        JRadioButtonMenuItem btn16 = new JRadioButtonMenuItem("16");
        JRadioButtonMenuItem btn20 = new JRadioButtonMenuItem("20");
        //video 110 accesos del teclado
//        btn20.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, InputEvent.CTRL_DOWN_MASK));
        ButtonGroup tamagnoGroup = new ButtonGroup();
        tamagnoGroup.add(btn12);
        tamagnoGroup.add(btn14);
        tamagnoGroup.add(btn16);
        tamagnoGroup.add(btn20);
        btn12.addActionListener(new StyledEditorKit.FontSizeAction("tam", 12));
        btn14.addActionListener(new StyledEditorKit.FontSizeAction("tam", 14));
        btn16.addActionListener(new StyledEditorKit.FontSizeAction("tam", 16));
        btn20.addActionListener(new StyledEditorKit.FontSizeAction("tam", 20));
        tamagno2.add(btn12);
        tamagno2.add(btn14);
        tamagno2.add(btn16);
        tamagno2.add(btn20);
        //------------------------------------------------
        configura_menu("Guardar", "guardar", "", 9, 9);

        mibarra.add(fuente);
        mibarra.add(estilo);
        mibarra.add(tamagno);
        mibarra.add(archivo);
        mibarra.add(estilo2);
        mibarra.add(tamagno2);
        laminamenu.add(mibarra);
        add(laminamenu, BorderLayout.NORTH);


        miarea = new JTextPane();

        JPopupMenu menuEmergente = new JPopupMenu();
        JMenuItem negritaEmergente = new JMenuItem("Negrita");
        JMenuItem cursivaEmergente = new JMenuItem("Cursiva");

        negritaEmergente.addActionListener(new StyledEditorKit.BoldAction());
        cursivaEmergente.addActionListener(new StyledEditorKit.ItalicAction());

        menuEmergente.add(negritaEmergente);
        menuEmergente.add(cursivaEmergente);

        setComponentPopupMenu(menuEmergente);
        miarea.setComponentPopupMenu(menuEmergente);
        add(miarea, BorderLayout.CENTER);
    }

    public void configura_menu(String rotulo, String menu, String tipo_letra, int estilos, int tam) {
        JMenuItem elem_menu = new JMenuItem(rotulo);
        switch (menu) {
            case "fuente":
                elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambio_letra",tipo_letra));
                fuente.add(elem_menu);
                break;
            case "estilo":
                if(estilos==Font.BOLD){
                    elem_menu.addActionListener(new StyledEditorKit.BoldAction());
                    elem_menu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,InputEvent.CTRL_DOWN_MASK));
                }else if(estilos==Font.ITALIC){
                    elem_menu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,InputEvent.CTRL_DOWN_MASK));
                    elem_menu.addActionListener(new StyledEditorKit.ItalicAction());
                }
                estilo.add(elem_menu);
                break;
            case "tamaño":
                elem_menu.addActionListener(new StyledEditorKit.FontSizeAction("tam", tam));
                tamagno.add(elem_menu);
                break;
            case "guardar":
                elem_menu.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try (PrintStream out = new PrintStream(new FileOutputStream("filename.txt"))) {
                            out.print(miarea.getText());
                            JOptionPane.showMessageDialog(null,"Documento guardado con éxito");
                        } catch (FileNotFoundException e1) {
                            e1.printStackTrace();
                        }
                    }


                });

                archivo.add(elem_menu);
                break;

        }

    }


}

