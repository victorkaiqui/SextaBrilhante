/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.desafios.sextaBrilhante;

/**
 *
 * @author @victorKaiqui
 * 
 * http://www.hamerski.com.br/sexta/main/show/14
 * 
 */
public class SextaBrilhante14 {

    public static void diagonaisEmNumerosEspiralados(int n) {

        int val = n * n;
        int matriz[][] = new int[n][n];
        int x = n - 1;
        int y = 0;
        int soma = 1;
        int lim = n;


        boolean cont = true;

        //Direção
        int dx = -1;
        int dy = 0;

        int aux = 1;

        while (cont) {

            matriz[x][y] = val;

            if (aux == lim) {
                if (x == y) {
                    lim--;
                }
                if (dx == -1 && dy == 0) {
                    dx = 0;
                    dy = 1;
                } else if (dx == 0 && dy == 1) {
                    dx = 1;
                    dy = 0;
                } else if (dx == 1 && dy == 0) {
                    dx = 0;
                    dy = -1;
                } else if (dx == 0 && dy == -1) {
                    dx = -1;
                    dy = 0;
                }
                aux = 0;
            }

            x += dx;
            y += dy;

            aux++;
            val--;

            if (val == 1) {
                cont = false;
            }
        }


        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                System.out.print(matriz[j][i] + " | ");
                if (i == j) {
                    soma += matriz[j][i];
                }
                if (i + j == matriz.length - 1 && i != j) {
                    soma += matriz[j][i];
                }

            }
            System.out.println("");

        }

        System.out.println("Soma " + soma);
    }
}
