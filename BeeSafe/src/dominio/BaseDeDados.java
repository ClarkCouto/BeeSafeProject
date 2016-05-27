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
    
    public String criarComentario(Date data, String titulo, String descricao, Usuario usuario, Ocorrencia ocorrencia){
        Comentario comentario = new Comentario(data, titulo, descricao, usuario, ocorrencia);
        ocorrencia.adiconarComentario(comentario);
        return "OK";
    }
    
    public String criarEndereco(String rua, int numero, String nomeBairro){
        //Verifica se o bairro ja existe
        Bairro bairro = validarBairro(nomeBairro);
        if(bairro != null){
            //caso exista cria o endereco e adiciona na lista
            Endereco endereco = new Endereco(rua, numero, bairro);
            listaEnderecos.add(endereco);
            return "OK";
        }
        else{
            return "O bairro " + nomeBairro + " nao existe!";
        }
    }
    
    //usar este caso va receber só o nome do usuario e nao o objeto
//    public String criarOcorrencia(String rua, String numero, String nomeBairro, Usuario user, String descricao, String tipoDeViolencia, Date data){
//        Usuario usuario = user;
    //usar este caso va receber só o nome do usuario e nao o objeto
    public String criarOcorrencia(String rua, String numero, String nomeBairro, String nomeUsuario, String titulo, String descricao, String tipoDeViolencia, Date data){
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
                        Ocorrencia ocorrencia = new Ocorrencia(endereco, usuario, titulo, descricao, tipoViolencia, data);
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
        //Verifica se a Regiao ja existe
        Regiao regiao = validarRegiao(nomeRegiao);
        if(regiao == null){
            //Caso nao exista cria a Regiao e adiciona na lista
            regiao =  new Regiao(nomeRegiao);
            listaRegioes.add(regiao);
            return "OK";
        }
        else{
            return "A regiao " + nomeRegiao + " ja existe!";
        }
    }
    
    public String criarTipoUsuario(String tipo){
        //Verifica se o Tipo de Usuario ja existe
        TipoUsuario tipoUsuario = validarTipoUsuario(tipo.toUpperCase());
        if(tipoUsuario == null){
            //Caso nao exista cria o novo Tipo e adiciona na lista
            tipoUsuario =  new TipoUsuario(tipo);
            listaTiposUsuario.add(tipoUsuario);
            return "OK";
        }
        else{
            return "O Tipo de Usuario " + tipoUsuario + " ja existe!";
        }
    }
    
    public String criarTipoViolencia(String tipo){
        //Verifica se o Tipo de Violencia ja existe
        TipoViolencia tipoViolencia = validarTipoViolencia(tipo.toUpperCase());
        if(tipoViolencia == null){
            //Caso nao exista cria o novo Tipo e adiciona na lista
            tipoViolencia =  new TipoViolencia(tipo);
            listaTiposViolencia.add(tipoViolencia);
            return "OK";
        }
        else{
            return "O Tipo Violencia " + tipoViolencia + " ja existe!";
        }
    }
    
    public String criarUsuario(String nome, String email, String senha, String tipo){
        //Verifica se o Tipo de Usuario existe
        TipoUsuario tipoUsuario = validarTipoUsuario(tipo);
        //Caso nao exista retorna a mensagem de erro
        if(tipoUsuario == null){
            return "Tipo Usuario invalido!";
        }
        else{
            //Caso exista, verifica se ja existe um Usuario cadastrado com os mesmos dados
            Usuario user = new Usuario(nome, email, senha, tipoUsuario);
            if(validarUsuario(user)){
                return "Usuario ja cadastrado anteriormente!";
            }
            else{
                //Caso nao exista adiciona na lista 
                listaUsuarios.add(user);
                return "OK";
            }
        }
    }
    
//    private Date formatarData(String data){
//        Date dataFormatada = null;
//        try{
//            dataFormatada = formataData.parse(data);
//        }
//        catch(Exception e){
//            return null;
//        }
//        return dataFormatada;
//    }
    
    //Retorna a lista de todos os Bairros
    public List<Bairro> getBairros(){
        return listaBairros;
    }
    
    //Retorna a ocorrencia que corresponde ao titulo passado por parametro
    public Ocorrencia getOcorrencia(String tituloOcorrencia){
        //para cada ocorrencia cadastrada, verifica se o titulo e igual ao passado por parametro
        for(Ocorrencia o : listaOcorrencias){
            if(o.getTitulo().toUpperCase().equals(tituloOcorrencia.toUpperCase())){
                //se for igual retorna a Ocorrencia
                return o;
            }
        }
        //Se nao existir retorna null
        return null;
    }
        
    //Retorna a lista de todas as ocorrencias
    public List<Ocorrencia> getOcorrencias(){
        return listaOcorrencias;
    }
    
    //Retorna a lista de todas as Regioes
    public List<Regiao> getRegioes(){
        return listaRegioes;
    }
    
    //Verifica se o nome do Usuario ja existe
    public Usuario getUsuario(String nomeUsuario){
        //para cada usuario cadastrado, verifica se o nome e igual ao passado por parametro
        for(Usuario u : listaUsuarios){
            if(u.getNome().toUpperCase().equals(nomeUsuario.toUpperCase())){
                //se for igual retorna o Usuario
                return u;
            }
        }
        //Se nao existir retorna null
        return null;
    }
    
    //Retorna a lista de todos os Usuarios
    public List<Usuario> getUsuarios(){
        return listaUsuarios;
    }
    
    //Retorna a lista de todos os Tipos de Usuario
    public List<TipoUsuario> getTiposUsuario(){
        return listaTiposUsuario;
    }
    
    //Retorna a lista de todos os Tipos de Violencia
    public List<TipoViolencia> getTiposViolencia(){
        return listaTiposViolencia;
    }
        
    //Verifica se o Bairro ja existe
    public Bairro validarBairro(String bairro){
        //para cada Bairro da lista
        for(Bairro b : listaBairros){
            //verifica se o nome do bairro cadastrado e igual ao passado por parametro
            if(b.getNome().toUpperCase().equals(bairro.toUpperCase())){
                //caso seja, retorna o bairro
                return b;
            }
        }
        //caso nao seja encontrado, retorn null
        return null;
    }
    
    //Verifica se o Endereco ja existe
    public boolean validarEndereco(Endereco endereco){
        //para cada Endereco da lista
        for(Endereco e : listaEnderecos){
            //verifica se algum dos Enderecos cadastrados e igual ao passado por parametro
            if(endereco.equals(e)){
                //caso seja, retorna o true
                return true;
            }
        }
        //caso nao seja encontrado, retorn false
        return false;
    }
      
    //Verifica se a Regiao ja existe
    public Regiao validarRegiao(String regiao){
        //para cada Regiao da lista
        for(Regiao r : listaRegioes){
            //verifica se alguma das Regioes cadastradas e igual a passada por parametro
            if(r.getNome().toUpperCase().equals(regiao.toUpperCase())){
                //caso seja, retorna o true
                return r;
            }
        }
        //caso nao seja encontrado, retorn false
        return null;
    }
    
    //Verifica se o TipoViolencia ja existe
    public TipoViolencia validarTipoViolencia(String tipo){
        //para cada TipoViolencia da lista
        for(TipoViolencia tv : listaTiposViolencia){
            //verifica se algum dos TipoViolencia cadastradas e igual ao passado por parametro
            if(tv.getTipo().toUpperCase().equals(tipo.toUpperCase())){
                //caso seja, retorna o true
                return tv;
            }
        }
        //caso nao seja encontrado, retorn false
        return null;
    }    
    
    //Verifica se o TipoUsuario ja existe
    public TipoUsuario validarTipoUsuario(String tipo){
        //para cada TipoUsuario da lista
        for(TipoUsuario tu : listaTiposUsuario){
            //verifica se algum dos TipoUsuario cadastradas e igual ao passado por parametro
            if(tu.getTipo().toUpperCase().equals(tipo.toUpperCase())){
                //caso seja, retorna o true
                return tu;
            }
        }
        //caso nao seja encontrado, retorn false
        return null;
    }
    
    //Verifica se o Usuario ja existe
    public boolean validarUsuario(Usuario usuario){
        //para cada Usuario da lista
        for(Usuario u : listaUsuarios){
            //verifica se algum dos Usuarios cadastrados e igual ao passado por parametro
            if(usuario.equals(u)){
                //caso seja, retorna o true
                return true;
            }
        }
        //caso nao seja encontrado, retorn false
        return false;
    }
    
    
    public List<Ocorrencia> pesquisar(List<Object> parametros){
        //busca todas as ocorrencias cadastradas
        List<Ocorrencia> lista = getOcorrencias();
        List<Ocorrencia> auxiliar = getOcorrencias();
//        if(!parametros.get(0).equals("") && !parametros.get(1).equals("")){
//            //filtrar por período
//        }
        //Filtra a partir da DataInicial
        if(parametros.get(0) != null){
            auxiliar = lista;
            for(Ocorrencia o: auxiliar){
                c.setTime(o.getData());
                if(!c.after(parametros.get(0)))
                    auxiliar.remove(o);
            }
        }        
        //Filtra ate a DataFinal
        if(parametros.get(1) != null){
            auxiliar = lista;
            for(Ocorrencia o: auxiliar){
                c.setTime(o.getData());
                if(!c.before(parametros.get(0)))
                    auxiliar.remove(o);
            }
        }
        //Filtra pelo Ano
        if((int)parametros.get(2) > 0){
            auxiliar = lista;
            for(Ocorrencia o: auxiliar){
                c.setTime(o.getData());
                int ano = (int)parametros.get(2);
                if(c.get(Calendar.YEAR) != ano)
                    auxiliar.remove(o);
            }
        }
        //Filtra pelo Mes
        if(!parametros.get(3).equals("")){
            auxiliar = lista;
            for(Ocorrencia o: auxiliar){
                c.setTime(o.getData());
                int mes = (int)parametros.get(3);
                if(c.get(Calendar.MONTH) != mes)
                    auxiliar.remove(o);
            }
        }
        //Filtra pelo Tipo de Violencia
        if(!parametros.get(4).equals("")){
            auxiliar = lista;
            for(Ocorrencia o: auxiliar){
                if(!o.getTipoViolencia().equals(parametros.get(4)))
                    auxiliar.remove(o);
            }
        }
        //Filtra pela Regiao
        if(!parametros.get(5).equals("")){
            auxiliar = lista;
            for(Ocorrencia o: auxiliar){
                if(!o.getRegiao().equals(parametros.get(5)))
                    auxiliar.remove(o);
            }
        }
        //Filtra pelo Bairro
        if(parametros.get(6) != null){
            auxiliar = lista;
            for(Ocorrencia o: auxiliar){
                if(!o.getBairro().equals(parametros.get(6)))
                    auxiliar.remove(o);
            }
        }
        //Filtra pela Rua
        if(!parametros.get(7).equals("")){
            auxiliar = lista;
            for(Ocorrencia o: auxiliar){
                if(!o.getEndereco().getRua().equals(parametros.get(7)))
                    auxiliar.remove(o);
            }
        }
        return lista;
    }
    
    /*
        //busca todas as ocorrencias cadastradas
        List<Ocorrencia> lista = getOcorrencias();
        List<Ocorrencia> auxiliar = getOcorrencias();
//        if(!parametros.get(0).equals("") && !parametros.get(1).equals("")){
//            //filtrar por período
//        }
        //Filtra a partir da DataInicial
        if(parametros.get(0) != null){
            auxiliar = lista;
            for(Ocorrencia o: auxiliar){
                c.setTime(o.getData());
                if(!c.after(parametros.get(0)))
                    auxiliar.remove(o);
            }
        }        
        //Filtra ate a DataFinal
        if(parametros.get(1) != null){
            auxiliar = lista;
            for(Ocorrencia o: auxiliar){
                c.setTime(o.getData());
                if(!c.before(parametros.get(0)))
                    auxiliar.remove(o);
            }
        }
        //Filtra pelo Ano
        if((int)parametros.get(2) > 0){
            auxiliar = lista;
            for(Ocorrencia o: auxiliar){
                c.setTime(o.getData());
                int ano = (int)parametros.get(2);
                if(c.get(Calendar.YEAR) != ano)
                    auxiliar.remove(o);
            }
        }
        //Filtra pelo Mes
        if(!parametros.get(3).equals("")){
            auxiliar = lista;
            for(Ocorrencia o: auxiliar){
                c.setTime(o.getData());
                int mes = (int)parametros.get(3);
                if(c.get(Calendar.MONTH) != mes)
                    auxiliar.remove(o);
            }
        }
        //Filtra pelo Tipo de Violencia
        if(!parametros.get(4).equals("")){
            auxiliar = lista;
            for(Ocorrencia o: auxiliar){
                if(!o.getTipoViolencia().equals(parametros.get(4)))
                    auxiliar.remove(o);
            }
        }
        //Filtra pela Regiao
        if(!parametros.get(5).equals("")){
            auxiliar = lista;
            for(Ocorrencia o: auxiliar){
                if(!o.getRegiao().equals(parametros.get(5)))
                    auxiliar.remove(o);
            }
        }
        //Filtra pelo Bairro
        if(parametros.get(6) != null){
            auxiliar = lista;
            for(Ocorrencia o: auxiliar){
                if(!o.getBairro().equals(parametros.get(6)))
                    auxiliar.remove(o);
            }
        }
        //Filtra pela Rua
        if(!parametros.get(7).equals("")){
            auxiliar = lista;
            for(Ocorrencia o: auxiliar){
                if(!o.getEndereco().getRua().equals(parametros.get(7)))
                    auxiliar.remove(o);
            }
        }
        lista = auxiliar;
        return lista;
    }
*/
    
    
    
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
        return quantidade/quantidadeTotal;
    }
    
}
