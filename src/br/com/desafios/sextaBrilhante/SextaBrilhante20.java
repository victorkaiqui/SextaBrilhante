/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.desafios.sextaBrilhante;

import br.com.desafios.metodos.metodos;
import java.math.BigInteger;

/**
 *
 * @author @victorKaiqui
 * 
 * http://www.hamerski.com.br/sexta/main/show/20
 * 
 */
public class SextaBrilhante20 {

    public static void caminhandoEmTrelica(int n) {
        
        BigInteger bi = new BigInteger(String.valueOf(n));

        BigInteger parte1 = metodos.factorial(bi.multiply(new BigInteger("2")));
        BigInteger parte2 = metodos.factorial(bi).pow(2);
        
        BigInteger resultado = parte1.divide(parte2);
        
        System.out.println(resultado);
    }
}
