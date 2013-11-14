/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.desafios.projectEuler;

import java.util.TreeSet;

/**
 *
 * @author @victorKaiqui
 *
 * http://projecteuler.net/problem=38
 *
 */
public class ProjectEuler38 {

    public static void pandigitalMultiples() {

        TreeSet list = new TreeSet();
        Integer i = 1;
        Integer j = 1;
        Integer cont = 0;
        String s = "";
        boolean status = true;

        while (cont <= 362880) {

            while (s.length() < 9) {
                s += String.valueOf(i * j);
                j++;
            }

            if (s.length() == 9) {
                for (int k = 1; k <= 9; k++) {
                    if (s.contains(String.valueOf(k))) {
                        status = true;
                    } else {
                        status = false;
                        break;
                    }
                }

                if (status) {
                    list.add(s);
                } else {
                    status = true;
                }

            }


            i++;
            j = 1;
            s = "";
            cont++;
        }
        System.out.println(list);
    }
}
