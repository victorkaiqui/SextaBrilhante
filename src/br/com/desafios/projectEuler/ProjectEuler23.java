/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.desafios.projectEuler;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

/**
 *
 * @author @victorKaiqui
 *
 * http://projecteuler.net/problem=23
 *
 */
public class ProjectEuler23 {

    public static void nonAbundantSums() {
        int numMax = 28123;
        List<Integer> list = new ArrayList<>();
        HashSet<Integer> result = new HashSet<>();

        for (int i = 1; i < numMax; i++) {
            if (abundant(i)) {
                list.add(i);
            }
        }

        for (int i = 1; i < numMax; i++) {
            result.add(i);
        }


        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) + list.get(j) <= numMax) {
                    result.remove(list.get(i) + list.get(j));
                }
            }
        }
        int sum = 0;
        for (Integer e : result) {
            sum += e;
        }
        System.out.println(sum);
        System.out.println(result.size());
    }

    public static boolean abundant(int e) {
        boolean status = false;
        int soma = 0;

        for (int i = 1; i <= (e / 2); i++) {
            if (e % i == 0 && (e / 2) != 0) {
                soma += i;
            }
        }

        if (soma > e) {
            status = true;
        }

        return status;
    }
}
