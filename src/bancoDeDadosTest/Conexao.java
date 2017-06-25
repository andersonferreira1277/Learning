/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoDeDadosTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

/**
 *
 * @author Anderson Ferreira Câmara (andersonferreira1277@gmail.com)
 */
public class Conexao {

    private static Connection conn;

    private Conexao() {
            String url = "jdbc:mysql://localhost:3306/agencia";
            String user = "root";

            //Caixa de texto para digitar a senha
            JPasswordField pass = new JPasswordField();
            String[] options = new String[]{"OK", "Cancel"};
            String senha = "";
            int option = JOptionPane.showOptionDialog(null, pass, "Digite a senha do bando de dados:", JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
            if (option == 0) {
                char[] password = pass.getPassword();
                senha = String.copyValueOf(password);
            }// fim

            try {
                conn = DriverManager.getConnection(url, user, senha);
            } catch (SQLException sQLException) {
                sQLException.printStackTrace();
            }
        }

    public static Connection getInstance() {
        if (conn == null) {
            conn = (Connection) new Conexao();
        }
        return conn;
    }

    public static void close(Connection c) {
        if (c != null) {
            try {
                c.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void close(Connection c, Statement s) {
        close(c);
        if (s != null) {
            try {
                s.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
    public static void close(Connection c, Statement s, ResultSet rs){
        close(c, s);
        try {
            rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
