/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testiterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Anderson Ferreira Câmara (andersonferreira1277@gmail.com)
 */
public class TestIterator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Produto a = new Produto("1", "Café", 15.00f);
        Produto b = new Produto("1", "Pão", 1.00f);
        Produto c = new Produto("1", "Oléo", 10.00f);
        Produto d = new Produto("1", "CupNoodles", 3.00f);
        Produto e = new Produto("1", "Bono", 2.00f);
        List<Produto> produtos = new ArrayList();
        produtos.add(a);
        produtos.add(b);
        produtos.add(c);
        produtos.add(d);
        produtos.add(e);
        produtos.forEach((i) -> {
            System.out.println(i);
        });
        System.out.println("===================================");
        Iterator<Produto> produtoIterator = produtos.iterator();
        while (produtoIterator.hasNext()) {
            if (produtoIterator.next().getPreco() == 2.00f) {
                produtoIterator.remove();
            }
        }
        produtos.forEach((i) -> {
            System.out.println(i);});
    }

}
