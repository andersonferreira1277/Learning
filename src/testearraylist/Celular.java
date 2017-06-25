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
public class Celular implements Comparable<Celular>{

    private String nome;
    private String iMEI;
    private Double men;

    public Celular(String nome, String iMEI) {
        this.nome = nome;
        this.iMEI = iMEI;
    }

    public Double getMen() {
        return men;
    }

    public void setMen(Double men) {
        this.men = men;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getiMEI() {
        return iMEI;
    }

    public void setiMEI(String iMEI) {
        this.iMEI = iMEI;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.iMEI);
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
        final Celular other = (Celular) obj;
        if (!Objects.equals(this.iMEI, other.iMEI)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Celular{" + "nome=" + nome + ", iMEI=" + iMEI + '}';
    }

    @Override
    public int compareTo(Celular t) {
        return this.iMEI.compareTo(t.getiMEI());
    }
}
