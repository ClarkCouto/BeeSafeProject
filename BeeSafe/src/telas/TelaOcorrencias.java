/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import dominio.Bairro;
import dominio.BaseDeDados;
import dominio.Ocorrencia;
import dominio.TipoViolencia;
import dominio.Usuario;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author 0729159
 */
public class TelaOcorrencias extends javax.swing.JFrame {

    private BaseDeDados bd;
    private DefaultListModel lista; 
    private DefaultComboBoxModel model;
    private Usuario usuario;
    private SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");
    
    public TelaOcorrencias(BaseDeDados base, Usuario user) {
        super("Ocorrências");
        this.bd = base;
        this.usuario = user;
        initComponents();
        
        preencherComboBairros();
        preencherComboTiposViolencia();
        atualizarListaOcorrencias();
        
        //Centraliza a tela
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((tela.width - this.getSize().width) / 2, (tela.height - this.getSize().height) / 2);
        
        //Encerrar a aplicação quando fechar a tela 
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblData = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        txtRua = new javax.swing.JTextField();
        lblRua = new javax.swing.JLabel();
        lblNumero = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        comboBairros = new javax.swing.JComboBox();
        lblBairro = new javax.swing.JLabel();
        lblTipoOcorrencia = new javax.swing.JLabel();
        comboTiposViolencia = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        btnCriarOcorrencia = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaOcorrencias = new javax.swing.JList();
        btnVoltar = new javax.swing.JButton();
        lblDescricao = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblTituloOcorrencia = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblData.setText("Data:");

        lblTitulo.setText("OCORRÊNCIAS");

        lblRua.setText("Rua:");

        lblNumero.setText("Número:");

        comboBairros.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblBairro.setText("Bairro:");

        lblTipoOcorrencia.setText("Tipo de Ocorrência:");

        comboTiposViolencia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtDescricao.setColumns(20);
        txtDescricao.setRows(5);
        jScrollPane2.setViewportView(txtDescricao);

        btnCriarOcorrencia.setText("Criar");
        btnCriarOcorrencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarOcorrenciaActionPerformed(evt);
            }
        });

        listaOcorrencias.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listaOcorrencias);

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        lblDescricao.setText("Descrição:");

        jLabel1.setText("OCORRÊNCIAS CADASTRADAS");

        lblTituloOcorrencia.setText("Título:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblData)
                                    .addComponent(lblRua)
                                    .addComponent(lblNumero)
                                    .addComponent(lblBairro))
                                .addGap(68, 68, 68)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtData)
                                    .addComponent(txtRua)
                                    .addComponent(txtNumero)
                                    .addComponent(comboBairros, 0, 150, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(lblTitulo)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(54, 54, 54))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTipoOcorrencia)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCriarOcorrencia)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(comboTiposViolencia, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(btnVoltar))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDescricao))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTituloOcorrencia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblData)
                        .addGap(18, 18, 18)
                        .addComponent(lblRua))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNumero)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBairro)
                    .addComponent(comboBairros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoOcorrencia)
                    .addComponent(comboTiposViolencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTituloOcorrencia)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(lblDescricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCriarOcorrencia)
                .addGap(13, 13, 13)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnCriarOcorrenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarOcorrenciaActionPerformed
        if (txtData.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Você deve informar a Data.", "Atenção!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else if (txtRua.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Você deve informar a Rua.", "Atenção!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else if (txtNumero.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Você deve informar o Número.", "Atenção!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else if (comboBairros.getSelectedIndex() == -1 || comboBairros.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Você deve selecionar o Bairro!", "Atenção!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else if (comboTiposViolencia.getSelectedIndex() == -1  || comboTiposViolencia.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Você deve selecionar o Tipo de Violência!", "Atenção!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else if (txtTitulo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Você deve informar o Título da Ocorrência!", "Atenção!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else{
            Date data = formatarData(txtData.getText());
            if(data == null){
                JOptionPane.showMessageDialog(this, "Data Inválida!", "Atenção!", JOptionPane.WARNING_MESSAGE);
            }
            else{
                //String rua, int numero, String nomeBairro, String nomeUsuario, String email, String senha, String descricao, String tipoDeViolencia, Date data
                String mensagem = bd.criarOcorrencia(txtRua.getText(), txtNumero.getText(), comboBairros.getSelectedItem().toString(), usuario.getNome(), txtTitulo.getText(), txtDescricao.getText(), comboTiposViolencia.getSelectedItem().toString(), data);
                if(!mensagem.equals("OK")){
                    JOptionPane.showMessageDialog(this, mensagem, "Atenção!", JOptionPane.WARNING_MESSAGE);
                }
                else{
                    txtData.setText("");
                    txtRua.setText("");
                    txtNumero.setText("");
                    txtDescricao.setText("");
                    txtTitulo.setText("");
                    comboBairros.setSelectedIndex(0);
                    comboTiposViolencia.setSelectedIndex(0);
                    atualizarListaOcorrencias();
                }
            }
        }
    }//GEN-LAST:event_btnCriarOcorrenciaActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.setVisible(false);
        new TelaPrincipal(bd, usuario).setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void atualizarListaOcorrencias(){
        lista = new DefaultListModel();
        List<Ocorrencia> ocorrencias = bd.getOcorrencias();
        for(Ocorrencia o : ocorrencias){
            lista.addElement(o);
        }
        this.listaOcorrencias.setModel(lista);
    }

    private Date formatarData(String data){
        Date dataFormatada = null;
        try{
            dataFormatada = formataData.parse(data);
        }
        catch(Exception e){}
        return dataFormatada;
    }
    
    private void preencherComboBairros(){
        model = new DefaultComboBoxModel();
        model.addElement("--Selecione--");
        List<Bairro> bairros = bd.getBairros();
        for(Bairro b : bairros){
            model.addElement(b);
        }
        comboBairros.setModel(model);
    }
    private void preencherComboTiposViolencia(){
        model = new DefaultComboBoxModel();
        model.addElement("--Selecione--");
        List<TipoViolencia> tipos = bd.getTiposViolencia();
        for(TipoViolencia t : tipos){
            model.addElement(t);
        }
        comboTiposViolencia.setModel(model);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCriarOcorrencia;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox comboBairros;
    private javax.swing.JComboBox comboTiposViolencia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblRua;
    private javax.swing.JLabel lblTipoOcorrencia;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTituloOcorrencia;
    private javax.swing.JList listaOcorrencias;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtRua;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
