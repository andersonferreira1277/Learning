/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package padroesDeProjetos.Adapter;

/**
 *
 * @author Anderson Ferreira Câmara (andersonferreira1277@gmail.com)
 */
public class Aplicacao {
    public static void main(String[] args) {
        Notebook n = new Notebook();
        CelularAdapter c = new CelularAdapter(new CelularAndroid());
        c.iniciar();
    }
}
