/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.desafios.projectEuler;

import br.com.desafios.metodos.metodos;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vpaz
 */
public class ProjectEuler43 {

    BigInteger sum = BigInteger.ZERO;
    String pandigital = null;

    public static void subStringDivisibility() {

        ProjectEuler43 p = new ProjectEuler43();
        p.permuteString("", "0123456789");
        System.out.println("Soma " + p.sum);
    }

    public void permuteString(String beginningString, String endingString) {

        if (endingString.length() <= 1) {
            pandigital = (beginningString + endingString);

            String d1 = pandigital.substring(0, 1);
            String d2 = pandigital.substring(1, 2);
            String d3 = pandigital.substring(2, 3);
            String d4 = pandigital.substring(3, 4);
            String d5 = pandigital.substring(4, 5);
            String d6 = pandigital.substring(5, 6);
            String d7 = pandigital.substring(6, 7);
            String d8 = pandigital.substring(7, 8);
            String d9 = pandigital.substring(8, 9);
            String d10 = pandigital.substring(9, 10);

            if (Integer.valueOf(d2 + d3 + d4) % 2 == 0) {
                if (Integer.valueOf(d3 + d4 + d5) % 3 == 0) {
                    if (Integer.valueOf(d4 + d5 + d6) % 5 == 0) {
                        if (Integer.valueOf(d5 + d6 + d7) % 7 == 0) {
                            if (Integer.valueOf(d6 + d7 + d8) % 11 == 0) {
                                if (Integer.valueOf(d7 + d8 + d9) % 13 == 0) {
                                    if (Integer.valueOf(d8 + d9 + d10) % 17 == 0) {
                                        System.out.println(pandigital);
                                        sum = sum.add(new BigInteger(pandigital));
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int i = 0; i < endingString.length(); i++) {
                String newString = endingString.substring(0, i) + endingString.substring(i + 1);
                permuteString(beginningString + endingString.charAt(i), newString);
            }
        }

        pandigital = null;
    }
}
