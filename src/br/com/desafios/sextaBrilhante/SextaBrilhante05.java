/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.desafios.sextaBrilhante;

/**
 * fdfds
 *
 * @author vpaz
 * 
 * http://www.hamerski.com.br/sexta/main/show/5
 * 
 */
public class SextaBrilhante05 {

    public static void multiplosDe3e5(int n) {

        int sum = 0;

        for (int i = 0; i < n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {

                sum += i;

            }
        }
        System.out.println("Soma " + sum);
    }
}
