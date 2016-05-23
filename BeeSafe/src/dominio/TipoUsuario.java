/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.Objects;

/**
 *
 * @author ccouto
 */
public class TipoUsuario {
    private String tipo;
    
    public TipoUsuario(String tipo){
        this.tipo = tipo;
    }
    
    public String getTipo(){
        return this.tipo.toUpperCase();
    }
    
    @Override
    public String toString(){
         return this.getTipo();
    }    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TipoUsuario other = (TipoUsuario) obj;
        if (!Objects.equals(this.tipo, other.tipo)) {
            return false;
        }
        return true;
    }
    
}
