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
 * http://www.hamerski.com.br/sexta/main/show/22
 *
 */
public class SextaBrilhante22 {

    public static void somasDosPrimosConsecutivos(int n) {

        int val = 0;
        int maiorVal = 0;
        int i = 1;
        
        while (val <= n) {
            if (metodos.primo(i)) {
                val += i;
            }
            if (metodos.primo(val) && maiorVal < val) {
                maiorVal = val;
            }
            i++;
        }
        System.out.println(maiorVal);
    }
}
