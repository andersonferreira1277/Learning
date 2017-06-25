/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equals;

/**
 *
 * @author Anderson Ferreira Câmara (andersonferreira1277@gmail.com)
 */
public class EqualsTest {

    public static void main(String[] args) {
        Celular p1 = new Celular("moto g", Long.parseLong("6464464464644"));
        System.out.println(p1.hashCode());
    }
}
