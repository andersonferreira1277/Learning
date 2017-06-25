/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package equals;

import java.util.Objects;

/**
 *
 * @author Anderson Ferreira Câmara (andersonferreira1277@gmail.com)
 */
public class Celular {
    private String nome;
    private long iMEI;

    public Celular(String nome, long iMEI) {
        this.nome = nome;
        this.iMEI = iMEI;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getiMEI() {
        return iMEI;
    }

    public void setiMEI(long iMEI) {
        this.iMEI = iMEI;
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
        if (this.iMEI != other.iMEI) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }
    
}
