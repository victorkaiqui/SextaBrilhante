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
 * @author @victorKaiqui
 *
 * http://projecteuler.net/problem=35
 *
 */
public class ProjectEuler35 {

    List<String> lista = new ArrayList<>();

    public static void circularPrimes() {
        String s;
        List<Integer> list = new ArrayList<>();
        boolean status = false;
        
        for (int i = 0; i < 1000000; i++) {

            s = String.valueOf(i);
            
            if (metodos.primo(Long.valueOf(s))) {
                status = true;
                for (int j = 0; j < s.length(); j++) {
                    s = (String) s.subSequence(1, s.length()) + s.substring(0, 1);
                    if (metodos.primo(Long.valueOf(s))) {
                        status = true;
                    } else {
                        status = false;
                        break;
                    }
                }
            }

            if (status) {
                System.out.println(i);
                list.add(i);
            }
            status = false;
        }
        
        System.out.println(list.size());
    }
}
