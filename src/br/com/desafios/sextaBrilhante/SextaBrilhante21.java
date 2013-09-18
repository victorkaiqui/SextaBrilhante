/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.desafios.sextaBrilhante;

import br.com.desafios.metodos.metodos;

/**
 *
 * @author @victorKaiqui
 * 
 * http://www.hamerski.com.br/sexta/main/show/21
 * 
 */
public class SextaBrilhante21 {

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

            while (metodos.primo(cont)) {

                string = String.valueOf(cont);
                String direitaEsquerda = string.substring(i, string.length());
                String esquerdaDireita = string.substring(0, string.length() - j);;

                if (!(direitaEsquerda.equals("") && esquerdaDireita.equals(""))) {

                    if (metodos.primo(Integer.valueOf(direitaEsquerda)) && metodos.primo(Integer.valueOf(esquerdaDireita))) {
                    
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
