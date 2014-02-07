/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.desafios.projectEuler;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vpaz
 */
public class ProjectEuler45 {

    public static void triangularPentagonalAndHexagonal() {

        List<String> listTriangular = new ArrayList<String>();
        List<String> listPentagonal = new ArrayList<String>();
        List<String> listHexagonal = new ArrayList<String>();

        for (int i = 1; i <= 10000; i++) {
            listTriangular.add(String.valueOf((i * (i + 1)) / 2));
            listPentagonal.add(String.valueOf((i * (3 * i - 1)) / 2));
            listHexagonal.add(String.valueOf(i * (2 * i - 1)));
        }

        for (int i = 0; i < 10000; i++) {
            for (int j = 0; j < 10000; j++) {
                for (int k = 0; k < 10000; k++) {
                    if ((listTriangular.get(i).equals(listPentagonal.get(j)))
                            && (listPentagonal.get(j).equals(listHexagonal.get(k)))) {
                        System.out.println("---------- " + listTriangular.get(i));
                        System.out.println("---------- " + listPentagonal.get(j));
                        System.out.println("---------- " + listHexagonal.get(k));
                    }
                }
            }
        }
        System.out.println("Vish, FUDEU");
    }
}
