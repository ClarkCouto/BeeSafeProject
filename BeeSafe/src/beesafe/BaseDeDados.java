/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beesafe;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Clark
 */
public class BaseDeDados {
    private List<Ocorrencia> listaOcorrencias = new ArrayList<Ocorrencia>();
    private List<Usuario> listaUsuarios = new ArrayList<Usuario>();
    private List<Endereco> listaEnderecos = new ArrayList<Endereco>();
    private List<Bairro> listaBairros = new ArrayList<Bairro>();
    private List<Regiao> listaRegioes = new ArrayList<Regiao>();
    private List<TipoViolencia> listaTiposViolencia = new ArrayList<TipoViolencia>();
 
    public List<Ocorrencia> pesquisar(ArrayList<String> parametros){
        return listaOcorrencias;
    }
    
    public double gerarEstatisticas(ArrayList<String> parametros){
        return 0;
    }
    
    public void criarBairro(String nomeBairro, String nomeRegiao){
        Regiao regiao = validarRegiao(nomeRegiao);
        if(regiao != null){
            Bairro bairro = validarBairro(nomeBairro);
            if(bairro == null){
                bairro = new Bairro(nomeBairro, regiao);
                listaBairros.add(bairro);
                System.out.println("Bairro cadastrado!");
            }
            else{
                System.out.println("O bairro " + nomeBairro + " já existe!");
            }
        }
        else{
            System.out.println("A região " + nomeRegiao + " não existe!");
        }
    }
    
    public void criarOcorrencia(String rua, int numero, Bairro bairro, Usuario usuario, String descricao, TipoViolencia tipoViolencia, Date data){
        Ocorrencia ocorrencia = new Ocorrencia(rua, numero, bairro, usuario, descricao, tipoViolencia, data);
        listaOcorrencias.add(ocorrencia);
        System.out.println("Ocorência cadastrada!");
    }
    
    
    public void criarRegiao(String nomeRegiao){
        Regiao regiao = validarRegiao(nomeRegiao);
        if(regiao == null){
            regiao =  new Regiao(nomeRegiao);
            listaRegioes.add(regiao);
            System.out.println("Região cadastrada!");
        }
        else{
            System.out.println("A região " + nomeRegiao + " já existe!");
        }
    }
    
    public void criarTipoViolencia(String nome, String tipo){
        TipoViolencia tv = validarTipoViolencia(nome.toUpperCase());
        if(tv == null){
            switch(tipo.toUpperCase()){
                case "FISICA": 
                    Fisica vf = new Fisica(nome);
                    listaTiposViolencia.add(vf);
                    System.out.println("Tipo de Violência cadastrada!");
                    break;
                case "PSICOLOGICA": 
                    Psicologica vp = new Psicologica(nome);
                    listaTiposViolencia.add(vp);
                    System.out.println("Tipo de Violência cadastrada!");
                    break;
                case "SEXUAL": 
                    Sexual vs = new Sexual(nome);
                    listaTiposViolencia.add(vs);
                    System.out.println("Tipo de Violência cadastrada!");
                    break;
                default:
                    System.out.println("Tipo de Violência inválido!");
                    break;
            }
        }
        else{
            System.out.println("Tipo de ocorrência " + tipo + " já existe!");
        }
    }
    
    public void criarUsuario(String nome, String email, String senha){
        Usuario usuario = new Usuario(nome, email, senha);
        listaUsuarios.add(usuario);
        System.out.println("Usuário cadastrado!");
    }
    
    public List<Bairro> getBairros(){
        return listaBairros;
    }
    
    public List<Endereco> getEnderecos(){
        return listaEnderecos;
    }
    
    public List<Ocorrencia> getOcorrencias(){
        return listaOcorrencias;
    }
    
    public List<Regiao> getRegioes(){
        return listaRegioes;
    }
    
    public List<TipoViolencia> getTiposViolencia(){
        return listaTiposViolencia;
    }
    
    public List<Usuario> getUsuarios(){
        return listaUsuarios;
    }
        
    public Bairro validarBairro(String bairro){
        for(Bairro b : listaBairros){
            if(b.getNome().toUpperCase().equals(bairro.toUpperCase())){
                return b;
            }
        }
        return null;
    }
    
    public Regiao validarRegiao(String regiao){
        for(Regiao r : listaRegioes){
            if(r.getNome().toUpperCase().equals(regiao.toUpperCase())){
                return r;
            }
        }
        return null;
    }
    
    public TipoViolencia validarTipoViolencia(String tipo){
        for(TipoViolencia r : listaTiposViolencia){
            if(r.getTipo().toUpperCase().equals(tipo.toUpperCase())){
                return r;
            }
        }
        return null;
    }
}
