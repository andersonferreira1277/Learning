/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacao;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 *
 * @author Anderson Ferreira Câmara (andersonferreira1277@gmail.com)
 */
public class LeitorDeArquivos {

    public static Aluno leitorDeArquivos(String uri) {
        Aluno retorno = null;
        try (ObjectInputStream obj = new ObjectInputStream(new FileInputStream(uri))) {
            retorno =  (Aluno) obj.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return retorno;
    }
}
