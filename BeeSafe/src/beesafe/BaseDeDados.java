/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beesafe;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Clark
 */
public class BaseDeDados {
    private List<Ocorrencia> listaOcorrencias = new ArrayList<Ocorrencia>();
    private List<Usuario> listaUsuarios = new ArrayList<Usuario>();
    private List<Endereco> listaEnderecos = new ArrayList<Endereco>();
    private List<Bairro> listaBairros = new ArrayList<Bairro>();
    private List<Regiao> listaRegioes = new ArrayList<Regiao>();
    private List<TipoViolencia> listaTiposViolencia = new ArrayList<TipoViolencia>();
 
    public List<Ocorrencia> pesquisar(ArrayList<String> parametros){
        return listaOcorrencias;
    }
    
    public double gerarEstatisticas(ArrayList<String> parametros){
        return 0;
    }
}
