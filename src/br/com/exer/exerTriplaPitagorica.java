/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.exer;

/**
 *
 * @author vpaz
 */
public class exerTriplaPitagorica {

    public static void triplaPitagorica() {

        int c, valorTotal, valorAB;

        for (int a = 1; a <= 1040; a++) {

            for (int b = 1; b <= 1040; b++) {

                valorAB = (int) (Math.pow(a, 2) + Math.pow(b, 2));
                c = (int) Math.sqrt(valorAB);

                if (valorAB == Math.pow(c, 2)) {

                    valorTotal = a + b + c;

                    if (valorTotal == 1040) {

                        System.out.println("-----FINAL Valor A: " + a + " B: " + b + " C: " + c + "-----");
                        System.out.println("-----FINAL Resposta: " + a * b * c + "-----");
                        System.out.println(" ");

                    }
                }

            }
        }

    }
}
