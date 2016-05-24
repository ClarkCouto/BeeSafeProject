/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import dominio.Bairro;
import dominio.BaseDeDados;
import dominio.Ocorrencia;
import dominio.Regiao;
import dominio.TipoViolencia;
import dominio.Usuario;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author ccouto
 */
public class TelaPesquisar extends javax.swing.JFrame {

    private BaseDeDados bd;
    private DefaultListModel lista;
    private DefaultComboBoxModel model;
    private List<Ocorrencia> ocorrencias;
    private SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");
    private Usuario usuario;

    /**
     * Creates new form TelaPesquisar
     */
    public TelaPesquisar(BaseDeDados base, Usuario user) {
        super("Pesquisas");
        this.bd = base;
        this.usuario = user;
        ocorrencias = new ArrayList<>();
        initComponents();

        preencherComboAnos();
        preencherComboMeses();
        preencherComboBairros();
        preencherComboRegioes();
        preencherComboTiposViolencia();
        atualizarListaOcorrencias(ocorrencias);

        //Centraliza a tela
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((tela.width - this.getSize().width) / 2, (tela.height - this.getSize().height) / 2);

        //Encerrar a aplicação quando fechar a tela 
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        lblTiposViolencia = new javax.swing.JLabel();
        lblRegiao = new javax.swing.JLabel();
        lblBairro = new javax.swing.JLabel();
        lblRua = new javax.swing.JLabel();
        txtDataInicial = new javax.swing.JTextField();
        comboTiposViolencia = new javax.swing.JComboBox<>();
        comboRegioes = new javax.swing.JComboBox<>();
        comboBairros = new javax.swing.JComboBox<>();
        txtRua = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaOcorrencias = new javax.swing.JList<>();
        btnVoltar = new javax.swing.JButton();
        lblMes = new javax.swing.JLabel();
        lblAno = new javax.swing.JLabel();
        comboMeses = new javax.swing.JComboBox<>();
        comboAnos = new javax.swing.JComboBox<>();
        txtDataFinal = new javax.swing.JTextField();
        lblDataFinal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setText("PESQUISAR");

        lblData.setText("Data Inicial:");

        lblTiposViolencia.setText("Tipo de Violência:");

        lblRegiao.setText("Região:");

        lblBairro.setText("Bairro:");

        lblRua.setText("Rua:");

        comboTiposViolencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboRegioes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboBairros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        listaOcorrencias.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listaOcorrencias);

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        lblMes.setText("Mês:");

        lblAno.setText("Ano:");

        comboMeses.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboAnos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblDataFinal.setText("Data Final:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(lblTitulo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(btnVoltar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(btnPesquisar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTiposViolencia)
                                    .addComponent(lblRegiao)
                                    .addComponent(lblBairro)
                                    .addComponent(lblRua)
                                    .addComponent(lblDataFinal)
                                    .addComponent(lblMes)
                                    .addComponent(lblAno)
                                    .addComponent(lblData))
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(comboTiposViolencia, 0, 150, Short.MAX_VALUE)
                                            .addComponent(comboRegioes, 0, 150, Short.MAX_VALUE)
                                            .addComponent(comboBairros, 0, 150, Short.MAX_VALUE)
                                            .addComponent(txtRua, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                            .addComponent(txtDataFinal)
                                            .addComponent(comboAnos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(comboMeses, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblTitulo)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblData)
                    .addComponent(txtDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDataFinal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAno)
                    .addComponent(comboAnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMes)
                    .addComponent(comboMeses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTiposViolencia)
                    .addComponent(comboTiposViolencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRegiao)
                    .addComponent(comboRegioes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBairro)
                    .addComponent(comboBairros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRua)
                    .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPesquisar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVoltar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        //String dataInicial = txtDataInicial.getText();
        //String dataFinal = txtRua.getText();
        Calendar dataInicial = null;
        Calendar dataFinal = null;
        String mes = "";
        int ano = 0;
        String tipoViolencia = "";
        String regiao = "";
        Bairro bairro = null;
        String rua = "";
        boolean ok = true;
        if(!txtDataInicial.getText().equals("")){
            dataInicial = converterData(txtDataInicial.getText());
            if(dataInicial == null){
                JOptionPane.showMessageDialog(this, "Data Inicial Inválida!", "Atenção!", JOptionPane.WARNING_MESSAGE);
                txtDataInicial.setText("");
                ok = false;
            }
        }
        if(!txtDataFinal.getText().equals("")){
            dataFinal = converterData(txtDataFinal.getText());
            if(dataFinal == null){
                JOptionPane.showMessageDialog(this, "Data Final Inválida!", "Atenção!", JOptionPane.WARNING_MESSAGE);
                txtDataFinal.setText("");
                ok = false;
            }
        }
        if(comboAnos.getSelectedIndex() != -1 && comboMeses.getSelectedIndex() != 0){
            ano = Integer.parseInt(comboAnos.getSelectedItem().toString());
        }
        if(comboMeses.getSelectedIndex() != -1 && comboMeses.getSelectedIndex() != 0){
            mes = comboMeses.getSelectedItem().toString();
        }
        if(comboTiposViolencia.getSelectedIndex() != -1 && comboTiposViolencia.getSelectedIndex() != 0){
            comboTiposViolencia.getSelectedItem().toString();
        }
        if(comboRegioes.getSelectedIndex() != -1 && comboRegioes.getSelectedIndex() != 0){
            regiao = comboRegioes.getSelectedItem().toString();
        }
        if(comboBairros.getSelectedIndex() != -1 && comboBairros.getSelectedIndex() != 0){
            bairro = (Bairro)comboBairros.getSelectedItem();
        }

        List<Object> parametros = new ArrayList<>();
        parametros.add(dataInicial);
        parametros.add(dataFinal);
        parametros.add(ano);
        parametros.add(mes);
        parametros.add(tipoViolencia);
        parametros.add(regiao);
        parametros.add(bairro);
        parametros.add(rua);

        ocorrencias = bd.pesquisar(parametros);
        if (ocorrencias.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nenhuma Ocorrência encontrada!", "Atenção!", JOptionPane.WARNING_MESSAGE);
        }
        else{
            txtDataInicial.setText("");
            txtRua.setText("");
            comboBairros.setSelectedIndex(0);
            comboRegioes.setSelectedIndex(0);
            comboTiposViolencia.setSelectedIndex(0);
        }
        atualizarListaOcorrencias(ocorrencias);
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.setVisible(false);
        new TelaPrincipal(bd, usuario).setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private Calendar converterData(String data){
        Calendar c = Calendar.getInstance();
        try {
            c.setTime(formataData.parse(data));
            return c;
        }
        catch (Exception e) {
            return null;
        }
    }
    
    private void atualizarListaOcorrencias(List<Ocorrencia> listaOcorrencias){
        lista = new DefaultListModel();
        ocorrencias = listaOcorrencias;
        for(Ocorrencia o : ocorrencias){
            lista.addElement(o);
        }
        this.listaOcorrencias.setModel(lista);
    }
    
    private void preencherComboBairros() {
        model = new DefaultComboBoxModel();
        model.addElement("--Selecione--");
        List<Bairro> bairros = bd.getBairros();
        for (Bairro b : bairros) {
            model.addElement(b);
        }
        comboBairros.setModel(model);
    }

    private void preencherComboRegioes() {
        model = new DefaultComboBoxModel();
        model.addElement("--Selecione--");
        List<Regiao> regioes = bd.getRegioes();
        for (Regiao r : regioes) {
            model.addElement(r);
        }
        comboRegioes.setModel(model);
    }

    private void preencherComboTiposViolencia() {
        model = new DefaultComboBoxModel();
        model.addElement("--Selecione--");
        List<TipoViolencia> tipos = bd.getTiposViolencia();
        for (TipoViolencia t : tipos) {
            model.addElement(t);
        }
        comboTiposViolencia.setModel(model);
    }

    private void preencherComboMeses() {
        model = new DefaultComboBoxModel();
        model.addElement("--Selecione--");
        model.addElement("Janeiro");
        model.addElement("Fevereiro");
        model.addElement("Marco");
        model.addElement("Abril");
        model.addElement("Maio");
        model.addElement("Junho");
        model.addElement("Julho");
        model.addElement("Agosto");
        model.addElement("Setembro");
        model.addElement("Outubro");
        model.addElement("Novembro");
        model.addElement("Dezembro");
        comboMeses.setModel(model);
    }

    private void preencherComboAnos() {
        model = new DefaultComboBoxModel();
        model.addElement("--Selecione--");
        //bd.getAnos();
        comboAnos.setModel(model);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> comboAnos;
    private javax.swing.JComboBox<String> comboBairros;
    private javax.swing.JComboBox<String> comboMeses;
    private javax.swing.JComboBox<String> comboRegioes;
    private javax.swing.JComboBox<String> comboTiposViolencia;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAno;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblDataFinal;
    private javax.swing.JLabel lblMes;
    private javax.swing.JLabel lblRegiao;
    private javax.swing.JLabel lblRua;
    private javax.swing.JLabel lblTiposViolencia;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JList<String> listaOcorrencias;
    private javax.swing.JTextField txtDataFinal;
    private javax.swing.JTextField txtDataInicial;
    private javax.swing.JTextField txtRua;
    // End of variables declaration//GEN-END:variables
}
