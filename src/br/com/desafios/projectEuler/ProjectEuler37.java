/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.desafios.projectEuler;

import br.com.desafios.metodos.metodos;

/**
 *
 * @author @victorKaiqui
 *
 * http://projecteuler.net/problem=37
 *
 *
 */
public class ProjectEuler37 {

    public static void truncatablePrimes() {

        boolean status = true;
        boolean primo = false;

        int i = 1;
        int j = 1;
        int cont = 8;

        int qtd = 0;
        int sum = 0;

        String string;

        while (status) {

            while (metodos.primo(cont)) {

                string = String.valueOf(cont);
                String rightLeft = string.substring(i, string.length());
                String leftRight = string.substring(0, string.length() - j);;

                if (!(rightLeft.equals("") && leftRight.equals(""))) {

                    if (metodos.primo(Integer.valueOf(rightLeft)) && metodos.primo(Integer.valueOf(leftRight))) {

                        primo = true;
                    } else {
                        primo = false;
                        break;
                    }

                } else {
                    break;
                }

                i++;
                j++;
            }

            i = 1;
            j = 1;

            if (primo) {
                qtd++;
                sum += cont;
                primo = false;
                System.out.println(qtd + " ************* " + cont);
            }

            if (qtd == 11) {
                status = false;
            } else {
                cont++;
            }
        }

        System.out.println("Tot: " + sum);
    }
}
