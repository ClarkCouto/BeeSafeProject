/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import dominio.BaseDeDados;
import dominio.Usuario;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import testes.BeeSafe;

/**
 *
 * @author ccouto
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    private BeeSafe bs;
    private BaseDeDados bd;
    private TelaBairros telaBairros;
    private TelaOcorrencias telaOcorrencias;
    private TelaRegioes telaRegioes;
    private TelaTipoViolencia telaTipoViolencia;
    private TelaUsuarios telaUsuarios;
    private TelaPesquisar telaPesquisar;
    private TelaEditarCadastro telaEditarCadastro;
    private TelaEditarUsuarios telaEditarUsuarios;
    private Usuario usuario;
    
    public TelaPrincipal(BaseDeDados base, Usuario user) {
        super("Inicio");
        if(base == null){
            bs = new BeeSafe();
            base = bs.iniciarBaseDeDados();
        }
        if(usuario == null){
            usuario = user;
        }
        bd = base;
        
        initComponents();
        
        //Imprime os dados do usuario logado
        //JOptionPane.showMessageDialog(this, usuario.getInformacoesUsuario(), "Atenção!", JOptionPane.WARNING_MESSAGE);
        
        if(usuario.getTipoUsuario().getTipo().equals("COMUM")){
            btnBairros.setVisible(false);
            btnRegioes.setVisible(false);
            btnTipoViolencia.setVisible(false);
            btnEditarUsuarios.setVisible(false);
        }
        telaBairros = new TelaBairros(bd, usuario);
        telaOcorrencias = new TelaOcorrencias(bd, usuario);
        telaRegioes = new TelaRegioes(bd, usuario);
        telaTipoViolencia = new TelaTipoViolencia(bd, usuario);
        telaUsuarios = new TelaUsuarios(bd);
        telaPesquisar = new TelaPesquisar(bd, usuario);
        telaEditarUsuarios = new TelaEditarUsuarios(bd, usuario);
        telaEditarCadastro = new TelaEditarCadastro(bd, usuario);
        
        //Centraliza a tela
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((tela.width - this.getSize().width) / 2, (tela.height - this.getSize().height) / 2);
        this.setVisible(true);
        
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
        btnBairros = new javax.swing.JButton();
        btnOcorrencias = new javax.swing.JButton();
        btnRegioes = new javax.swing.JButton();
        btnTipoViolencia = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        btnPesquisar = new javax.swing.JButton();
        btnEstatisticas = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnEditarCadastro = new javax.swing.JButton();
        btnEditarUsuarios = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnBairros.setText("Criar Bairros");
        btnBairros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBairrosActionPerformed(evt);
            }
        });

        btnOcorrencias.setText("Criar Ocorrência");
        btnOcorrencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOcorrenciasActionPerformed(evt);
            }
        });

        btnRegioes.setText("Criar Regiões");
        btnRegioes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegioesActionPerformed(evt);
            }
        });

        btnTipoViolencia.setText("Tipos de Violência");
        btnTipoViolencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTipoViolenciaActionPerformed(evt);
            }
        });

        lblTitulo.setText("ESCOLHA UMA OPÇÃO:");

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnEstatisticas.setText("Estatísticas");

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnEditarCadastro.setText("Editar Cadastro");
        btnEditarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarCadastroActionPerformed(evt);
            }
        });

        btnEditarUsuarios.setText("Editar Usuários");
        btnEditarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarUsuariosActionPerformed(evt);
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
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnOcorrencias, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                    .addComponent(btnPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnEditarCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnEstatisticas, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnBairros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnRegioes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnTipoViolencia, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                    .addComponent(btnEditarUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(lblTitulo))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPesquisar)
                    .addComponent(btnEstatisticas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOcorrencias)
                    .addComponent(btnEditarCadastro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTipoViolencia)
                    .addComponent(btnBairros))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarUsuarios)
                    .addComponent(btnRegioes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSair)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBairrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBairrosActionPerformed
        this.setVisible(false);
        telaBairros.setVisible(true);
    }//GEN-LAST:event_btnBairrosActionPerformed

    private void btnRegioesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegioesActionPerformed
        this.setVisible(false);
        telaRegioes.setVisible(true);
    }//GEN-LAST:event_btnRegioesActionPerformed

    private void btnOcorrenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOcorrenciasActionPerformed
        this.setVisible(false);
        telaOcorrencias.setVisible(true);
    }//GEN-LAST:event_btnOcorrenciasActionPerformed

    private void btnTipoViolenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTipoViolenciaActionPerformed
        this.setVisible(false);
        telaTipoViolencia.setVisible(true);
    }//GEN-LAST:event_btnTipoViolenciaActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        this.setVisible(false);
        telaPesquisar.setVisible(true);
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.setVisible(false);
        new TelaInicial(bd).setVisible(true);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnEditarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarCadastroActionPerformed
        this.setVisible(false);
        telaEditarCadastro.setVisible(true);
    }//GEN-LAST:event_btnEditarCadastroActionPerformed

    private void btnEditarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarUsuariosActionPerformed
        this.setVisible(false);
        telaEditarUsuarios.setVisible(true);
    }//GEN-LAST:event_btnEditarUsuariosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBairros;
    private javax.swing.JButton btnEditarCadastro;
    private javax.swing.JButton btnEditarUsuarios;
    private javax.swing.JButton btnEstatisticas;
    private javax.swing.JButton btnOcorrencias;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnRegioes;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnTipoViolencia;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
