/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package RandomTest;

import java.util.Random;

/**
 *
 * @author Anderson Ferreira Câmara (andersonferreira1277@gmail.com)
 */
public class RandomTest {
    public static void main(String[] args) {
        Random random = new Random();
        int count = 0;
        while (count <= 10){
            System.out.println(random.nextInt(2));
            count++;
        }
    }
}
