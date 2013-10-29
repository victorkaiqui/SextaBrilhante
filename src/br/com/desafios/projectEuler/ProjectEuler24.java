/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.desafios.projectEuler;

import br.com.desafios.metodos.metodos;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author @victorKaiqui
 *
 * http://projecteuler.net/problem=24
 *
 */
public class ProjectEuler24 {

    List<String> lista = new ArrayList<>();

    public static void permutation() {

        ProjectEuler24 p = new ProjectEuler24();
        p.permuteString("", "0123456789");

    }

    public void permuteString(String beginningString, String endingString) {

        if (endingString.length() <= 1) {
            lista.add(beginningString + endingString);
        } else {
            for (int i = 0; i < endingString.length(); i++) {
                String newString = endingString.substring(0, i) + endingString.substring(i + 1);
                permuteString(beginningString + endingString.charAt(i), newString);

            }
        }
        if (lista.size() == 1000001) {           
            System.out.println(lista.get(1000000-1));    
        }
    }
}
