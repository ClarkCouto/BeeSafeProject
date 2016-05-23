/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author Clark
 */
public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private TipoUsuario tipoUsuario;

    public Usuario(String nome, String email, String senha, TipoUsuario tipoUsuario) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.tipoUsuario = tipoUsuario;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public TipoUsuario getTipoUsuario(){
        return tipoUsuario;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public void setTipoUsuario(TipoUsuario tipo){
        this.tipoUsuario = tipo;
    }
    
    public boolean fazerLogin(String email, String senha){
        if(!this.email.equals(email) || !this.senha.equals(senha)){
            return false;
        }
        return true;
    }
    
    public String getInformacoesUsuario(){        
         //return "Nome: " + this.getNome() + "\t Email: " + this.getEmail() + "\t Senha: " + this.getSenha() + "\t Tipo: " + this.getTipoUsuario().getTipo();
         return "Nome: " + this.getNome() + "\nEmail: " + this.getEmail() + "\nSenha: " + this.getSenha() + "\nTipo: " + this.getTipoUsuario().getTipo();
    }
    
    @Override
    public String toString(){
         return this.getNome();
    }
}
