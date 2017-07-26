/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Classes;

import java.util.Objects;

/**
 *
 * @author Anderson Ferreira Câmara (andersonferreira1277@gmail.com) Ufal
 */
public class Comprador {
    private Integer id;
    private String nome;
    private String cpf;

    public Comprador(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id){
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Comprador other = (Comprador) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Comprador{" + "nome=" + nome + ", cpf=" + cpf + '}';
    }
    
       
}
