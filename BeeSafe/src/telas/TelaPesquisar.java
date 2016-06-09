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
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author ccouto
 */
public class TelaPesquisar extends javax.swing.JFrame {

    private BaseDeDados bd;
    private DefaultTableModel tabela;
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
        
        lblEstatisticas.setText("");
        preencherComboBairros();
        preencherComboRegioes();
        preencherComboTiposViolencia();
        atualizarTabelaOcorrencias(new ArrayList<>());

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
        btnVoltar = new javax.swing.JButton();
        txtDataFinal = new javax.swing.JTextField();
        lblDataFinal = new javax.swing.JLabel();
        btnDetalhes = new javax.swing.JButton();
        txtTitulo = new javax.swing.JTextField();
        lblTituloOcorrencia = new javax.swing.JLabel();
        btnLimpar = new javax.swing.JButton();
        btnPercentual = new javax.swing.JButton();
        btnQuantidade = new javax.swing.JButton();
        lblEstatisticas = new javax.swing.JLabel();
        lblTituloEstatisticas = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaOcorrencias = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(600, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 600));
        jPanel1.setRequestFocusEnabled(false);

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTitulo.setText("Pesquisar");

        lblData.setText("Data Inicial:");

        lblTiposViolencia.setText("Tipo de Violência:");

        lblRegiao.setText("Região:");

        lblBairro.setText("Bairro:");

        lblRua.setText("Rua:");

        txtDataInicial.setMaximumSize(new java.awt.Dimension(150, 25));
        txtDataInicial.setMinimumSize(new java.awt.Dimension(150, 25));
        txtDataInicial.setPreferredSize(new java.awt.Dimension(150, 25));

        comboTiposViolencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboRegioes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboBairros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtRua.setMaximumSize(new java.awt.Dimension(150, 25));
        txtRua.setMinimumSize(new java.awt.Dimension(150, 25));
        txtRua.setPreferredSize(new java.awt.Dimension(150, 25));

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        txtDataFinal.setMaximumSize(new java.awt.Dimension(150, 25));
        txtDataFinal.setMinimumSize(new java.awt.Dimension(150, 25));
        txtDataFinal.setPreferredSize(new java.awt.Dimension(150, 25));

        lblDataFinal.setText("Data Final:");

        btnDetalhes.setText("Detalhes");
        btnDetalhes.setPreferredSize(new java.awt.Dimension(254, 30));
        btnDetalhes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetalhesActionPerformed(evt);
            }
        });

        txtTitulo.setMaximumSize(new java.awt.Dimension(150, 25));
        txtTitulo.setMinimumSize(new java.awt.Dimension(150, 25));
        txtTitulo.setPreferredSize(new java.awt.Dimension(150, 25));

        lblTituloOcorrencia.setText("Título:");

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnPercentual.setText("Percentual");
        btnPercentual.setMaximumSize(new java.awt.Dimension(94, 23));
        btnPercentual.setMinimumSize(new java.awt.Dimension(94, 23));
        btnPercentual.setPreferredSize(new java.awt.Dimension(94, 23));
        btnPercentual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPercentualActionPerformed(evt);
            }
        });

        btnQuantidade.setText("Quantidade");
        btnQuantidade.setMaximumSize(new java.awt.Dimension(94, 23));
        btnQuantidade.setMinimumSize(new java.awt.Dimension(94, 23));
        btnQuantidade.setPreferredSize(new java.awt.Dimension(94, 23));
        btnQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuantidadeActionPerformed(evt);
            }
        });

        lblEstatisticas.setText("Estatisticas");

        lblTituloEstatisticas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblTituloEstatisticas.setText("Gerar Estatísticas");

        tabelaOcorrencias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Data", "Tipo", "Região", "Bairro", "Título"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaOcorrencias.setMaximumSize(new java.awt.Dimension(480, 124));
        tabelaOcorrencias.setMinimumSize(new java.awt.Dimension(480, 124));
        tabelaOcorrencias.setPreferredSize(new java.awt.Dimension(480, 124));
        jScrollPane2.setViewportView(tabelaOcorrencias);
        if (tabelaOcorrencias.getColumnModel().getColumnCount() > 0) {
            tabelaOcorrencias.getColumnModel().getColumn(0).setResizable(false);
            tabelaOcorrencias.getColumnModel().getColumn(1).setResizable(false);
            tabelaOcorrencias.getColumnModel().getColumn(2).setResizable(false);
            tabelaOcorrencias.getColumnModel().getColumn(3).setResizable(false);
            tabelaOcorrencias.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jSeparator2)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblRua)
                                .addGap(18, 18, 18)
                                .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblTiposViolencia)
                                        .addComponent(lblRegiao, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(comboRegioes, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(comboTiposViolencia, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(26, 26, 26)
                                    .addComponent(lblData)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(96, 96, 96)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(lblBairro)
                                .addGap(18, 18, 18)
                                .addComponent(comboBairros, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(lblTituloOcorrencia)
                                .addGap(18, 18, 18)
                                .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblDataFinal)
                                .addGap(18, 18, 18)
                                .addComponent(txtDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPesquisar)
                .addGap(18, 18, 18)
                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(lblTitulo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTituloEstatisticas)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnPercentual, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(btnDetalhes, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblEstatisticas))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblData)
                            .addComponent(txtDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTiposViolencia)
                            .addComponent(comboTiposViolencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRegiao)
                            .addComponent(comboRegioes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDataFinal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(lblTituloOcorrencia)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboBairros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBairro))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRua))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPesquisar)
                    .addComponent(btnLimpar))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDetalhes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(lblTituloEstatisticas)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPercentual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblEstatisticas)
                .addGap(17, 17, 17)
                .addComponent(btnVoltar)
                .addGap(32, 32, 32))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 611, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuantidadeActionPerformed
        lblEstatisticas.setText("Foram encontradas " + ocorrencias.size() + " ocorrências!");
    }//GEN-LAST:event_btnQuantidadeActionPerformed

    private void btnPercentualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPercentualActionPerformed
        double totalOcorrencias = bd.getOcorrencias().size();
        double ocorrenciasFiltradas = ocorrencias.size();
        double percentual = (ocorrenciasFiltradas/totalOcorrencias)*100.0;
        lblEstatisticas.setText("Estas ocorrências correspondem a " + percentual + "% do total!");
    }//GEN-LAST:event_btnPercentualActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtDataInicial.setText("");
        txtDataFinal.setText("");
        txtRua.setText("");
        comboBairros.setSelectedIndex(0);
        comboRegioes.setSelectedIndex(0);
        comboTiposViolencia.setSelectedIndex(0);
        lblEstatisticas.setText("");
        atualizarTabelaOcorrencias(new ArrayList<>());
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnDetalhesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetalhesActionPerformed
        //Verifica se um ocorrencia foi selecionada, caso nao tenha, retorna um erro
        if(tabelaOcorrencias.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(this, "Nenhuma Ocorrência selecionada!", "Atenção!", JOptionPane.WARNING_MESSAGE);
        }
        //caso tenha, abre a tela de detalhes da ocorrencia
        else{
            Object tituloOcorrencia = tabelaOcorrencias.getValueAt(tabelaOcorrencias.getSelectedRow(), 4);
            Ocorrencia ocorrencia = bd.getOcorrencia ((String)tituloOcorrencia);
            this.setVisible(false);
            new TelaDetalhesOcorrencia(bd, usuario, ocorrencia).setVisible(true);
        }
    }//GEN-LAST:event_btnDetalhesActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.setVisible(false);
        new TelaPrincipal(bd, usuario).setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        
      Calendar dataInicial = null;
         Calendar dataFinal = null;
         String tipoViolencia = "";
         String regiao = "";
         Bairro bairro = null;
         String rua = "";
         String titulo = "";
         lblEstatisticas.setText("");
         boolean ok = true;
         
         //Verifica se a data inicial foi preenchida e se e uma data valida
         if(!txtDataInicial.getText().equals("")){
             dataInicial = converterData(txtDataInicial.getText());
             if(dataInicial == null){
                 JOptionPane.showMessageDialog(this, "Data Inicial Inválida!", "Atenção!", JOptionPane.WARNING_MESSAGE);
                 txtDataInicial.setText("");
                 ok = false;
             }
         }
         //Verifica se a data final foi preenchida e se e uma data valida
         if(!txtDataFinal.getText().equals("")){
             dataFinal = converterData(txtDataFinal.getText());
             if(dataFinal == null){
                 JOptionPane.showMessageDialog(this, "Data Final Inválida!", "Atenção!", JOptionPane.WARNING_MESSAGE);
                 txtDataFinal.setText("");
                 ok = false;
             }
         }
         
         //se as datas sao validas continua a filtrar os resultados
         if(ok){
             if(comboTiposViolencia.getSelectedIndex() != -1 && comboTiposViolencia.getSelectedIndex() != 0){
                 tipoViolencia = comboTiposViolencia.getSelectedItem().toString();
             }
             if(comboRegioes.getSelectedIndex() != -1 && comboRegioes.getSelectedIndex() != 0){
                 regiao = comboRegioes.getSelectedItem().toString();
             }
             if(comboBairros.getSelectedIndex() != -1 && comboBairros.getSelectedIndex() != 0){
                 bairro = (Bairro)comboBairros.getSelectedItem();
             }
             if(!txtTitulo.getText().isEmpty()){
                 titulo = txtTitulo.getText();
             }
             if(!txtRua.getText().isEmpty()){
                 titulo = txtRua.getText();
             }
 
             ocorrencias = bd.pesquisar(dataInicial, dataFinal, tipoViolencia, regiao, bairro, rua, titulo);
             atualizarTabelaOcorrencias(ocorrencias);
             if (ocorrencias.isEmpty()) {
                 JOptionPane.showMessageDialog(this, "Nenhuma Ocorrência encontrada!", "Atenção!", JOptionPane.WARNING_MESSAGE);
             }
         }
     }//GEN-LAST:event_btnPesquisarActionPerformed
 
     //Converte string em uma Data
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
     
     //Formata uma Data em uma String modelada
     private String formatarData(Date data){
         formataData = new SimpleDateFormat("dd/MM/yyyy");
         String dataFormatada = "";
         try{
             dataFormatada = formataData.format(data);
         }
         catch(Exception e){}
         return dataFormatada;
     }
         
     private void atualizarTabelaOcorrencias(List<Ocorrencia> lista){
         //Seta a ordenação pela data
         TableRowSorter<TableModel> sorter = new TableRowSorter<>(tabelaOcorrencias.getModel());
         sorter.setComparator(0, comparator);
         tabelaOcorrencias.setRowSorter(sorter);	
         //Efetua a ordenação automaticamente ao criar a tabela a partir da data mais recente
        
         List <RowSorter.SortKey> sortKeys = new ArrayList<>();
         sortKeys.add(new RowSorter.SortKey(0, SortOrder.DESCENDING));
         sorter.setSortKeys(sortKeys); 
         
         tabela = (DefaultTableModel) tabelaOcorrencias.getModel();
         //Verifica se te algum dado anterior e exclui
         while (tabela.getRowCount() > 0) {
             tabela.removeRow(0);
         }
         //Adiciona as ocorrencias na tabela
         for (Ocorrencia o : lista) {
             tabela.addRow(new Object[] { formatarData(o.getData()), o.getTipoViolencia(), o.getRegiao(), o.getBairro().getNome(), o.getTitulo() });
         }
         
     }
     
     //Efetua a comparação entre duas datas
     private Comparator<String> comparator = new Comparator<String>() {
         public int compare(String d1, String d2) {
             Calendar data1 = converterData(d1);
             Calendar data2 = converterData(d2);
             return data1.compareTo(data2);
         }
     };   
     
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
    }//GEN-LAST:event_btnPesquisarActionPerformed

    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDetalhes;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnPercentual;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnQuantidade;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> comboBairros;
    private javax.swing.JComboBox<String> comboRegioes;
    private javax.swing.JComboBox<String> comboTiposViolencia;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblDataFinal;
    private javax.swing.JLabel lblEstatisticas;
    private javax.swing.JLabel lblRegiao;
    private javax.swing.JLabel lblRua;
    private javax.swing.JLabel lblTiposViolencia;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTituloEstatisticas;
    private javax.swing.JLabel lblTituloOcorrencia;
    private javax.swing.JTable tabelaOcorrencias;
    private javax.swing.JTextField txtDataFinal;
    private javax.swing.JTextField txtDataInicial;
    private javax.swing.JTextField txtRua;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
