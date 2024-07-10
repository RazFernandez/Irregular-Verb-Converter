package ProyectoProgramacion;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Juego extends javax.swing.JFrame implements ActionListener {

    protected JButton opcion1, opcion2, opcion3, siguiente, cerrar, reiniciar;
    protected String verbo, tiempo, fila, columna, oracion;
    protected JTextArea areaEjercicio;
    protected JScrollPane Scroll;
    protected JLabel Score, respuesta;
    protected int Puntaje = 0, Contador = 1;

    public Juego() {
        setLayout(null);
        setTitle("Ejercicio n°" + Contador);
        getContentPane().setBackground(new Color(51, 107, 255));

        juegoMatriz matriz = new juegoMatriz();
        matriz.generarVerbo();
        verbo = matriz.obtenerVerbo();

        matriz.generarTiempo();
        tiempo = matriz.obtenerTiempo();

        opcion1 = new JButton("");
        opcion1.setBounds(45, 150, 100, 30);
        add(opcion1);
        opcion1.addActionListener(this);

        opcion2 = new JButton("");
        opcion2.setBounds(175, 150, 100, 30);
        add(opcion2);
        opcion2.addActionListener(this);

        opcion3 = new JButton("");
        opcion3.setBounds(305, 150, 100, 30);
        add(opcion3);
        opcion3.addActionListener(this);

        siguiente = new JButton("Siguiente");
        siguiente.setBounds(305, 200, 100, 30);
        siguiente.setEnabled(false);
        add(siguiente);
        siguiente.addActionListener(this);

        reiniciar = new JButton("Reiniciar");
        reiniciar.setBounds(45, 200, 100, 30);
        reiniciar.setEnabled(false);
        reiniciar.setVisible(false);
        add(reiniciar);
        reiniciar.addActionListener(this);

        cerrar = new JButton("Cerrar");
        cerrar.setBounds(305, 200, 100, 30);
        cerrar.setEnabled(false);
        cerrar.setVisible(false);
        add(cerrar);
        cerrar.addActionListener(this);

        areaEjercicio = new JTextArea(oracion);
        Scroll = new JScrollPane(areaEjercicio);
        areaEjercicio.setForeground(new Color(0, 0, 0));
        areaEjercicio.setFont(new Font("Andale Mono", 1, 14));
        areaEjercicio.setEditable(false);
        Scroll.setBounds(45, 75, 360, 45);
        add(Scroll);

        Score = new JLabel("Puntaje: " + Puntaje + "/10");
        Score.setBounds(310, 25, 400, 30);
        Score.setForeground(new Color(255, 255, 255));
        Score.setFont(new Font("Univers", 1, 14));
        add(Score);

        respuesta = new JLabel("");
        respuesta.setBounds(25, 25, 400, 30);
        respuesta.setForeground(new Color(255, 255, 255));
        respuesta.setFont(new Font("Univers", 1, 14));
        respuesta.setVisible(true);
        add(respuesta);

        setOracion();
        /*
        juegoEjercicios ejercicio = new juegoEjercicios();
        ejercicio.setOracion();
         */
    }

    public void setOracion() {

        switch (verbo) {

            case "Be":
                opcion1.setText("Be");
                opcion2.setText("Was/were");
                opcion3.setText("Been");

                switch (tiempo) {
                    case "Be":
                        oracion = "I __ an student";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Was/were":
                        oracion = "I __ a cop last year";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Been":
                        oracion = "I have __ in Paris";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break; // Evita que se siga ejecutando este caso para el switch
            //Aca me quede xd
            case "Beat":
                opcion1.setText("Beat");
                opcion2.setText("Bet");
                opcion3.setText("Beaten");

                switch (tiempo) {
                    case "Beat":
                        oracion = "I will __ my old record";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Beaten":
                        oracion = "The red team has __ the blue team at baseball";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;

            case "Become":
                opcion1.setText("Become");
                opcion2.setText("Became");
                opcion3.setText("Because");

                switch (tiempo) {
                    case "Become":
                        oracion = "The caterpillar __________ a moth";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Became":
                        oracion = "His grandparents _______ older";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;

            case "Begin":
                opcion1.setText("Begin");
                opcion2.setText("Began");
                opcion3.setText("Begun");

                switch (tiempo) {
                    case "Begin":
                        oracion = "I ______ in my job in 2015";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Began":
                        oracion = "The teacher _____ the lesson five minutes earlier";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Begun":
                        oracion = "Mike has already _____ writing an essay";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;

            case "Bend":
                opcion1.setText("Bend");
                opcion2.setText("Bent");
                opcion3.setText("Always");

                switch (tiempo) {
                    case "Bend":
                        oracion = "The machine ______ the metal bar at a sharp angle ";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Bent":
                        oracion = "The storm _____ the tree to the ground";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;

            case "Bite":
                opcion1.setText("Bite");
                opcion2.setText("Bit");
                opcion3.setText("Bitten");

                switch (tiempo) {
                    case "Bite":
                        oracion = "Does your dog ______?";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Bit":
                        oracion = "The neighbors´dog ____ me";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Bitten":
                        oracion = "He was _____ by a dog";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;

            case "Blow":
                opcion1.setText("Blow");
                opcion2.setText("Blew");
                opcion3.setText("Blown");

                switch (tiempo) {
                    case "Blow":
                        oracion = "The winter wind _______ from the west";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Blew":
                        oracion = "The wind ____ his hat off";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Blown":
                        oracion = "You have ______";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;

            case "Break":
                opcion1.setText("Break");
                opcion2.setText("Broke");
                opcion3.setText("Broken");

                switch (tiempo) {
                    case "Break":
                        oracion = "Be careful! Don´t _____ the vase";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Broke":
                        oracion = "The kid fell off the tree and ______ his arm";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Broken":
                        oracion = "We can´t use our microwave because it is ______";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;

            case "Bring":
                opcion1.setText("Bring");
                opcion2.setText("Brought");
                opcion3.setText("Pencil");

                switch (tiempo) {
                    case "Bring":
                        oracion = "______ me the newspaper Buddy!";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Brought":
                        oracion = "Astronauts ________ back a piece of the moon";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;

            case "Build":
                opcion1.setText("Build");
                opcion2.setText("Built");
                opcion3.setText("Apple");

                switch (tiempo) {
                    case "Build":
                        oracion = "The construction company ______ the house in two month";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Built":
                        oracion = "The survivors _____ a raft and were able to get to the shore";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;

            case "Buy":
                opcion1.setText("Buy");
                opcion2.setText("Bought");
                opcion3.setText("Circle");

                switch (tiempo) {
                    case "Buy":
                        oracion = "I will ____ a new car";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Bought":
                        oracion = "The old lady was feeling lonely so she _______ a dog";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;

            case "Catch":
                opcion1.setText("Catch");
                opcion2.setText("Caught");
                opcion3.setText("Book");

                switch (tiempo) {
                    case "Catch":
                        oracion = "Jason _____ her by the waist";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Caught":
                        oracion = "You have been ______ in the trap of the adversary";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;

            case "Choose":
                opcion1.setText("Choose");
                opcion2.setText("Chose");
                opcion3.setText("Chosen");

                switch (tiempo) {
                    case "Choose":
                        oracion = "You have to _______ your way!";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Chose":
                        oracion = "She _____ the most beautiful dress in the shop and bought it";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Chosen":
                        oracion = "Mr. Jones was _____ as executive director of the company";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;

            case "Come":
                opcion1.setText("Come");
                opcion2.setText("Came");
                opcion3.setText("Three");

                switch (tiempo) {
                    case "Come":
                        oracion = "______ here and taste my punch!";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Came":
                        oracion = "She is feeling sad because nobody ______ to her party last night";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;

            case "Cost":
                opcion1.setText("Cost");
                opcion2.setText("Eyes");
                opcion3.setText("Finger");

                switch (tiempo) {
                    case "Cost":
                        oracion = "All of the rides at the fair ______ a dollar";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;

            case "Cut":
                opcion1.setText("Cut");
                opcion2.setText("Eyes");
                opcion3.setText("Cuted");

                switch (tiempo) {
                    case "Cut":
                        oracion = "She _____ the string and open the package";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;

            case "Do":
                opcion1.setText("Do");
                opcion2.setText("Did");
                opcion3.setText("Done");

                switch (tiempo) {
                    case "Do":
                        oracion = "We should ___ something to help homeless people";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Did":
                        oracion = "The doctors ___ everything they could to save the patient";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Done":
                        oracion = "You ______ a fantastic job on the last Project";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;

            case "Draw":
                opcion1.setText("Draw");
                opcion2.setText("Drew");
                opcion3.setText("Drawn");

                switch (tiempo) {
                    case "Draw":
                        oracion = "Sometimes I ____ sketches";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Drew":
                        oracion = "I ____ a sketch of my plane last night";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Drawn":
                        oracion = "I have just ______ a sketch of my plane";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;

            case "Drink":
                opcion1.setText("Drink");
                opcion2.setText("Drank");
                opcion3.setText("Drunk");

                switch (tiempo) {
                    case "Drink":
                        oracion = "He ______  beer upon beer";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Drank":
                        oracion = "She ______ two glasses of wine at the party";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Drunk":
                        oracion = "She has not _____ beer since yesterday";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;

            case "Drive":
                opcion1.setText("Drive");
                opcion2.setText("Drove");
                opcion3.setText("Driven");

                switch (tiempo) {
                    case "Drive":
                        oracion = "We ______ around the island, enjoying its tropical landscape";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Drove":
                        oracion = "Yesterday Juan drove drunk and almost had an accident\n";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Driven":
                        oracion = "The truck driver has ______ the whole night and now he is exhausted";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;

            case "Eat":
                opcion1.setText("Eat");
                opcion2.setText("Ate");
                opcion3.setText("Eaten");

                switch (tiempo) {
                    case "Eat":
                        oracion = "We _____ some eggs with our breakfast";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Ate":
                        oracion = "They _____ chiken and rice for dinner";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Eaten":
                        oracion = "I had not _____ since Tuesday";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;

            case "Fall":
                opcion1.setText("Fall");
                opcion2.setText("Fell");
                opcion3.setText("Fallen");

                switch (tiempo) {
                    case "Fall":
                        oracion = "I _____ from the stairs";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Fell":
                        oracion = "She was riding her bike when she _______";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Fallen":
                        oracion = "The temperature has _____ sharply";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;

            case "Feel":
                opcion1.setText("Feel");
                opcion2.setText("Felt");
                opcion3.setText("Filt");

                switch (tiempo) {
                    case "Feel":
                        oracion = "We _____ good! Nobody can get us down!";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Felt":
                        oracion = "Susan ____ very sad when her cat died";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;

            case "Fight":
                opcion1.setText("Fight");
                opcion2.setText("Fought");
                opcion3.setText("Can");

                switch (tiempo) {
                    case "Fight":
                        oracion = "The boxers ______ each other for half an hour in the world championship";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Fought":
                        oracion = "He _______ at the Battle of Saratoga and was wounded";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;

            case "Find":
                opcion1.setText("Find");
                opcion2.setText("Found");
                opcion3.setText("Sad");

                switch (tiempo) {
                    case "Find":
                        oracion = "I can´t ____ my wallet. Have you seen it?";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Found":
                        oracion = "A dead whale was _____ on the shore";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;

            case "Forget":
                opcion1.setText("Forget");
                opcion2.setText("Forgot");
                opcion3.setText("Forgotten");

                switch (tiempo) {
                    case "Forget":
                        oracion = "I _____ to wash the clothes";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Forgot":
                        oracion = "Godzilla never _______ the anger he felt at that time";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Forgotten":
                        oracion = "I´ve _________ a lot of things in my life";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;

            case "Forgive":
                opcion1.setText("Forgive");
                opcion2.setText("Forgave");
                opcion3.setText("Forgiven");

                switch (tiempo) {
                    case "Forgive":
                        oracion = "I _______ her one and one thousand times";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Forgave":
                        oracion = "The novelist never __________ his parents for their treatment";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Forgiven":
                        oracion = "You´ve been a naughty boy, but now all is _________";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;

            case "Freeze":
                opcion1.setText("Freeze");
                opcion2.setText("Froze");
                opcion3.setText("Frozen");

                switch (tiempo) {
                    case "Freeze":
                        oracion = "The scientist _______ methane for an experiment";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Froze":
                        oracion = "The moment he walked in and saw me, he ________";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Frozen":
                        oracion = "The rivers are so ________, you can skate on them";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;

            case "Get":
                opcion1.setText("Get");
                opcion2.setText("Got");
                opcion3.setText("Gotten");

                switch (tiempo) {
                    case "Get":
                        oracion = "People who __ fired get compensated.";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Got":
                        oracion = "you __ it!, you have understood the homework";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;

            case "Give":
                opcion1.setText("Give");
                opcion2.setText("Gave");
                opcion3.setText("Given");

                switch (tiempo) {
                    case "Give":
                        oracion = "I'm going to __ you a hug";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Gave":
                        oracion = "Ultimately, the Army __ him respectability.";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Given":
                        oracion = "Children are __ priority under the programme.";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;
            case "Go":
                opcion1.setText("Go");
                opcion2.setText("Went");
                opcion3.setText("Gone");

                switch (tiempo) {
                    case "Go":
                        oracion = "So my mindset was __.";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Went":
                        oracion = "You sister __ to the beach yerterday";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Gone":
                        oracion = "They entered after the diamonds were __";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;

            case "Grow":
                opcion1.setText("Grow");
                opcion2.setText("Grew");
                opcion3.setText("Grown");

                switch (tiempo) {
                    case "Grow":
                        oracion = "When I __ up, I want to be a doctor";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Grew":
                        oracion = "A community __ around this train stop.";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Grown":
                        oracion = "The treaty system has __ unwieldy.";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;

            case "Hang":
                opcion1.setText("Hang");
                opcion2.setText("Hung");
                opcion3.setText("Hunging");

                switch (tiempo) {
                    case "Hang":
                        oracion = "Nowhere else to __ my hat.";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Hung":
                        oracion = "Mayor wants them __ in every precinct.";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;

            case "Have":
                opcion1.setText("Have");
                opcion2.setText("Had");
                opcion3.setText("Hadden");

                switch (tiempo) {
                    case "Have":
                        oracion = "I __ to do my homeworks";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Had":
                        oracion = "In Lebanon, ethnic strife __ grave consequences.";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;

            case "Hear":
                opcion1.setText("Hear");
                opcion2.setText("Heard");
                opcion3.setText("Hearding");

                switch (tiempo) {
                    case "Hear":
                        oracion = "I could __ Lant Street laughing.";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Heard":
                        oracion = "I __ Kim Jang-ok mention this person before.";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;

            case "Hide":
                opcion1.setText("Hide");
                opcion2.setText("Hid");
                opcion3.setText("Hidden");

                switch (tiempo) {
                    case "Hide":
                        oracion = "Don't __ you coward!";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Hid":
                        oracion = "The captain __ it somewhere on shore.";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Hidden":
                        oracion = "Recognize __ potential by analyzing customer profiles.";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;

            case "Hit":
                opcion1.setText("Hit");
                opcion2.setText("Hitting");
                opcion3.setText("Hiteng");

                switch (tiempo) {
                    case "Hit":
                        oracion = "Don't stop until you __ the target";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;

            case "Hold":
                opcion1.setText("Hold");
                opcion2.setText("Held");
                opcion3.setText("Held up");

                switch (tiempo) {
                    case "Hold":
                        oracion = "I intend to __ Charles Vane to account as promised.";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Held":
                        oracion = "Other courts have __ that no such hearing was required.";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;

            case "Hurt":
                opcion1.setText("Hurts");
                opcion2.setText("Hurtting");
                opcion3.setText("Hurt and");

                switch (tiempo) {
                    case "Hurt":
                        oracion = "It __ when a friend betrays you";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;

            case "Keep":
                opcion1.setText("Keep");
                opcion2.setText("kept");
                opcion3.setText("Kepting");

                switch (tiempo) {
                    case "Keep":
                        oracion = "__ calm and carry on";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Kept":
                        oracion = "We __ our childhood toys";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;

            case "Know":
                opcion1.setText("Know");
                opcion2.setText("Knew");
                opcion3.setText("Known");

                switch (tiempo) {
                    case "Know":
                        oracion = "Well, you must __ the stories.";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Knew":
                        oracion = "Agnes __ Richard all his life.";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Known":
                        oracion = "There is no __ specific antidote for azacitidine overdose.";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;

            case "Lay":
                opcion1.setText("Lay");
                opcion2.setText("Laid");
                opcion3.setText("Laying");

                switch (tiempo) {
                    case "Lay":
                        oracion = "Remove standing water where mosquitoes could __ eggs.";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Laid":
                        oracion = "Nobody's __ a finger on it.";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;

            case "Leave":
                opcion1.setText("Leave");
                opcion2.setText("Left");
                opcion3.setText("Letting");

                switch (tiempo) {
                    case "Leave":
                        oracion = "Life is too short to __ anything important unsaid.";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Left":
                        oracion = "I suppose you __ behind broken hearts.";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }

                break;
            case "Lend":
                opcion1.setText("Lend");
                opcion2.setText("Lent");
                opcion3.setText("Lending");

                switch (tiempo) {
                    case "Lend":
                        oracion = "Many stores will __ clothes for your show.";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Lent":
                        oracion = "No, l __ you 100 francs.";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;

            case "Lie":
                opcion1.setText("Lie");
                opcion2.setText("Lay");
                opcion3.setText("Lain");

                switch (tiempo) {
                    case "Lie":
                        oracion = "They __ as easily as breathe.";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Lay":
                        oracion = "But I can __ a wager on this chap.";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Lain":
                        oracion = "It must have __ or she will have become crazy.";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;

            case "Lose":
                opcion1.setText("lose");
                opcion2.setText("lost");
                opcion3.setText("losing");

                switch (tiempo) {
                    case "Lose":
                        oracion = "If I __ the game I will have to give away some Sodas";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Lost":
                        oracion = "I __ my database of his acquaintances";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;

            case "Make":
                opcion1.setText("Make");
                opcion2.setText("Made");
                opcion3.setText("Making");

                switch (tiempo) {
                    case "Make":
                        oracion = "we __ a tasty chocolate cake";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Made":
                        oracion = "This product was __ in china";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;

            case "Mean":
                opcion1.setText("Mean");
                opcion2.setText("Meant");
                opcion3.setText("Meaning");

                switch (tiempo) {
                    case "Mean":
                        oracion = "Inverter failures __ cost-intensive equipment damages.";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Meant":
                        oracion = "The flowers could have __ Copenhagen was a go.";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;

            case "Meet":
                opcion1.setText("Meet");
                opcion2.setText("Met");
                opcion3.setText("Metting");

                switch (tiempo) {
                    case "Meet":
                        oracion = "Supervision Groups will __ Saturday mornings.";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Met":
                        oracion = "Could have __ the caller there.";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;

            case "Pay":
                opcion1.setText("Pay");
                opcion2.setText("Paid");
                opcion3.setText("Paying");

                switch (tiempo) {
                    case "Pay":
                        oracion = "Tomorrow we'll __ everyone something on account.";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Paid":
                        oracion = "Voluntary contributions have been __ in full.";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;
            case "Put":
                opcion1.setText("Put");
                opcion2.setText("Putting");
                opcion3.setText("Puted");

                switch (tiempo) {
                    case "Put":
                        oracion = "We'll __ everything underneath a 2019 microscope.";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;
            case "Read":
                opcion1.setText("Read");
                opcion2.setText("Reading");
                opcion3.setText("Readed");

                switch (tiempo) {
                    case "Read":
                        oracion = "I just __ the book 'A Brave New World' by Jules Verne";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;

            case "Ride":
                opcion1.setText("Ride");
                opcion2.setText("Rode");
                opcion3.setText("Ridden");

                switch (tiempo) {
                    case "Ride":
                        oracion = "__ out with a picnic lunch every day.";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Rode":
                        oracion = "I __ an elephant in Bangkok last week.";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Ridden":
                        oracion = "I was __ around like a pony ";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;
            case "Ring":
                opcion1.setText("Ring");
                opcion2.setText("Rang");
                opcion3.setText("Rung");

                switch (tiempo) {
                    case "Ring":
                        oracion = "__ around, try and find him.";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Rang":
                        oracion = "__ Social Services and then I was gone, too.";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Rung":
                        oracion = "If you had __ my doorbell, probably I'd have been rude.";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;
            case "Rise":
                opcion1.setText("Rise");
                opcion2.setText("Rose");
                opcion3.setText("Risen");

                switch (tiempo) {
                    case "Rise":
                        oracion = "The __ and Fall of Bitcoin: Evaluating Digital Currency";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Rose":
                        oracion = "Our savior __ from the dead.";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Risen":
                        oracion = "Empires have ___ and fallen throughout history.";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;

            case "Run":
                opcion1.setText("Run");
                opcion2.setText("Ran");
                opcion3.setText("Runner");

                switch (tiempo) {
                    case "Run":
                        oracion = "I would like to go ___ to the park";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Ran":
                        oracion = "Looks like Pablo ___ away from the School last night";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;
            //Mi parte desde Say
            case "Say":
                opcion1.setText("Say");
                opcion2.setText("Said");
                opcion3.setText("Saided");

                switch (tiempo) {
                    case "Say":
                        oracion = "They __ they like cats";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Said":
                        oracion = "she __ yesterday she wanted to go to the movies";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;

            case "See":
                opcion1.setText("See");
                opcion2.setText("Saw");
                opcion3.setText("Seen");

                switch (tiempo) {
                    case "See":
                        oracion = "Did you __ where i put my cellphone?";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Saw":
                        oracion = "He told me she __ a spider in his bathroom";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Seen":
                        oracion = " You should have __ the cake i made.";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;

            case "Sell":
                opcion1.setText("Sell");
                opcion2.setText("Sold");
                opcion3.setText("Seller");

                switch (tiempo) {
                    case "Sell":
                        oracion = "I __ lemonade to buy a bicycle";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Sold":
                        oracion = "it´s better to have __ your car than your house.";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;

            //
            case "Send":
                opcion1.setText("Send");
                opcion2.setText("Sent");
                opcion3.setText("Sendeen");

                switch (tiempo) {
                    case "Send":
                        oracion = "She won’t __ her complaint by mailbox today";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Sent":
                        oracion = "You would have __ me your friend request on facebook.";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;

            case "Shake":
                opcion1.setText("Shake");
                opcion2.setText("Shook");
                opcion3.setText("Shaken");

                switch (tiempo) {
                    case "Shake":
                        oracion = "You have to __ the juice first before you drink it";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Shook":
                        oracion = "Those words __ the world yesterday";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Shaken":
                        oracion = "This murder has __ our community";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;

            case "Shoot":
                opcion1.setText("Shoot");
                opcion2.setText("Shot");
                opcion3.setText("Shoten");

                switch (tiempo) {
                    case "Shoot":
                        oracion = "Please tell everybody not to __";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Shot":
                        oracion = "Onlookers say they heard a __";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;

            case "Show":
                opcion1.setText("Show");
                opcion2.setText("Showed");
                opcion3.setText("Shown");

                switch (tiempo) {
                    case "Show":
                        oracion = "I wanna __ you a magic trick";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Showed":
                        oracion = "Tom __ me the way to get to Chedraui last week";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Shown":
                        oracion = "I have __ you that what you do is wrong";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;

            case "Shut":
                opcion1.setText("Shut");
                opcion2.setText("Shuted");
                opcion3.setText("Shuten");

                switch (tiempo) {
                    case "Shut":
                        oracion = "Don´t forget to __ the door";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;

            case "Sing":
                opcion1.setText("Shake");
                opcion2.setText("Shook");
                opcion3.setText("Shaken");

                switch (tiempo) {
                    case "Sing":
                        oracion = "Jessica likes to __ ballads";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Sang":
                        oracion = "The school choir __ melodiously last night.";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Sung":
                        oracion = "I've never __ karaoke before";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;

            case "Sink":
                opcion1.setText("Sink");
                opcion2.setText("Sank");
                opcion3.setText("Sunk");

                switch (tiempo) {
                    case "Sink":
                        oracion = "Despites the blows, the ship didn´t __";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Sank":
                        oracion = "The Titanic is the most famous ship that __";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Sunk":
                        oracion = "He has __ into misery after losing the bet";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;

            case "Sit":
                opcion1.setText("Sit");
                opcion2.setText("Sat");
                opcion3.setText("Sitten");

                switch (tiempo) {
                    case "Sit":
                        oracion = "Mauricio asked for a chair to __ comfortably";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Sat":
                        oracion = "As there were no chairs, Julio __ on the floor";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;

            case "Sleep":
                opcion1.setText("Sleep");
                opcion2.setText("Slept");
                opcion3.setText("Sleped");

                switch (tiempo) {
                    case "Sleep":
                        oracion = "Mauricio asked for a chair to __ comfortably";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Slept":
                        oracion = "My cat __ for a little too long last night";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;

            case "Speak":
                opcion1.setText("Speak");
                opcion2.setText("Spoke");
                opcion3.setText("Spoken");

                switch (tiempo) {
                    case "Speak":
                        oracion = "Sorry, we don´t __ german";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Spoke":
                        oracion = "She __ to her boss yesterday to ask for a raise";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Spoken":
                        oracion = "They hsve never __ italian fluently";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;

            case "Spend":
                opcion1.setText("Spend");
                opcion2.setText("Spent");
                opcion3.setText("Spont");

                switch (tiempo) {
                    case "Spend":
                        oracion = "Gerardo prefers to __ time with his family";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Spent":
                        oracion = "Have you ever __ yout money on something useless?";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;

            case "Stand":
                opcion1.setText("Stand");
                opcion2.setText("Stood");
                opcion3.setText("Stander");

                switch (tiempo) {
                    case "Stand":
                        oracion = "Quick, __ up soldier, we still haven´t lost the war";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Stood":
                        oracion = "Nicolás __ the whole class";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;

            case "Steal":
                opcion1.setText("Steal");
                opcion2.setText("Stole");
                opcion3.setText("Stolen");

                switch (tiempo) {
                    case "Steal":
                        oracion = "If you steal, it is very likely that you will go to jail";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Stole":
                        oracion = "yesterday some bandits __ Mrs. ana´s groceries";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Stolen":
                        oracion = "Help me! a guy has __ my purse";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;

            case "Strike":
                opcion1.setText("Strike");
                opcion2.setText("Struck");
                opcion3.setText("Striken");

                switch (tiempo) {
                    case "Strike":
                        oracion = "Then someone else will __ back";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Struck":
                        oracion = "His head must´ve __ the floor";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;

            case "Swim":
                opcion1.setText("Swim");
                opcion2.setText("Swam");
                opcion3.setText("Swum");

                switch (tiempo) {
                    case "Swim":
                        oracion = "help him, he can´t __!";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Swam":
                        oracion = "She __ across the Mississippi on christmas";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Swum":
                        oracion = "he has __ in olympic competitions";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;

            case "Take":
                opcion1.setText("Take");
                opcion2.setText("Took");
                opcion3.setText("Taken");

                switch (tiempo) {
                    case "Take":
                        oracion = "__ one please";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Took":
                        oracion = "Rafel __ a slice of pepperoni pizza";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Taken":
                        oracion = "leave him, he has __ his decision";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;

            case "Teach":
                opcion1.setText("Teach");
                opcion2.setText("Taught");
                opcion3.setText("Tought");

                switch (tiempo) {
                    case "Teach":
                        oracion = "i´d like to __ maths at UNAM";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Taught":
                        oracion = "My parents never __ me to dance";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;

            case "Tear":
                opcion1.setText("Tear");
                opcion2.setText("Tore");
                opcion3.setText("Torn");

                switch (tiempo) {
                    case "Tear":
                        oracion = "I´ll __ out your smile";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Tore":
                        oracion = "My dress was __ last night by mistake";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Torn":
                        oracion = "Now it´s just a __ rag";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;

            case "Tell":
                opcion1.setText("Tell");
                opcion2.setText("Told");
                opcion3.setText("Toldest");

                switch (tiempo) {
                    case "Tell":
                        oracion = "Ernesto __ his mother everything";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Told":
                        oracion = "Our story __ through films";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;

            case "Think":
                opcion1.setText("Think");
                opcion2.setText("Thought");
                opcion3.setText("Thaught");

                switch (tiempo) {
                    case "Think":
                        oracion = "That guy cannot __ for himself";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Thought":
                        oracion = "I guess i never __ about it";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;

            case "Throw":
                opcion1.setText("Throw");
                opcion2.setText("Threw");
                opcion3.setText("Thrown");

                switch (tiempo) {
                    case "Throw":
                        oracion = "The girl can __ a football";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Threw":
                        oracion = "My dress was __ last night by mistake";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Thrown":
                        oracion = "Now it´s just a __ rag";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;

            case "Understand":
                opcion1.setText("Understand");
                opcion2.setText("Understood");
                opcion3.setText("Understund");

                switch (tiempo) {
                    case "Understand":
                        oracion = "My parents don´t __ me";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Understood":
                        oracion = "I think that wveryone has __";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;

            case "Wear":
                opcion1.setText("Wear");
                opcion2.setText("Wore");
                opcion3.setText("Worn");

                switch (tiempo) {
                    case "Wear":
                        oracion = "Astronauts must __ a spacesuit";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Wore":
                        oracion = "She __ princess dresses when she was a kid";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Worn":
                        oracion = "I´d have __ a less expensive shirt";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;

            case "Win":
                opcion1.setText("Win");
                opcion2.setText("Won");
                opcion3.setText("Wan");

                switch (tiempo) {
                    case "Win":
                        oracion = "We just want to __ the challenge";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Won":
                        oracion = "Nobody from our great class __";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;

            case "Write":
                opcion1.setText("Write");
                opcion2.setText("Wrote");
                opcion3.setText("Written");

                switch (tiempo) {
                    case "Write":
                        oracion = "Amanda __ a heroic poem";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Wrote":
                        oracion = "Jules Verne __ the book 'From the earth to the moon'";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Written":
                        oracion = "Pablo has written 10 love poems for his girlfriend";
                        areaEjercicio.setText(oracion);
                        break;

                    default:
                        oracion = "Felicidades, aqui no hay nada";
                        areaEjercicio.setText(oracion);
                }
                break;

            //Final Write
            default:
                opcion1.setText("Null");
                opcion2.setText("Null");
                opcion3.setText("Ester egg");

                oracion = "Felicidades, aqui no hay nada";
                areaEjercicio.setText(oracion);

        }
    }

    public void validarOpcion1() {

        switch (tiempo) {

            case "Be":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;// Evita que se siga ejecutando este caso para el switch
            //Aca me quede xd
            case "Beat":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Become":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Begin":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Bend":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Bite":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Blow":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Break":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Bring":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Build":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Buy":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Catch":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Choose":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Come":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Cost":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Cut":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Do":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Draw":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Drink":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Drive":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Eat":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Fall":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Feel":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Fight":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Find":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Forget":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Forgive":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Freeze":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Get":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Give":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Go":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Grow":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Hang":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Have":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Hear":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Hide":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Hit":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Hold":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Hurt":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Keep":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Know":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Lay":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Leave":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Lend":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Lie":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Lose":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Make":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Mean":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Meet":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Pay":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Put":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Read":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Ride":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Ring":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Rise":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Run":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            //Mi parte desde Say
            case "Say":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "See":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Sell":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            //
            case "Send":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Shake":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Shoot":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Show":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Shut":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Sing":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Sink":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Sit":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Sleep":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Speak":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Spend":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Stand":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Steal":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Strike":
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Swim":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Take":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Teach":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Tear":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Tell":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Think":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Throw":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Understand":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Wear":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Win":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Write":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            //Final Write
            default:

                respuesta.setText("Incorrecto: la respuesta era: " + tiempo);
                siguiente.setEnabled(true);

                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

        }
    }

    public void validarOpcion2() {

        switch (tiempo) {

            case "Was/were":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;// Evita que se siga ejecutando este caso para el switch
            //Aca me quede xd
            case "Bet":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Became":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Began":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Bent":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Bit":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Blew":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Broke":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Brought":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Built":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Bought":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Caught":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Chose":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Came":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Cost":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Cut":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Did":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Drew":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Drank":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Drove":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Ate":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Fell":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Felt":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Fought":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Found":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Forgot":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Forgave":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Froze":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Got":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Gave":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Went":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Grew":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Hung":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Had":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Heard":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Hid":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Hit":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Held":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Hurt":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Kept":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Knew":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Laid":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Left":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Lent":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Lay":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Lost":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Made":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Meant":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Met":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Paid":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Put":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Read":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Rode":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Rang":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Rose":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Ran":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            //Mi parte desde Say
            case "Said":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Saw":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Sold":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            //
            case "Sent":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Shook":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Shot":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Showed":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Shut":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Sang":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Sank":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Sat":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Slept":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Spoke":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Spent":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Stood":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Stole":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Struck":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Swam":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Took":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Taught":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Tore":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Told":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Thought":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Threw":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Understood":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Wore":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Won":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Wrote":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            //Final Write
            default:

                respuesta.setText("Incorrecto: la respuesta era: " + tiempo);
                siguiente.setEnabled(true);

                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);
        }
    }

    public void validarOpcion3() {

        switch (tiempo) {

            case "Been":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;// Evita que se siga ejecutando este caso para el switch
            //Aca me quede xd
            case "Beaten":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Becomex":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Begun":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Benter":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Bitten":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Blown":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Broken":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Broughts":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Builte":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Boughts":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Caughts":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Chosen":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Comet":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Costs":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Cuter":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Done":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Drawn":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Drunk":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Driven":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Eaten":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Fallen":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Felts":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Foughts":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Founds":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Forgotten":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Forgiven":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Frozen":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Gots":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Given":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Gone":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Grown":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Hungs":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Hads":
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Heards":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Hidden":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Hits":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Helds":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Hurts":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Kepts":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Known":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Laids":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Lefts":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Lents":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Lain":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Losts":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Mades":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Meants":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Mets":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Paids":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Puts":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Reads":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Ridden":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Rung":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Risen":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Runs":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            //Mi parte desde Say
            case "Saids":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Seen":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Solds":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            //
            case "Sents":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Shaken":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Shots":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Shown":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Shuts":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Sung":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Sunk":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Sats":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Slepts":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Spoken":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Spents":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Stoods":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Stolen":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Strucks":
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Swum":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Taken":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Taughts":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Torn":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Tolds":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Thoughts":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Thrown":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Understoods":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Worn":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Wons":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            case "Written":
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

                respuesta.setText("¡Correcto!");
                respuesta.setEnabled(true);

                areaEjercicio.setEditable(false);
                siguiente.setEnabled(true);

                Puntaje++;
                Score.setText("Puntaje: " + Puntaje + "/10");
                break;

            //Final Write
            default:
                respuesta.setText("Incorrecto: la respuesta era: " + tiempo);
                siguiente.setEnabled(true);

                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);

        }
    }

    //Eventos de los botones
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == opcion1) {

            validarOpcion1();
        }

        if (e.getSource() == opcion2) {

            validarOpcion2();
        }

        if (e.getSource() == opcion3) {

            validarOpcion3();
        }

        if (e.getSource() == siguiente) {

            if (Contador < 10) {
                juegoMatriz matriz = new juegoMatriz();
                matriz.generarVerbo();
                verbo = matriz.obtenerVerbo();

                matriz.generarTiempo();
                tiempo = matriz.obtenerTiempo();

                juegoValidacion mensaje = new juegoValidacion();
                mensaje.contadorEJercicio(matriz.fila, matriz.columna);
                
                setOracion();

                opcion1.setEnabled(true);
                opcion2.setEnabled(true);
                opcion3.setEnabled(true);

                respuesta.setText("");

                siguiente.setEnabled(false);
                Contador++;
                setTitle("Ejercicio n°" + Contador);
                
            } else if (Contador == 10) {

                setTitle("Ejercicio n°10");
                juegoValidacion mensaje = new juegoValidacion();
                mensaje.showMensajeFinal(Puntaje);

                siguiente.setVisible(false);
                cerrar.setVisible(true);
                cerrar.setEnabled(true);
                reiniciar.setVisible(true);
                reiniciar.setEnabled(true);
            }
        }

        if (e.getSource() == cerrar) {

            Principal principal = new Principal();
            principal.setBounds(0, 0, 426, 568);
            principal.setVisible(true);
            principal.setLocationRelativeTo(null);
            principal.setResizable(false);

            this.setVisible(false);
        }

        if (e.getSource() == reiniciar) {

            Juego juego = new Juego();
            juego.setBounds(0, 0, 465, 300);
            juego.setVisible(true);
            juego.setLocationRelativeTo(null);
            juego.setResizable(false);

            this.setVisible(false);
        }
    }
}
