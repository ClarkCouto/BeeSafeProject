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
    private int num;
    private Bairro bairro;

    public Endereco(String rua, int numero, Bairro bairro) {
        this.rua = rua;
        this.num = numero;
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public int getNumero() {
        return num;
    }

    public Bairro getBairro() {
        return bairro;
    }
    
    @Override
    public String toString(){
         return "Rua: " + this.getRua() + "\t Número: " + this.getNumero() + "\t Bairro: " + this.getBairro().getNome() + "\t Região: " + this.getBairro().getRegiao();
    }
}
