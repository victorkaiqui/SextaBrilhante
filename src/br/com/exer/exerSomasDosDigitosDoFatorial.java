/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.exer;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;

/**
 *
 * @author vpaz
 */
public class exerSomasDosDigitosDoFatorial {
    
    public static void somasDosDigitosDoFatorial(int valor) {
        
        BigInteger result = BigInteger.ONE;
        
        for (long i = valor; i >= 2; i--) {
            
            result = result.multiply(new BigInteger(String.valueOf(i)));
            
        }
        
        System.out.println(result);
        
        System.out.println(soma(result));
        
        
    }
    
    public static BigInteger soma(BigInteger x) {
      
        if (x.compareTo(BigInteger.ONE) < 0) {
            return BigInteger.ZERO;
        }        
        
        return x.mod(BigInteger.TEN).add(soma(x.divide(BigInteger.TEN)));
         
    }
}
