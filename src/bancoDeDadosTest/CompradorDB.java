/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoDeDadosTest;

import Classes.Comprador;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Anderson Ferreira Câmara (andersonferreira1277@gmail.com)
 */
public class CompradorDB {

    public static void save(String nome, String cpf) {
        String sql = "INSERT INTO `agencia`.`comprador` (`nome`, `cpf`) VALUES ('" + nome + "', ' " + cpf + "')";
        Connection conn = Conexao.getInstance();
        try {
            Statement stm = conn.createStatement();
            stm.executeUpdate(sql);
            stm.close();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }

    public static void delete(Comprador c) {
        String sql = "DELETE FROM `agencia`.`comprador` WHERE `id_comprador`='" + c.getId().toString() + "';";
        Connection conn = Conexao.getInstance();
        try {
            Statement stm = conn.createStatement();
            System.out.println(stm.executeUpdate(sql));
            stm.close();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }

    public static int selecionarID(String cpf) {
        String nome = null;
        int id = 0;
        List l = new ArrayList();
        String sql = "select * from agencia.comprador where comprador.cpf='" + cpf + "'";
        Connection conn = Conexao.getInstance();
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                id = rs.getInt("id_comprador");
                nome = rs.getString("nome");
                cpf = rs.getString("cpf");
            }
            stm.close();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        System.out.println(nome);
        System.out.println(cpf);
        System.out.println("ID de retorno do método select" + id);
        return id;
    }

    public static void selecionarTudo() {

    }
    public static void selecionarMetadados () {
        String sql = "";
        Connection conn = Conexao.getInstance();
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            ResultSetMetaData rsmd = rs.getMetaData();            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public static void checarStatus () {
        Connection conn = Conexao.getInstance();
        try {
            DatabaseMetaData dbmd = conn.getMetaData();
            if (dbmd.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)) {
                System.out.println("Suporta TYPE_FORWARD_ONLY");
                if (dbmd.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) {
                    System.out.println(" e também suporta CONCUR_UPDATABLE");
                }
            }
            if (dbmd.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)) {
                System.out.println("Suporta TYPE_SCROLL_INSENSITIVE");
                if (dbmd.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
                    System.out.println(" e também suporta CONCUR_UPDATABLE");
                }
            }
            if (dbmd.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)) {
                System.out.println("Suporta TYPE_SCROLL_SENSITIVE");
                if (dbmd.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
                    System.out.println(" e também suporta CONCUR_UPDATABLE");
                }
            }
            Conexao.close(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void nomesParaUpperCase (){
        String sql = "SELECT id_comprador, nome, cpf FROM agencia.comprador;";
        Connection conn = Conexao.getInstance();
        try {
            Statement stm = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                rs.updateString("nome", rs.getString("nome").toUpperCase());
                rs.updateRow();
            }
            Conexao.close(conn, stm, rs);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
