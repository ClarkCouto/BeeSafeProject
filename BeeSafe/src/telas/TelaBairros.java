package telas;

import dominio.Bairro;
import dominio.BaseDeDados;
import dominio.Regiao;
import dominio.Usuario;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Cristiano do Couto
 */
public class TelaBairros extends javax.swing.JFrame {

    private BaseDeDados bd;
    private DefaultTableModel tabela;
    private DefaultComboBoxModel model;
    private Usuario usuario;

    public TelaBairros(BaseDeDados base, Usuario user) {
        super("Bairros");
        this.bd = base;
        this.usuario = user;
        initComponents();
        preencherComboRegioes();
        atualizarTabelaBairros();
        
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblBairros = new javax.swing.JLabel();
        txtNomeBairro = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        comboRegioes = new javax.swing.JComboBox();
        lblBairrosCadastrados = new javax.swing.JLabel();
        btnCriarBairro = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaBairros = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(600, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 600));
        jPanel1.setRequestFocusEnabled(false);

        jLabel1.setText("Nome:");

        lblBairros.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        lblBairros.setText("Bairros");

        txtNomeBairro.setMaximumSize(new java.awt.Dimension(210, 25));
        txtNomeBairro.setMinimumSize(new java.awt.Dimension(210, 25));
        txtNomeBairro.setPreferredSize(new java.awt.Dimension(210, 25));

        jLabel2.setText("Região:");

        comboRegioes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboRegioes.setMaximumSize(new java.awt.Dimension(210, 25));
        comboRegioes.setMinimumSize(new java.awt.Dimension(210, 25));
        comboRegioes.setPreferredSize(new java.awt.Dimension(210, 25));

        lblBairrosCadastrados.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblBairrosCadastrados.setText("Bairros Cadastrados");

        btnCriarBairro.setText("Criar Bairro");
        btnCriarBairro.setMaximumSize(new java.awt.Dimension(100, 30));
        btnCriarBairro.setMinimumSize(new java.awt.Dimension(100, 30));
        btnCriarBairro.setPreferredSize(new java.awt.Dimension(100, 30));
        btnCriarBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarBairroActionPerformed(evt);
            }
        });

        btnVoltar.setText("Voltar");
        btnVoltar.setAlignmentX(5.0F);
        btnVoltar.setMaximumSize(new java.awt.Dimension(100, 30));
        btnVoltar.setMinimumSize(new java.awt.Dimension(100, 30));
        btnVoltar.setPreferredSize(new java.awt.Dimension(100, 30));
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        tabelaBairros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Bairro", "Região"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaBairros.setPreferredSize(new java.awt.Dimension(542, 218));
        jScrollPane3.setViewportView(tabelaBairros);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(lblBairrosCadastrados)))
                .addGap(30, 30, 30))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(lblBairros))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCriarBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNomeBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comboRegioes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(lblBairros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNomeBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(comboRegioes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(btnCriarBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(lblBairrosCadastrados)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCriarBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarBairroActionPerformed
        if (txtNomeBairro.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Você deve informar o nome do Bairro.", "Atenção!", JOptionPane.WARNING_MESSAGE);
        } 
        else if (comboRegioes.getSelectedIndex() == -1 || comboRegioes.getSelectedIndex() == 0) {
        //else if (comboRegioes.getSelectedIndex() == -1 || comboRegioes.getSelectedItem().toString().equals("--Selecione--")) {
            JOptionPane.showMessageDialog(this, "Você deve selecionar a Região!", "Atenção!", JOptionPane.WARNING_MESSAGE);
        }
        else{
            String mensagem = bd.criarBairro(txtNomeBairro.getText(), comboRegioes.getSelectedItem().toString());
            if(!mensagem.equals("OK")){
                JOptionPane.showMessageDialog(this, mensagem, "Atenção!", JOptionPane.WARNING_MESSAGE);
            }
            else{
                txtNomeBairro.setText("");
                comboRegioes.setSelectedIndex(0);
                atualizarTabelaBairros();
            }
        }
    }//GEN-LAST:event_btnCriarBairroActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.setVisible(false);
        new TelaPrincipal(bd, usuario).setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void atualizarTabelaBairros(){    
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(tabelaBairros.getModel());
        tabelaBairros.setRowSorter(sorter);	
        tabela = (DefaultTableModel) tabelaBairros.getModel();
        //Verifica se te algum dado anterior e exclui
        while (tabela.getRowCount() > 0) {
            tabela.removeRow(0);
        }
        //Adiciona os bairros na tabela
        List<Bairro> bairros = bd.getBairros();
        for (Bairro b : bairros) {
            tabela.addRow(new Object[] { b.getNome(), b.getRegiao() });
        }
    }
    
    private void preencherComboRegioes(){
        model = new DefaultComboBoxModel();
        model.addElement("--Selecione--");
        List<Regiao> regioes = bd.getRegioes();
        for(Regiao r : regioes){
            model.addElement(r);
        }
        comboRegioes.setModel(model);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCriarBairro;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox comboRegioes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblBairros;
    private javax.swing.JLabel lblBairrosCadastrados;
    private javax.swing.JTable tabelaBairros;
    private javax.swing.JTextField txtNomeBairro;
    // End of variables declaration//GEN-END:variables
}
