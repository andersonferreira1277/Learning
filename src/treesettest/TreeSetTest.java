/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treesettest;

import java.util.NavigableSet;
import java.util.TreeSet;

/**
 *
 * @author Anderson Ferreira Câmara (andersonferreira1277@gmail.com)
 */
public class TreeSetTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Produto a = new Produto("1", "Café", 15.00f);
        Produto b = new Produto("2", "Pão", 1.00f);
        Produto c = new Produto("3", "Oléo", 10.00f);
        Produto d = new Produto("4", "CupNoodles", 3.00f);
        Produto e = new Produto("5", "Bono", 2.00f);
        Celular ce1 = new Celular("Iphone 7", "12");
        NavigableSet<Produto> navProd = new TreeSet();
        NavigableSet<Celular> navCell = new TreeSet();
        navProd.add(a);
        navProd.add(b);
        navProd.add(c);
        navProd.add(d);
        navProd.add(e);
        navCell.add(ce1);
        navProd.forEach((i) -> {
            System.out.println(i);
        });
        navCell.forEach((i) -> {
            System.out.println(i);
        });
    }

}
