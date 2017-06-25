/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package serializacao;

import java.io.Serializable;

/**
 *
 * @author Anderson Ferreira Câmara (andersonferreira1277@gmail.com)
 */
public class Aluno implements Serializable{
    private int id;
    private String nome;
    private transient String password;
    private final String ESCOLANOME = "Anderson";

    public Aluno(int id, String nome, String password) {
        this.id = id;
        this.nome = nome;
        this.password = password;
    }
    
    @Override
    public String toString() {
        return "Aluno{" + "id=" + id + ", nome=" + nome + ", password=" + password + ", ESCOLANOME=" + ESCOLANOME + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
