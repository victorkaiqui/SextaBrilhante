/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.desafios.metodos;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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
    static HashMap<BigInteger, BigInteger> cache = new HashMap<BigInteger, BigInteger>();
    static BigInteger TWO = new BigInteger("2");
    static BigInteger ONE = BigInteger.ONE;
    static BigInteger ZERO = BigInteger.ZERO;

    public static BigInteger fibonacci(BigInteger n) {

        if (n.equals(ZERO)) {
            return ZERO;
        }
        if (n.equals(ONE)) {
            return ONE;
        }
        if (cache.containsKey(n)) {
            return cache.get(n);
        }

        // odd
        if (n.testBit(0)) {
            BigInteger n2 = n.shiftRight(1);
            BigInteger n3 = n2.add(ONE);
            BigInteger result = fibonacci(n2).multiply(fibonacci(n2)).add(fibonacci(n3).multiply(fibonacci(n3)));
            cache.put(n, result);
            return result;
        } // even
        else {
            BigInteger n2 = n.shiftRight(1);
            BigInteger n3 = n2.subtract(ONE);
            BigInteger result = fibonacci(n2).multiply(fibonacci(n2).add(fibonacci(n3).add(fibonacci(n3))));
            cache.put(n, result);
            return result;
        }
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

    public static List<String> permuteString(String beginningString, String endingString) {
        List<String> lista = new ArrayList<>();

        if (endingString.length() <= 1) {
            lista.add(beginningString + endingString);
            System.out.println(beginningString + endingString);
        } else {
            for (int i = 0; i < endingString.length(); i++) {
                String newString = endingString.substring(0, i) + endingString.substring(i + 1);
                permuteString(beginningString + endingString.charAt(i), newString);
            }
        }
        return lista;
    }

    public static boolean pandigital(long i) {

        String s = String.valueOf(i);
        boolean status = false;

        for (int j = 1; j <= s.length(); j++) {
            if (s.contains(String.valueOf(j))) {
                status = true;
            } else {
                status = false;
                break;
            }
        }

        return status;
    
    }
}
