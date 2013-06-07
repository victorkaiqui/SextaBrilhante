/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.exer;

/**
 *
 * @author vpaz
 */
public class exerQualMaiorFatorPrimo {

    public static void qualMaiorFatorPrimo(long j) {

        for (int i = 1; i <= j; i++) {

            if (primo(i)) {
                if (j % i == 0) {
                    System.out.println(i);
                }
            }
        }

    }

    public static boolean primo(long x) {

        boolean primo = false;

        if (x == 2 || x == 3) {

            return primo = true;
        }
        if (x % 2 == 0 && x != 2) {

            return primo = false;
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
