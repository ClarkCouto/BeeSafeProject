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

    public Regiao getRegiao() {
        return regiao;
    }   
}
