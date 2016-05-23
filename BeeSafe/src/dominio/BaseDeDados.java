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
    
    public String criarBairro(String nomeBairro, String nomeRegiao){
        Regiao regiao = validarRegiao(nomeRegiao);
        if(regiao != null){
            Bairro bairro = validarBairro(nomeBairro);
            if(bairro == null){
                bairro = new Bairro(nomeBairro, regiao);
                listaBairros.add(bairro);
                return "OK";
            }
            else{
                return "O bairro " + nomeBairro + " já existe!";
            }
        }
        else{
            return "A região " + nomeRegiao + " não existe!";
        }
    }
    
    public String criarEndereco(String rua, int numero, String nomeBairro){
        Bairro bairro = validarBairro(nomeBairro);
        if(bairro != null){
            Endereco endereco = new Endereco(rua, numero, bairro);
            listaEnderecos.add(endereco);
            return "OK";
        }
        else{
            return "O bairro " + nomeBairro + " não existe!";
        }
    }
    
    public String criarOcorrencia(String rua, String numero, String nomeBairro, String nomeUsuario, String descricao, String tipoDeViolencia, Date data){
//    public String criarOcorrencia(String rua, String numero, String nomeBairro, String nomeUsuario, String email, String senha, String descricao, String tipoDeViolencia, Date data){
//        Usuario usuario = new Usuario(nomeUsuario, email, senha); 
//        //verifica se o usuario existe, caso não exista adiciona na lista de usuários
//        if(!validarUsuario(usuario)){
//            listaUsuarios.add(usuario);
//        }
        Usuario usuario = getUsuario(nomeUsuario);
        if(usuario != null){
            Bairro bairro = validarBairro(nomeBairro);
            //Verifica se o bairro existe
            if(bairro != null){
                TipoViolencia tipoViolencia = validarTipoViolencia(tipoDeViolencia);
                //Verifica se o tipo de violência existe
                if(tipoViolencia != null){
                    try{
                        int num = Integer.parseInt(numero);
                        Endereco endereco = new Endereco(rua, num, bairro);
                        //Verifica se o endereco já foi cadastrado anteriormente
                        boolean existe = validarEndereco(endereco);
                        if(!existe){
                            //se não existir adiciona na lista
                            listaEnderecos.add(endereco);
                        }
                        //Cria a ocorrência e adiciona na lista
                        Ocorrencia ocorrencia = new Ocorrencia(endereco, usuario, descricao, tipoViolencia, data);
                        listaOcorrencias.add(ocorrencia);
                        return "OK";
                    }
                    catch(Exception e){
                        return "Número inválido!";
                    }
                }
                else{
                    return "Tipo de Ocorrência inválido!";
                }
            }
            else{
                return "Bairro inválido!";
            }
        }
        else{
            return "Usuário não cadastrado!";
        }
    }
    
    
    public String criarRegiao(String nomeRegiao){
        Regiao regiao = validarRegiao(nomeRegiao);
        if(regiao == null){
            regiao =  new Regiao(nomeRegiao);
            listaRegioes.add(regiao);
            return "OK";
        }
        else{
            return "A região " + nomeRegiao + " já existe!";
        }
    }
    
    public String criarTipoViolencia(String nome, String tipo){
        TipoViolencia tv = validarTipoViolencia(nome.toUpperCase());
        String situacao;
        if(tv == null){
            switch(tipo.toUpperCase()){
                case "FISICA": 
                    Fisica vf = new Fisica(nome);
                    listaTiposViolencia.add(vf);
                    situacao = "OK";
                    break;
                case "PSICOLOGICA": 
                    Psicologica vp = new Psicologica(nome);
                    listaTiposViolencia.add(vp);
                    situacao = "OK";
                    break;
                case "SEXUAL": 
                    Sexual vs = new Sexual(nome);
                    listaTiposViolencia.add(vs);
                    situacao = "OK";
                    break;
                default:
                    situacao = "Tipo de Violência inválido!";
                    break;
            }
        }
        else{
            situacao = "Tipo de ocorrência " + tipo + " já existe!";
        }
        return situacao;
    }
    
    public String criarUsuario(String nome, String email, String senha){
        Usuario user = new Usuario(nome, email, senha);
        if(validarUsuario(user)){
            return "Usuário já cadastrado anteriormente!";
        }
        else{
            listaUsuarios.add(user);
            return "OK";
        }
    }
    
    public List<Ocorrencia> pesquisar(List<String> parametros){
        List<Ocorrencia> lista = getOcorrencias();
        List<Ocorrencia> aux = new ArrayList<Ocorrencia>();
        //Filtra pela Data
        if(parametros.get(0) != ""){
            
        }
        //Filtra pelo Tipo de Violência
        if(parametros.get(1) != ""){
            for(Ocorrencia o: lista){
                //if(o.)
                    aux.add(o);
            }
        }
        //Filtra pela Região
        if(parametros.get(2) != ""){
        }
        //Filtra pelo Bairro
        if(parametros.get(3) != ""){
        }
        //Filtra pela Rua
        if(parametros.get(4) != ""){
        }
        //Filtra pelo Usuário
        if(parametros.get(5) != ""){
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
        //Filtra pela Rua
        if(parametros.get(4) != ""){
        }
        //Filtra pelo Usuário
        if(parametros.get(5) != ""){
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
    
    public Usuario getUsuario(String nomeUsuario){
        for(Usuario u : listaUsuarios){
            if(u.getNome().toUpperCase().equals(nomeUsuario.toUpperCase())){
                return u;
            }
        }
        return null;
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
