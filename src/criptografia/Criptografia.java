/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package criptografia;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Anderson Ferreira Câmara (andersonferreira1277@gmail.com)
 */
public class Criptografia {

    public void cripttografar(String password) {
        try {
            MessageDigest algorithm = MessageDigest.getInstance("SHA-256");
            byte senha[] = algorithm.digest(password.getBytes("UTF-8"));
            System.out.println(senha);
            StringBuilder hexString = new StringBuilder();
            for (byte b : senha) {
                hexString.append(String.format("%02X", 0xFF & b));
            }
            String senha2 = hexString.toString();
            System.out.println(senha2);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
