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
 * http://projecteuler.net/problem=36
 *
 */
public class ProjectEuler36 {

    public static void DoubleBasePalindromes() {
        int sum = 0;
        for (int i = 0; i < 1000000; i++) {
            String b = Integer.toBinaryString(i);

            if (palindromes(b) && palindromes(String.valueOf(i))) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

    public static boolean palindromes(String e) {
        boolean status = false;
        StringBuilder p = new StringBuilder(e).reverse();

        if (e.equals(p.toString())) {
            status = true;
        }
        return status;
    }
}
