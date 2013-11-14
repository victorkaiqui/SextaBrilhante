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
 * http://projecteuler.net/problem=39
 *
 */
public class ProjectEuler39 {

    public static void integerRightTriangles() {

        int sum = 0;
        int sumBigger = 0;
        int pBigger = 0;
//        int p = 120;
        for (int p = 0; p <= 1000; p++) {

            for (int a = 1; a < p / 2; ++a) {
                for (int b = 1; b < p / 2; ++b) {
                    double c = java.lang.Math.sqrt((a * a) + (b * b));
                    if (Math.rint(c) == c && a + b + c == p) {
                        System.out.println(a + ", " + b + ", " + c + " perimeter: " + p);
                        sum++;
                    }
                }
            }
            if (sum / 2 > sumBigger) {
                pBigger = p;
                sumBigger = sum;
            }
            sum = 0;
        }
        System.out.println("Qtd: " + sumBigger + " perimeter: " + pBigger);
    }
}
