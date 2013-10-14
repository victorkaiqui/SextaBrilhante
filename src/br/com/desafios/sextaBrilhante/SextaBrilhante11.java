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
 * http://www.hamerski.com.br/sexta/main/show/11
 *
 */
public class SextaBrilhante11 {

    public static void calcularExponenciacaoEficiente() {
        int max = 69;
        int total = 0;
        List<No> listaNos = new ArrayList<No>();        
        int cont = 0;
        
        while (listaNos.size() <= 100) {
            List<No> listaNosAux, listaNosInserir = new ArrayList<No>();
            listaNosAux = listaNos;
            No noCorrente = listaNos.get(cont);
            for (No noItem : listaNosAux) {
                if (pertence(noItem, noCorrente, listaNos)) {
                    if (!inserido(noCorrente.getValor() + noItem.getValor(), listaNos, listaNosInserir)) {
                        // listaNosInserir.add(new No(noCorrente.getValor() + noItem.getValor(), noCorrente.getValor(), (noCorrente.qtde + 1)));
                    }
                }
            }
            for (No noItem : listaNosInserir) {
                listaNos.add(noItem);
            }
            cont++;
        }
        imprimir(listaNos, max, total);
    }

    
    public static boolean pertence(No noComparar, No noCorrente, List<No> listaNos) {
        if (noCorrente.getPai() == noComparar.getValor() || noCorrente.getValor() == noComparar.getValor()) {
            return true;
        } else {
            for (No noItem : listaNos) {
                if (noItem.getValor() == noCorrente.getPai()) {
                    return pertence(noComparar, noItem, listaNos);
                }
            }
        }
        return false;
    }

    public static void imprimir(List<No> nosImprimir, int max, int total) {
        for (No item : nosImprimir) {
            if (item.getValor() <= max) {
                item.imprimir();
                total += item.getQtde();
            }
        }
        System.out.println("\nTOTAL: " + total);
        int aux = 0;
        for (No item : nosImprimir) {
            if (item.getValor() <= max) {
                if (item.getQtde() != aux) {
                    System.out.print("\n");
                    aux = item.getQtde();
                }
                System.out.print(item.getValor() + "(" + item.getPai() + ")	");
            }
        }
    }

    private static boolean inserido(int i, List<No> listaNos, List<No> listaNosInserir) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public class No {

        Integer valor;
        Integer pai;
        Integer qtde;

        public Integer getValor() {
            return valor;
        }

        public void setValor(Integer valor) {
            this.valor = valor;
        }

        public Integer getPai() {
            return pai;
        }

        public void setPai(Integer pai) {
            this.pai = pai;
        }

        public Integer getQtde() {
            return qtde;
        }

        public void setQtde(Integer qtde) {
            this.qtde = qtde;
        }

        public No(Integer valor, Integer pai, Integer qtde) {
            super();
            this.valor = valor;
            this.pai = pai;
            this.qtde = qtde;
        }

        public void imprimir() {
            System.out.print("VALOR: " + valor + "  PAI: " + pai + "  QTDE: " + qtde + "\n");
        }
    }
}
