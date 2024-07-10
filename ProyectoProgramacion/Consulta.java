package ProyectoProgramacion;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Consulta extends javax.swing.JFrame implements ActionListener {

    private JLabel titulo;
    private JButton cerrar;
    private JScrollPane Scroll;
    private JTextArea ejemplo;
    public static String verbo;
    public String verboejemplo = "";

    public Consulta() {

        Principal principal = new Principal();
        verbo = principal.Texto;
        setEjemplos();

        setLayout(null);
        setTitle("Ejemplo verbo " + verbo);
        getContentPane().setBackground(new Color(51, 107, 255));

        //Declaracion JLabel
        titulo = new JLabel("Ejemplos del verbo " + "" + verbo + "");
        titulo.setBounds(25, 15, 300, 30);
        titulo.setFont(new Font("Univers", 1, 18));
        titulo.setForeground(new Color(255, 255, 255));
        add(titulo);

        //Delcaracion JTextArea
        ejemplo = new JTextArea(verboejemplo);
        Scroll = new JScrollPane(ejemplo);
        ejemplo.setFont(new Font("Univers", 0, 12));
        ejemplo.setForeground(new Color(0, 0, 0));
        ejemplo.setEditable(false);
        Scroll.setBounds(25, 60, 358, 160);
        add(Scroll);

        //Declaracion JButtom
        cerrar = new JButton("Cerrar");
        cerrar.setBounds(285, 250, 100, 30);
        add(cerrar);
        cerrar.addActionListener(this);

    }
//Funcionalidad de los botones

    public void setEjemplos() {

        switch (verbo) {

            case "Be":
                verboejemplo = "\n" + "  1) Tiempo infinitivo: I am an student " + "\n" + "       Traduccion: Yo soy un estudiante"
                        + "\n" + "\n" + "  2) Tiempo pasado: I was an student" + "\n" + "       Traduccion: Yo era un estudiante"
                        + "\n" + "\n" + "  3) Tiempo participio: I have been an student" + "\n" + "       Traduccion: Yo he sido un estudiante";

                this.setVisible(true);
                break;

            case "Beat":
                verboejemplo = "\n" + "  1) Tiempo infinitivo: He beat the desk with his fist " + "\n" + "       Traduccion: Él golpea el escritorio con el puño"
                        + "\n" + "\n" + "  2) Tiempo pasado: He beat the desk with his fist" + "\n" + "       Traduccion: Él golpeó el escritorio con el puño"
                        + "\n" + "\n" + "  3) Tiempo participio: He beaten the desk with his fist" + "\n" + "       Traduccion: Él ha golpeado el escritorio con el puño";

                this.setVisible(true);
                break;

            case "Become":
                verboejemplo = "\n" + "  1) Tiempo infinitivo: The caterpillar become a moth " + "\n" + "       Traduccion: La oruga se convierte en polilla"
                        + "\n" + "\n" + "  2) Tiempo pasado: The caterpillar became a moth" + "\n" + "       Traduccion: La oruga se convirtió en polilla"
                        + "\n" + "\n" + "  3) Tiempo participio: The caterpillar become a moth" + "\n" + "       Traduccion: La oruga se ha convertido en polilla";

                this.setVisible(true);
                break;

            case "Begin":
                verboejemplo = "\n" + "  1) Tiempo infinitivo: I begin in my job in 2015 " + "\n" + "       Traduccion: Empiezo en mi trabajo en 2015"
                        + "\n" + "\n" + "  2) Tiempo pasado: I began in my job in 2015" + "\n" + "       Traduccion: Empecé en mi trabajo en 2015"
                        + "\n" + "\n" + "  3) Tiempo participio: I begun in my job in 2015" + "\n" + "       Traduccion: He empezado en mi trabajo en 2015";

                this.setVisible(true);
                break;

            case "Bend":
                verboejemplo = "\n" + "  1) Tiempo infinitivo: The machine bend the metal bar at a sharp angle" + "\n" + "       Traduccion: La máquina dobla la barra de metal en un ángulo agudo"
                        + "\n" + "\n" + "  2) Tiempo pasado: The machine bent the metal bar at a sharp angle" + "\n" + "       Traduccion: La máquina dobló la barra de metal en un ángulo agudo"
                        + "\n" + "\n" + "  3) Tiempo participio: The machine bent the metal bar at a sharp angle" + "\n" + "       Traduccion: La máquina ha doblado la barra de metal en un ángulo agudo";

                this.setVisible(true);
                break;

            case "Bite":
                verboejemplo = "\n" + "  1) Tiempo infinitivo: The turtle bite the dog’s tail" + "\n" + "       Traduccion: La tortuga muerde la cola del perro"
                        + "\n" + "\n" + "  2) Tiempo pasado: The turtle bit the dog’s tail" + "\n" + "       Traduccion: La tortuga mordió la cola del perro"
                        + "\n" + "\n" + "  3) Tiempo participio: The turtle bitten the dog’s tail" + "\n" + "       Traduccion: La tortuga ha mordido la cola del perro";

                this.setVisible(true);
                break;

            case "Blow":
                verboejemplo = "\n" + "  1) Tiempo infinitivo: The winter wind blow from the west" + "\n" + "       Traduccion: El viento invernal sopla desde el oeste"
                        + "\n" + "\n" + "  2) Tiempo pasado: The winter wind blew from the west" + "\n" + "       Traduccion: El viento invernal sopló desde el oeste"
                        + "\n" + "\n" + "  3) Tiempo participio: The winter wind blown from the west" + "\n" + "       Traduccion: El viento invernal ha soplado desde el oeste";

                this.setVisible(true);
                break;

            case "Break":
                verboejemplo = "\n" + "  1) Tiempo infinitivo: Steven break his arm when he fall" + "\n" + "       Traduccion: Steven se rompe el brazo cuando se cae"
                        + "\n" + "\n" + "  2) Tiempo pasado: Steven broke his arm when he fell" + "\n" + "       Traduccion: Steven se rompió el brazo cuando se cayó"
                        + "\n" + "\n" + "  3) Tiempo participio: Steven broken his arm when he fell" + "\n" + "       Traduccion: Steven se ha roto el brazo cuando se cayó";

                this.setVisible(true);
                break;

            case "Bring":
                verboejemplo = "\n" + "  1) Tiempo infinitivo: He bring the red wine" + "\n" + "       Traduccion: Él trae el vino tinto"
                        + "\n" + "\n" + "  2) Tiempo pasado: He brought the red wine" + "\n" + "       Traduccion: Él trajo el vino tinto"
                        + "\n" + "\n" + "  3) Tiempo participio: He brought the red wine" + "\n" + "       Traduccion: Él ha traído el vino tinto";

                this.setVisible(true);
                break;

            case "Build":
                verboejemplo = "\n" + "  1) Tiempo infinitivo: The construction company build the house in two month" + "\n" + "       Traduccion: La empresa construye la casa en dos meses"
                        + "\n" + "\n" + "  2) Tiempo pasado: The construction company built the house in two month" + "\n" + "       Traduccion: La empresa construyó la casa en dos meses"
                        + "\n" + "\n" + "  3) Tiempo participio: The construction company built the house in two month" + "\n" + "       Traduccion: La empresa ha construido la casa en dos meses";

                this.setVisible(true);
                break;

            case "Buy":
                verboejemplo = "\n" + "  1) Tiempo infinitivo: Luis buy a car" + "\n" + "       Traduccion: Luis compra un coche"
                        + "\n" + "\n" + "  2) Tiempo pasado: Luis bought a car" + "\n" + "       Traduccion: Luis compró un coche"
                        + "\n" + "\n" + "  3) Tiempo participio: Luis bought a car" + "\n" + "       Traduccion: Luis ha comprado un coche";

                this.setVisible(true);
                break;

            case "Catch":
                verboejemplo = "\n" + "  1) Tiempo infinitivo: Jason catch her by the waist" + "\n" + "       Traduccion: Jason la atrapa por la cintura"
                        + "\n" + "\n" + "  2) Tiempo pasado: Jason caught her by the waist" + "\n" + "       Traduccion: Jason la atrapó por la cintura"
                        + "\n" + "\n" + "  3) Tiempo participio: Jason caught her by the waist" + "\n" + "       Traduccion: Jason la ha atrapado por la cintura";

                this.setVisible(true);
                break;

            case "Choose":
                verboejemplo = "\n" + "  1) Tiempo infinitivo: He choose to become an architect" + "\n" + "       Traduccion: Él escoge ser arquitecto"
                        + "\n" + "\n" + "  2) Tiempo pasado: He chose to become an architect" + "\n" + "       Traduccion: Él escogió ser arquitecto"
                        + "\n" + "\n" + "  3) Tiempo participio: He chosen to become an architect" + "\n" + "       Traduccion: Él ha escogido ser arquitecto";

                this.setVisible(true);
                break;

            case "Come":
                verboejemplo = "\n" + "  1) Tiempo infinitivo: They come too late" + "\n" + "       Traduccion: Ellos vienen muy tarde"
                        + "\n" + "\n" + "  2) Tiempo pasado: They came too late" + "\n" + "       Traduccion: Ellos vinieron muy tarde"
                        + "\n" + "\n" + "  3) Tiempo participio: They come too late" + "\n" + "       Traduccion: Ellos han venido muy tarde";

                this.setVisible(true);
                break;

            case "Cost":
                verboejemplo = "\n" + "  1) Tiempo infinitivo: All of the rides at the fair cost a dollar" + "\n" + "       Traduccion: Todas las atracciones de la feria cuestan un dólar"
                        + "\n" + "\n" + "  2) Tiempo pasado: All of the rides at the fair cost a dollar" + "\n" + "       Traduccion: Todas las atracciones de la feria costaban un dólar"
                        + "\n" + "\n" + "  3) Tiempo participio: All of the rides at the fair cost a dollar" + "\n" + "       Traduccion: Todas las atracciones de la feria han costado un dólar";

                this.setVisible(true);
                break;

            case "Cut":
                verboejemplo = "\n" + "  1) Tiempo infinitivo: She cut the string and open the package" + "\n" + "       Traduccion: Ella corta la cuerda y abre el paquete"
                        + "\n" + "\n" + "  2) Tiempo pasado: She cut the string and opened the package" + "\n" + "       Traduccion: Ella cortó la cuerda y abrió el paquete"
                        + "\n" + "\n" + "  3) Tiempo participio: She cut the string and opened the package" + "\n" + "       Traduccion: Ella ha cortado la cuerda y abrió el paquete";

                this.setVisible(true);
                break;

            case "Do":
                verboejemplo = "\n" + "  1) Tiempo infinitivo: You do a fantastic job on the last Project" + "\n" + "       Traduccion: Haces un trabajo fantástico en el último proyecto"
                        + "\n" + "\n" + "  2) Tiempo pasado: You did a fantastic job on the last Project" + "\n" + "       Traduccion: Hiciste un trabajo fantástico en el último proyecto"
                        + "\n" + "\n" + "  3) Tiempo participio: You done a fantastic job on the last Project" + "\n" + "       Traduccion: Has hecho un trabajo fantástico en el último proyecto";

                this.setVisible(true);
                break;

            case "Draw":
                verboejemplo = "\n" + "  1) Tiempo infinitivo: The map you draw is really confusing" + "\n" + "       Traduccion: El mapa que dibujas es muy confuso"
                        + "\n" + "\n" + "  2) Tiempo pasado: The map you drew is really confusing" + "\n" + "       Traduccion: El mapa que dibujaste es muy confuso"
                        + "\n" + "\n" + "  3) Tiempo participio: The map you drawn is really confusing" + "\n" + "       Traduccion: El mapa que has dibujado es muy confuso";

                this.setVisible(true);
                break;

            case "Drink":
                verboejemplo = "\n" + "  1) Tiempo infinitivo: He drink beer upon beer" + "\n" + "       Traduccion: Bebe cerveza tras cerveza"
                        + "\n" + "\n" + "  2) Tiempo pasado: He drank beer upon beer" + "\n" + "       Traduccion: Bebió cerveza tras cerveza"
                        + "\n" + "\n" + "  3) Tiempo participio: He drunk beer upon beer" + "\n" + "       Traduccion: Ha bebido cerveza tras cerveza";

                this.setVisible(true);
                break;

            case "Drive":
                verboejemplo = "\n" + "  1) Tiempo infinitivo: We drive around the island, enjoying its tropical landscape" + "\n" + "       Traduccion: Manejamos alrededor de la isla disfrutando de su paisaje tropical"
                        + "\n" + "\n" + "  2) Tiempo pasado: We drove around the island, enjoying its tropical landscape" + "\n" + "       Traduccion: Manejamos alrededor de la isla disfrutando de su paisaje tropical"
                        + "\n" + "\n" + "  3) Tiempo participio: We driven around the island, enjoying its tropical landscape" + "\n" + "       Traduccion: Hemos manejado alrededor de la isla disfrutando de su paisaje tropical";

                this.setVisible(true);
                break;

            case "Eat":
                verboejemplo = "\n" + "  1) Tiempo infinitivo: We eat some eggs with our breakfast" + "\n" + "       Traduccion: Comemos unos huevos con nuestro desayuno"
                        + "\n" + "\n" + "  2) Tiempo pasado: We ate some eggs with our breakfast" + "\n" + "       Traduccion: Comimos unos huevos con nuestro desayuno"
                        + "\n" + "\n" + "  3) Tiempo participio: We eaten some eggs with our breakfast" + "\n" + "       Traduccion: Hemos comido unos huevos con nuestro desayuno";

                this.setVisible(true);
                break;

            case "Fall":
                verboejemplo = "\n" + "  1) Tiempo infinitivo: I fall from the stairs" + "\n" + "       Traduccion: Me caigo de la escalera"
                        + "\n" + "\n" + "  2) Tiempo pasado: I fell from the stairs" + "\n" + "       Traduccion: Me caí de la escalera"
                        + "\n" + "\n" + "  3) Tiempo participio: I fallen from the stairs" + "\n" + "       Traduccion: Me he caído de la escalera";

                this.setVisible(true);
                break;

            case "Feel":
                verboejemplo = "\n" + "  1) Tiempo infinitivo: I feel very lonely when I arrive in Tokyo for the first time" + "\n" + "       Traduccion: Me siento muy sola cuando llego a Tokio por primera vez"
                        + "\n" + "\n" + "  2) Tiempo pasado: I felt very lonely when I arrived in Tokyo for the first time" + "\n" + "       Traduccion: Me sentí muy sola cuando llegué a Tokio por primera vez"
                        + "\n" + "\n" + "  3) Tiempo participio: I felt very lonely when I arrive in Tokyo for the first time" + "\n" + "       Traduccion: Me he sentido muy sola cuando llego a Tokio por primera vez";

                this.setVisible(true);
                break;

            case "Fight":
                verboejemplo = "\n" + "  1) Tiempo infinitivo: The boxers fight each other for half an hour in the world championship" + "\n" + "       Traduccion: Los boxeadores se pelean durante media hora en el campeonato mundial"
                        + "\n" + "\n" + "  2) Tiempo pasado: The boxers fought each other for half an hour in the world championship" + "\n" + "       Traduccion: Los boxeadores se pelearon durante media hora en el campeonato mundial"
                        + "\n" + "\n" + "  3) Tiempo participio: The boxers fought each other for half an hour in the world championship" + "\n" + "       Traduccion: Los boxeadores se han peleado durante media hora en el campeonato mundial";

                this.setVisible(true);
                break;

            case "Find":
                verboejemplo = "\n" + "  1) Tiempo infinitivo: I find ten dollars in the Street" + "\n" + "       Traduccion: Encuentro diez dólares en la calle"
                        + "\n" + "\n" + "  2) Tiempo pasado: I found ten dollars in the Street yesterday" + "\n" + "       Traduccion: Ayer encontré diez dólares en la calle"
                        + "\n" + "\n" + "  3) Tiempo participio: I found ten dollars in the Street yesterday" + "\n" + "       Traduccion: Ayer he encontrado diez dólares en la calle";

                this.setVisible(true);
                break;

            case "Forget":
                verboejemplo = "\n" + "  1) Tiempo infinitivo: I forget to wash the clothes" + "\n" + "       Traduccion: Olvido lavar la ropa"
                        + "\n" + "\n" + "  2) Tiempo pasado: I forgot to wash the clothes" + "\n" + "       Traduccion: Olvidé lavar la ropa"
                        + "\n" + "\n" + "  3) Tiempo participio: I forgotten to wash the clothes" + "\n" + "       Traduccion: He olvidado lavar la ropa";

                this.setVisible(true);
                break;

            case "Forgive":
                verboejemplo = "\n" + "  1) Tiempo infinitivo: I forgive her one and one thousand times" + "\n" + "       Traduccion: La perdono una y mil veces"
                        + "\n" + "\n" + "  2) Tiempo pasado: I forgave her one and one thousand times" + "\n" + "       Traduccion: La perdoné una y mil veces"
                        + "\n" + "\n" + "  3) Tiempo participio: I forgiven her one and one thousand times" + "\n" + "       Traduccion: La he perdonado una y mil veces";

                this.setVisible(true);
                break;

            case "Freeze":
                verboejemplo = "\n" + "  1) Tiempo infinitivo: The scientist freeze methane for an experiment" + "\n" + "       Traduccion: El científico congela metano para un experimento"
                        + "\n" + "\n" + "  2) Tiempo pasado: The scientist froze methane for an experiment" + "\n" + "       Traduccion: El científico congeló metano para un experimento"
                        + "\n" + "\n" + "  3) Tiempo participio: The scientist frozen methane for an experiment" + "\n" + "       Traduccion: El científico ha congelado metano para un experimento";

                this.setVisible(true);
                break;

            //Parte 2  
            case "Get":
                verboejemplo = "\n" + "  1) Tiempo infinitivo:I'm about to get home" + "\n" + "       Traduccion: Estoy a punto de llegar a casa"
                        + "\n" + "\n" + "  2) Tiempo pasado: I'm about to got a home " + "\n" + "       Traduccion: Estoy a punto de obtener una casa"
                        + "\n" + "\n" + "  3) Tiempo participio: He will got a house" + "\n" + "       Traduccion: El tendrá una casa ";

                this.setVisible(true);
                break;

            case "Give":
                verboejemplo = "\n" + "  1) Tiempo infinitivo: I'm going to give you a hug  " + "\n" + "       Traduccion: Te voy a dar un abrazo"
                        + "\n" + "\n" + "  2) Tiempo pasado: I will go to gave a hug  " + "\n" + "       Traduccion: iré para dar un abrazo"
                        + "\n" + "\n" + "  3) Tiempo participio: She will given me a hug " + "\n" + "       Traduccion: Ella me dará un abrazo ";

                this.setVisible(true);
                break;

            case "Go":
                verboejemplo = "\n" + "  1) Tiempo infinitivo: I'm go to the park  " + "\n" + "       Traduccion: Voy al parque"
                        + "\n" + "\n" + "  2) Tiempo pasado: we went to the park  " + "\n" + "       Traduccion: nosotros fuimos al parque "
                        + "\n" + "\n" + "  3) Tiempo participio: They will gone to the park" + "\n" + "       Traduccion: Ellas iran al parque ";

                this.setVisible(true);
                break;

            case "Grow":
                verboejemplo = "\n" + "  1) Tiempo infinitivo: This tree is about to grow " + "\n" + "       Traduccion: Este árbol está a punto de crecer"
                        + "\n" + "\n" + "  2) Tiempo pasado: This tree has already grew " + "\n" + "       Traduccion:Este árbol ya ha crecido"
                        + "\n" + "\n" + "  3) Tiempo participio: The tree will grown " + "\n" + "       Traduccion: El árbol crecerá  ";

                this.setVisible(true);
                break;

            case "Hang":
                verboejemplo = "\n" + "  1) Tiempo infinitivo: To hang the cell phone " + "\n" + "       Traduccion: Colgar el celular"
                        + "\n" + "\n" + "  2) Tiempo pasado: The hung the cell phone" + "\n" + "       Traduccion: El colgó el celular"
                        + "\n" + "\n" + "  3) Tiempo participio: The cell phone will hung up when the call ends  " + "\n" + "       Traduccion: El celular se colgará cuando finalice la llamada.  ";

                this.setVisible(true);
                break;

            case "Have":
                verboejemplo = "\n" + "  1) Tiempo infinitivo: You can't have a dog " + "\n" + "       Traduccion: No puedes tener un perro"
                        + "\n" + "\n" + "  2) Tiempo pasado: I have had a dog" + "\n" + "       Traduccion: yo he tenido un perro "
                        + "\n" + "\n" + "  3) Tiempo participio: They will had a dog" + "\n" + "       Traduccion: Ellas tendrán un perro   ";

                this.setVisible(true);
                break;

            case "Hear":
                verboejemplo = "\n" + "  1) Tiempo infinitivo: Hear music" + "\n" + "       Traduccion: Escuchar musica"
                        + "\n" + "\n" + "  2) Tiempo pasado: She Heard music" + "\n" + "       Traduccion: Ella escucho musica "
                        + "\n" + "\n" + "  3) Tiempo participio: She will heard to music " + "\n" + " Traduccion: Ella escuchará música  ";

                this.setVisible(true);
                break;

            case "Hide":
                verboejemplo = "\n" + "  1) Tiempo infinitivo: I'm going to hide my backpack  " + "\n" + "       Traduccion: Voy a esconder mi mochila"
                        + "\n" + "\n" + "  2) Tiempo pasado: They have hid my backpack" + "\n" + "       Traduccion: Ellos han escondido mi mochila "
                        + "\n" + "\n" + "  3) Tiempo participio: they have hidden my backpack  " + "\n" + "      Traduccion:han oculto  mi mochila ";

                this.setVisible(true);
                break;

            case "Hit":
                verboejemplo = "\n" + "  1) Tiempo infinitivo: i can hit the ball " + "\n" + "       Traduccion: puedo golpear la pelota"
                        + "\n" + "\n" + "  2) Tiempo pasado: they hit the ball " + "\n" + "       Traduccion:  Ellos golpearon la pelota "
                        + "\n" + "\n" + "  3) Tiempo participio: She thinks to hit the ball  " + "\n" + "      Traduccion:  Ella piensa golpear la pelota ";

                this.setVisible(true);
                break;

            case "Hold":
                verboejemplo = "\n" + "  1) Tiempo infinitivo: Can you hold my bag   " + "\n" + "       Traduccion: ¿Puedes sostener mi bolso?"
                        + "\n" + "\n" + "  2) Tiempo pasado: Has she held my purse? " + "\n" + "       Traduccion: ¿Ella a retenido mi bolso? "
                        + "\n" + "\n" + "  3) Tiempo participio: She gon 'held my bag  " + "\n" + "      Traduccion: Ella va a sostener mi bolso ";

                this.setVisible(true);
                break;

            case "Hurt":
                verboejemplo = "\n" + "  1) Tiempo infinitivo: The gun can hurt you " + "\n" + "       Traduccion: El arma puede lastimarte"
                        + "\n" + "\n" + "  2) Tiempo pasado: she can hurt you with the gun weapon  " + "\n" + "       Traduccion: Ella puede herirte con el arma arma  "
                        + "\n" + "\n" + "  3) Tiempo participio: they can hurt you with the gun  " + "\n" + "      Traduccion: pueden lastimarte con el arma ";

                this.setVisible(true);
                break;

            case "Keep":
                verboejemplo = "\n" + "  1) Tiempo infinitivo: I know I must keep a shovel " + "\n" + "       Traduccion: Se que debo mantener una pala"
                        + "\n" + "\n" + "  2) Tiempo pasado: I have kept a shovel " + "\n" + "       Traduccion: yo he mantenido  una pala  "
                        + "\n" + "\n" + "  3) Tiempo participio: we kept a shovel" + "\n" + "      Traduccion:  nosotros mantuvimos una pala ";

                this.setVisible(true);
                break;

            case "Know":
                verboejemplo = "\n" + "  1) Tiempo infinitivo: She may know what I think " + "\n" + "  Traduccion: Ella puede saber lo que pienso "
                        + "\n" + "\n" + "  2) Tiempo pasado:the  knew what I think  " + "\n" + "       Traduccion: El sabia lo que pienso   "
                        + "\n" + "\n" + "  3) Tiempo participio: She has known what I bought" + "\n" + "      Traduccion: Ella a conocido lo que compre ";

                this.setVisible(true);
                break;

            case "Lay":
                verboejemplo = "\n" + "  1) Tiempo infinitivo:I have to lay a plate on the table " + "\n" + "  Traduccion: Yo tengo que poner un plato sobre la mesa "
                        + "\n" + "\n" + "  2) Tiempo pasado: I should have laid a plate on the table  " + "\n" + "       Traduccion: Debí haber puesto un plato sobre la mesa"
                        + "\n" + "\n" + "  3) Tiempo participio: I shouldear have laid a plate on the table" + "\n" + "      Traduccion: Debería haber puesto un plato sobre la mesa ";

                this.setVisible(true);
                break;

            case "Leave":
                verboejemplo = "\n" + "  1) Tiempo infinitivo:he could to leave drinking " + "\n" + "  Traduccion: podría dejar de beber "
                        + "\n" + "\n" + "  2) Tiempo pasado: I should have laid a plate on the table  " + "\n" + "       Traduccion: Debí haber puesto un plato sobre la mesa"
                        + "\n" + "\n" + "  3) Tiempo participio: I shouldear have laid a plate on the table" + "\n" + "      Traduccion: Debería haber puesto un plato sobre la mesa ";

                this.setVisible(true);
                break;

            case "Lend":
                verboejemplo = "\n" + "  1) Tiempo infinitivo: She will lend me her slippers " + "\n" + "  Traduccion: Ella me va prestar sus zapatillas "
                        + "\n" + "\n" + "  2) Tiempo pasado: She lent me her slippers  " + "\n" + "       Traduccion: Ella me prestó sus zapatillas"
                        + "\n" + "\n" + "  3) Tiempo participio: She had lent me her slippers" + "\n" + "      Traduccion: Ella me habia prestado sus zapatillas";

                this.setVisible(true);
                break;

            case "Lie":
                verboejemplo = "\n" + "  1) Tiempo infinitivo: I can't lie " + "\n" + "  Traduccion: Ella me va prestar sus zapatillas "
                        + "\n" + "\n" + "  2) Tiempo pasado: we lie at work " + "\n" + "       Traduccion: nosotros mentimos en su trabajo"
                        + "\n" + "\n" + "  3) Tiempo participio: we have to lay on the work uniform " + "\n" + "      Traduccion: tenemos que ponernos el uniforme de trabajo";

                this.setVisible(true);
                break;

            case "Lose":
                verboejemplo = "\n" + "  1) Tiempo infinitivo: He had to lose in the game " + "\n" + "  Traduccion: A el le toco perder en el juego "
                        + "\n" + "\n" + "  2) Tiempo pasado: They have lost their patience " + "\n" + "       Traduccion: Ellos han perdido la paciencia"
                        + "\n" + "\n" + "  3) Tiempo participio: They have to lost their patience " + "\n" + "      Traduccion: Tienen que perder la paciencia";

                this.setVisible(true);
                break;

            case "Make":
                verboejemplo = "\n" + "  1) Tiempo infinitivo: He is going to make a house " + "\n" + "Traduccion: El va hacer una casa "
                        + "\n" + "\n" + "  2) Tiempo pasado:He has made a cut inside the house  " + "\n" + "Traduccion:El se ha hecho un  corte dentro de la casa "
                        + "\n" + "\n" + "  3) Tiempo participio: They have to made their house  " + "\n" + "      Traduccion: Ellos tienen que hacer su casa";

                this.setVisible(true);
                break;

            case "Mean":
                verboejemplo = "\n" + "  1) Tiempo infinitivo: This teddy bear can mean a lot to her  " + "\n" + " Traduccion: Este osito de peluche puede significar mucho para ella  "
                        + "\n" + "\n" + "  2) Tiempo pasado: The teddy bear meant a lot to her  " + "\n" + "       Traduccion: El osito de peluche significo mucho para ella  "
                        + "\n" + "\n" + "  3) Tiempo participio: a teddy bear meant a lot to her " + "\n" + "      Traduccion: un osito de peluche significaba mucho para ella ";

                this.setVisible(true);
                break;

            case "Meet":
                verboejemplo = "\n" + "  1) Tiempo infinitivo: She is going to meet someone at home  " + "\n" + " Traduccion: Ella se va a encontrar con alguien en casa  "
                        + "\n" + "\n" + "  2) Tiempo pasado: We met a very beautiful city  " + "\n" + "       Traduccion: We met a very beautiful city  "
                        + "\n" + "\n" + "  3) Tiempo participio: We met a state in Mexico " + "\n" + "      Traduccion: conocimos un estado en mexico  ";

                this.setVisible(true);
                break;

            case "Pay":
                verboejemplo = "\n" + "  1) Tiempo infinitivo: I have to pay for the electricity  " + "\n" + " Traduccion: Tengo que pagar la luz  "
                        + "\n" + "\n" + "  2) Tiempo pasado: They have paid for the light " + "\n" + "       Traduccion: Ellos han pagado por la luz  "
                        + "\n" + "\n" + "  3) Tiempo participio: They should have paid for the light  " + "\n" + "      Traduccion: Ellas deberían haber pagado la luz  ";

                this.setVisible(true);
                break;

            case "Put":
                verboejemplo = "\n" + "  1) Tiempo infinitivo: I'm going to put my backpack in the car  " + "\n" + " Traduccion: Voy a poner mi mochila en el auto  "
                        + "\n" + "\n" + "  2) Tiempo pasado: He should put my backpack in the car " + "\n" + "       Traduccion:El debía poner mi mochila en el carro  "
                        + "\n" + "\n" + "  3) Tiempo participio: They had to put my backpack in the trunk of the car " + "\n" + "      Traduccion: Ellos tuvieron que poner mi mochila en el maletero del auto  ";

                this.setVisible(true);
                break;

            case "Read":
                verboejemplo = "\n" + "  1) Tiempo infinitivo: I'm going to read a book  " + "\n" + " Traduccion:Yo voy a leer un libro  "
                        + "\n" + "\n" + "  2) Tiempo pasado: He will have to read my book  " + "\n" + "       Traduccion:El tendra que  leer mi libro  "
                        + "\n" + "\n" + "  3) Tiempo participio: we read a text  " + "\n" + "      Traduccion: nosotros leimos un texto  ";

                this.setVisible(true);
                break;

            case "Ride":
                verboejemplo = "\n" + "  1) Tiempo infinitivo: I'm going to ride a horse  " + "\n" + " Traduccion: Yo voy a montar un caballo  "
                        + "\n" + "\n" + "  2) Tiempo pasado: he rode a horse on the ranch  " + "\n" + " Traduccion: El montó a caballo en el rancho  "
                        + "\n" + "\n" + "  3) Tiempo participio: he spent it  ridden the horse " + "\n" + " Traduccion: Se lo pasó montando a caballo";

                this.setVisible(true);
                break;

            case "Ring":
                verboejemplo = "\n" + "  1) Tiempo infinitivo: I'm going to ring my mom  " + "\n" + " Traduccion: Voy a llamar a mi mamá  "
                        + "\n" + "\n" + "  2) Tiempo pasado: He rang my mom  " + "\n" + "Traduccion:El llamó a mi mamá "
                        + "\n" + "\n" + "  3) Tiempo participio: llamó a mi mamá desde su celular " + "\n" + "      Traduccion:  ";

                this.setVisible(true);
                break;

            case "Rise":
                verboejemplo = "\n" + "  1) Tiempo infinitivo: I'm going rise my tools  " + "\n" + " Traduccion: Voy a levantar mis herramientas "
                        + "\n" + "\n" + "  2) Tiempo pasado: He rose my tools   " + "\n" + "       Traduccion:El levantó mis herramientas  "
                        + "\n" + "\n" + "  3) Tiempo participio: He will risen my tools " + "\n" + "      Traduccion: Él levantará mis herramientas ";

                this.setVisible(true);
                break;

            case "Run":
                verboejemplo = "\n" + "  1) Tiempo infinitivo: I run to the supermarket because I have no food " + "\n" + "       Traduccion: Corro al supermercado porque no tengo comida"
                        + "\n" + "\n" + "  2) Tiempo pasado: I ran to the supermarket because I have no food" + "\n" + "       Traduccion: Corri al supermercado porque no tengo comida"
                        + "\n" + "\n" + "  3) Tiempo participio: I have run to the supermarket because I have no food" + "\n" + "       Traduccion: He corrido al supermercado porque no tengo comida";

                this.setVisible(true);
                break;

            case "Say":
                verboejemplo = "\n" + "  1) Tiempo infinitivo: I say we better go to the movies" + "\n" + "       Traduccion: yo digo que mejor vayamos al cine"
                        + "\n" + "\n" + "  2) Tiempo pasado: I said we better go to the movies" + "\n" + "       Traduccion: yo dije que mejor vayamos al cine"
                        + "\n" + "\n" + "  3) Tiempo participio: I have said we better go to the movies" + "\n" + "       Traduccion: yo he dicho que mejor vayamos al cine";

                this.setVisible(true);
                break;

            case "See":
                verboejemplo = "\n" + "  1) Tiempo infinitivo: I see a spider in my bathroom " + "\n" + "       Traduccion: veo una araña en mi baño"
                        + "\n" + "\n" + "  2) Tiempo pasado: I saw a spider in my bathroom" + "\n" + "       Traduccion: vi una araña en mi baño"
                        + "\n" + "\n" + "  3) Tiempo participio: I have seen a spider in my bathroom" + "\n" + "       Traduccion: He visto una araña en mi baño";

                this.setVisible(true);
                break;

            case "Sell":
                verboejemplo = "\n" + "  1) Tiempo infinitivo: My friend Pablo sells his toys to buy a video game " + "\n" + "       Traduccion: Mi amigo Pablo vende sus juguetes para comprar un videojuego"
                        + "\n" + "\n" + "  2) Tiempo pasado: My friend Pablo sold his toys to buy a video game" + "\n" + "       Traduccion: Mi amigo Pablo vendió sus juguetes para comprar un videojuego"
                        + "\n" + "\n" + "  3) Tiempo participio: My friend Pablo have sold his toys to buy a video game" + "\n" + "       Traduccion: Mi amigo Pablo ha vendido sus juguetes para comprar un videojuego";

                this.setVisible(true);
                break;

            case "Send":
                verboejemplo = "\n" + "  1) Tiempo infinitivo: You send this message by email" + "\n" + "       Traduccion: Envía este mensaje por correo electrónico"
                        + "\n" + "\n" + "  2) Tiempo pasado: You sent this message by email" + "\n" + "       Traduccion: Envíaste este mensaje por correo electrónico"
                        + "\n" + "\n" + "  3) Tiempo participio: You have sent this message by email" + "\n" + "       Traduccion: Has enviado este mensaje por correo electrónico";

                this.setVisible(true);
                break;

            case "Shake":
                verboejemplo = "\n" + "  1) Tiempo infinitivo: My boss shakes my hand at work " + "\n" + "       Traduccion: Mi jefa estrecha mi mano en el trabajo"
                        + "\n" + "\n" + "  2) Tiempo pasado: My boss shook my hand at work" + "\n" + "       Traduccion: Mi jefa estrecho mi mano en el trabajo"
                        + "\n" + "\n" + "  3) Tiempo participio: My boss have shaken my hand at work" + "\n" + "       Traduccion: Mi jefa ha estrechado mi mano en el trabajo";

                this.setVisible(true);
                break;

            case "Shoot":
                verboejemplo = "\n" + "  1) Tiempo infinitivo: You shoot moving targets " + "\n" + "       Traduccion: Disparas a los objetivos en movimiento"
                        + "\n" + "\n" + "  2) Tiempo pasado: You shoot moving targets" + "\n" + "       Traduccion: Disparaste a los objetivos en movimiento"
                        + "\n" + "\n" + "  3) Tiempo participio: You have shoot moving targets" + "\n" + "       Traduccion: Has disparado a los objetivos en movimiento";

                this.setVisible(true);
                break;

            case "Show":
                verboejemplo = "\n" + "  1) Tiempo infinitivo: They show their favorite movie in class " + "\n" + "       Traduccion: Ellos muestran su película favorita en clase"
                        + "\n" + "\n" + "  2) Tiempo pasado: They showed their favorite movie in class" + "\n" + "       Traduccion: Ellos mostraron su película favorita en clase"
                        + "\n" + "\n" + "  3) Tiempo participio: They have shown their favorite movie in class" + "\n" + "       Traduccion: Ellos han mostrado su película favorita en clase";

                this.setVisible(true);
                break;

            case "Shut":
                verboejemplo = "\n" + "  1) Tiempo infinitivo: I shut the door of my house with a padlock " + "\n" + "       Traduccion: Cierro la puerta de mi casa con candado"
                        + "\n" + "\n" + "  2) Tiempo pasado: I shut the door of my house with a padlock last time" + "\n" + "       Traduccion: Cerré la puerta de mi casa con candado la última vez"
                        + "\n" + "\n" + "  3) Tiempo participio: I have shut the door of my house with a padlock" + "\n" + "       Traduccion: He cerrado la puerta de mi casa con candado";

                this.setVisible(true);
                break;

            case "Sing":
                verboejemplo = "\n" + "  1) Tiempo infinitivo: Alessia sings like a professional" + "\n" + "       Traduccion: Alessia canta como una profesional"
                        + "\n" + "\n" + "  2) Tiempo pasado: Alessia sang like a professional" + "\n" + "       Traduccion: Alessia canto como una profesional"
                        + "\n" + "\n" + "  3) Tiempo participio: Alessia has sung like a professional" + "\n" + "       Traduccion: Alessia ha cantado como una profesional";

                this.setVisible(true);
                break;

            case "Sink":
                verboejemplo = "\n" + "  1) Tiempo infinitivo: Venezuela sinks due to corruption " + "\n" + "       Traduccion: Venezuela se hunde debido a la corrupcion"
                        + "\n" + "\n" + "  2) Tiempo pasado: Venezuela sank due to corruption" + "\n" + "       Traduccion: Venezuela se hundio debido a la corrupcion"
                        + "\n" + "\n" + "  3) Tiempo participio: Venezuela have sunk due to corruption" + "\n" + "       Traduccion: Venezuela ha hundido debido a la corrupcion";

                this.setVisible(true);
                break;

            case "Sit":
                verboejemplo = "\n" + "  1) Tiempo infinitivo: We sit together at lunch " + "\n" + "       Traduccion: Nos sentamos juntos en el almuerzo"
                        + "\n" + "\n" + "  2) Tiempo pasado: We sat together at lunch yesterday" + "\n" + "       Traduccion: Nos sentamos juntos en el almuerzo ayer"
                        + "\n" + "\n" + "  3) Tiempo participio: We have sat together at lunch" + "\n" + "       Traduccion: Nos hemos sentado juntos en el almuerzo";

                this.setVisible(true);
                break;

            case "Sleep":
                verboejemplo = "\n" + "  1) Tiempo infinitivo: He sleeps in math class" + "\n" + "       Traduccion: El se duerme en la clase de matematicas"
                        + "\n" + "\n" + "  2) Tiempo pasado: He sleept in math class" + "\n" + "       Traduccion: El se durmio en la clase de matematicas"
                        + "\n" + "\n" + "  3) Tiempo participio: He has sleept in math class" + "\n" + "       Traduccion: El se ha dormido en la clase de matematicas";

                this.setVisible(true);
                break;

            case "Speak":
                verboejemplo = "\n" + "  1) Tiempo infinitivo: His mother speaks english with my brother " + "\n" + "       Traduccion: Su madre habla ingles con mi hermano"
                        + "\n" + "\n" + "  2) Tiempo pasado: His mother spoke english with my brother" + "\n" + "       Traduccion: Su madre hablaba ingles con mi hermano"
                        + "\n" + "\n" + "  3) Tiempo participio: His mother has spoken english with my brother" + "\n" + "       Traduccion: Su madre ha hablado ingles con mi hermano";

                this.setVisible(true);
                break;

            case "Spend":
                verboejemplo = "\n" + "  1) Tiempo infinitivo: Vanessa spend time with her family" + "\n" + "       Traduccion: Vanessa pasa tiempo con su familia"
                        + "\n" + "\n" + "  2) Tiempo pasado: Vanessa spent time with her family" + "\n" + "       Traduccion: Vanessa paso tiempo con su familia"
                        + "\n" + "\n" + "  3) Tiempo participio: Vanessa have spent time with her family" + "\n" + "       Traduccion: Vanessa ha pasado tiempo con su familia";

                this.setVisible(true);
                break;

            case "Stand":
                verboejemplo = "\n" + "  1) Tiempo infinitivo: The people stand when the president came in " + "\n" + "       Traduccion: La gente se para cuando el presidente entró"
                        + "\n" + "\n" + "  2) Tiempo pasado: The people stood when the president came in" + "\n" + "       Traduccion: La gente se paró cuando el presidente entró"
                        + "\n" + "\n" + "  3) Tiempo participio: The people have stood when the president came in" + "\n" + "       Traduccion: La gente se ha parado cuando el presidente entró";

                this.setVisible(true);
                break;

            case "Steal":
                verboejemplo = "\n" + "  1) Tiempo infinitivo: The robbers steal everything I have" + "\n" + "       Traduccion: Los ladrones roban todo lo que tengo"
                        + "\n" + "\n" + "  2) Tiempo pasado: The robbers stole everything I had" + "\n" + "       Traduccion: Los ladrones robaron todo lo que tenía"
                        + "\n" + "\n" + "  3) Tiempo participio: The robbers have stolen everything I had" + "\n" + "       Traduccion: Los ladrones han robado todo lo que tenía";

                this.setVisible(true);
                break;

            case "Strike":
                verboejemplo = "\n" + "  1) Tiempo infinitivo: The boxer strike his opponent very hard " + "\n" + "       Traduccion: El boxeador le pega muy fuerte a su contrincante"
                        + "\n" + "\n" + "  2) Tiempo pasado: The boxer struck his opponent very hard" + "\n" + "       Traduccion: El boxeador le pegó muy fuerte a su contrincante"
                        + "\n" + "\n" + "  3) Tiempo participio: The boxer have strike his opponent very hard" + "\n" + "       Traduccion: El boxeador le ha pegado muy fuerte a su contrincante";

                this.setVisible(true);
                break;

            case "Swim":
                verboejemplo = "\n" + "  1) Tiempo infinitivo: Ducks swim near the shore of the lake " + "\n" + "       Traduccion: Los patos nadan cerca de la orilla del lago"
                        + "\n" + "\n" + "  2) Tiempo pasado: Ducks swam near the shore of the lake" + "\n" + "       Traduccion: Los patos nadaron cerca de la orilla del lago"
                        + "\n" + "\n" + "  3) Tiempo participio: Ducks have swum near the shore of the lake" + "\n" + "       Traduccion: Los patos han nadado cerca de la orilla del lago";

                this.setVisible(true);
                break;

            case "Take":
                verboejemplo = "\n" + "  1) Tiempo infinitivo: She take me by the hand in the park" + "\n" + "       Traduccion: Ella me toma de la mano en el parque"
                        + "\n" + "\n" + "  2) Tiempo pasado: She took me by the hand in the park" + "\n" + "       Traduccion: Ella me tomó de la mano en el parque"
                        + "\n" + "\n" + "  3) Tiempo participio: She have taken me by the hand in the park" + "\n" + "       Traduccion: Ella me ha tomado de la mano en el parque";

                this.setVisible(true);
                break;

            case "Teach":
                verboejemplo = "\n" + "  1) Tiempo infinitivo: I teach Spanish at the local community college " + "\n" + "       Traduccion: Yo enseño español en la universidad comunitaria local"
                        + "\n" + "\n" + "  2) Tiempo pasado: I taught Spanish at the local community college" + "\n" + "       Traduccion: Yo enseñe español en la universidad comunitaria local"
                        + "\n" + "\n" + "  3) Tiempo participio: I have taught Spanish at the local community college" + "\n" + "       Traduccion: Yo he enseñado español en la universidad comunitaria local";

                this.setVisible(true);
                break;

            case "Tear":
                verboejemplo = "\n" + "  1) Tiempo infinitivo: He tear the letter in half " + "\n" + "       Traduccion: El rompe la carta por la mitad"
                        + "\n" + "\n" + "  2) Tiempo pasado: He tore the letter in half" + "\n" + "       Traduccion: El rompió la carta por la mitad"
                        + "\n" + "\n" + "  3) Tiempo participio: He have torn the letter in half" + "\n" + "       Traduccion: El ha rompido la carta por la mitad";

                this.setVisible(true);
                break;

            case "Tell":
                verboejemplo = "\n" + "  1) Tiempo infinitivo: Your cousin tell me she have a brother " + "\n" + "       Traduccion: Tu prima me dice que tiene un hermano"
                        + "\n" + "\n" + "  2) Tiempo pasado: Your cousin told me she have a brother " + "\n" + "       Traduccion: Tu prima me dijo que tiene un hermano"
                        + "\n" + "\n" + "  3) Tiempo participio: Your cousin has told me she have a brother " + "\n" + "       Traduccion: Tu prima me ha dicho que tiene un hermano";

                this.setVisible(true);
                break;

            case "Think":
                verboejemplo = "\n" + "  1) Tiempo infinitivo: I think you said it as a joke " + "\n" + "       Traduccion: Yo pienso que lo dijiste de broma"
                        + "\n" + "\n" + "  2) Tiempo pasado: I thought you said it as a joke" + "\n" + "       Traduccion: Yo pensé que lo dijiste de broma"
                        + "\n" + "\n" + "  3) Tiempo participio: I have thought you said it as a joke" + "\n" + "       Traduccion: Yo he pensado que lo dijiste de broma";

                this.setVisible(true);
                break;

            case "Throw":
                verboejemplo = "\n" + "  1) Tiempo infinitivo: At least I throw my trash in the trash can " + "\n" + "       Traduccion: Al menos tiro mi basura en el bote de basura"
                        + "\n" + "\n" + "  2) Tiempo pasado: At least I threw my trash in the trash can" + "\n" + "       Traduccion: Al menos tire mi basura en el bote de basura"
                        + "\n" + "\n" + "  3) Tiempo participio: At least I have thrown my trash in the trash can" + "\n" + "       Traduccion: Al menos he tirado mi basura en el bote de basura";

                this.setVisible(true);
                break;

            case "Understand":
                verboejemplo = "\n" + "  1) Tiempo infinitivo: Mario understands your Mayan lenguage" + "\n" + "       Traduccion: Mario entiende tu lengua maya"
                        + "\n" + "\n" + "  2) Tiempo pasado: Mario understood your Mayan lenguage" + "\n" + "       Traduccion: Mario entendio tu lengua maya"
                        + "\n" + "\n" + "  3) Tiempo participio: Mario have understood your Mayan lenguage" + "\n" + "       Traduccion: Mario ha entendido tu lengua maya";

                this.setVisible(true);
                break;

            case "Wear":
                verboejemplo = "\n" + "  1) Tiempo infinitivo: You always wear a sweater even in summer " + "\n" + "       Traduccion: Siempre usas un suéter incluso en verano"
                        + "\n" + "\n" + "  2) Tiempo pasado: You always wore a sweater even in summer" + "\n" + "       Traduccion: Siempre usaste un suéter incluso en verano"
                        + "\n" + "\n" + "  3) Tiempo participio: You always have worn a sweater even in summer" + "\n" + "       Traduccion: Siempre has usado un suéter incluso en verano";

                this.setVisible(true);
                break;

            case "Win":
                verboejemplo = "\n" + "  1) Tiempo infinitivo: I win a car in a raffle at work " + "\n" + "       Traduccion: Me gano un auto en una rifa del trabajo"
                        + "\n" + "\n" + "  2) Tiempo pasado: I won a car in a raffle at work" + "\n" + "       Traduccion: Me gane un auto en una rifa del trabajo"
                        + "\n" + "\n" + "  3) Tiempo participio: I have won a car in a raffle at work" + "\n" + "       Traduccion: Me he ganado un auto en una rifa del trabajo";

                this.setVisible(true);
                break;

            case "Write":
                verboejemplo = "\n" + "  1) Tiempo infinitivo: I write a book about programming " + "\n" + "       Traduccion: Yo escribo un libro sobre programación"
                        + "\n" + "\n" + "  2) Tiempo pasado: I wrote a book about programming " + "\n" + "       Traduccion: Yo escribi un libro sobre programación"
                        + "\n" + "\n" + "  3) Tiempo participio: I written a book about programming " + "\n" + "       Traduccion: Yo he escribido un libro sobre programación";

                this.setVisible(true);
                break;

            default:

                JOptionPane.showMessageDialog(null, "Lo sentimos, debes ingresar un verbo que este dentro de la lista, " + "\n"
                        + "Asegurese de haberlo escrito correctamente", "¡Error!", 0);
                this.setVisible(false);
                break;
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == cerrar) {

            this.setVisible(false);
        }
    }
}
