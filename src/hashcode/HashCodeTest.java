/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hashcode;

/**
 *
 * @author Anderson Ferreira Câmara (andersonferreira1277@gmail.com)
 */
public class HashCodeTest {
    public static void main(String[] args) {
        String nome = "Anderson";
        String nome2 = "anderson";
        int num = 1;
        System.out.println(nome.hashCode());
        System.out.println(nome2.hashCode());
        System.out.println();
    }
}
