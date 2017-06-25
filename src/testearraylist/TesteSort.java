/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testearraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Anderson Ferreira Câmara (andersonferreira1277@gmail.com)
 */
public class TesteSort {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList();
        nomes.add("Anderson");
        nomes.add("Juliana");
        nomes.add("Marilene");
        nomes.add("A");
        nomes.add(0, "Ana");
        Collections.sort(nomes);
        for (String i: nomes){
            System.out.println(i);}
    }
}
