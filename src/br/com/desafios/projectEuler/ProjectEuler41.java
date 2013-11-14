/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.desafios.projectEuler;

import br.com.desafios.metodos.metodos;

/**
 *
 * @author vpaz
 */
public class ProjectEuler41 {

    
    public static void pandigitalPrime() {

        long bigger = 0; 

        for (int i = 10; i < 100000000; i++) {
                        
            if (metodos.primo(i) && metodos.pandigital(i)) {               
  
                if (bigger < i) {
                    System.out.println(i);
                    bigger = i;
                }
                
            }
        }
        System.out.println(bigger);
    }
}
