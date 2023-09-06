package view;

import controller.ThreadSoma;

import java.util.Random;

public class Executar {
    public static void main(String[] args) {
        int[][] matriz = new int[3][5];

        preencherComNumerosAleatorios(matriz);

        for (int thread = 0; thread < 3; thread++) {
            //matriz[thread] >>> apenas a linha
            Thread threadSoma = new ThreadSoma(matriz[thread], thread);
            threadSoma.start();
        }
    }

    public static void preencherComNumerosAleatorios(int[][] matriz) {
        Random aleatorio = new Random();

        int tamanhoLinhas = matriz.length;
        int tamanhoColunas = matriz[0].length;

        for (int x = 0; x < tamanhoLinhas; x++) {
            for (int y = 0; y < tamanhoColunas; y++) {
                matriz[x][y] = aleatorio.nextInt(10); //0 a 9
//                System.out.print(matriz[x][y] + " ");
            }
//            System.out.println();
        }
    }
}
