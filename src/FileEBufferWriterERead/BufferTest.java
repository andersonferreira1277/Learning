/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileEBufferWriterERead;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Anderson Ferreira Câmara (andersonferreira1277@gmail.com)
 */
public class BufferTest {

    public static void main(String[] args) throws IOException {
        String caminho = System.getProperty("user.home");
        File arquivo = new File(caminho+"\\desktop\\desktop\\a.txt");
        FileWriter writer = new FileWriter(arquivo);
        try (BufferedWriter bw = new BufferedWriter(writer)) {
            bw.write("Nossa");
            bw.newLine();
            bw.write("Anderson");
            bw.flush();
        }
        FileReader reader = new FileReader(arquivo);
        BufferedReader bf = new BufferedReader(reader);
        String s;
        String  temp = "";
        while((s=bf.readLine()) != null){
            temp+=s+"\n";
        }
        System.out.println(temp);
    }
}
