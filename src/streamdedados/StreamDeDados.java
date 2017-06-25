/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamdedados;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Anderson Ferreira Câmara (andersonferreira1277@gmail.com)
 */
public class StreamDeDados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        gravadorTunado();
        leitorTunado();
    }

    private static void lerDados() {
        try (FileInputStream leitor = new FileInputStream("pasta/strem.txt")) {
            int leitura;
            while ((leitura = leitor.read()) != -1) {
                byte b = (byte) leitura;
                System.out.println(" " + b);
            }
        } catch (Exception e) {
        }
    }

    private static void gravador() {
        byte[] dados = {65, 66, 67, 68, 69, 70};
        try (FileOutputStream gravador = new FileOutputStream("pasta\\strem.txt")) {
            gravador.write(dados);
            System.out.println("Dados gravador com sucesso");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void gravadorTunado() {
        byte[] dados = {71,72,73,74,75,76,77,78};
        try (BufferedOutputStream bufferGravador = new BufferedOutputStream(new FileOutputStream("pasta/stream.txt"))) {
            bufferGravador.write(dados);
            bufferGravador.flush();
            System.out.println("Dados escritos com buffer");
        } catch (IOException e) {
                e.printStackTrace();
        }
    }
    
    private static void leitorTunado(){
        try (BufferedInputStream leitor = new BufferedInputStream(new FileInputStream("pasta/stream.txt"))) {
            int leitura;
            byte b;
            while((leitura = leitor.read()) != -1){
                b = (byte) leitura;
                System.out.println(" "+ b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
