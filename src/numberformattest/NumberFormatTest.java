/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberformattest;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author Anderson Ferreira Câmara (andersonferreira1277@gmail.com)
 */
public class NumberFormatTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float valor = 123.45f;
        Locale localeUS = new Locale("en", "US");
        Locale localeFR = new Locale("fr");
        NumberFormat[] nfa = new NumberFormat[5];
        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(localeUS);
        nfa[2] = NumberFormat.getCurrencyInstance();
        nfa[3] = NumberFormat.getCurrencyInstance(localeUS);
        nfa[4] = NumberFormat.getCurrencyInstance(localeFR);
        for(NumberFormat i : nfa){
            System.out.println(i.format(valor));}
    }
    
}
