/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author 0729159
 */
public class Comentario {
    private String titulo;
    private String descricao;
    private Usuario usuario;
    private Ocorrencia ocorrencia;

    public Comentario(String titulo, String descricao, Usuario usuario, Ocorrencia ocorrencia) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.usuario = usuario;
        this.ocorrencia = ocorrencia;
    }

    public String getTitulo() {
        return titulo;
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
}
