/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MapTest;
import java.util.HashMap;
import java.util.Map;
import treesettest.Produto;

/**
 *
 * @author Anderson Ferreira Câmara (andersonferreira1277@gmail.com)
 */
public class ConsumidorTest {
    public static void main(String[] args) {
        Consumidor a = new Consumidor("Anderson", "115");
        Consumidor b = new Consumidor("B", "115");
        Produto p = new Produto("1", "Café", 15.00f);
        Map<Consumidor, Produto> lista = new HashMap();
        lista.put(a, p);
    }
}
