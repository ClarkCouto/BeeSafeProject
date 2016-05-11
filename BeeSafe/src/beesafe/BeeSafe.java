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
            System.out.println(count + " = " + r.toString());
        }
        
        System.out.println("");
        bd.criarBairro("Cristo Redentor", "Norte");
        bd.criarBairro("Centro Histórico", "Centro");
        bd.criarBairro("Centro Histórico", "Centro");
        bd.criarBairro("Sarandi", "Norte");
        bd.criarBairro("Cristal", "Sul");
        bd.criarBairro("Partenon", "Leste");
        
        System.out.println("\n=============================");
        System.out.println("BAIRROS CADASTRADOS:");
        System.out.println("=============================");
        List<Bairro> bairros = bd.getBairros();
        count = 0;
        for(Bairro b : bairros){
            count++;
            System.out.println(count +" = " + b.toString());
        }
        
        System.out.println(""); 
        bd.criarTipoViolencia("Agressão", "Fisica");
        bd.criarTipoViolencia("Discriminação", "Psicologica");
        bd.criarTipoViolencia("Estupro", "Sexual");
        bd.criarTipoViolencia("Estupro", "Sexual");  
        
        System.out.println("\n===============================");
        System.out.println("TIPOS DE VIOLÊNCIA CADASTRADOS:");
        System.out.println("===============================");
        List<TipoViolencia> tiposViolencia = bd.getTiposViolencia();
        count = 0;
        for(TipoViolencia tv : tiposViolencia){
            count++;
            System.out.println(count +" = " + tv.toString());
        }
        
                
        System.out.println("");    
        bd.criarEndereco("A", 1, "Cristo Redentor");
        bd.criarEndereco("B", 2, "Centro Histórico");
        bd.criarEndereco("C", 3, "Sarandi");
        bd.criarEndereco("D", 4, "Anchieta");
        
        System.out.println("\n===============================");
        System.out.println("ENDEREÇOS CADASTRADOS:");
        System.out.println("===============================");
        List<Endereco> enderecos = bd.getEnderecos();
        count = 0;
        for(Endereco e : enderecos){
            count++;
            System.out.println(count +" = " + e.toString());
        }
        
        System.out.println("");    
        bd.criarUsuario("Cristiano", "cris@gmail.com", "123456");
        bd.criarUsuario("Matheus", "matheus@gmail.com", "123456");
        bd.criarUsuario("Thayse", "thayse@gmail.com", "123456");
        System.out.println("\n===============================");
        System.out.println("USUÁRIOS CADASTRADOS:");
        System.out.println("===============================");
        List<Usuario> usuarios = bd.getUsuarios();
        count = 0;
        for(Usuario u : usuarios){
            count++;
            System.out.println(count +" = " + u.toString());
        }
                
        System.out.println("");    
        bd.criarOcorrencia(null, 0, null, null, null, null, null);
        System.out.println("\n===============================");
        System.out.println("OCORRÊNCIAS CADASTRADAS:");
        System.out.println("===============================");
        List<Ocorrencia> ocorrencias = bd.getOcorrencias();
        count = 0;
        for(Ocorrencia o : ocorrencias){
            count++;
            System.out.println(o.toString());
        }
        
    }
    
}
