/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filefordirectory;

import java.io.File;

/**
 *
 * @author Anderson Ferreira Câmara (andersonferreira1277@gmail.com)
 */
public class FileForDirectory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String caminho = System.getProperty("user.home");
        File arquivo = new File(caminho+"\\desktop\\desktop\\teste");
        boolean pasta = arquivo.mkdir();
        System.out.println(pasta);
    }
    
}
