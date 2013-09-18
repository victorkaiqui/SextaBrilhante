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
 * http://www.hamerski.com.br/sexta/main/show/9
 *
 */
public class SextaBrilhante09 {

    public static void qualEONumeroPrimo(int n) {

        boolean valida = true;
        int cont = 0;
        int contPos = 0;

        while (valida) {

            cont++;

            if (metodos.primo(cont)) {

                contPos++;

                if (contPos == n) {
                    valida = false;
                }

                System.out.println(contPos + " -> " + cont);

            }
        }
    }
}
