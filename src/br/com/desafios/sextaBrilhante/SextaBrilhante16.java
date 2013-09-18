/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.desafios.sextaBrilhante;

/**
 *
 * @author @victorKaiqui
 *
 * http://www.hamerski.com.br/sexta/main/show/16
 *
 */
public class SextaBrilhante16 {

    public static void numeroTriangularDivisivel() {

        boolean status = true;
        boolean status2 = true;

        int n = 12374;
        int ate = 550;
        int num = 0;

        int qtd = 0;
        int cont = 1;

        while (status) {

            num = numeroTriangular(n);

            while (status2) {

                if (num % cont == 0) {
                    qtd++;
                }

                if ((num / 2) == cont || num == 1) {
                    status2 = false;
                }

                cont++;
            }

            System.out.println("Posicão: " + n + " numero: " + num + " qtd de fatores " + qtd);

            if (qtd >= ate) {

                status = false;

                System.out.println("---------------------------Posicão: " + n + " numero: " + num + " qtd de fatores " + qtd);
            }

            status2 = true;
            cont = 1;
            qtd = 1;
            n++;

        }
    }

    public static int numeroTriangular(int n) {

        int valorN = 0;

        valorN = (n * (n + 1)) / 2;

        return valorN;
    }
}
