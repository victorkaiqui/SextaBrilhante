/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.exer;

import java.math.BigInteger;

/**
 *
 * @author vpaz
 */
public class Exer18 {

    public static void potenciasSomadas() {

        BigInteger value = BigInteger.ZERO;
        
        for (int i = 1; i <= 940; i++) {
                                   
            BigInteger t = new BigInteger(String.valueOf(i));
            
            value = value.add(t.pow(i));
        
            System.out.println(t.pow(i));
        }
        
        System.out.println("R " + value);
    }

}
