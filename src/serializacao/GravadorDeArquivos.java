/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package serializacao;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Anderson Ferreira Câmara (andersonferreira1277@gmail.com)
 */
public class GravadorDeArquivos {
    public static void gravarClases(Object o, String uri) {
        try (ObjectOutputStream objeto = new ObjectOutputStream(new FileOutputStream(uri))){
            objeto.writeObject(o);
            objeto.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
