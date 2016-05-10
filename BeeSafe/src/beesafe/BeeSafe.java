/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beesafe;

import java.util.List;

/**
 *
 * @author Clark
 */
public class BeeSafe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BaseDeDados bd = new BaseDeDados();
        
        bd.criarRegiao("Norte");
        bd.criarRegiao("Sul");
        bd.criarRegiao("Norte");
        bd.criarRegiao("Leste");
        bd.criarRegiao("Oeste");
        bd.criarRegiao("Centro");
        System.out.println("\n===================");
        System.out.println("REGIÕES CADASTRADAS");
        System.out.println("===================");
        List<Regiao> regioes = bd.getRegioes();
        int count = 0;
        for(Regiao r : regioes){
            count++;
            System.out.println(count +" = " + r.getNome());
        }
        
        System.out.println("");
        bd.criarBairro("Cristo Redentor", "Norte");
        bd.criarBairro("Centro Histórico", "Centro");
        bd.criarBairro("Centro Histórico", "Centro");
        bd.criarBairro("Sarandi", "Norte");
        bd.criarBairro("Cristal", "Sul");
        bd.criarBairro("Partenon", "Leste");
        
        System.out.println("\n===================");
        System.out.println("BAIRROS CADASTRADOS:");
        System.out.println("===================");
        List<Bairro> bairros = bd.getBairros();
        count = 0;
        for(Bairro b : bairros){
            count++;
            System.out.println(count +" = " + b.getNome() + " - " + b.getRegiao());
        }
    }
    
}
