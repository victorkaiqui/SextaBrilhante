/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.desafios.projectEuler;

import br.com.desafios.metodos.metodos;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vpaz
 */
public class ProjectEuler46 {

    public static void goldbachstherConjecture() {
        boolean find = true;
        int number = 0;
        List<Integer> prime = new ArrayList<>();
        List<Integer> oddComposite = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            if (metodos.primo(i)) {
                prime.add(i);
            } else if (i % 2 != 0) {
                oddComposite.add(i);
            }
        }

        int g = 1;
        int i = 1;
        int j = 1;

        while (find) {

            for (g = g; g <= oddComposite.size(); g++) {
                for (i = i; i <= oddComposite.size(); i++) {
                    for (j = j; j <= oddComposite.size(); j++) {
                        if (oddComposite.get(g) == prime.get(j) + 2 * Math.pow(i, 2)) {
                            System.out.println(g + " = " + i + " + 2 * " + j + "² ");
                            oddComposite.remove(g);
                            break;
                        }
                    }
                }
                if (g == oddComposite.size()) {
                    System.out.println(oddComposite);
                    find = false;
                }
            }
        }
    }
}
