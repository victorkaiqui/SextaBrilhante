/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.exer;

/**
 *
 * @author vpaz
 */
public class exerFormasDeTroco {

    public static void formasDeTroco() {

        int cont = 0;
        int c1;
        int c5;
        int c10;
        int c25;
        int c50;
        int c100;

        for (c100 = 0; c100 <= 400; c100 = c100 + 100) {
            for (c50 = 0; c50 <= 400; c50 = c50 + 50) {
                for (c25 = 0; c25 <= 400; c25 = c25 + 25) {
                    for (c10 = 0; c10 <= 400; c10 = c10 + 10) {
                        for (c5 = 0; c5 <= 400; c5 = c5 + 5) {
                            for (c1 = 0; c1 <= 400; c1 = c1 + 1) {
                                int soma = c100 + c50 + c25 + c10 + c5 + c1;
                                if (soma == 400) {
                                    System.out.println("1c: " + c1 + " 5c: " + c5 + " 10c: " + c10 + " 25c: " + c25 + " 50c: " + c50 + " 1r: " + c100);
                                    cont++;
                                }
                            }
                        }
                    }
                }
            }
        }
        
        System.out.println("Total: " + cont);
    }
}
