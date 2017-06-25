/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locale;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

/**
 *
 * @author Anderson Ferreira Câmara (andersonferreira1277@gmail.com)
 */
public class ClasseLocale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // ISO 369 = pt=português BR=Brasil en= Inglês US= Estados Unidos
        Calendar c = Calendar.getInstance();
        c.set(2015, Calendar.DECEMBER, 23);
        Locale localeItaly = new Locale("it");
        Locale localeBrazil = new Locale("pt", "BR");
        Locale localeJapan = new Locale("ja");
        Locale localeUS = new Locale("en", "US");
        
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        System.out.println(df.format(c.getTime()));
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeBrazil);
        System.out.println(df2.format(c.getTime()));
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeJapan);
        System.out.println(df3.format(c.getTime())+"\n");
        
        
        System.out.println(localeItaly.getDisplayLanguage());
        System.out.println(localeBrazil.getDisplayLanguage());
        System.out.println(localeJapan.getDisplayLanguage(localeItaly)); //A palavra Japonês em Italiano
        
        System.out.println(localeBrazil.getDisplayCountry(localeUS));
    }
    
}
