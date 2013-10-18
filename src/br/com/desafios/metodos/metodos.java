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

    public static long soma(long x) {

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

    public static BigInteger fibonacci(BigInteger n) {
        if (n.equals(BigInteger.ZERO)) {
            return BigInteger.ZERO;
        }
        if (n.equals(BigInteger.ONE)) {
            return BigInteger.ONE;
        }
        return fibonacci(n.subtract(BigInteger.ONE)).add(fibonacci(n.subtract(new BigInteger("2"))));
    }

    public static long fatorial(long n) {
        long fat = 1;

        for (int i = 2; i <= n; i++) {
            fat *= i;
        }
        return fat;
    }

    public static BigInteger fatorial(BigInteger n) {
        if (n.equals(BigInteger.ZERO)) {
            return BigInteger.ONE;
        }
        BigInteger i = n.subtract(BigInteger.ONE);
        while (i.compareTo(BigInteger.ZERO) > 0) {
            n = n.multiply(i);
            i = i.subtract(BigInteger.ONE);
        }
        return n;
    }
}
