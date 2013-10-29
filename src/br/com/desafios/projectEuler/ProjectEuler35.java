/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.desafios.projectEuler;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author @victorKaiqui
 *
 * http://projecteuler.net/problem=35
 *
 */
public class ProjectEuler35 {

    List<String> lista = new ArrayList<>();

    public void circularPrimes() {
        ProjectEuler35 p = new ProjectEuler35();
        p.permutation("", "197");

        System.out.println(lista);
    }

    public void permutation(String prefix, String str) {
        int n = str.length();
        if (n == 0) {
            System.out.println(prefix);
            lista.add(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
            }
        }
    }

}
