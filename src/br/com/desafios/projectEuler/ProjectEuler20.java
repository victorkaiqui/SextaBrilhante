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
 * http://projecteuler.net/problem=20
 *
 */
public class ProjectEuler20 {

    public static void factorialDigitSum() {
        
        BigInteger bi = metodos.fatorial(new BigInteger("100"));        
        System.out.println(metodos.soma(bi));
    
    }
    
}
