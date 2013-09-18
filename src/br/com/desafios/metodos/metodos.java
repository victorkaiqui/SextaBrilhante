/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.desafios.metodos;

import java.math.BigInteger;

/**
 *
 * @author vpaz
 */
public class metodos {

    public static boolean primo(long x) {

        boolean primo = false;

        if ((x % 2 == 0 && x != 2) || x == 0) {
            return primo;
        }

        for (int i = 2; i <= x; i++) {
            if (x % i == 0 && x == i) {
                primo = true;
            } else if (x % i == 0 && x != i) {
                break;
            }
        }

        return primo;
    }

    public static int soma(int x) {

        if (x % 10 == 0) {
            return 0;
        }

        return ((x % 10) + soma(x / 10));

    }

    public static BigInteger soma(BigInteger x) {

        if (x.compareTo(BigInteger.ONE) < 0) {
            return BigInteger.ZERO;
        }

        return x.mod(BigInteger.TEN).add(soma(x.divide(BigInteger.TEN)));

    }

    public static long fibonacci(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
