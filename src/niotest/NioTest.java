/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package niotest;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

/**
 *
 * @author Anderson Ferreira Câmara (andersonferreira1277@gmail.com)
 */
public class NioTest {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        String caminho = System.getProperty("user.home");
        Path p1 = Paths.get(caminho, "desktop", "desktop", "estudo","subpasta","subpasta");
        Path destino = Paths.get(caminho, "desktop", "desktop","copiado");
        Path arquivo = Paths.get(caminho, "desktop", "desktop", "estudo", "arquivo.txt");
        Files.createDirectories(p1);
        try {
            Files.createFile(arquivo);
        } catch (FileAlreadyExistsException e) {
            System.out.println("O arquivo já existe");
        }
        Files.copy(p1, destino, StandardCopyOption.REPLACE_EXISTING);
    }

}
