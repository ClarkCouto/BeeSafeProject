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
        
        //Cria as Regioes iniciais
        bd.criarRegiao("Norte");
        bd.criarRegiao("Sul");
        bd.criarRegiao("Leste");
        bd.criarRegiao("Oeste");
        bd.criarRegiao("Centro");
        
        //Cria os Bairros iniciais
        bd.criarBairro("Cristo Redentor", "Norte");
        bd.criarBairro("Centro Histórico", "Centro");
        bd.criarBairro("Sarandi", "Norte");
        bd.criarBairro("Cristal", "Sul");
        bd.criarBairro("Partenon", "Leste");
        bd.criarBairro("Anchieta", "Norte");
        
        //Cria os Tipos de Violancia
        bd.criarTipoViolencia("Agressao");
        bd.criarTipoViolencia("Discriminacao");
        bd.criarTipoViolencia("Estupro");
        
        //Cria os Tipos de Usuario
        bd.criarTipoUsuario("Comum");
        bd.criarTipoUsuario("Adm");
        
        //Cria os Usuarios iniciais
        bd.criarUsuario("C", "cristiano@gmail.com", "1", "Adm");
        bd.criarUsuario("M", "matheus@gmail.com", "1", "Comum");
        bd.criarUsuario("T", "thayse@gmail.com", "1", "Comum");
        
//        bd.criarUsuario("Cristiano", "cristiano@gmail.com", "123456", "Adm");
//        bd.criarUsuario("Matheus", "matheus@gmail.com", "123456", "Comum");
//        bd.criarUsuario("Thayse", "thayse@gmail.com", "123456", "Comum");
        
        //Cria as Ocorrencias iniciais
        bd.criarOcorrencia("A", "1", "Cristo Redentor", "C", "Titulo 1", "Descricao 1", "Estupro", formatarData("01/01/2016"));
        bd.criarOcorrencia("B", "2", "Centro Histórico", "T", "Titulo 2", "Descricao 2", "Discriminacao", formatarData("20/02/2016"));
        bd.criarOcorrencia("C", "3", "Sarandi", "M", "Titulo 3", "Descricao 3", "Agressao", formatarData("10/03/2015"));        
        bd.criarOcorrencia("D", "4", "Anchieta", "M", "Titulo 4", "Descricao 4", "Agressao", formatarData("25/04/2015"));
        
//        bd.criarOcorrencia("A", "1", "Cristo Redentor", "Cristiano", "Titulo 1", "Descricao 1", "Estupro", formatarData("01/01/2016"));
//        bd.criarOcorrencia("B", "2", "Centro Histórico", "Thayse", "Titulo 2", "Descricao 2", "Discriminacao", formatarData("20/02/2016"));
//        bd.criarOcorrencia("C", "3", "Sarandi", "Matheus", "Titulo 3", "Descricao 3", "Agressao", formatarData("10/03/2015"));        
//        bd.criarOcorrencia("D", "4", "Anchieta", "Matheus", "Titulo 4", "Descricao 4", "Agressao", formatarData("25/04/2015"));
        
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
}
