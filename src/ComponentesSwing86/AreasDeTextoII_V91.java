package ComponentesSwing86;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AreasDeTextoII_V91 {
    public static void main(String[] args) {
        MarcoPruevaArea mimarco = new MarcoPruevaArea();
        mimarco.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        mimarco.setVisible(true);
    }
}

class MarcoPruevaArea extends JFrame{
    MarcoPruevaArea(){
        setTitle("Probar área de texto");
        setBounds(500,300,500,350);
        setLayout(new BorderLayout());
        laminaBotones = new JPanel();

        botonInsertar=new JButton("Insertar");
        botonInsertar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                areaTexto.append("En un lugar de la mancha de cuyo nombre no me quiero acordar....      ");
            }
        });
        laminaBotones.add(botonInsertar);

        botonSaltoLinea= new JButton("SaltoLinea");
        botonSaltoLinea.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean saltar = !areaTexto.getLineWrap();
                areaTexto.setLineWrap(saltar);
//                if(saltar){
//                    botonSaltoLinea.setText("Quitar Salto");
//                }else{
//                    botonSaltoLinea.setText("Salto línea");
//                }
                botonSaltoLinea.setText(saltar?"Quitar Salto":"Salto Línea");
            }
        });
        laminaBotones.add(botonSaltoLinea);

        borrarTodo = new JButton("Borrar todo");
        borrarTodo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                areaTexto.setText("");
            }
        });
        add(laminaBotones,BorderLayout.SOUTH);

        laminaBotones.add(borrarTodo);

        areaTexto = new JTextArea(8,20);
        laminaConBarras=new JScrollPane(areaTexto);


        add(laminaConBarras,BorderLayout.CENTER);
    }
    private JPanel laminaBotones;
    private JButton botonInsertar, botonSaltoLinea, borrarTodo;
    private JTextArea areaTexto;
    private JScrollPane laminaConBarras;
}