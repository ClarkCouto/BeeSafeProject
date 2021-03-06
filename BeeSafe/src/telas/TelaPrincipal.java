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
import dominio.BeeSafeRepository;

/**
 *
 * @author ccouto
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    private BeeSafeRepository bs;
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
            bs = new BeeSafeRepository();
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
        btnSair = new javax.swing.JButton();
        btnEditarCadastro = new javax.swing.JButton();
        btnEditarUsuarios = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(600, 600));

        btnBairros.setText("Criar Bairros");
        btnBairros.setMaximumSize(new java.awt.Dimension(229, 35));
        btnBairros.setMinimumSize(new java.awt.Dimension(229, 35));
        btnBairros.setPreferredSize(new java.awt.Dimension(229, 35));
        btnBairros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBairrosActionPerformed(evt);
            }
        });

        btnOcorrencias.setText("Criar Ocorrência");
        btnOcorrencias.setPreferredSize(new java.awt.Dimension(229, 35));
        btnOcorrencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOcorrenciasActionPerformed(evt);
            }
        });

        btnRegioes.setText("Criar Regiões");
        btnRegioes.setMaximumSize(new java.awt.Dimension(229, 35));
        btnRegioes.setMinimumSize(new java.awt.Dimension(229, 35));
        btnRegioes.setPreferredSize(new java.awt.Dimension(229, 35));
        btnRegioes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegioesActionPerformed(evt);
            }
        });

        btnTipoViolencia.setText("Tipos de Violência");
        btnTipoViolencia.setMaximumSize(new java.awt.Dimension(229, 35));
        btnTipoViolencia.setMinimumSize(new java.awt.Dimension(229, 35));
        btnTipoViolencia.setPreferredSize(new java.awt.Dimension(229, 35));
        btnTipoViolencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTipoViolenciaActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        lblTitulo.setText("Selecione uma opção:");

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.setPreferredSize(new java.awt.Dimension(545, 35));
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.setMaximumSize(new java.awt.Dimension(169, 26));
        btnSair.setMinimumSize(new java.awt.Dimension(169, 26));
        btnSair.setPreferredSize(new java.awt.Dimension(169, 26));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnEditarCadastro.setText("Editar Cadastro");
        btnEditarCadastro.setMaximumSize(new java.awt.Dimension(229, 35));
        btnEditarCadastro.setMinimumSize(new java.awt.Dimension(229, 35));
        btnEditarCadastro.setPreferredSize(new java.awt.Dimension(229, 35));
        btnEditarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarCadastroActionPerformed(evt);
            }
        });

        btnEditarUsuarios.setText("Editar Usuários");
        btnEditarUsuarios.setMaximumSize(new java.awt.Dimension(229, 35));
        btnEditarUsuarios.setMinimumSize(new java.awt.Dimension(229, 35));
        btnEditarUsuarios.setPreferredSize(new java.awt.Dimension(229, 35));
        btnEditarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarUsuariosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(lblTitulo)
                        .addGap(365, 365, 365))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnRegioes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnBairros, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnOcorrencias, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(87, 87, 87)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnEditarUsuarios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnTipoViolencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnEditarCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOcorrencias, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnTipoViolencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBairros, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEditarUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegioes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, 649, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
    private javax.swing.JButton btnOcorrencias;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnRegioes;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnTipoViolencia;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
