/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.exer;

/**
 *
 * @author vpaz
 * 
 * http://www.hamerski.com.br/sexta/main/show/1
 * 
 */
public class Exer1 {

    public static void sequenciaMaisLonga(int n) {

        int cont, aux;
        int maiorValor = 0;
        int maiorQtd = 0;


        for (int i = 1; i <= n; i++) {
            cont = i;
            aux = 1;
            while (cont != 1) {

                if (cont % 2 == 0) {
                    cont = cont / 2;
                } else {
                    cont = (cont * 3) + 1;
                }
                aux++;
            }
            if (maiorQtd < aux) {
                maiorValor = i;
                maiorQtd = aux;
            }
        }
        System.out.println("Qtd " + maiorQtd);
        System.out.println("Valor " + maiorValor);




    }
}
