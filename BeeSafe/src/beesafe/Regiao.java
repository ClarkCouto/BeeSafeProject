/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beesafe;

/**
 *
 * @author Clark
 */
public class Regiao {
    private String nomeRegiao;

    public Regiao(String nome) {
        this.nomeRegiao = nome;
    }

    public String getNome() {
        return nomeRegiao;
    }
    
    @Override
    public String toString(){
         return this.getNome();
    }
}
