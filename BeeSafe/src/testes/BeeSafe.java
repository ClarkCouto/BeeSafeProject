/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import dominio.BaseDeDados;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Clark
 */
public class BeeSafe {
    private SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");

    public BeeSafe(){
    }
    
    public BaseDeDados iniciarBaseDeDados(){
        BaseDeDados bd = new BaseDeDados();
        
        bd.criarRegiao("Norte");
        bd.criarRegiao("Sul");
        bd.criarRegiao("Leste");
        bd.criarRegiao("Oeste");
        bd.criarRegiao("Centro");
        
        bd.criarBairro("Cristo Redentor", "Norte");
        bd.criarBairro("Centro Histórico", "Centro");
        bd.criarBairro("Sarandi", "Norte");
        bd.criarBairro("Cristal", "Sul");
        bd.criarBairro("Partenon", "Leste");
        bd.criarBairro("Anchieta", "Norte");
        
        
        bd.criarTipoViolencia("Agressao");
        bd.criarTipoViolencia("Discriminacao");
        bd.criarTipoViolencia("Estupro");
        
        bd.criarTipoUsuario("Comum");
        bd.criarTipoUsuario("Adm");
        
        bd.criarEndereco("A", 1, "Cristo Redentor");
        bd.criarEndereco("B", 2, "Centro Historico");
        bd.criarEndereco("C", 3, "Sarandi");
        bd.criarEndereco("D", 4, "Anchieta");
        
        bd.criarUsuario("Cristiano", "cristiano@gmail.com", "123456", "Adm");
        bd.criarUsuario("Matheus", "matheus@gmail.com", "123456", "Comum");
        bd.criarUsuario("Thayse", "thayse@gmail.com", "123456", "Comum");
        
        bd.criarOcorrencia("A", "1", "Cristo Redentor", "Cristiano", "Descricao 1", "Estupro", formatarData("01/01/2016"));
        bd.criarOcorrencia("B", "2", "Centro Histórico", "Thayse", "Descricao 2", "Discriminacao", formatarData("20/02/2016"));
        bd.criarOcorrencia("C", "3", "Sarandi", "Matheus", "Descricao 3", "Agressao", formatarData("10/03/2015"));        
        bd.criarOcorrencia("D", "4", "Anchieta", "Matheus", "Descricao 4", "Agressao", formatarData("25/04/2015"));
        
        return bd;
    }
    
    private Date formatarData(String data){
        Date dataFormatada = null;
        try{
            dataFormatada = formataData.parse(data);
        }
        catch(Exception e){}
        return dataFormatada;
    }
//import dominio.Bairro;
//import dominio.Endereco;
//import dominio.Ocorrencia;
//import dominio.Regiao;
//import dominio.TipoViolencia;
//import dominio.Usuario;
//import java.util.List;
//    public static void main(String[] args) {
//        BaseDeDados bd = new BaseDeDados();
//        
//        bd.criarRegiao("Norte");
//        bd.criarRegiao("Sul");
//        bd.criarRegiao("Norte");
//        bd.criarRegiao("Leste");
//        bd.criarRegiao("Oeste");
//        bd.criarRegiao("Centro");
//        System.out.println("\n===================");
//        System.out.println("REGIÕES CADASTRADAS");
//        System.out.println("===================");
//        List<Regiao> regioes = bd.getRegioes();
//        int count = 0;
//        for(Regiao r : regioes){
//            count++;
//            System.out.println(count + " = " + r.toString());
//        }
//        
//        System.out.println("");
//        bd.criarBairro("Cristo Redentor", "Norte");
//        bd.criarBairro("Centro Histórico", "Centro");
//        bd.criarBairro("Centro Histórico", "Centro");
//        bd.criarBairro("Sarandi", "Norte");
//        bd.criarBairro("Cristal", "Sul");
//        bd.criarBairro("Partenon", "Leste");
//        
//        System.out.println("\n=============================");
//        System.out.println("BAIRROS CADASTRADOS:");
//        System.out.println("=============================");
//        List<Bairro> bairros = bd.getBairros();
//        count = 0;
//        for(Bairro b : bairros){
//            count++;
//            System.out.println(count +" = " + b.toString());
//        }
//        
//        System.out.println(""); 
//        bd.criarTipoViolencia("Agressão", "Fisica");
//        bd.criarTipoViolencia("Discriminação", "Psicologica");
//        bd.criarTipoViolencia("Estupro", "Sexual");
//        bd.criarTipoViolencia("Estupro", "Sexual");  
//        
//        System.out.println("\n===============================");
//        System.out.println("TIPOS DE VIOLÊNCIA CADASTRADOS:");
//        System.out.println("===============================");
//        List<TipoViolencia> tiposViolencia = bd.getTiposViolencia();
//        count = 0;
//        for(TipoViolencia tv : tiposViolencia){
//            count++;
//            System.out.println(count +" = " + tv.toString());
//        }
//        
//                
//        System.out.println("");    
//        bd.criarEndereco("A", 1, "Cristo Redentor");
//        bd.criarEndereco("B", 2, "Centro Histórico");
//        bd.criarEndereco("C", 3, "Sarandi");
//        bd.criarEndereco("D", 4, "Anchieta");
//        
//        System.out.println("\n===============================");
//        System.out.println("ENDEREÇOS CADASTRADOS:");
//        System.out.println("===============================");
//        List<Endereco> enderecos = bd.getEnderecos();
//        count = 0;
//        for(Endereco e : enderecos){
//            count++;
//            System.out.println(count +" = " + e.toString());
//        }
//        
//        System.out.println("");    
//        bd.criarUsuario("Cristiano", "cristiano@gmail.com", "123456");
//        bd.criarUsuario("Matheus", "matheus@gmail.com", "123456");
//        bd.criarUsuario("Thayse", "thayse@gmail.com", "123456");
//        System.out.println("\n===============================");
//        System.out.println("USUÁRIOS CADASTRADOS:");
//        System.out.println("===============================");
//        List<Usuario> usuarios = bd.getUsuarios();
//        count = 0;
//        for(Usuario u : usuarios){
//            count++;
//            System.out.println(count +" = " + u.toString());
//        }
//                
//        System.out.println("");    
//        bd.criarOcorrencia("A", "1", "Cristo Redentor", "Cristiano", "cristiano@email.com", "123456", "Descrição 1", "Estupro", new Date());
//        bd.criarOcorrencia("B", "2", "Centro Histórico", "Thayse", "thayse@email.com", "123456", "Descrição 2", "Discriminação", new Date());
//        bd.criarOcorrencia("C", "3", "Sarandi", "Matheus", "matheus@email.com", "123456", "Descrição 3", "Agressão", new Date());        
//        bd.criarOcorrencia("D", "4", "Auxiliadora", "Matheus", "matheus@email.com", "123456", "Descrição 3", "Agressão", new Date());
//        System.out.println("\n===============================");
//        System.out.println("OCORRÊNCIAS CADASTRADAS:");
//        System.out.println("===============================");
//        List<Ocorrencia> ocorrencias = bd.getOcorrencias();
//        count = 0;
//        for(Ocorrencia o : ocorrencias){
//            count++;
//            System.out.println(o.toString());
//        }
//        
//    }
    
}
