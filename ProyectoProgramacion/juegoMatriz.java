package ProyectoProgramacion;

import java.util.Random;

public class juegoMatriz {

    public String[][] matrizVerboIrregular = new String[83][3];
    public int fila, columna, min, max;
    private int repeticionFila = 0;
    String verbo, tiempo;

    //Constructor o estado inicial de mi programa
    public juegoMatriz() {

        setVerbosMatriz();
    }

    //Seleccioa un verbo de lalista de verbos irregulares
    public void generarVerbo() {
        min = 0;
        max = 83;

        Random random = new Random();
        fila = random.nextInt(max + min) + min;
        columna = 0;
        repeticionFila++;
    }

    //Selecciona un tiempo verbal de acuerdo a un verbo
    public void generarTiempo() {
        min = 0;
        max = 3;
        Random random = new Random();
        columna = random.nextInt(max + min) + min;
    }

    //Metodo getter para recuperar el valor de fila
    public String obtenerVerbo() {
        generarVerbo();
        verbo = matrizVerboIrregular[fila][columna];
        return verbo;
    }

    public String obtenerTiempo() {
        generarTiempo();
        tiempo = matrizVerboIrregular[fila][columna];
        return tiempo;
    }

    public void setVerbosMatriz() {

        matrizVerboIrregular[0][0] = "Be";
        matrizVerboIrregular[0][1] = "Was/were";
        matrizVerboIrregular[0][2] = "Been";

        matrizVerboIrregular[1][0] = "Beat";
        matrizVerboIrregular[1][1] = "Beat";
        matrizVerboIrregular[1][2] = "Beaten";

        matrizVerboIrregular[2][0] = "Become";
        matrizVerboIrregular[2][1] = "Became";
        matrizVerboIrregular[2][2] = "Become";

        matrizVerboIrregular[3][0] = "Begin";
        matrizVerboIrregular[3][1] = "Began";
        matrizVerboIrregular[3][2] = "Begun";

        matrizVerboIrregular[4][0] = "Bend";
        matrizVerboIrregular[4][1] = "Bent";
        matrizVerboIrregular[4][2] = "Bent";

        matrizVerboIrregular[5][0] = "Bite";
        matrizVerboIrregular[5][1] = "Bit";
        matrizVerboIrregular[5][2] = "Bitten";

        matrizVerboIrregular[6][0] = "Blow";
        matrizVerboIrregular[6][1] = "Blew";
        matrizVerboIrregular[6][2] = "Blown";

        matrizVerboIrregular[7][0] = "Break";
        matrizVerboIrregular[7][1] = "Broke";
        matrizVerboIrregular[7][2] = "Broken";

        matrizVerboIrregular[8][0] = "Bring";
        matrizVerboIrregular[8][1] = "Brought";
        matrizVerboIrregular[8][2] = "Brought";

        matrizVerboIrregular[9][0] = "Build";
        matrizVerboIrregular[9][1] = "Built";
        matrizVerboIrregular[9][2] = "Built";

        matrizVerboIrregular[10][0] = "Buy";
        matrizVerboIrregular[10][1] = "Bought";
        matrizVerboIrregular[10][2] = "Bought";

        matrizVerboIrregular[11][0] = "Catch";
        matrizVerboIrregular[11][1] = "Caught";
        matrizVerboIrregular[11][2] = "Caught";

        matrizVerboIrregular[12][0] = "Choose";
        matrizVerboIrregular[12][1] = "Chose";
        matrizVerboIrregular[12][2] = "Chosen";

        matrizVerboIrregular[13][0] = "Come";
        matrizVerboIrregular[13][1] = "Came";
        matrizVerboIrregular[13][2] = "Come";

        matrizVerboIrregular[14][0] = "Cost";
        matrizVerboIrregular[14][1] = "Cost";
        matrizVerboIrregular[14][2] = "Cost";

        matrizVerboIrregular[15][0] = "Cut";
        matrizVerboIrregular[15][1] = "Cut";
        matrizVerboIrregular[15][2] = "Cut";

        matrizVerboIrregular[16][0] = "Do";
        matrizVerboIrregular[16][1] = "Did";
        matrizVerboIrregular[16][2] = "Done";

        matrizVerboIrregular[17][0] = "Draw";
        matrizVerboIrregular[17][1] = "Drew";
        matrizVerboIrregular[17][2] = "Drawn";

        matrizVerboIrregular[18][0] = "Drink";
        matrizVerboIrregular[18][1] = "Drank";
        matrizVerboIrregular[18][2] = "Drunk";

        matrizVerboIrregular[19][0] = "Drive";
        matrizVerboIrregular[19][1] = "Drove";
        matrizVerboIrregular[19][2] = "Driven";

        matrizVerboIrregular[20][0] = "Eat";
        matrizVerboIrregular[20][1] = "Ate";
        matrizVerboIrregular[20][2] = "Eaten";

        matrizVerboIrregular[21][0] = "Fall";
        matrizVerboIrregular[21][1] = "Fell";
        matrizVerboIrregular[21][2] = "Fallen";

        matrizVerboIrregular[22][0] = "Feel";
        matrizVerboIrregular[22][1] = "Felt";
        matrizVerboIrregular[22][2] = "Felt";

        matrizVerboIrregular[23][0] = "Find";
        matrizVerboIrregular[23][1] = "Found";
        matrizVerboIrregular[23][2] = "Found";

        matrizVerboIrregular[24][0] = "Forget";
        matrizVerboIrregular[24][1] = "Forgot";
        matrizVerboIrregular[24][2] = "Forgotten";

        matrizVerboIrregular[25][0] = "Forgive";
        matrizVerboIrregular[25][1] = "Forgave";
        matrizVerboIrregular[25][2] = "Forgiven";

        matrizVerboIrregular[26][0] = "Freeze";
        matrizVerboIrregular[26][1] = "Froze";
        matrizVerboIrregular[26][2] = "Frozen";

        matrizVerboIrregular[27][0] = "Get";
        matrizVerboIrregular[27][1] = "Got";
        matrizVerboIrregular[27][2] = "Got";

        matrizVerboIrregular[28][0] = "Give";
        matrizVerboIrregular[28][1] = "Gave";
        matrizVerboIrregular[28][2] = "Given";

        matrizVerboIrregular[29][0] = "Go";
        matrizVerboIrregular[29][1] = "Went";
        matrizVerboIrregular[29][2] = "Gone";

        matrizVerboIrregular[30][0] = "Grow";
        matrizVerboIrregular[30][1] = "Grew";
        matrizVerboIrregular[30][2] = "Grown";

        matrizVerboIrregular[31][0] = "Hang";
        matrizVerboIrregular[31][1] = "Hung";
        matrizVerboIrregular[31][2] = "Hung";

        matrizVerboIrregular[32][0] = "Have";
        matrizVerboIrregular[32][1] = "Had";
        matrizVerboIrregular[32][2] = "Had";

        matrizVerboIrregular[33][0] = "Hear";
        matrizVerboIrregular[33][1] = "Heard";
        matrizVerboIrregular[33][2] = "Heard";

        matrizVerboIrregular[34][0] = "Hide";
        matrizVerboIrregular[34][1] = "Hid";
        matrizVerboIrregular[34][2] = "Hidden";

        matrizVerboIrregular[35][0] = "Hit";
        matrizVerboIrregular[35][1] = "Hit";
        matrizVerboIrregular[35][2] = "Hit";

        matrizVerboIrregular[36][0] = "Hold";
        matrizVerboIrregular[36][1] = "Held";
        matrizVerboIrregular[36][2] = "Held";

        matrizVerboIrregular[37][0] = "Hurt";
        matrizVerboIrregular[37][1] = "Hurt";
        matrizVerboIrregular[37][2] = "Hurt";

        matrizVerboIrregular[38][0] = "Keep";
        matrizVerboIrregular[38][1] = "Kept";
        matrizVerboIrregular[38][2] = "Kept";

        matrizVerboIrregular[39][0] = "Know";
        matrizVerboIrregular[39][1] = "Knew";
        matrizVerboIrregular[39][2] = "Known";

        matrizVerboIrregular[40][0] = "Lay";
        matrizVerboIrregular[40][1] = "Laid";
        matrizVerboIrregular[40][2] = "Laid";

        matrizVerboIrregular[41][0] = "Leave";
        matrizVerboIrregular[41][1] = "Left";
        matrizVerboIrregular[41][2] = "Left";

        matrizVerboIrregular[42][0] = "Lend";
        matrizVerboIrregular[42][1] = "Lent";
        matrizVerboIrregular[42][2] = "Lent";

        matrizVerboIrregular[43][0] = "Lie";
        matrizVerboIrregular[43][1] = "Lay";
        matrizVerboIrregular[43][2] = "Lain";

        matrizVerboIrregular[44][0] = "Lose";
        matrizVerboIrregular[44][1] = "Lost";
        matrizVerboIrregular[44][2] = "Lost";

        matrizVerboIrregular[45][0] = "Make";
        matrizVerboIrregular[45][1] = "Made";
        matrizVerboIrregular[45][2] = "Made";

        matrizVerboIrregular[46][0] = "Mean";
        matrizVerboIrregular[46][1] = "Meant";
        matrizVerboIrregular[46][2] = "Meant";

        matrizVerboIrregular[47][0] = "Meet";
        matrizVerboIrregular[47][1] = "Met";
        matrizVerboIrregular[47][2] = "Met";

        matrizVerboIrregular[48][0] = "Pay";
        matrizVerboIrregular[48][1] = "Paid";
        matrizVerboIrregular[48][2] = "Paid";

        matrizVerboIrregular[49][0] = "Put";
        matrizVerboIrregular[49][1] = "Put";
        matrizVerboIrregular[49][2] = "Put";

        matrizVerboIrregular[50][0] = "Read";
        matrizVerboIrregular[50][1] = "Read";
        matrizVerboIrregular[50][2] = "Read";

        matrizVerboIrregular[51][0] = "Ride";
        matrizVerboIrregular[51][1] = "Rode";
        matrizVerboIrregular[51][2] = "Ridden";

        matrizVerboIrregular[52][0] = "Ring";
        matrizVerboIrregular[52][1] = "Rang";
        matrizVerboIrregular[52][2] = "Rung";

        matrizVerboIrregular[53][0] = "Rise";
        matrizVerboIrregular[53][1] = "Rose";
        matrizVerboIrregular[53][2] = "Risen";

        matrizVerboIrregular[54][0] = "Run";
        matrizVerboIrregular[54][1] = "Ran";
        matrizVerboIrregular[54][2] = "Run";

        matrizVerboIrregular[55][0] = "Say";
        matrizVerboIrregular[55][1] = "Said";
        matrizVerboIrregular[55][2] = "Said";

        matrizVerboIrregular[56][0] = "See";
        matrizVerboIrregular[56][1] = "Saw";
        matrizVerboIrregular[56][2] = "Seen";

        matrizVerboIrregular[57][0] = "Sell";
        matrizVerboIrregular[57][1] = "Sold";
        matrizVerboIrregular[57][2] = "Sold";

        matrizVerboIrregular[58][0] = "Send";
        matrizVerboIrregular[58][1] = "Sent";
        matrizVerboIrregular[58][2] = "Sent";

        matrizVerboIrregular[59][0] = "Shake";
        matrizVerboIrregular[59][1] = "Shook";
        matrizVerboIrregular[59][2] = "Shaken";

        matrizVerboIrregular[60][0] = "Shoot";
        matrizVerboIrregular[60][1] = "Shot";
        matrizVerboIrregular[60][2] = "Shot";

        matrizVerboIrregular[61][0] = "Show";
        matrizVerboIrregular[61][1] = "Showed";
        matrizVerboIrregular[61][2] = "Shown";

        matrizVerboIrregular[62][0] = "Shut";
        matrizVerboIrregular[62][1] = "Shut";
        matrizVerboIrregular[62][2] = "Shut";

        matrizVerboIrregular[63][0] = "Sing";
        matrizVerboIrregular[63][1] = "Sang";
        matrizVerboIrregular[63][2] = "Sung";

        matrizVerboIrregular[64][0] = "Sink";
        matrizVerboIrregular[64][1] = "Sank";
        matrizVerboIrregular[64][2] = "Sunk";

        matrizVerboIrregular[65][0] = "Sit";
        matrizVerboIrregular[65][1] = "Sat";
        matrizVerboIrregular[65][2] = "Sat";

        matrizVerboIrregular[66][0] = "Sleep";
        matrizVerboIrregular[66][1] = "Slept";
        matrizVerboIrregular[66][2] = "Slept";

        matrizVerboIrregular[67][0] = "Speak";
        matrizVerboIrregular[67][1] = "Spoke";
        matrizVerboIrregular[67][2] = "Spoken";

        matrizVerboIrregular[68][0] = "Spend";
        matrizVerboIrregular[68][1] = "Spent";
        matrizVerboIrregular[68][2] = "Spent";

        matrizVerboIrregular[69][0] = "Stand";
        matrizVerboIrregular[69][1] = "Stood";
        matrizVerboIrregular[69][2] = "Stood";

        matrizVerboIrregular[70][0] = "Steal";
        matrizVerboIrregular[70][1] = "Stole";
        matrizVerboIrregular[70][2] = "Stolen";

        matrizVerboIrregular[71][0] = "Strike";
        matrizVerboIrregular[71][1] = "Struck";
        matrizVerboIrregular[71][2] = "Struck";

        matrizVerboIrregular[72][0] = "Swim";
        matrizVerboIrregular[72][1] = "Swam";
        matrizVerboIrregular[72][2] = "Swum";

        matrizVerboIrregular[73][0] = "Take";
        matrizVerboIrregular[73][1] = "Took";
        matrizVerboIrregular[73][2] = "Taken";

        matrizVerboIrregular[74][0] = "Teach";
        matrizVerboIrregular[74][1] = "Taught";
        matrizVerboIrregular[74][2] = "Taught";

        matrizVerboIrregular[75][0] = "Tear";
        matrizVerboIrregular[75][1] = "Tore";
        matrizVerboIrregular[75][2] = "Torn";

        matrizVerboIrregular[76][0] = "Tell";
        matrizVerboIrregular[76][1] = "Told";
        matrizVerboIrregular[76][2] = "Told";

        matrizVerboIrregular[77][0] = "Think";
        matrizVerboIrregular[77][1] = "Thought";
        matrizVerboIrregular[77][2] = "Thought";

        matrizVerboIrregular[78][0] = "Throw";
        matrizVerboIrregular[78][1] = "Threw";
        matrizVerboIrregular[78][2] = "Thrown";

        matrizVerboIrregular[79][0] = "Understand";
        matrizVerboIrregular[79][1] = "Understood";
        matrizVerboIrregular[79][2] = "Understood";

        matrizVerboIrregular[80][0] = "Wear";
        matrizVerboIrregular[80][1] = "Wore";
        matrizVerboIrregular[80][2] = "Worn";

        matrizVerboIrregular[81][0] = "Win";
        matrizVerboIrregular[81][1] = "Won";
        matrizVerboIrregular[81][2] = "Won";

        matrizVerboIrregular[82][0] = "Write";
        matrizVerboIrregular[82][1] = "Wrote";
        matrizVerboIrregular[82][2] = "Written";
    }

}
