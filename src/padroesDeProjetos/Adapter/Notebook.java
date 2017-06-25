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
public class Notebook implements Dispositivo{

    @Override
    public void iniciar() {
        System.out.println("iniciar");
    }

    @Override
    public void desligar() {
        System.out.println("desligar");
    }

    @Override
    public void reiniciar() {
        System.out.println("reiniciar");
    }

}
