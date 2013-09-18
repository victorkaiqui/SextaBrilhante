/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.desafios.sextaBrilhante;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author @victorKaiqui
 * 
 * http://www.hamerski.com.br/sexta/main/show/3
 * 
 */
public class SextaBrilhante03 {

    public static void ciclosReciprocos() {
        BigDecimal numeroMax = new BigDecimal(950);
        int quantidade = 0;
        BigDecimal numeroResultado = new BigDecimal(0);
        BigDecimal cont = new BigDecimal(2);
        
        while (cont.compareTo(numeroMax) < 1) {
            
            BigDecimal valor = new BigDecimal(1).divide(cont, 1000, RoundingMode.HALF_UP);
            
            String resultado = String.valueOf(valor).replace("0.00", "");
            resultado = resultado.replace("0.0", "");
            resultado = resultado.replace("0.", "");
            
            String valorRec = resultado.substring(10, 20);
            
            for (int cont2 = 11; cont2 < 990; cont2++) {
                if (resultado.substring(cont2, cont2 + 10).equals(valorRec)) {
                    System.out.println(cont + ": " + (cont2 - 10));
                    if ((cont2 - 10) > quantidade) {
                        quantidade = cont2 - 10;
                        numeroResultado = cont;
                    }
                    cont2 = 4800;
                }
            }

            cont = cont.add(new BigDecimal(1));
        }
        
        System.out.println("RESULTADO: ");
        System.out.println(numeroResultado + "->" + quantidade);
    }
}
