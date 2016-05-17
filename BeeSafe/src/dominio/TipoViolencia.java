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
public class TipoViolencia {
    private String tipo;
    
    public TipoViolencia(String tipo){
        this.tipo = tipo;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    @Override
    public String toString(){
         return this.getTipo();
    }
}
