/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.desafios.projectEuler;

import br.com.desafios.metodos.metodos;

/**
 *
 * @author @victorKaiqui
 *
 * http://projecteuler.net/problem=34
 *
 */
public class ProjectEuler34 {

    public static void digitFactorials() {

        int sum = 0;
        int sumFact = 0;
        int inA, inB;

        for (int i = 3; i < 100000000; i++) {

            inA = 0;
            inB = 1;
            sum = 0;
            
            for (int j = 1; j <= String.valueOf(i).length(); j++) {
                sum += metodos.fatorial(Integer.valueOf(String.valueOf(i).substring(inA, inB)));
                inA++;
                inB++;
            }

            if (i == sum) {
                sumFact += i;
                System.out.println(i);
            }
        }
        System.out.println("Sum: " + sumFact);
    }
}
