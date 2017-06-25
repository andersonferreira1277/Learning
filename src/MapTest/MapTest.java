/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MapTest;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author Anderson Ferreira Câmara (andersonferreira1277@gmail.com)
 */
public class MapTest {

    public static void main(String[] args) {
        Map<String, String> dio = new LinkedHashMap();
        dio.put("1", "teste");
        dio.put("2", "teste2");
        dio.put("3", "teste3");
        dio.put("4", "teste4");
        dio.put("7", "teste5");
        dio.put("6", "teste6");
        for (String i : dio.keySet()) {
            System.out.println(i);
        }
        for (String i : dio.values()) {
            System.out.println(i);
        }
        System.out.println("for com dois valores ================================");
        for (Map.Entry<String, String> entry : dio.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
