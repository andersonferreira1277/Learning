/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testearraylist;

import java.util.Objects;

/**
 *
 * @author Anderson Ferreira Câmara (andersonferreira1277@gmail.com)
 */
public class NomesTest implements Comparable<NomesTest>{
    private String nome;

    public NomesTest(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.nome);
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
        final NomesTest other = (NomesTest) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "NomesTest{" + "nome=" + nome + '}';
    }
    
    @Override
    public int compareTo(NomesTest t) {
        return this.nome.compareTo(t.getNome());
    }
}
