/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.desafios.sextaBrilhante;

/**
 *
 * @author vpaz
 */
public class SextaBrilhante26 {

    public static void funcoesObtidasCancelandoDigitos() {
        double resultado = 0, resultadoMenor = 0;
        int repetido;
        int denominador = 1;
        int numerador = 1;
        int a = 1, b = 1;

        for (int i = 10; i < 100; i++) {
            for (int j = 10; j < 100; j++) {
                repetido = comparacao(i, j);
                if (repetido != 0) {

                    if (String.valueOf(j).substring(0, 1).equals(String.valueOf(repetido))) {
                        b = Integer.valueOf(String.valueOf(j).substring(1, 2));
                    } else if (String.valueOf(j).substring(1, 2).equals(String.valueOf(repetido))) {
                        b = Integer.valueOf(String.valueOf(j).substring(0, 1));
                    }
                    if (String.valueOf(i).substring(0, 1).equals(String.valueOf(repetido))) {
                        a = Integer.valueOf(String.valueOf(i).substring(1, 2));
                    } else if (String.valueOf(i).substring(1, 2).equals(String.valueOf(repetido))) {
                        a = Integer.valueOf(String.valueOf(i).substring(0, 1));
                    }

                    if (a != 0 && b != 0) {
                        resultado = (double) i / j;
                        resultadoMenor = (double) a / b;
                        if (resultado == resultadoMenor && resultado < 1) {
                            System.out.println(i + " / " + j + " Simplificado: " + a + " / " + b);
                            numerador = numerador * a;
                            denominador = denominador * b;
                        }
                    }
                }
            }
        }

        System.out.println("Numerador: " + numerador + " denominador: " + denominador);
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
