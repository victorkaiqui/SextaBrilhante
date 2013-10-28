/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.desafios.projectEuler;

/**
 *
 * @author vpaz
 */
public class ProjectEuler31 {

    public static void coinSums() {

        int cont = 0;
        int value = 200;
        int c1;
        int c2;
        int c5;
        int c10;
        int c20;
        int c50;
        int c100;
        int c200;

        for (c200 = 0; c200 <= value; c200 = c200 + 200) {
            for (c100 = 0; c100 <= value; c100 = c100 + 100) {
                for (c50 = 0; c50 <= value; c50 = c50 + 50) {
                    for (c20 = 0; c20 <= value; c20 = c20 + 20) {
                        for (c10 = 0; c10 <= value; c10 = c10 + 10) {
                            for (c5 = 0; c5 <= value; c5 = c5 + 5) {
                                for (c2 = 0; c2 <= value; c2 = c2 + 2) {
                                    for (c1 = 0; c1 <= value; c1 = c1 + 1) {
                                        int soma = c200 + c100 + c50 + c20 + c10 + c5 + c2 + c1;
                                        if (soma == value) {
                                            System.out.println("1c: " + c1 + "2c: " + c2 + " 5c: " + c5 + " 10c: " + c10 + " 25c: " + c20 + " 50c: " + c50 + " 1E: " + c100 + " 2E " + c200);
                                            cont++;
                                        }
                                    }
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
