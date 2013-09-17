/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.exer;

import br.com.metodos.NumerosPrimos;

/**
 *
 * @author vpaz
 */
public class Exer21 {

    public static void primosCortados() {


        boolean status = true;
        boolean primo = false;

        int i = 1;
        int j = 1;
        int cont = 8;

        int qtd = 0;
        int soma = 0;

        String string;

        while (status) {

            while (NumerosPrimos.primo(cont)) {

                string = String.valueOf(cont);
                String direitaEsquerda = string.substring(i, string.length());
                String esquerdaDireita = string.substring(0, string.length() - j);;

                if (!(direitaEsquerda.equals("") && esquerdaDireita.equals(""))) {

                    System.out.println("<------------------------------ " + string + " ------------------------------>");

                    if (NumerosPrimos.primo(Integer.valueOf(direitaEsquerda)) && NumerosPrimos.primo(Integer.valueOf(esquerdaDireita))) {
                        System.out.println("Primo: Direita: " + direitaEsquerda + " esquerdaDireita: " + esquerdaDireita);
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
                soma += cont;
                primo = false;
                System.out.println(qtd + " ************* " + cont);
            }

            if (qtd >= 12) {
                status = false;
            } else {
                cont++;
            }
        }

        System.out.println("Total: " + soma);
    }
}
