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
public class BinarySearchTest {

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList();
        numeros.add(87878);
        numeros.add(7676);
        numeros.add(6565);
        numeros.add(5454);
        numeros.add(123);
        Collections.sort(numeros);
        System.out.println(Collections.binarySearch(numeros, 5000));;
        // Caso não exista o retorno é: (-(ponto de inserção) -1)
    }
}
