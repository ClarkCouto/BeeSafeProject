
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Clark
 */
public class BeeSafeRepository {
    private SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");
    
    public BaseDeDados iniciarBaseDeDados(){
        BaseDeDados bd = new BaseDeDados();
        
        //Cria as Regioes iniciais
        bd.criarRegiao("Norte");
        bd.criarRegiao("Sul");
        bd.criarRegiao("Leste");
        bd.criarRegiao("Oeste");
        bd.criarRegiao("Centro");
        
        //Cria os Bairros iniciais
        bd.criarBairro("Cristo Redentor", "Norte");
        bd.criarBairro("Centro Histórico", "Centro");
        bd.criarBairro("Sarandi", "Norte");
        bd.criarBairro("Cristal", "Sul");
        bd.criarBairro("Partenon", "Leste");
        bd.criarBairro("Anchieta", "Norte");
        bd.criarBairro("Agronomia", "Leste");
        bd.criarBairro("Ipiranga", "Norte");
        bd.criarBairro("Jardim Europa", "Norte");
        bd.criarBairro("Jardim Lindóia", "Norte");
        bd.criarBairro("Passo da Areia", "Norte");
        bd.criarBairro("Três Figueiras", "Norte");
        bd.criarBairro("Aberta dos Morros", "Sul");
        bd.criarBairro("Camaquã", "Sul");
        bd.criarBairro("Hípica", "Sul");
        bd.criarBairro("Ipanema", "Sul");
        bd.criarBairro("Nonoai", "Sul");
        bd.criarBairro("Teresópolis", "Sul");
        bd.criarBairro("Vila Assunção", "Sul");
        bd.criarBairro("Vila Conceição", "Sul");
        bd.criarBairro("Vila Nova", "Sul");
        bd.criarBairro("Serraria", "Sul");
        bd.criarBairro("Alto Petrópolis", "Leste");
        bd.criarBairro("Bom Jesus", "Leste");
        bd.criarBairro("Jardim do Salso", "Leste");
        bd.criarBairro("Agronomia", "Leste");
        bd.criarBairro("Cascata", "Leste");
        bd.criarBairro("Glória", "Leste");
        bd.criarBairro("Medianeira", "Leste");
        bd.criarBairro("Santa Tereza", "Leste");
        bd.criarBairro("Belém Velho", "Leste");
        
        //Cria os Tipos de Violancia
        bd.criarTipoViolencia("Agressao");
        bd.criarTipoViolencia("Discriminacao");
        bd.criarTipoViolencia("Estupro");
        
        //Cria os Tipos de Usuario
        bd.criarTipoUsuario("Comum");
        bd.criarTipoUsuario("Adm");
        
        //Cria os Usuarios iniciais
        bd.criarUsuario("C", "cristiano@gmail.com", "1", "Adm");
        bd.criarUsuario("M", "matheus@gmail.com", "1", "Comum");
        bd.criarUsuario("T", "thayse@gmail.com", "1", "Comum");
        bd.criarUsuario("João", "joao@gmail.com", "1", "Comum");
        bd.criarUsuario("Maria", "maria@gmail.com", "1", "Comum");
        bd.criarUsuario("José", "jose@gmail.com", "1", "Comum");
        bd.criarUsuario("Ricardo", "ricardo@gmail.com", "1", "Comum");
        bd.criarUsuario("Ana", "ana@gmail.com", "1", "Comum");
        bd.criarUsuario("Admin", "admin@gmail.com", "admin", "Adm");
        

        
        //Cria as Ocorrencias iniciais
        bd.criarOcorrencia("Rua Voluntários da Pátria", "100", "Centro Histórico", "C", "Violência!!", "Fui assediado nesse local!", "Estupro", formatarData("01/01/2016"));
        bd.criarOcorrencia("Rua Guilherme Schell", "245", "Santo Antônio", "T", "Sofri discriminação", "Fui vítima de discriminação na frente da faculdade.", "Discriminacao", formatarData("20/02/2016"));
        bd.criarOcorrencia("Rua Voluntários da Pátria", "389", "Centro Histórico", "M", "Violência no centro", "Sofri agressão física em pleno centro de porto alegre. Tomem cuidado.", "Agressao", formatarData("10/03/2015"));        
        bd.criarOcorrencia("Av Fernando Ferrari", "34", "Anchieta", "M", "Perigo nas ruas", "Estava indo trabalhar com meu namorado e fui agredido por um grupo de homens. Já denunciei!", "Agressao", formatarData("25/04/2015"));
        bd.criarOcorrencia("Rua Barão do Amazonas", "400", "Partenon", "M", "Horror", "Fui agredido na rua barão do amazonas no início da noite.", "Agressao", formatarData("20/03/2015"));
        bd.criarOcorrencia("Av Diário de Notícias", "200", "Cristal", "João", "Saída do shopping perigosa", "Estava saindo do shopping e fui agredido verbalmente com palavras de baixo calão.", "Discriminacao", formatarData("15/07/2015"));
        bd.criarOcorrencia("Av Diário de Notícias", "200", "Cristal", "João", "Saída do shopping perigosa", "Estava saindo do shopping e fui agredido verbalmente com palavras de baixo calão.", "Discriminacao", formatarData("15/07/2015"));
        bd.criarOcorrencia("Rua Cruzeiro do Sul", "99", "Cristal", "Maria", "Preconceito no bar", "Fui expulsa de um bar por ser lésbica!", "Discriminacao", formatarData("10/07/2015"));
        bd.criarOcorrencia("Rua Marquês do Pombal", "900", "Auxiliadora", "Ana", "Virei estatística", "Fui estuprada ao pegar um táxi na rua marquês do pombal. Cuidado!", "Discriminacao", formatarData("20/10/2015"));
        bd.criarOcorrencia("Av João Walling", "80", "Passo da Areia", "Ricardo", "Fui agredido", "Fui espancado perto do shopping Iguatemi.", "Agressao", formatarData("06/01/2016"));
        
        
        
//        bd.criarOcorrencia("A", "1", "Cristo Redentor", "Cristiano", "Titulo 1", "Descricao 1", "Estupro", formatarData("01/01/2016"));
//        bd.criarOcorrencia("B", "2", "Centro Histórico", "Thayse", "Titulo 2", "Descricao 2", "Discriminacao", formatarData("20/02/2016"));
//        bd.criarOcorrencia("C", "3", "Sarandi", "Matheus", "Titulo 3", "Descricao 3", "Agressao", formatarData("10/03/2015"));        
//        bd.criarOcorrencia("D", "4", "Anchieta", "Matheus", "Titulo 4", "Descricao 4", "Agressao", formatarData("25/04/2015"));
        
        return bd;
    }
    
    private Date formatarData(String data){
        Date dataFormatada = null;
        try{
            dataFormatada = formataData.parse(data);
        }
        catch(Exception e){}
        return dataFormatada;
    }
}

