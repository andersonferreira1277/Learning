/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacao;

/**
 *
 * @author Anderson Ferreira Câmara (andersonferreira1277@gmail.com)
 */
public class Serializacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String uri = System.getProperty("user.home") + "/desktop" + "/desktop" + "/arquivo.an";
        Aluno a = new Aluno(1, "Anderson", "teste");
        GravadorDeArquivos.gravarClases(a, uri);
        Aluno b = LeitorDeArquivos.leitorDeArquivos(uri);
        System.out.println(b);
    }
}
