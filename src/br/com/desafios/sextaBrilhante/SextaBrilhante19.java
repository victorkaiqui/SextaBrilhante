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
 * http://www.hamerski.com.br/sexta/main/show/19
 *
 */
public class SextaBrilhante19 {

    public static void numerosDeFibonacci() {
        int soma = 0;
        int fibo = 0;

        for (int i = 3; i <= 6000000; i++) {

            fibo = (int) metodos.fibonacci(i);

            if (fibo % 2 != 0) {
                soma += fibo;
            }
        }
        System.out.println("Total: " + soma);
    }
}
