/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.desafios.sextaBrilhante;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author @victorKaiqui
 * 
 * http://www.hamerski.com.br/sexta/main/show/2
 * 
 */
public class SextaBrilhante02 {

    public static void somasNaoAbundantes(int n) {
        
        int numeroMax = n;

        List<Integer> numerosAbloqueadontes = new ArrayList<>();
        List<Integer> resultado = new ArrayList<>();

        for (int cont = 2; cont <= numeroMax; cont++) {
            int soma = 0;
            for (int cont2 = cont; cont2 > 1; cont2--) {
                if (cont % cont2 == 0) {
                    soma += cont / cont2;
                }
            }
            if (soma > cont) {
                numerosAbloqueadontes.add(cont);
            }
        }
        for (int cont = 1; cont <= numeroMax; cont++) {
            resultado.add(cont);
        }
        String removidos = "[";
        for (int cont = 0; cont < numerosAbloqueadontes.size(); cont++) {
            for (int cont2 = cont; cont2 < numerosAbloqueadontes.size(); cont2++) {
                if ((numerosAbloqueadontes.get(cont) + numerosAbloqueadontes.get(cont2)) <= numeroMax) {
                    if (resultado.contains(numerosAbloqueadontes.get(cont) + numerosAbloqueadontes.get(cont2))) {
                        for (int cont3 = 0; cont3 < resultado.size(); cont3++) {
                            if (resultado.get(cont3).equals(numerosAbloqueadontes.get(cont) + numerosAbloqueadontes.get(cont2))) {
                                removidos += resultado.get(cont3) + ", ";
                                resultado.remove(cont3);
                            }
                        }
                    }
                }
            }
        }
        System.out.println("ABLOQUEADOENTES: " + numerosAbloqueadontes);
        System.out.println("REMOVIDOS:       " + removidos + "]");
        System.out.println("RESULTADO:       " + resultado);
        System.out.println("TOTAL:           " + resultado.size());
    }
}
