package dateTest;

import java.util.Calendar;
import java.util.Date;

public class DataTest {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        Date inicio = new Date();
        c.setTime(inicio);
        c.add(Calendar.DATE, -30);  //Valor referente a 1 m�s
        Date data = c.getTime();
        
        System.out.println(inicio);
        
        System.out.println(data);
        
        
    }
}
