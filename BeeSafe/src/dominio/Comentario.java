/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author 0729159
 */
public class Comentario {
    private String titulo;
    private String descricao;
    private Usuario usuario;
    private Ocorrencia ocorrencia;
    private Date data;
    private SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");

    public Comentario(Date data, String titulo, String descricao, Usuario usuario, Ocorrencia ocorrencia) {
        this.data = data;
        this.titulo = titulo;
        this.descricao = descricao;
        this.usuario = usuario;
        this.ocorrencia = ocorrencia;
    }

    public String getTitulo() {
        return titulo;
    }

    public Date getData(){
        return data;
    }
    
    public String getDescricao() {
        return descricao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Ocorrencia getOcorrencia() {
        return ocorrencia;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public String getInformacoesComentario(){
         return "Data: " + formataData.format(this.data) + "\t Usuario: " + this.getUsuario().getNome() 
              + "\n Título: " + this.getTitulo();
    }
    
    @Override
    public String toString(){
         return "Data: " + formataData.format(this.data) + "\t Usuario: " + this.getUsuario().getNome() + "\n Título: " + this.getTitulo();
    }
}
