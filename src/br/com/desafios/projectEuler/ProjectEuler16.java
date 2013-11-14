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
 * http://projecteuler.net/problem=16
 *
 */
public class ProjectEuler16 {

    public static void powerDigitSum() {

        BigInteger bi = new BigInteger("2");

        System.out.println(metodos.soma(bi.pow(1000)));
    }
    
}
