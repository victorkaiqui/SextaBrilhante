/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.exer;

/**
 *
 * @author vpaz
 */
public class exerSequenciaMaisLonga {

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
