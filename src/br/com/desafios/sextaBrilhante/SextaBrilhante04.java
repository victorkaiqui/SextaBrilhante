/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.desafios.sextaBrilhante;

import java.math.BigDecimal;
import java.util.HashSet;

/**
 *
 * @author @victorKaiqui
 * 
 * http://www.hamerski.com.br/sexta/main/show/4
 * 
 */
public class SextaBrilhante04 {

    public static void potenciasDiferentes(int menorA, int maiorA, int menorB, int maiorB) {

        HashSet lista = new HashSet();

        for (int i = menorA; i <= maiorA; i++) {
            for (int j = menorB; j <= maiorB; j++) {
                BigDecimal cont = new BigDecimal(Math.pow(i, j));
                lista.add(cont);
            }
        }
        System.out.println(lista.size());
    }
}
