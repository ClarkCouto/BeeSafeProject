/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import dominio.BaseDeDados;
import dominio.Regiao;
import dominio.Usuario;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author 0729159
 */
public class TelaRegioes extends javax.swing.JFrame {
    
    private BaseDeDados bd;
    private DefaultListModel lista; 
    private Usuario usuario;
    /**
     * Creates new form TelaRegioes
     */
    public TelaRegioes(BaseDeDados base, Usuario user) {
        super("Regiões");
        this.bd = base;
        this.usuario = user;
        initComponents();
        atualizarListaRegioes();
        
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
        lblNomeRegiao = new javax.swing.JLabel();
        txtNomeRegiao = new javax.swing.JTextField();
        btnCriarRegiao = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaRegioes = new javax.swing.JList();
        lblTituloRegioes = new javax.swing.JLabel();
        lblRegioes = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(600, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 600));

        lblNomeRegiao.setText("Nome:");

        txtNomeRegiao.setMaximumSize(new java.awt.Dimension(473, 25));
        txtNomeRegiao.setMinimumSize(new java.awt.Dimension(473, 25));
        txtNomeRegiao.setPreferredSize(new java.awt.Dimension(473, 25));
        txtNomeRegiao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeRegiaoActionPerformed(evt);
            }
        });

        btnCriarRegiao.setText("Criar");
        btnCriarRegiao.setMaximumSize(new java.awt.Dimension(100, 30));
        btnCriarRegiao.setMinimumSize(new java.awt.Dimension(100, 30));
        btnCriarRegiao.setPreferredSize(new java.awt.Dimension(100, 30));
        btnCriarRegiao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarRegiaoActionPerformed(evt);
            }
        });

        listaRegioes.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        listaRegioes.setPreferredSize(new java.awt.Dimension(542, 240));
        jScrollPane1.setViewportView(listaRegioes);

        lblTituloRegioes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTituloRegioes.setText("Regiões Cadastradas");

        lblRegioes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblRegioes.setText("Regiões");

        btnVoltar.setText("Voltar");
        btnVoltar.setMaximumSize(new java.awt.Dimension(100, 30));
        btnVoltar.setMinimumSize(new java.awt.Dimension(100, 30));
        btnVoltar.setPreferredSize(new java.awt.Dimension(100, 30));
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(lblRegioes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTituloRegioes)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(lblNomeRegiao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomeRegiao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCriarRegiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblRegioes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeRegiao)
                    .addComponent(txtNomeRegiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(btnCriarRegiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(lblTituloRegioes)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeRegiaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeRegiaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeRegiaoActionPerformed

    private void btnCriarRegiaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarRegiaoActionPerformed
        if (txtNomeRegiao.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Você deve informar o nome da Região.", "Atenção!", JOptionPane.WARNING_MESSAGE);
        } 
        else{
            String mensagem = bd.criarRegiao(txtNomeRegiao.getText());
            if(!mensagem.equals("OK")){
                JOptionPane.showMessageDialog(this, mensagem, "Atenção!", JOptionPane.WARNING_MESSAGE);
            }
            else{
                txtNomeRegiao.setText("");
                atualizarListaRegioes();
            }
        }
    }//GEN-LAST:event_btnCriarRegiaoActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.setVisible(false);
        new TelaPrincipal(bd, usuario).setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void atualizarListaRegioes(){
        lista = new DefaultListModel();
        List<Regiao> l = bd.getRegioes();
        for(Regiao r : l){
            lista.addElement(r);
        }
        this.listaRegioes.setModel(lista);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCriarRegiao;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblNomeRegiao;
    private javax.swing.JLabel lblRegioes;
    private javax.swing.JLabel lblTituloRegioes;
    private javax.swing.JList listaRegioes;
    private javax.swing.JTextField txtNomeRegiao;
    // End of variables declaration//GEN-END:variables
}
