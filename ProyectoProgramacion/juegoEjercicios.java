package ProyectoProgramacion;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class juegoEjercicios extends javax.swing.JFrame {

    JButton opcion1, opcion2, opcion3, siguiente, cerrar, reiniciar;
    String verbo, tiempo, fila, columna, oracion;
    JTextArea areaEjercicio;
    private JScrollPane Scroll;

    public juegoEjercicios() {

        juegoMatriz matriz = new juegoMatriz();
        matriz.generarVerbo();
        verbo = matriz.obtenerVerbo();

        matriz.generarTiempo();
        tiempo = matriz.obtenerTiempo();

        opcion1 = new JButton("");
        opcion1.setBounds(45, 150, 100, 30);
        add(opcion1);
       

        opcion2 = new JButton("");
        opcion2.setBounds(175, 150, 100, 30);
        add(opcion2);
       

        opcion3 = new JButton("");
        opcion3.setBounds(305, 150, 100, 30);
        add(opcion3);


        areaEjercicio = new JTextArea(oracion);
        Scroll = new JScrollPane(areaEjercicio);
        areaEjercicio.setBounds(45, 85, 360, 30);
        areaEjercicio.setForeground(new Color(0, 0, 0));
        areaEjercicio.setFont(new Font("Andale Mono", 1, 10));
        areaEjercicio.setEditable(false);
        add(areaEjercicio);

    }

    /*public void setTexto() {

        Juego juego = new Juego();

        juego.opcion1 = opcion1;
        juego.opcion2 = opcion2;
        juego.opcion3 = opcion3;
        juego.areaEjercicio = areaEjercicio;

    }
    */ 
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
                        oracion = "The neighbours´dog ____ me";
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
                opcion3.setText("Short");

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
                        oracion = "yesterday Juan _____ drunk and almost had an accident";
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
                opcion3.setText("New");

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
                opcion1.setText("Shake");
                opcion2.setText("Shook");
                opcion3.setText("Shaken");

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
                        oracion = "Jsssica likes to __ ballads";
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
                    case "Sing":
                        oracion = "Despites the blows, the ship didn´t __";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Sang":
                        oracion = "The Titanic is the most famous ship that __";
                        areaEjercicio.setText(oracion);
                        break;

                    case "Sung":
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
                        oracion = "Sorry, we don´t __ german";
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

                    case "Tought":
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
                        oracion = "I guess i never __ about ir";
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

            case "Undertsand":
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
                opcion1.setText("Understand");
                opcion2.setText("Understood");
                opcion3.setText("Understund");

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
                opcion3.setText("Null");

                oracion = "Felicidades, aqui no hay nada";
                areaEjercicio.setText(oracion);

        }
    }

}
