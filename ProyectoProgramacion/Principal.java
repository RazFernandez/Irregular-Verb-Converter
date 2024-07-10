package ProyectoProgramacion;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public final class Principal extends javax.swing.JFrame implements ActionListener {

    private JLabel label1, bienvenida, texto1, titulotabla;
    private JTextField verbo;
    private JTable tabla;
    private JScrollPane scroll;
    private JButton consultar, salir, regresar, practicar;
    private Object titulos[] = {"Infinitivo", "Pasado", "P. participio", "Traduccion"};
    protected Object celdas[][] = new Object[83][4];
    private String Nombre = "";
    public static String Texto = "";

    public Principal() {

        //Diseño ventana
        setLayout(null);
        setTitle("Irregular Verb Converter");
        getContentPane().setBackground(new Color(51, 107, 255));
        //setIconImage(new ImageIcon(getClass().getResource("images/Irregular-verb-converter.ico")).getImage());

        Bienvenida ventanbienvenida = new Bienvenida();
        Nombre = ventanbienvenida.Texto;

        //JLabel declaracion
        ImageIcon imagen = new ImageIcon("images/Logo3.png");
        label1 = new JLabel(imagen);
        label1.setBounds(320, 1, 99, 88);
        add(label1);
        
        bienvenida = new JLabel("Bienvenido " + Nombre);
        bienvenida.setBounds(25, 25, 400, 30);
        bienvenida.setForeground(new Color(255, 255, 255));
        bienvenida.setFont(new Font("Univers", 1, 14));
        add(bienvenida);

        texto1 = new JLabel("Ingrese el verbo en infinitivo para consultar ejemplos");
        texto1.setBounds(25, 57, 400, 30);
        texto1.setForeground(new Color(255, 255, 255));
        texto1.setFont(new Font("Univers", 1, 12));
        add(texto1);

        titulotabla = new JLabel("Lista de verbos irregulares");
        titulotabla.setBounds(85, 125, 400, 30);
        titulotabla.setForeground(new Color(255, 255, 255));
        titulotabla.setFont(new Font("Andale Mono", 1, 18));
        add(titulotabla);

        //JTextField declaracion
        verbo = new JTextField();
        verbo.setBounds(25, 87, 160, 20);
        add(verbo);

        //JButton declaracion
        consultar = new JButton("Consultar");
        consultar.setBounds(225, 87, 100, 30);
        add(consultar);
        consultar.addActionListener(this);

        salir = new JButton("Cerrar");
        salir.setBounds(255, 465, 100, 30);
        add(salir);
        salir.addActionListener(this);

        regresar = new JButton("Regresar");
        regresar.setBounds(55, 465, 100, 30);
        add(regresar);
        regresar.addActionListener(this);
        
        practicar = new JButton("Practicar");
        practicar.setBounds(155, 465, 100, 30);
        add(practicar);
        practicar.addActionListener(this);

        //JTable con JScrollPane declaracion
        tabla = new JTable(celdas, titulos);
        tabla.setEnabled(false);
        scroll = new JScrollPane(tabla);
        scroll.setBounds(55, 170, 300, 270);
        add(scroll);

        setVerbs();
    }

    //Relleno tabla de verbos irrgulares
    public void setVerbs() {

        celdas[0][0] = "To be";
        celdas[0][1] = "Was/were";
        celdas[0][2] = "Been";
        celdas[0][3] = "Ser/estar";

        celdas[1][0] = "To beat";
        celdas[1][1] = "beat";
        celdas[1][2] = "beaten";
        celdas[1][3] = "Batir/golpear";

        celdas[2][0] = "To become";
        celdas[2][1] = "Became";
        celdas[2][2] = "Become";
        celdas[2][3] = "Llegar a ser";

        celdas[3][0] = "To begin";
        celdas[3][1] = "Began";
        celdas[3][2] = "Begun";
        celdas[3][3] = "Empezar";

        celdas[4][0] = "To bend";
        celdas[4][1] = "Bent";
        celdas[4][2] = "Bent";
        celdas[4][3] = "Doblar";

        celdas[5][0] = "To bite";
        celdas[5][1] = "Bit";
        celdas[5][2] = "Bitten";
        celdas[5][3] = "Morder";

        celdas[6][0] = "To blow";
        celdas[6][1] = "Blew";
        celdas[6][2] = "Blown";
        celdas[6][3] = "Soplar";

        celdas[7][0] = "To break";
        celdas[7][1] = "Broke";
        celdas[7][2] = "Broken";
        celdas[7][3] = "Romper";

        celdas[8][0] = "To bring";
        celdas[8][1] = "Brought";
        celdas[8][2] = "Brought";
        celdas[8][3] = "Traer";

        celdas[9][0] = "To build";
        celdas[9][1] = "Built";
        celdas[9][2] = "Built";
        celdas[9][3] = "Construir";

        celdas[10][0] = "To buy";
        celdas[10][1] = "Bought";
        celdas[10][2] = "Bought";
        celdas[10][3] = "Comprar";

        celdas[11][0] = "To catch";
        celdas[11][1] = "Caught";
        celdas[11][2] = "Caught";
        celdas[11][3] = "Coger/atrapar";

        celdas[12][0] = "To choose";
        celdas[12][1] = "Chose";
        celdas[12][2] = "Chosen";
        celdas[12][3] = "Elegir";

        celdas[13][0] = "To come";
        celdas[13][1] = "Cae";
        celdas[13][2] = "Come";
        celdas[13][3] = "Venir";

        celdas[14][0] = "To cost";
        celdas[14][1] = "Cost";
        celdas[14][2] = "Cost";
        celdas[14][3] = "Costar";

        celdas[15][0] = "To cut";
        celdas[15][1] = "Cut";
        celdas[15][2] = "Cut";
        celdas[15][3] = "Cortar";

        celdas[16][0] = "To do";
        celdas[16][1] = "Did";
        celdas[16][2] = "Done";
        celdas[16][3] = "Hacer";

        celdas[17][0] = "To draw";
        celdas[17][1] = "Drew";
        celdas[17][2] = "Drawn";
        celdas[17][3] = "Dibujar";

        celdas[18][0] = "To drink";
        celdas[18][1] = "Drank";
        celdas[18][2] = "Drunk";
        celdas[18][3] = "Beber";

        celdas[19][0] = "To drive";
        celdas[19][1] = "Drove";
        celdas[19][2] = "Driven";
        celdas[19][3] = "Conducir";

        celdas[20][0] = "To eat";
        celdas[20][1] = "Ate";
        celdas[20][2] = "Eaten";
        celdas[20][3] = "Comer";

        celdas[21][0] = "To fall";
        celdas[21][1] = "Fell";
        celdas[21][2] = "Fallen";
        celdas[21][3] = "Caer";

        celdas[22][0] = "To feel";
        celdas[22][1] = "Felt";
        celdas[22][2] = "Felt";
        celdas[22][3] = "Sentir";

        celdas[23][0] = "To find";
        celdas[23][1] = "Found";
        celdas[23][2] = "Found";
        celdas[23][3] = "Encontrar";

        celdas[24][0] = "To forget";
        celdas[24][1] = "Forgot";
        celdas[24][2] = "Forgotten";
        celdas[24][3] = "Olvidar";

        celdas[25][0] = "To forgive";
        celdas[25][1] = "Forgave";
        celdas[25][2] = "Forgiven";
        celdas[25][3] = "Perdonar";

        celdas[26][0] = "To freeze";
        celdas[26][1] = "Froze";
        celdas[26][2] = "Frozen";
        celdas[26][3] = "Congelar";

        celdas[27][0] = "To get";
        celdas[27][1] = "Got";
        celdas[27][2] = "Got";
        celdas[27][3] = "Obtener";

        celdas[28][0] = "To give";
        celdas[28][1] = "Gave";
        celdas[28][2] = "Given";
        celdas[28][3] = "Dar";

        celdas[29][0] = "To go";
        celdas[29][1] = "Went";
        celdas[29][2] = "Gone";
        celdas[29][3] = "ir";

        celdas[30][0] = "To grow";
        celdas[30][1] = "Grew";
        celdas[30][2] = "Grown";
        celdas[30][3] = "Crecer";

        celdas[31][0] = "To hang";
        celdas[31][1] = "Hung";
        celdas[31][2] = "Hung";
        celdas[31][3] = "Colgar";

        celdas[32][0] = "To have";
        celdas[32][1] = "Had";
        celdas[32][2] = "Had";
        celdas[32][3] = "Tener";

        celdas[33][0] = "To hear";
        celdas[33][1] = "Heard";
        celdas[33][2] = "Heard";
        celdas[33][3] = "Oir";

        celdas[34][0] = "To hide";
        celdas[34][1] = "Hid";
        celdas[34][2] = "Hidden";
        celdas[34][3] = "Esconder";

        celdas[35][0] = "To hit";
        celdas[35][1] = "Hit";
        celdas[35][2] = "Hit";
        celdas[35][3] = "Golpear";

        celdas[36][0] = "To hold";
        celdas[36][1] = "Held";
        celdas[36][2] = "Held";
        celdas[36][3] = "Sostener";

        celdas[37][0] = "To hurt";
        celdas[37][1] = "Hurt";
        celdas[37][2] = "Hurt";
        celdas[37][3] = "Herir";

        celdas[38][0] = "To keep";
        celdas[38][1] = "Kept";
        celdas[38][2] = "Kept";
        celdas[38][3] = "Mantener";

        celdas[39][0] = "To Know";
        celdas[39][1] = "Knew";
        celdas[39][2] = "Caught";
        celdas[39][3] = "Coger/atrapar";

        celdas[40][0] = "To lay";
        celdas[40][1] = "Laid";
        celdas[40][2] = "Laid";
        celdas[40][3] = "Poner/tumbar";

        celdas[41][0] = "To leave";
        celdas[41][1] = "Left";
        celdas[41][2] = "Left";
        celdas[41][3] = "Dejar/partir";

        celdas[42][0] = "To lend";
        celdas[42][1] = "Lent";
        celdas[42][2] = "Lent";
        celdas[42][3] = "Prestar";

        celdas[43][0] = "To lie";
        celdas[43][1] = "Lay";
        celdas[43][2] = "Lain";
        celdas[43][3] = "Mentir";

        celdas[44][0] = "To lose";
        celdas[44][1] = "Lost";
        celdas[44][2] = "Lost";
        celdas[44][3] = "Perder";

        celdas[45][0] = "To make";
        celdas[45][1] = "made";
        celdas[45][2] = "made";
        celdas[45][3] = "Hacer/construir";

        celdas[46][0] = "To meant";
        celdas[46][1] = "Meant";
        celdas[46][2] = "Meant";
        celdas[46][3] = "Signficar";

        celdas[47][0] = "To meet";
        celdas[47][1] = "Met";
        celdas[47][2] = "Met";
        celdas[47][3] = "Quedar con alguien";

        celdas[48][0] = "To pay";
        celdas[48][1] = "Paid";
        celdas[48][2] = "Paid";
        celdas[48][3] = "Pagar";

        celdas[49][0] = "To put";
        celdas[49][1] = "Put";
        celdas[49][2] = "Put";
        celdas[49][3] = "Poner";

        celdas[50][0] = "To read";
        celdas[50][1] = "Read";
        celdas[50][2] = "Read";
        celdas[50][3] = "Leer";

        celdas[51][0] = "To ride";
        celdas[51][1] = "Rode";
        celdas[51][2] = "Ridden";
        celdas[51][3] = "Montar";

        celdas[52][0] = "To ring";
        celdas[52][1] = "Rang";
        celdas[52][2] = "Rung";
        celdas[52][3] = "Llamar";

        celdas[53][0] = "To rise";
        celdas[53][1] = "Rose";
        celdas[53][2] = "Risen";
        celdas[53][3] = "Ascender/levantar";

        celdas[54][0] = "To run";
        celdas[54][1] = "Ran";
        celdas[54][2] = "Run";
        celdas[54][3] = "Correr";

        celdas[55][0] = "To say";
        celdas[55][1] = "Said";
        celdas[55][2] = "Said";
        celdas[55][3] = "Decir";

        celdas[56][0] = "To see";
        celdas[56][1] = "Saw";
        celdas[56][2] = "Seen";
        celdas[56][3] = "Mirar";

        celdas[57][0] = "To sell";
        celdas[57][1] = "Sold";
        celdas[57][2] = "Sold";
        celdas[57][3] = "Vender";

        celdas[58][0] = "To send";
        celdas[58][1] = "Sent";
        celdas[58][2] = "Sent";
        celdas[58][3] = "Enviar";

        celdas[59][0] = "To shake";
        celdas[59][1] = "Shook";
        celdas[59][2] = "Shaken";
        celdas[59][3] = "Sacudir/agitar";

        celdas[60][0] = "To shoot";
        celdas[60][1] = "Shot";
        celdas[60][2] = "Shot";
        celdas[60][3] = "Disparar";

        celdas[61][0] = "To show";
        celdas[61][1] = "Showed";
        celdas[61][2] = "Shown";
        celdas[61][3] = "Mostrar";

        celdas[62][0] = "To shut";
        celdas[62][1] = "Shut";
        celdas[62][2] = "Shut";
        celdas[62][3] = "Cerrar";

        celdas[63][0] = "To sing";
        celdas[63][1] = "Sang";
        celdas[63][2] = "Sung";
        celdas[63][3] = "Cantar";

        celdas[64][0] = "To sink";
        celdas[64][1] = "Sank";
        celdas[64][2] = "Sunk";
        celdas[64][3] = "Hundir";

        celdas[65][0] = "To sit";
        celdas[65][1] = "Sar";
        celdas[65][2] = "Sat";
        celdas[65][3] = "Sentarse";

        celdas[66][0] = "To sleep";
        celdas[66][1] = "Slept";
        celdas[66][2] = "Slept";
        celdas[66][3] = "Dormir";

        celdas[67][0] = "To speak";
        celdas[67][1] = "Spoke";
        celdas[67][2] = "Spoken";
        celdas[67][3] = "Hablar";

        celdas[68][0] = "To spend";
        celdas[68][1] = "Spent";
        celdas[68][2] = "Spent";
        celdas[68][3] = "Gastar";

        celdas[69][0] = "To stand";
        celdas[69][1] = "Stood";
        celdas[69][2] = "Stood";
        celdas[69][3] = "Estar de pie";

        celdas[70][0] = "To steal";
        celdas[70][1] = "Stole";
        celdas[70][2] = "Stolen";
        celdas[70][3] = "Robar";

        celdas[71][0] = "To strike";
        celdas[71][1] = "Struck";
        celdas[71][2] = "Struck";
        celdas[71][3] = "Golpear";

        celdas[72][0] = "To swim";
        celdas[72][1] = "Swam";
        celdas[72][2] = "Swum";
        celdas[72][3] = "Nadar";

        celdas[73][0] = "To take";
        celdas[73][1] = "Took";
        celdas[73][2] = "Taken";
        celdas[73][3] = "Coger/Tomar";

        celdas[74][0] = "To teach";
        celdas[74][1] = "Taught";
        celdas[74][2] = "Taught";
        celdas[74][3] = "Enseñar";

        celdas[75][0] = "To tear";
        celdas[75][1] = "Tore";
        celdas[75][2] = "Torn";
        celdas[75][3] = "Rasgar";

        celdas[76][0] = "To tell";
        celdas[76][1] = "Told";
        celdas[76][2] = "Told";
        celdas[76][3] = "Contar";

        celdas[77][0] = "To think";
        celdas[77][1] = "Thought";
        celdas[77][2] = "Thought";
        celdas[77][3] = "Pensar";

        celdas[78][0] = "To throw";
        celdas[78][1] = "Threw";
        celdas[78][2] = "Thrown";
        celdas[78][3] = "Tirar";

        celdas[79][0] = "To understand";
        celdas[79][1] = "Understood";
        celdas[79][2] = "Understood";
        celdas[79][3] = "Entender";

        celdas[80][0] = "To wear";
        celdas[80][1] = "Wore";
        celdas[80][2] = "Worn";
        celdas[80][3] = "LLevar puesto";

        celdas[81][0] = "To win";
        celdas[81][1] = "won";
        celdas[81][2] = "won";
        celdas[81][3] = "Ganar";

        celdas[82][0] = "To write";
        celdas[82][1] = "Wrote";
        celdas[82][2] = "Written";
        celdas[82][3] = "Escribir";

    }

    //Accion del boton
    @Override
    public void actionPerformed(ActionEvent e) {

        //Boton salir
        if (e.getSource() == salir) {
            JOptionPane.showMessageDialog(null, Nombre + " gracias por usar la aplicacion, ¡Tenga un bonita dia!", "Hasta luego", 1);
            System.exit(0);
        }

        //Boton Practicar    
        if (e.getSource() == practicar) {

            Instrucciones caja = new Instrucciones();
            caja.setBounds(0, 0, 420, 340);
            caja.setVisible(true);
            caja.setLocationRelativeTo(null);
            caja.setResizable(false);

            this.setVisible(false);
        }
        
        //Boton Regresar
        if (e.getSource() == regresar) {

            Bienvenida caja = new Bienvenida();
            caja.setBounds(0, 0, 350, 450);
            caja.setVisible(true);
            caja.setLocationRelativeTo(null);
            caja.setResizable(false);

            this.setVisible(false);
        }

        //Boton Consultar
        if (e.getSource() == consultar) {

            Texto = verbo.getText().trim();

            if (Texto.equals("")) {

                JOptionPane.showMessageDialog(null, "Lo sentimos, no puede dejar este campo vacio", "¡Error!", 0);

            } else {
                verbo.setText("");
                Consulta ejemplo = new Consulta();
                ejemplo.setBounds(0, 0, 426, 340);
                ejemplo.setLocationRelativeTo(null);
                ejemplo.setResizable(false);
            }

        }

    }

}
