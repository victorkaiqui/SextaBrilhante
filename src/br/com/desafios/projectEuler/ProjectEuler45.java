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

        List<Integer> listTriangular = new ArrayList<Integer>();
        List<Integer> listPentagonal = new ArrayList<Integer>();
        List<Integer> listHexagonal = new ArrayList<Integer>();

        for (int i = 1; i < 1000000; i++) {
            listTriangular.add((i * (i + 1)) / 2);
            listPentagonal.add((i * (3 * i - 1)) / 2);
            listHexagonal.add(i * (2 * i - 1));
        }

        for (int i = 284; i < 10000; i++) {
            for (int j = 164; j < 10000; j++) {
                for (int k = 142; k < 10000; k++) {
                    if (listTriangular.get(i).toString().equals(listPentagonal.get(j).toString()) && listPentagonal.get(j).toString().equals(listHexagonal.get(k).toString())) {
                        System.out.println("----------" + listTriangular.get(i));
                        System.out.println("----------" + listPentagonal.get(j));
                        System.out.println("----------" + listHexagonal.get(k));
                    }
                }
            }
        }
    }
}
