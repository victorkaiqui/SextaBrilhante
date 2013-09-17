/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.exer;

import br.com.metodos.NumerosPrimos;

/**
 *
 * @author vpaz
 * 
 * http://www.hamerski.com.br/sexta/main/show/6
 * 
 */
public class Exer06 {

    public static void qualOMaiorFatorPrimo(long j) {

        for (int i = 1; i <= j; i++) {

            if (NumerosPrimos.primo(i)) {
                if (j % i == 0) {
                    System.out.println(i);
                }
            }
        }

    }

    
}
