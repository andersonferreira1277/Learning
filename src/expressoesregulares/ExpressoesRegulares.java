/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expressoesregulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Anderson Ferreira Câmara (andersonferreira1277@gmail.com)
 */
public class ExpressoesRegulares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //https://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html
        // \d - todos os digitos
        // \D tudo o que não for digito
        // \s espaços em branco \t \n \f \r
        // \S caractere que não é branco
        // \w caracteres de palavras a-z A-Z, digitos e _
        // \W tudo o que não for caractere de palavra
        // []
        // ? zero ou uma
        // * zero ou mais
        // + uma ou mais
        // {n,m} de n ate m
        // ( )
        // |
        // $
        // . coringa 1.3 = 123,133,1A3,1#3, 1 3
        // ^ [^abc]
        /*String regex = "[abc]";
        Pattern pattern = Pattern.compile(regex);
        String texto = "abcd8fce8";
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto: "+ texto);
        System.out.println("Indice: 0123456789");
        System.out.println("expressoes regulares "+matcher.pattern());
        System.out.println("posicoes encontradas");
        while(matcher.find()){
        System.out.print(matcher.start()+" ");}*/
        String teste = "teste";
        char[] testeChar;
        testeChar = teste.toCharArray();
        for(char i : testeChar){
            System.out.println(i);}
    }
    
}
