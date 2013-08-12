/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.exer;

import java.util.HashSet;

/**
 *
 * @author vpaz
 * 
 * http://www.hamerski.com.br/sexta/main/show/15
 * 
 */
public class Exer15 {
    
    public static void palindromoDeProdutos() {
        
        int num = 0;
        String s = "";
        HashSet lista = new HashSet();
        
        for (int i = 0; i <= 999; i++) {
            for (int j = i; j <= 999; j++) {
                
                num = i * j;
                
                s = String.valueOf(num);
                
                if (num >= 300000) {
                    StringBuilder palindromo = new StringBuilder(s).reverse();
                    if (palindromo.toString().equals(s)) {
                        lista.add(s);
                        System.out.println(s + " " + i + " " + j);
                    }
                    
                }
            }
        }
    }
}
