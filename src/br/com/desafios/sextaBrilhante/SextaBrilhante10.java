/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.desafios.sextaBrilhante;

/**
 *
 * @author @victorKaiqui
 *
 * http://www.hamerski.com.br/sexta/main/show/10
 *
 */
public class SextaBrilhante10 {

    public static void diferencaDaSomaDosQuadrados() {
        int somaDosQuadrados = 0;
        int quadradosDaSoma = 0;
        int diferenca = 0;

        for (int i = 0; i <= 120; i++) {
            somaDosQuadrados += Math.pow(i, 2);
            quadradosDaSoma += i;
        }

        quadradosDaSoma = (int) Math.pow(quadradosDaSoma, 2);
        diferenca = quadradosDaSoma - somaDosQuadrados;

        System.out.println("Soma dos quadrados: " + somaDosQuadrados + " quadrado da soma: " + quadradosDaSoma + " Difereça: " + diferenca);

    }
}
