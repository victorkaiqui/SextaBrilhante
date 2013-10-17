/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.desafios.projectEuler;

/**
 *
 * @author @victorKaiqui
 *
 * http://projecteuler.net/problem=14
 *
 */
public class ProjectEuler14 {

    public static void longestCollatzSequence(int n) {

        int cont, aux;
        int biggerValue = 0;
        int biggerQtd = 0;


        for (int i = 1; i <= n; i++) {
            cont = i;
            aux = 1;
            while (cont != 1) {

                if (cont % 2 == 0) {
                    cont = cont / 2;
                } else {
                    cont = (cont * 3) + 1;
                }
                aux++;
            }
            if (biggerQtd < aux) {
                biggerValue = i;
                biggerQtd = aux;
            }
        }
        System.out.println("Qtd: " + biggerQtd);
        System.out.println("Value: " + biggerValue);

    }
}
