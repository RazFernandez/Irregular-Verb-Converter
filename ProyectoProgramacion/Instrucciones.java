package ProyectoProgramacion;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Instrucciones extends javax.swing.JFrame implements ActionListener {

    private JTextArea areaTexto;
    private JLabel importante;
    private JButton regresar, jugar;
    private JScrollPane Scroll;
    private String instruccion;

    public Instrucciones() {

        setLayout(null);
        setTitle("Intrucciones");
        getContentPane().setBackground(new Color(51, 107, 255));

        //Declaracion del area de texto donde se colocaran las instrucciones
        areaTexto = new JTextArea(setInstrucciones());
        Scroll = new JScrollPane(areaTexto);
        areaTexto.setFont(new Font("Univers", 0, 12));
        areaTexto.setForeground(new Color(0, 0, 0));
        areaTexto.setEditable(false);
        Scroll.setBounds(25, 60, 358, 160);
        add(Scroll);

        //Delcaracion de JLabel
        importante = new JLabel("Instrucciones");
        importante.setBounds(25, 25, 200, 30);
        importante.setFont(new Font("Univers", 1, 20));
        importante.setForeground(new Color(255, 255, 255));
        add(importante);

        //Declaracion de los botones regresar y jugar
        regresar = new JButton("Regresar");
        regresar.setBounds(25, 250, 100, 30);
        add(regresar);
        regresar.addActionListener(this);

        jugar = new JButton("Jugar");
        jugar.setBounds(285, 250, 100, 30);
        add(jugar);
        jugar.addActionListener(this);
    }

    public String setInstrucciones() {

        instruccion = "El juego consiste en que se generarán 10 ejercicios, que \n"
                + "consisten en seleccionar un verbo en cualquiera de los 3\n"
                + "tiempos verbales, tomandos completamente al azar apartir\n"
                + "de la lista de 84 verbos irregulares mostrados con \n"
                + "anterioridad, para poder completar el espacio vacio que \n"
                + "hay en el ejercicio mostrado.\n"
                + "\n"
                + "Tambien se le mostrara en la parte inferior su puntaje, \n"
                + "de acuerdo a la cantidad de aciertos de los ejercicios.\n"
                + "Sin nada mas que decir, le deseamos mucha suerte :)";

        return instruccion;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == regresar) {

            Principal principal = new Principal();
            principal.setBounds(0, 0, 426, 568);
            principal.setVisible(true);
            principal.setLocationRelativeTo(null);
            principal.setResizable(false);

            this.setVisible(false);
        }

        if (e.getSource() == jugar) {

            Juego juego = new Juego();
            juego.setBounds(0, 0, 465, 300);
            juego.setVisible(true);
            juego.setLocationRelativeTo(null);
            juego.setResizable(false);

            this.setVisible(false);
        }
    }

}
