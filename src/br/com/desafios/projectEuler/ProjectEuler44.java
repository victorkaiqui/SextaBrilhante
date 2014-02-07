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
public class ProjectEuler44 {

    List<String> li = new ArrayList<>();
    boolean status = false;
    String val;

    public void pentagonNumbers() {

        if (status) {
            System.out.println(val);
        } else {
            li = generatePetagon(li);

            for (String pj : li) {
                for (String pk : li) {

                    for (String s : li) {

                        if (Integer.valueOf(pk) - Integer.valueOf(pj) == Integer.valueOf(s)
                                && Integer.valueOf(pk) != 0
                                && Integer.valueOf(pj) != 0
                                && Integer.valueOf(s) != 0) {                            

                            for (String d : li) {

                                if (Integer.valueOf(pj) + Integer.valueOf(pk) == Integer.valueOf(d)
                                        && Integer.valueOf(pk) != 0
                                        && Integer.valueOf(pj) != 0
                                        && Integer.valueOf(s) != 0) {

                                    val = String.valueOf(Integer.valueOf(pk) - Integer.valueOf(pj));
                                    status = true;
                                    
                                    System.out.println("*****************************************");
                                    System.out.println("***" + pj + " + " + pk + " = " + (Integer.valueOf(pj) + Integer.valueOf(pk)) + "***");
                                    System.out.println("***" + pk + " - " + pj + " = " + val + "***");
                                    System.out.println("*****************************************");
                                    
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            pentagonNumbers();
        }
    }

    public List<String> generatePetagon(List<String> list) {
        int l = list.size();

        while (list.size() < l + 500) {
            list.add(String.valueOf((list.size() * (3 * list.size() - 1)) / 2));
        }

        return list;
    }
}
