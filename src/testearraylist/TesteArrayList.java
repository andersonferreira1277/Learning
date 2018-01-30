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
public class TesteArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Celular celular1 = new Celular("Galaxy S8", "z");
        Celular celular2 = new Celular("Moto Maxx", "c");
        Celular celular3 = new Celular("Iphone 7", "b");
        Celular celular4 = new Celular("I 7", "a");
        List<Celular> listaDeCelulares = new ArrayList();
        listaDeCelulares.add(celular1);
        listaDeCelulares.add(celular2);
        listaDeCelulares.add(celular3);
        listaDeCelulares.add(celular4);
        for (Celular i : listaDeCelulares) {
            System.out.println(i);
        }
        System.out.println("====================================");
        Collections.sort(listaDeCelulares);
        for (Celular i : listaDeCelulares) {
            System.out.println(i);
        }
    }

}
