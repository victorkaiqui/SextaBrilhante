/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.exer;

/**
 *
 * @author vpaz
 * 
 * http://www.hamerski.com.br/sexta/main/show/9
 * 
 */
public class Exer9 {

    public static void qualEONumeroPrimo(int n) {

        boolean valida = true;
        int cont = 0;
        int contPos = 0;

        while (valida) {

            cont++;

            if (primo(cont)) {

                contPos++;

                if (contPos == n) {
                    valida = false;
                }

                System.out.println(contPos + " -> " + cont);

            }
        }
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
