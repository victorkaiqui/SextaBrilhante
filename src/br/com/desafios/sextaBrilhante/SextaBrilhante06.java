/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.desafios.sextaBrilhante;

import br.com.desafios.metodos.metodos;

/**
 *
 * @author  @victorKaiqui 
 *
 * http://www.hamerski.com.br/sexta/main/show/6
 *
 */
public class SextaBrilhante06 {

    public static void qualOMaiorFatorPrimo(long j) {

        for (int i = 1; i <= j; i++) {

            if (metodos.primo(i)) {
                if (j % i == 0) {
                    System.out.println("Fator: " + i);
                }
            }
            if ((j / 2) <= i) {
                break;
            }
        }

    }
}
