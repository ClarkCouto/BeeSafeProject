/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

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
    
    public void criarEndereco(String rua, int numero, String nomeBairro){
        Bairro bairro = validarBairro(nomeBairro);
        if(bairro != null){
            Endereco endereco = new Endereco(rua, numero, bairro);
            listaEnderecos.add(endereco);
            System.out.println("Endereço cadastrado!");
        }
        else{
            System.out.println("O bairro " + nomeBairro + " não existe!");
        }
    }
    
    public void criarOcorrencia(String rua, int numero, String nomeBairro, String nomeUsuario, String email, String senha, String descricao, String tipoDeViolencia, Date data){
        Usuario usuario = new Usuario(nomeUsuario, email, senha); 
        //verifica se o usuario existe, caso não exista adiciona na lista de usuários
        if(!validarUsuario(usuario)){
            listaUsuarios.add(usuario);
        }
        Bairro bairro = validarBairro(nomeBairro);
        //Verifica se o bairro existe
        if(bairro != null){
            TipoViolencia tipoViolencia = validarTipoViolencia(tipoDeViolencia);
            //Verifica se o tipo de violência existe
            if(tipoViolencia != null){
                Endereco endereco = new Endereco(rua, numero, bairro);
                //Verifica se o endereco já foi cadastrado anteriormente
                boolean existe = validarEndereco(endereco);
                if(!existe){
                    //se não existir adiciona na lista
                    listaEnderecos.add(endereco);
                }
                //Cria a ocorrência e adiciona na lista
                Ocorrencia ocorrencia = new Ocorrencia(endereco, usuario, descricao, tipoViolencia, data);
                listaOcorrencias.add(ocorrencia);
                System.out.println("Ocorência cadastrada!");
            }
            else{
                System.out.println("Ocorência não cadastrada! Tipo de Vilência inválido!");
            }
        }
        else{
            System.out.println("Ocorência não cadastrada! Bairro inválido!");
        }
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
        Usuario user = new Usuario(nome, email, senha);
        if(validarUsuario(user)){
            System.out.println("Usuário já cadastrado anteriormente!");
        }
        else{
            listaUsuarios.add(user);
            System.out.println("Usuário cadastrado!");
        }
    }
    
    public List<Ocorrencia> pesquisar(List<String> parametros){
        List<Ocorrencia> lista = getOcorrencias();
        //Filtra pela Data
        if(parametros.get(0) != ""){
        }
        //Filtra pelo Tipo de Violência
        if(parametros.get(1) != ""){
        }
        //Filtra pela Região
        if(parametros.get(2) != ""){
        }
        //Filtra pelo Bairro
        if(parametros.get(3) != ""){
        }
        //Filtra pela Região
        if(parametros.get(4) != ""){
        }
        //Filtra pela Rua
        if(parametros.get(5) != ""){
        }
        //Filtra pelo Usuário
        if(parametros.get(6) != ""){
        }
        return null;
    }
    
    public double gerarEstatisticas(List<String> parametros){
        List<Ocorrencia> lista = getOcorrencias();
        double quantidade = 0;
        //Filtra pela Data
        if(parametros.get(0) != ""){
        }
        //Filtra pelo Tipo de Violência
        if(parametros.get(1) != ""){
        }
        //Filtra pela Região
        if(parametros.get(2) != ""){
        }
        //Filtra pelo Bairro
        if(parametros.get(3) != ""){
        }
        //Filtra pela Região
        if(parametros.get(4) != ""){
        }
        //Filtra pela Rua
        if(parametros.get(5) != ""){
        }
        //Filtra pelo Usuário
        if(parametros.get(6) != ""){
        }
        return quantidade;
    }
    
    public List<Bairro> getBairros(){
        return listaBairros;
    }
    
    public Bairro getBairro(int codBairro){
        return listaBairros.get(codBairro);
    }
    
    public List<Endereco> getEnderecos(){
        return listaEnderecos;
    }
    
    public Endereco getEndereco(int codEndereco){
        return listaEnderecos.get(codEndereco);
    }
        
    public List<Ocorrencia> getOcorrencias(){
        return listaOcorrencias;
    }
    
    public Ocorrencia getOcorrencia(int codOcorrencia){
        return listaOcorrencias.get(codOcorrencia);
    }
    
    public List<Regiao> getRegioes(){
        return listaRegioes;
    }
    
    public Regiao getRegiao(int codRegiao){
        return listaRegioes.get(codRegiao);
    }
    
    public List<TipoViolencia> getTiposViolencia(){
        return listaTiposViolencia;
    }
    
    public TipoViolencia getTipoViolencia(int codTipoViolencia){
        return listaTiposViolencia.get(codTipoViolencia);
    }
    
    public List<Usuario> getUsuarios(){
        return listaUsuarios;
    }
    
    public Usuario getUsuario(int codUsuario){
        return listaUsuarios.get(codUsuario);
    }
        
    public Bairro validarBairro(String bairro){
        for(Bairro b : listaBairros){
            if(b.getNome().toUpperCase().equals(bairro.toUpperCase())){
                return b;
            }
        }
        return null;
    }
    
    public boolean validarEndereco(Endereco endereco){
        for(Endereco e : listaEnderecos){
            if(endereco.equals(e)){
                return true;
            }
        }
        return false;
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
    
    public boolean validarUsuario(Usuario usuario){
        for(Usuario u : listaUsuarios){
            if(usuario.equals(u)){
                return true;
            }
        }
        return false;
    }
}
