/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.desafios.sextaBrilhante;

import br.com.desafios.metodos.metodos;

/**
 *
 * @author @victorKaiqui
 *
 * http://www.hamerski.com.br/sexta/main/show/23
 *
 */
public class SextaBrilhante23 {

    public static void primosQuadraticos(int l) {

        int n = 0;
        int qtdPrimos = 0;
        int maxA = 0, maxB = 0;

        for (int a = -l; a < l; a++) {
            for (int b = -l; b < l; b++) {
                n = 0;
                while (metodos.primo(formula(n, a, b))) {
                    n++;
                }
                if (qtdPrimos < n) {
                    qtdPrimos = n;
                    maxA = a;
                    maxB = b;
                }
            }
        }
        System.out.println("Valor A: " + maxA + " valor B: " + maxB + " Valor A * B: " + maxA * maxB);
    }

    public static long formula(long n, long a, long b) {
        return (int) Math.pow(n, 2) + a * n + b;
    }
}
