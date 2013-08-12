/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.exer;

import java.util.HashSet;

/**
 *
 * @author vpaz
 * 
 * http://www.hamerski.com.br/sexta/main/show/7
 * 
 */
public class Exer7 {

    public static void triplasPotenciasDePrimos(long j) {

        long n = 0;
        HashSet lista = new HashSet();

        for (long i = 2; i < 32; i++) {
            if (primo(i) && Math.pow(i, 2) < 1000000) {
                for (long k = 2; k < 100; k++) {
                    if (primo(k) && Math.pow(i, 3) < 1000000) {
                        for (long z = 2; z < 1000; z++) {
                            if (primo(z) && Math.pow(i, 4) < 1000000) {

                                n = ((long) Math.pow(z, 2)) + ((long) Math.pow(k, 3)) + ((long) Math.pow(i, 4));

                                if (n < j) {
                                    lista.add(n);
                                }
                            }
                        }
                    }
                }
            }
        }

        System.out.println("qtd " + lista.size());
    }

    public static boolean primo(long x) {

        boolean primo = false;

        if (x == 2 || x == 3) {

            primo = true;
            return primo;

        }
        if (x % 2 == 0 && x != 2) {

            return primo;
        }

        for (int i = 3; i <= x; i++) {
            if (x % i == 0 && x != i) {
                break;
            }
            if (x % i == 0 && x == i) {
                primo = true;
            }
        }

        return primo;
    }
}
