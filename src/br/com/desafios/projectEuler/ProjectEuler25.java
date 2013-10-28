/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.desafios.projectEuler;

import br.com.desafios.metodos.metodos;
import java.math.BigInteger;

/**
 *
 * @author @victorKaiqui
 *
 * http://projecteuler.net/problem=25
 *
 */
public class ProjectEuler25 {

    public static void fibonacciNumber1000Digit() {
        
        boolean status = true;
        BigInteger bi = new BigInteger("4500");
        String value;
        
        while (status) {

            value = metodos.fibonacci(bi).toString();
            
            if (value.length() == 1000) {
                System.out.println(bi);
                status = false;
            }
            
            bi = bi.add(BigInteger.ONE);
        }
    }
}
