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

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
//    public Usuario cadastrarUsuario(String nome, String email, String senha){
//        Usuario user = new Usuario(nome, senha, email);
//        return user;
//    }
    
    public boolean fazerLogin(String email, String senha){
        return true;
    }
    
    @Override
    public String toString(){
         return "Nome: " + this.getNome() + "\t Email: " + this.getEmail() + "\t Senha: " + this.getSenha();
    }
}
