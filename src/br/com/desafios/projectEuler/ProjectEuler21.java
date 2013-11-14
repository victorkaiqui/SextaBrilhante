/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.desafios.projectEuler;

import java.util.HashSet;
import java.util.List;

/**
 *
 * @author @victorKaiqui
 *
 * http://projecteuler.net/problem=21
 *
 */
public class ProjectEuler21 {

    public static void start() {
        ProjectEuler21 p = new ProjectEuler21();
        p.amicableNumbers(p);
    }

    public void amicableNumbers(ProjectEuler21 p) {
        HashSet<Integer> list = new HashSet<>();
        long sum = 0;
        int a;
        int a1;
        int b;
        int b1;

        for (int i = 1; i < 10000; i++) {

            a = i;
            a1 = 0;
            b = 0;
            b1 = 0;

            for (int j = 1; j <= (a / 2); j++) {
                if (a % j == 0 && (a / 2) != 0) {
                    a1 += j;
                }
            }

            b = a1;

            for (int j = 1; j <= (b / 2); j++) {
                if (b % j == 0 && (b / 2) != 0) {
                    b1 += j;
                }
            }
            if (a1 > a) {
                if (a == b1 && a1 == b) {
                    list.add(a);
                    list.add(b);
                }
            }
        }

        for (Integer i : list) {
            sum += i;
        }

        System.out.println(sum);
    }
}
