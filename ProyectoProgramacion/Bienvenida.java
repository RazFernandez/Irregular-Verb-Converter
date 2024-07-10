package ProyectoProgramacion;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Bienvenida extends javax.swing.JFrame implements ActionListener {

    private JLabel label1, label2, label3, label4;
    private JTextField field1;
    private JButton ingresar, cerrar;
    public static String Texto = "";

    public Bienvenida() {
        setLayout(null);
        setTitle("Bienvenido");
        getContentPane().setBackground(new Color(51, 107, 255));
        //setIconImage(new ImageIcon(getClass().getResource("images/Logo.png")).getImage());

        //JLabel declaracion
        ImageIcon imagen = new ImageIcon("images/logo.png");
        label1 = new JLabel(imagen);
        label1.setBounds(45, 212, 300, 200);
        add(label1);

        
        label2 = new JLabel("Irregular Verbs Converter");
        label2.setBounds(45, 135, 300, 30);
        label2.setFont(new Font("Univers", 3, 18));
        label2.setForeground(new Color(255, 255, 255));
        add(label2);
         
        label3 = new JLabel("Ingrese su nombre");
        label3.setBounds(45, 212, 200, 30);
        label3.setFont(new Font("Univers", 1, 12));
        label3.setForeground(new Color(255, 255, 255));
        add(label3);

        label4 = new JLabel("©2021 Instituto Tecnologico de F.C.P");
        label4.setBounds(70, 375, 300, 30);
        label4.setFont(new Font("Univers", 1, 12));
        label4.setForeground(new Color(255, 255, 255));
        add(label4);

        //JTextfield declaracion
        field1 = new JTextField();
        field1.setBounds(45, 240, 255, 25);
        add(field1);

        //JButom declaracion
        ingresar = new JButton("Ingresar");
        ingresar.setBounds(125, 280, 100, 30);
        add(ingresar);
        ingresar.addActionListener(this);

        cerrar = new JButton("Cerrar");
        cerrar.setBounds(255, 465, 100, 30);
        add(cerrar);
        cerrar.addActionListener(this);

    }

    //Funcionalidad de los botones
    @Override
    public void actionPerformed(ActionEvent e) {

        //Boton Ingresar
        if (e.getSource() == ingresar) {

            Texto = field1.getText().trim();

            if (Texto.equals("")) {

                JOptionPane.showMessageDialog(null, "Lo sentimos, debes ingresar tu nombre para continuar", "¡Error!", 0);

            } else {

                JOptionPane.showMessageDialog(null, "Para consultar ejemplos de algun verbo, debes escribir el verbo en infinitivo " + "\n"
                        + "sin la particula to y con la primera letra en mayuscula", "Instrucciones", 1);

                Principal principal = new Principal();
                principal.setBounds(0, 0, 426, 568);
                principal.setVisible(true);
                principal.setLocationRelativeTo(null);
                principal.setResizable(false);

                this.setVisible(false);

            }
        }

        //Boton Cerrar
        if (e.getSource() == cerrar) {

            JOptionPane.showMessageDialog(null, "¡Tenga un bonito dia!");
            System.exit(0);
        }
    }

}
