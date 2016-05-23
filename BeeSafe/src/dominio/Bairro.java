/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.Objects;

/**
 *
 * @author Clark
 */
public class Bairro {
    private String nome;
    private Regiao regiao;

    public Bairro(String nome, Regiao regiao) {
        this.nome = nome;
        this.regiao = regiao;
    }
    
    public String getNome() {
        return nome;
    }

    public String getRegiao() {
        return regiao.getNome();
    }   
    
    public String getInformacoesBairro(){        
         return this.getNome() + " - " + this.getRegiao();
    }
    
    @Override
    public String toString(){
         return this.getNome();
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
        final Bairro other = (Bairro) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.regiao, other.regiao)) {
            return false;
        }
        return true;
    }
}
