/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.desafios.sextaBrilhante;

/**
 *
 * @author @victorKaiqui
 * 
 * http://www.hamerski.com.br/sexta/main/show/24
 * 
 */
public class SextaBrilhante24 {

    public static void potenciasQuintasDosDigitos() {
        String s;
        long soma = 0;
        long cont = 2;
        long valor = 0;
        int t, j;

        boolean status = true;

        while (status) {

            s = String.valueOf(cont);
            j = 0;
            valor = 0;
            
            for (int i = 1; i <= s.length(); i++) {
                t = Integer.valueOf(s.substring(s.length() - i, s.length() - j));
                valor += Math.pow(t, 5);
                j++;
            }
            if (valor == cont) {
                System.out.println(valor);
                soma += cont;
            }

            if (cont <= 100000000) {
                cont++;
            } else {
                status = false;
            }
        }
        System.out.println("Soma: " + soma);
    }
}
