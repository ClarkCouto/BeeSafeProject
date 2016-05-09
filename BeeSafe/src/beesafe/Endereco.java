/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beesafe;

/**
 *
 * @author Clark
 */
public class Endereco {
    private String rua;
    private int numero;
    //private String complemento;
    private Bairro bairro;

    public Endereco(String rua, int numero, Bairro bairro) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public int getNumero() {
        return numero;
    }

    public Bairro getBairro() {
        return bairro;
    }
}
