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
 * http://projecteuler.net/problem=40
 *
 *
 */
public class ProjectEuler40 {

    public static void ChampernownesConstant() {

        String s = "0123456789";
        int i = 1;
        while (s.length() <= 1000000) {
            s += i + "0" + i + "1" + i + "2" + i + "3" + i + "4" + i + "5" + i + "6" + i + "7" + i + "8" + i + "9";

            i++;
        }

        System.out.println(s);
        System.out.println(
                Integer.valueOf(s.substring(1, 2)) *
                Integer.valueOf(s.substring(10, 11)) * 
                Integer.valueOf(s.substring(100, 101)) *
                Integer.valueOf(s.substring(1000, 1001)) *
                Integer.valueOf(s.substring(10000, 10001)) *
                Integer.valueOf(s.substring(100000, 100001)) *
                Integer.valueOf(s.substring(1000000, 1000001))                
                );
    }
}
