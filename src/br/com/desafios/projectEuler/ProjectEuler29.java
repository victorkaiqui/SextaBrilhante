/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.desafios.projectEuler;

import java.math.BigInteger;
import java.util.TreeSet;

/**
 *
 * @author @victorKaiqui
 *
 * http://projecteuler.net/problem=29
 *
 */
public class ProjectEuler29 {

    public static void distinctPowers() {

        TreeSet list = new TreeSet();
        BigInteger biA;
        for (int a = 2; a <= 100; a++) {
            for (int b = 2; b <= 100; b++) {
                biA = new BigInteger(String.valueOf(a));
                list.add(biA.pow(b));
            }
        }
        System.out.println(list);
        System.out.println(list.size());
    }
}
