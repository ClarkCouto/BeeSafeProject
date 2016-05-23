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
import java.util.ArrayList;
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

    /**
     * Creates new form TelaPesquisar
     */
    public TelaPesquisar(BaseDeDados base) {
        this.bd = base;
        initComponents();

        preencherComboBairros();
        preencherComboRegioes();
        preencherComboUsuarios();
        preencherComboTiposViolencia();
        atualizarListaOcorrencias();

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
        lblUsuario = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        comboTiposViolencia = new javax.swing.JComboBox<>();
        comboRegioes = new javax.swing.JComboBox<>();
        comboBairros = new javax.swing.JComboBox<>();
        txtRua = new javax.swing.JTextField();
        comboUsuarios = new javax.swing.JComboBox<>();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaOcorrencias = new javax.swing.JList<>();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setText("PESQUISAR");

        lblData.setText("Data:");

        lblTiposViolencia.setText("Tipo de Violência:");

        lblRegiao.setText("Região:");

        lblBairro.setText("Bairro:");

        lblRua.setText("Rua:");

        lblUsuario.setText("Usuário:");

        comboTiposViolencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboRegioes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboBairros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboUsuarios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblData)
                            .addComponent(lblTiposViolencia)
                            .addComponent(lblRegiao)
                            .addComponent(lblBairro)
                            .addComponent(lblRua)
                            .addComponent(lblUsuario))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtData)
                            .addComponent(comboTiposViolencia, 0, 150, Short.MAX_VALUE)
                            .addComponent(comboRegioes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboBairros, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtRua)
                            .addComponent(comboUsuarios, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(lblTitulo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(btnVoltar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(btnPesquisar)))
                .addContainerGap(77, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblData)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsuario)
                    .addComponent(comboUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnPesquisar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVoltar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        String data = txtData.getText();
        String tipoViolencia = comboTiposViolencia.getSelectedItem().toString();
        String regiao = comboRegioes.getSelectedItem().toString();
        String bairro = comboBairros.getSelectedItem().toString();
        String rua = txtRua.getText();
        String usuario = comboUsuarios.getSelectedItem().toString();

        List<String> parametros = new ArrayList<String>();
        parametros.add(data);
        parametros.add(tipoViolencia);
        parametros.add(regiao);
        parametros.add(bairro);
        parametros.add(rua);
        parametros.add(usuario);

        List<Ocorrencia> ocorrencias = bd.pesquisar(parametros);
        String mensagem = "";
        if (ocorrencias.size() == 0) {
            JOptionPane.showMessageDialog(this, "Nenhuma Ocorrência encontrada!", "Atenção!", JOptionPane.WARNING_MESSAGE);
        }
        txtData.setText("");
        txtRua.setText("");
        comboBairros.setSelectedIndex(-1);
        comboRegioes.setSelectedIndex(-1);
        comboUsuarios.setSelectedIndex(-1);
        comboTiposViolencia.setSelectedIndex(-1);
        atualizarListaOcorrencias();
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.setVisible(false);
        new TelaInicial(bd).setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void atualizarListaOcorrencias() {
        lista = new DefaultListModel();
        List<Ocorrencia> ocorrencias = bd.getOcorrencias();
        for (Ocorrencia o : ocorrencias) {
            lista.addElement(o);
        }
        this.listaOcorrencias.setModel(lista);
    }

    private void preencherComboBairros() {
        model = new DefaultComboBoxModel();
        List<Bairro> bairros = bd.getBairros();
        for (Bairro b : bairros) {
            model.addElement(b);
        }
        comboBairros.setModel(model);
    }

    private void preencherComboRegioes() {
        model = new DefaultComboBoxModel();
        List<Regiao> regioes = bd.getRegioes();
        for (Regiao r : regioes) {
            model.addElement(r);
        }
        comboRegioes.setModel(model);
    }

    private void preencherComboTiposViolencia() {
        model = new DefaultComboBoxModel();
        List<TipoViolencia> tipos = bd.getTiposViolencia();
        for (TipoViolencia t : tipos) {
            model.addElement(t);
        }
        comboTiposViolencia.setModel(model);
    }

    private void preencherComboUsuarios() {
        model = new DefaultComboBoxModel();
        List<Usuario> usuarios = bd.getUsuarios();
        for (Usuario u : usuarios) {
            model.addElement(u);
        }
        comboUsuarios.setModel(model);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> comboBairros;
    private javax.swing.JComboBox<String> comboRegioes;
    private javax.swing.JComboBox<String> comboTiposViolencia;
    private javax.swing.JComboBox<String> comboUsuarios;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblRegiao;
    private javax.swing.JLabel lblRua;
    private javax.swing.JLabel lblTiposViolencia;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JList<String> listaOcorrencias;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtRua;
    // End of variables declaration//GEN-END:variables
}
