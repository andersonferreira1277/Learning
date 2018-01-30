/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuetest;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author Anderson Ferreira Câmara (andersonferreira1277@gmail.com)
 */
public class QueueTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue<String> teste = new PriorityQueue();
        teste.add("A");
        teste.add("D");
        teste.add("C");
        teste.add("E");
        teste.forEach((String i) -> {
            System.out.println(i);
        });
    }
}