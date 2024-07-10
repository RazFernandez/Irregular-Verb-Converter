package ProyectoProgramacion;

import javax.swing.JOptionPane;

public class juegoValidacion extends Juego {

    public int matrizContador[][] = new int[83][3];

    public void validarOpcion() {

        generarMatrizContador();
    }

    public void generarMatrizContador() {

        for (int x = 0; x <= 82; x++) {

            for (int y = 0; y <= 2; y++) {

                matrizContador[x][y] = 0;
            }
        }
    }

    public void contadorEJercicio(int Fila, int Columna) {

        if (matrizContador[Fila][Columna] == 0) {

            matrizContador[Fila][Columna] = 1;
        } else if (matrizContador[Fila][Columna] == 1) {

            juegoMatriz matriz = new juegoMatriz();
            matriz.generarVerbo();
            matriz.obtenerVerbo();
            matriz.generarTiempo();
            matriz.obtenerTiempo();
        }
    }

    public void showMensajeFinal(int Puntaje) {

        switch (Puntaje) {

            case 1:

            case 2:

            case 3:

            case 4:

            case 5:
                JOptionPane.showMessageDialog(null, "Buen trabajo, te recomiendo practicar más",
                        "Tu puntaje final ha sido: " + Puntaje + "/10", 1);

                break;

            case 6:
                JOptionPane.showMessageDialog(null, "¡Vas muy bien, sigue practicando!",
                        "Tu puntaje final ha sido: " + Puntaje + "/10", 1);

                break;

            case 7:
                JOptionPane.showMessageDialog(null, "Muy buen trabajo, puedes mejorarlo",
                        "Tu puntaje final ha sido: " + Puntaje + "/10", 1);

                break;

            case 8:
                JOptionPane.showMessageDialog(null, "Excelente puntaje,¡felicidades!",
                        "Tu puntaje final ha sido: " + Puntaje + "/10", 1);

                break;

            case 9:
                JOptionPane.showMessageDialog(null, "Increíble, eres bueno en esto, felicidades",
                        "Tu puntaje final ha sido: " + Puntaje + "/10", 1);

                break;

            case 10:
                JOptionPane.showMessageDialog(null, "Wow, acaso ¿eres un experto?",
                        "Tu puntaje final ha sido: " + Puntaje + "/10", 1);

                break;

            default:
                JOptionPane.showMessageDialog(null, "No te preocupes, sigue practicando para ser un experto",
                        "Tu puntaje final ha sido: " + Puntaje + "/10", 1);
        }

    }

}
