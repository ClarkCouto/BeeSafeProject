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
    private TipoViolencia tipoViolencia;
    private Date data;

    public Ocorrencia(String rua, int numero, Bairro bairro, Usuario usuario, String descricao, TipoViolencia tipoViolencia, Date data) {
        Endereco e = new Endereco(rua, numero, bairro);
        this.endereco = e;
        this.usuario = usuario;
        this.descricao = descricao;
        this.data = data;
        this.tipoViolencia = tipoViolencia;
    }

    public Ocorrencia(Endereco endereco, Usuario usuario, String descricao, TipoViolencia tipoViolencia, Date data) {
        this.endereco = endereco;
        this.usuario = usuario;
        this.descricao = descricao;
        this.data = data;
        this.tipoViolencia = tipoViolencia;
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
    
    @Override
    public String toString(){
         return "Data: " + this.data.toString() + "\t Tipo: " + this.tipoViolencia.toString() + "\t Usuario: " + this.getUsuario().getNome() + "\t Endereco: " + this.getEndereco().toString();
    }
}
