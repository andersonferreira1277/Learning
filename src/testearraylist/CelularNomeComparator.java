/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testearraylist;

import java.util.Comparator;

/**
 *
 * @author Anderson Ferreira Câmara (andersonferreira1277@gmail.com)
 */
public class CelularNomeComparator implements Comparator<Celular> {

    @Override
    public int compare(Celular t, Celular t1) {
        return t.getNome().compareTo(t1.getNome());
    }

}
