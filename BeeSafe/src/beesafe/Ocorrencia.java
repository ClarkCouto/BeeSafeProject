/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beesafe;

import java.util.Date;

/**
 *
 * @author Clark
 */
public class Ocorrencia {
    private Endereco endereco;
    private Usuario usuario;
    private String descricao;
    private Date data;

    public Ocorrencia(Endereco endereco, Usuario usuario, String descricao, Date data) {
        this.endereco = endereco;
        this.usuario = usuario;
        this.descricao = descricao;
        this.data = data;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public String getDescricao() {
        return descricao;
    }
}
