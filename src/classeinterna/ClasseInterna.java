/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classeinterna;

/**
 *
 * @author Anderson Ferreira Câmara (andersonferreira1277@gmail.com)
 */
public class ClasseInterna {

    /**
     * @param args the command line arguments
     */
    private String nome = "Anderson";
    
    class Interna{
        public void verExterna(){
            System.out.println(nome);
        }
    }
    public static void main(String[] args) {
        ClasseInterna a = new ClasseInterna();
        ClasseInterna.Interna interna = a.new Interna();
        interna.verExterna();
    }
    
}

