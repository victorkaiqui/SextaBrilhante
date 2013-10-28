/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.desafios.projectEuler;

/**
 *
 * @author @victorKaiqui
 *
 * http://projecteuler.net/problem=33
 *
 */
public class ProjectEuler33 {

    public static void digitCancelingFractions() {
        
        double result = 0, resultLow = 0;
        int repeat;
        int d = 1;
        int n = 1;
        int a = 1, b = 1;

        for (int i = 10; i < 100; i++) {
            for (int j = 10; j < 100; j++) {
                repeat = comparacao(i, j);
                if (repeat != 0) {

                    if (String.valueOf(j).substring(0, 1).equals(String.valueOf(repeat))) {
                        b = Integer.valueOf(String.valueOf(j).substring(1, 2));
                    } else if (String.valueOf(j).substring(1, 2).equals(String.valueOf(repeat))) {
                        b = Integer.valueOf(String.valueOf(j).substring(0, 1));
                    }
                    if (String.valueOf(i).substring(0, 1).equals(String.valueOf(repeat))) {
                        a = Integer.valueOf(String.valueOf(i).substring(1, 2));
                    } else if (String.valueOf(i).substring(1, 2).equals(String.valueOf(repeat))) {
                        a = Integer.valueOf(String.valueOf(i).substring(0, 1));
                    }

                    if (a != 0 && b != 0) {
                        result = (double) i / j;
                        resultLow = (double) a / b;
                        if (result == resultLow && result < 1) {
                            System.out.println(i + " / " + j + " Simplificado: " + a + " / " + b);
                            n = n * a;
                            d = d * b;
                        }
                    }
                }
            }
        }

        System.out.println("Numerador: " + n + " denominador: " + d);
    }

    public static int comparacao(int i, int j) {
        int repetido = 0;

        if (String.valueOf(j).substring(0, 1).equals(String.valueOf(i).substring(0, 1))) {
            repetido = Integer.valueOf(String.valueOf(i).substring(0, 1));
        }
        if (String.valueOf(j).substring(0, 1).equals(String.valueOf(i).substring(1, 2))) {
            repetido = Integer.valueOf(String.valueOf(i).substring(1, 2));
        }
        if (String.valueOf(j).substring(1, 2).equals(String.valueOf(i).substring(0, 1))) {
            repetido = Integer.valueOf(String.valueOf(i).substring(0, 1));
        }
        if (String.valueOf(j).substring(1, 2).equals(String.valueOf(i).substring(1, 2))) {
            repetido = Integer.valueOf(String.valueOf(i).substring(1, 2));
        }

        return repetido;
    }
}
