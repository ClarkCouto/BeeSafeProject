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
    private String titulo;
    private String descricao;
    private TipoViolencia tipoViolencia;
    private List<Comentario> comentarios;
    private Date data;
    private SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");

    public Ocorrencia(Endereco endereco, Usuario usuario, String titulo, String descricao, TipoViolencia tipoViolencia, Date data) {
        comentarios = new ArrayList<>();
        this.data = data;
        this.descricao = descricao;
        this.endereco = endereco;
        this.tipoViolencia = tipoViolencia;
        this.titulo = titulo;
        this.usuario = usuario;
    }   
    
    public Ocorrencia(String rua, int numero, Bairro bairro, Usuario usuario, String titulo, String descricao, TipoViolencia tipoViolencia, Date data) {
        this(new Endereco(rua, numero, bairro), usuario, titulo, descricao, tipoViolencia, data);
    }
    
    public Bairro getBairro(){
        return endereco.getBairro();
    }

    public List<Comentario> getComentarios(){
        return comentarios;
    }
    
    public Date getData(){
        return this.data;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    public Endereco getEndereco() {
        return endereco;
    }

    public String getNomeUsuario(){
        return usuario.getNome();
    }
    
    public String getRegiao(){
        return endereco.getBairro().getRegiao();
    }
    
    public String getTipoViolencia(){
        return tipoViolencia.getTipo();
    }
    
    public String getTitulo(){
        return titulo;
    }
        
    public Usuario getUsuario() {
        return usuario;
    }    
        
    public void adiconarComentario(Comentario comentario){
        comentarios.add(comentario);
    }
    
    @Override
    public String toString(){
         return "Data: " + formataData.format(this.data) + "\t Tipo: " + this.tipoViolencia.toString() + "\t Usuario: " + this.getUsuario().getNome() + "\t Endereco: " + this.getEndereco().toString();
    }
}
