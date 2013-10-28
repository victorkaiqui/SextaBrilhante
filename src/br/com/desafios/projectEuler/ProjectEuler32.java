/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.desafios.projectEuler;

import java.util.HashSet;

/**
 *
 * @author @victorKaiqui
 *
 * http://projecteuler.net/problem=32
 *
 */
public class ProjectEuler32 {

    public static void pandigitalProducts() {
        long produto = 0;
        long soma = 0;

        String num;
        boolean status = false;
        HashSet<Long> lista = new HashSet<>();

        for (int i = 0; i < 9999; i++) {
            for (int j = 0; j < 9999; j++) {

                produto = i * j;

                num = String.valueOf(i) + String.valueOf(j) + String.valueOf(produto);

                if (num.length() == 9) {
                    for (int k = 1; k <= num.length(); k++) {
                        if (num.contains(String.valueOf(k))) {
                            status = true;
                        } else {
                            status = false;
                            break;
                        }
                    }
                    if (status) {
                        System.out.println(i + " " + j + " " + produto);
                        lista.add(produto);
                    }
                }
            }
        }

        for (Long e : lista) {
            soma += e;
        }
        System.out.println(soma);
    }
}
