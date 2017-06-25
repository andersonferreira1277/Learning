/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileEBufferWriterERead;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Arrays;

/**
 *
 * @author Anderson Ferreira Câmara (andersonferreira1277@gmail.com)
 */
public class ClasseFile {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        //Criando e escrevendo um arquivo
        String property = System.getProperty("user.home");
        File arquivo = new File(property + "\\Desktop\\arquivo.txt");
        
        String s = System.lineSeparator();
        try (FileWriter escreverArquivo = new FileWriter(arquivo)) {
            escreverArquivo.write("Escrevendo no arquivo\r\n"
                    + "Pulando uma linha");
            escreverArquivo.flush();
        }

        // Lendo e imprimindo um arquivo
        try (FileReader arquivoRead = new FileReader(arquivo)) {
            char[] chars = new char[arquivoRead.read()];
            arquivoRead.read(chars);//Retorna o caracteres lidos(int) e coloca dentro de chars o caracteres
            System.out.println(chars);
        }
    }

}
