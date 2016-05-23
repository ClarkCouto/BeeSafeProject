/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Clark
 */
public class Ocorrencia {
    private Endereco endereco;
    private Usuario usuario;
    private String descricao;
    private TipoViolencia tipoViolencia;
    private List<Comentario> comentarios;
    private Date data;
    private SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");

    public Ocorrencia(Endereco endereco, Usuario usuario, String descricao, TipoViolencia tipoViolencia, Date data) {
        comentarios = new ArrayList<>();
        this.endereco = endereco;
        this.usuario = usuario;
        this.descricao = descricao;
        this.data = data;
        this.tipoViolencia = tipoViolencia;
    }   
    
    public Ocorrencia(String rua, int numero, Bairro bairro, Usuario usuario, String descricao, TipoViolencia tipoViolencia, Date data) {
        this(new Endereco(rua, numero, bairro), usuario, descricao, tipoViolencia, data);
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    public Endereco getEndereco() {
        return endereco;
    }

    public Usuario getUsuario() {
        return usuario;
    }    
    
    public Bairro getBairro(){
        return endereco.getBairro();
    }

//    public String getBairro(){
//        return endereco.getBairro().getNome();
//    }
    
    public Date getData(){
        return this.data;
    }
    
//    public String getData(){
//        return formataData.format(this.data);
//    }
    
    public String getNomeUsuario(){
        return usuario.getNome();
    }
    
    public String getRegiao(){
        return endereco.getBairro().getRegiao();
    }

    public String getTipoViolencia(){
        return tipoViolencia.getTipo();
    }
    
    public void adiconarComentario(Comentario comentario){
        comentarios.add(comentario);
    }
    
    public List<Comentario> getComentarios(){
        return comentarios;
    }
    
    @Override
    public String toString(){
         return "Data: " + formataData.format(this.data) + "\t Tipo: " + this.tipoViolencia.toString() + "\t Usuario: " + this.getUsuario().getNome() + "\t Endereco: " + this.getEndereco().toString();
    }
}
