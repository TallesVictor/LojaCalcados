/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ProdutoController;
import Model.Produto;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dcxz
 */
public class TelaEstoque extends javax.swing.JFrame {
int idUs;
ProdutoController controller;
    /**
     * Creates new form TelaEstoque
     */
    public TelaEstoque(int id) {
        initComponents(); 
        idUs=id;
        controller= new ProdutoController();
        ArrayList listaProduto= controller.buscarTodos();
        mostrarProduto(listaProduto);
    }
private void mostrarProduto(ArrayList<Produto> listaProduto) {
        String col[] = {"Código", "Modelo","Marca","Numeração","Fornecedor","Quantidade","Preço"};
        DefaultTableModel tableModel = new DefaultTableModel(col, 0);
        for (Produto p: listaProduto) {
            Object[] data = {
                p.getId(), 
                p.getModelo(),
            p.getMarca(),
            p.getNumeracao(),
            p.getIdFornecedor(),
            p.getQuantidade(),
            p.getPreco()
            };
            tableModel.addRow(data);
        }        
        Tabela = new JTable(tableModel);
        Painel.setViewportView(Tabela);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Painel = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        txtID = new javax.swing.JLabel();
        campoID = new javax.swing.JTextField();
        txtMarca = new javax.swing.JLabel();
        campoMarca = new javax.swing.JTextField();
        campoModelo = new javax.swing.JTextField();
        txtModelo = new javax.swing.JLabel();
        btBuscar = new javax.swing.JButton();
        btManter = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btCrescente = new javax.swing.JButton();
        btDescrescente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Tabela.setModel(new javax.swing.table.DefaultTableModel(
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
        Painel.setViewportView(Tabela);

        txtID.setText("ID:");

        txtMarca.setText("Marca:");

        campoModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoModeloActionPerformed(evt);
            }
        });

        txtModelo.setText("Modelo:");

        btBuscar.setText("Buscar");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        btManter.setText("Manter Produto");
        btManter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btManterActionPerformed(evt);
            }
        });

        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        jLabel1.setText("Ordenar o preço por ordem");

        btCrescente.setText("Crescente");
        btCrescente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCrescenteActionPerformed(evt);
            }
        });

        btDescrescente.setText("Descrescente");
        btDescrescente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDescrescenteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btManter)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btVoltar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoID, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtMarca)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtModelo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Painel, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btDescrescente)
                                    .addComponent(btCrescente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 11, Short.MAX_VALUE)))
                .addGap(2, 2, 2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtID)
                            .addComponent(campoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMarca)
                            .addComponent(campoMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtModelo)
                            .addComponent(btBuscar))
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Painel, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(btCrescente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btDescrescente)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btManter)
                    .addComponent(btVoltar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoModeloActionPerformed

    private void btManterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btManterActionPerformed
        mostrarManterProduto();
    }//GEN-LAST:event_btManterActionPerformed

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
      if(campoID.getText().length()>0){
          mostrarProduto(controller.buscarTodosID(Integer.parseInt(campoID.getText())));
      }else if(campoMarca.getText().length()>0){
          mostrarProduto(controller.buscarTodosMarca(campoMarca.getText()));
      }else if(campoModelo.getText().length()>0){
          mostrarProduto(controller.buscarTodosModelo(campoModelo.getText()));
      }else mostrarProduto(controller.buscarTodos());
      
    }//GEN-LAST:event_btBuscarActionPerformed

    private void btCrescenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCrescenteActionPerformed
        mostrarProduto(controller.ordenarPrecoAsc());
    }//GEN-LAST:event_btCrescenteActionPerformed

    private void btDescrescenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDescrescenteActionPerformed
         mostrarProduto(controller.ordernarPrecoDesc());
    }//GEN-LAST:event_btDescrescenteActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        mostrarMenu(idUs);
    }//GEN-LAST:event_btVoltarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEstoque(2).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane Painel;
    private javax.swing.JTable Tabela;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btCrescente;
    private javax.swing.JButton btDescrescente;
    private javax.swing.JButton btManter;
    private javax.swing.JButton btVoltar;
    private javax.swing.JTextField campoID;
    private javax.swing.JTextField campoMarca;
    private javax.swing.JTextField campoModelo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel txtID;
    private javax.swing.JLabel txtMarca;
    private javax.swing.JLabel txtModelo;
    // End of variables declaration//GEN-END:variables
public  void mostrarManterProduto(){
         TelaManterProduto tl = new TelaManterProduto(idUs);
        tl.setResizable(false);
        tl.setTitle("Produto");
        tl.setLocationRelativeTo(null);
        tl.setVisible(true);
        tl.setVisible(true);
	this.setVisible(false);
    }
public void mostrarMenu(int id){
        TelaMenu tl = new TelaMenu(id);
        tl.setResizable(false);
        tl.setTitle("Menu");
        tl.setLocationRelativeTo(null);
        tl.setVisible(true);
        this.setVisible(false);
    }
}
