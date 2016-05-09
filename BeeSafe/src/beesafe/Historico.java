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
public class Historico {
    private List<Ocorrencia> ocorrencias = new ArrayList<Ocorrencia>();
 
    public List<Ocorrencia> getTodasOcorrencias(){
        return ocorrencias;
    }
        
    public List<Ocorrencia> getOcorrenciasPorRegiao(Regiao regiao) {
        return ocorrencias;
    }
    
    public List<Ocorrencia> getOcorrenciasPorBairro(Bairro bairro) {
        return ocorrencias;
    }
        
    public List<Ocorrencia> getOcorrenciasPorEndereco(Endereco endereco) {
        return ocorrencias;
    }
        
    public List<Ocorrencia> getOcorrenciasPorRua(String rua) {
        return ocorrencias;
    }
}
