/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Clark
 */
public class BaseDeDados {
    private List<Ocorrencia> listaOcorrencias = new ArrayList<>();
    private List<Usuario> listaUsuarios = new ArrayList<>();
    private List<Endereco> listaEnderecos = new ArrayList<>();
    private List<Bairro> listaBairros = new ArrayList<>();
    private List<Regiao> listaRegioes = new ArrayList<>();
    private List<TipoViolencia> listaTiposViolencia = new ArrayList<>();
    private List<TipoUsuario> listaTiposUsuario = new ArrayList<>();
    private SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");
    private Calendar c = Calendar.getInstance();
 
//    public List<Ocorrencia> pesquisar(ArrayList<String> parametros){
//        return listaOcorrencias;
//    }
    
//    public double gerarEstatisticas(ArrayList<String> parametros){
//        return 0;
//    }
    
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
                return "O bairro " + nomeBairro + " ja existe!";
            }
        }
        else{
            return "A regiao " + nomeRegiao + " nao existe!";
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
            return "O bairro " + nomeBairro + " nao existe!";
        }
    }
    
    public String criarOcorrencia(String rua, String numero, String nomeBairro, String nomeUsuario, String descricao, String tipoDeViolencia, Date data){
        Usuario usuario = getUsuario(nomeUsuario);
        //Verifica se o usuario existe
        if(usuario != null){
            Bairro bairro = validarBairro(nomeBairro);
            //Verifica se o bairro existe
            if(bairro != null){
                TipoViolencia tipoViolencia = validarTipoViolencia(tipoDeViolencia);
                //Verifica se o tipo de violencia existe
                if(tipoViolencia != null){
                    try{
                        int num = Integer.parseInt(numero);
                        Endereco endereco = new Endereco(rua, num, bairro);
                        //Verifica se o endereco ja foi cadastrado anteriormente
                        boolean existe = validarEndereco(endereco);
                        if(!existe){
                            //se nao existir adiciona na lista
                            listaEnderecos.add(endereco);
                        }
                        //Cria a ocorrencia e adiciona na lista
                        Ocorrencia ocorrencia = new Ocorrencia(endereco, usuario, descricao, tipoViolencia, data);
                        listaOcorrencias.add(ocorrencia);
                        return "OK";
                    }
                    catch(Exception e){
                        return "Numero invalido!";
                    }
                }
                else{
                    return "Tipo de Ocorrencia invalido!";
                }
            }
            else{
                return "Bairro invalido!";
            }
        }
        else{
            return "Usuario nao cadastrado!";
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
            return "A regiao " + nomeRegiao + " ja existe!";
        }
    }
    
    public String criarTipoUsuario(String tipo){
        TipoUsuario tipoUsuario = validarTipoUsuario(tipo.toUpperCase());
        if(tipoUsuario == null){
            tipoUsuario =  new TipoUsuario(tipo);
            listaTiposUsuario.add(tipoUsuario);
            return "OK";
        }
        else{
            return "O Tipo de Usuario " + tipoUsuario + " ja existe!";
        }
    }
    
    public String criarTipoViolencia(String tipo){
        TipoViolencia tipoViolencia = validarTipoViolencia(tipo.toUpperCase());
        if(tipoViolencia == null){
            tipoViolencia =  new TipoViolencia(tipo);
            listaTiposViolencia.add(tipoViolencia);
            return "OK";
        }
        else{
            return "O Tipo Violencia " + tipoViolencia + " ja existe!";
        }
    }
    
    public String criarUsuario(String nome, String email, String senha, String tipo){
        TipoUsuario tipoUsuario = validarTipoUsuario(tipo);
        if(tipoUsuario == null){
            return "Tipo Usuario invalido!";
        }
        else{
            Usuario user = new Usuario(nome, email, senha, tipoUsuario);
            if(validarUsuario(user)){
                return "Usuario ja cadastrado anteriormente!";
            }
            else{
                listaUsuarios.add(user);
                return "OK";
            }
        }
    }
    
    public List<Ocorrencia> pesquisar(List<Object> parametros){
        
        List<Ocorrencia> lista = getOcorrencias();
//        if(!parametros.get(0).equals("") && !parametros.get(1).equals("")){
//            //filtrar por período
//        }
        //Filtra a partir da DataInicial
        if(parametros.get(0) != null){
            for(Ocorrencia o: lista){
                c.setTime(o.getData());
                if(!c.after(parametros.get(0)))
                    lista.remove(o);
            }
        }        
        //Filtra ate a DataFinal
        if(parametros.get(1) != null){
            for(Ocorrencia o: lista){
                c.setTime(o.getData());
                if(!c.before(parametros.get(0)))
                    lista.remove(o);
            }
        }
        //Filtra pelo Ano
        if((int)parametros.get(2) > 0){
            for(Ocorrencia o: lista){
                c.setTime(o.getData());
                int ano = (int)parametros.get(2);
                if(c.get(Calendar.YEAR) != ano)
                    lista.remove(o);
            }
        }
        //Filtra pela Mes
        if(!parametros.get(3).equals("")){
            for(Ocorrencia o: lista){
                c.setTime(o.getData());
                int mes = (int)parametros.get(3);
                if(c.get(Calendar.MONTH) != mes)
                    lista.remove(o);
            }
        }
        //Filtra pelo Tipo de Violencia
        if(!parametros.get(4).equals("")){
            for(Ocorrencia o: lista){
                if(!o.getTipoViolencia().equals(parametros.get(4)))
                    lista.remove(o);
            }
        }
        //Filtra pela Regiao
        if(!parametros.get(5).equals("")){
            for(Ocorrencia o: lista){
                if(!o.getRegiao().equals(parametros.get(5)))
                    lista.remove(o);
            }
        }
        //Filtra pelo Bairro
        if(parametros.get(6) != null){
            for(Ocorrencia o: lista){
                if(!o.getBairro().equals(parametros.get(6)))
                    lista.remove(o);
            }
        }
        //Filtra pela Rua
        if(!parametros.get(7).equals("")){
            for(Ocorrencia o: lista){
                if(!o.getEndereco().getRua().equals(parametros.get(7)))
                    lista.remove(o);
            }
        }
        return lista;
    }
    
//    public List<Ocorrencia> pesquisar(List<String> parametros){
//        
//        List<Ocorrencia> lista = getOcorrencias();
////        if(!parametros.get(0).equals("") && !parametros.get(1).equals("")){
////            //filtrar por período
////        }
//        //Filtra a partir da DataInicial
//        if(!parametros.get(0).equals("")){
//            for(Ocorrencia o: lista){
//                if(!o.getData().equals(parametros.get(0)))
//                    lista.remove(o);
//            }
//        }        
//        //Filtra ate a DataFinal
//        if(!parametros.get(1).equals("")){
//            for(Ocorrencia o: lista){
//                if(!o.getData().equals(parametros.get(1)))
//                    lista.remove(o);
//            }
//        }
//        //Filtra pelo Ano
//        if(!parametros.get(2).equals("")){
//            for(Ocorrencia o: lista){
//                if(!o.getData().equals(parametros.get(2)))
//                    lista.remove(o);
//            }
//        }
//        //Filtra pela Ano
//        if(!parametros.get(3).equals("")){
//            for(Ocorrencia o: lista){
//                if(!o.getData().equals(parametros.get(3)))
//                    lista.remove(o);
//            }
//        }
//        //Filtra pelo Tipo de Violencia
//        if(!parametros.get(4).equals("")){
//            for(Ocorrencia o: lista){
//                if(!o.getTipoViolencia().equals(parametros.get(4)))
//                    lista.remove(o);
//            }
//        }
//        //Filtra pela Regiao
//        if(!parametros.get(5).equals("")){
//            for(Ocorrencia o: lista){
//                if(!o.getRegiao().equals(parametros.get(5)))
//                    lista.remove(o);
//            }
//        }
//        //Filtra pelo Bairro
//        if(!parametros.get(6).equals("")){
//            for(Ocorrencia o: lista){
//                if(!o.getBairro().equals(parametros.get(6)))
//                    lista.remove(o);
//            }
//        }
//        //Filtra pela Rua
//        if(!parametros.get(7).equals("")){
//            for(Ocorrencia o: lista){
//                if(!o.getEndereco().getRua().equals(parametros.get(7)))
//                    lista.remove(o);
//            }
//        }
//        return lista;
//    }
    
    public double gerarEstatisticas(List<String> parametros){
        List<Ocorrencia> lista = getOcorrencias();
        int quantidadeTotal = lista.size();
        double quantidade = 0;
        //Filtra pela Data
        if(!parametros.get(0).equals("")){
            for(Ocorrencia o: lista){
                if(!o.getData().equals(parametros.get(0)))
                    lista.remove(o);
            }
        }
        //Filtra pelo Tipo de Violencia
        if(!parametros.get(1).equals("")){
            for(Ocorrencia o: lista){
                if(!o.getTipoViolencia().equals(parametros.get(1)))
                    lista.remove(o);
            }
        }
        //Filtra pela Regiao
        if(!parametros.get(2).equals("")){
            for(Ocorrencia o: lista){
                if(!o.getRegiao().equals(parametros.get(1)))
                    lista.remove(o);
            }
        }
        //Filtra pelo Bairro
        if(!parametros.get(3).equals("")){
            for(Ocorrencia o: lista){
                if(!o.getBairro().equals(parametros.get(3)))
                    lista.remove(o);
            }
        }
        //Filtra pela Rua
        if(!parametros.get(4).equals("")){
            for(Ocorrencia o: lista){
                if(!o.getEndereco().getRua().equals(parametros.get(4)))
                    lista.remove(o);
            }
        }
        return quantidade/quantidadeTotal;
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
        for(TipoViolencia tv : listaTiposViolencia){
            if(tv.getTipo().toUpperCase().equals(tipo.toUpperCase())){
                return tv;
            }
        }
        return null;
    }    
    
    public TipoUsuario validarTipoUsuario(String tipo){
        for(TipoUsuario tu : listaTiposUsuario){
            if(tu.getTipo().toUpperCase().equals(tipo.toUpperCase())){
                return tu;
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
