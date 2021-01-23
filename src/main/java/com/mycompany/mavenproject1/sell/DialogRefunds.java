/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1.sell;

import com.mycompany.mavenproject1.apiclient.ApiClient;
import com.mycompany.mavenproject1.apiclient.sells.DetailReturnResponse;
import com.mycompany.mavenproject1.apiclient.sells.ReturnsResponse;
import com.mycompany.mavenproject1.sqlite.SQLiteJDBC;
import com.mycompany.mavenproject1.utils.ForcedListSelectionModel;
import com.mycompany.mavenproject1.utils.StyledButtonUI;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 *
 * @author User
 */
public class DialogRefunds extends javax.swing.JDialog {

    /**
     * Creates new form DialogRefunds
     *
     * @param parent
     * @param modal
     */
    public DialogRefunds(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        tblReturns.setRowHeight(30);
        tblReturns.setShowGrid(true);

        tblDetails.getColumnModel().getColumn(0).setMinWidth(0);
        tblDetails.getColumnModel().getColumn(0).setMaxWidth(0);
        tblDetails.getColumnModel().getColumn(0).setWidth(0);
        tblDetails.setRowHeight(30);
        tblDetails.setShowGrid(true);
        getReturns();
    }

    private void getReturns() {
        SQLiteJDBC sqlite = new SQLiteJDBC();
        String token = sqlite.getToken();
        Call<List<ReturnsResponse>> returnsResponseCall = ApiClient.getSalesService().returnsToday("Bearer " + token);
        returnsResponseCall.enqueue(new Callback<List<ReturnsResponse>>() {
            @Override
            public void onResponse(Call<List<ReturnsResponse>> call, Response<List<ReturnsResponse>> response) {
                if (response.isSuccessful()) {
                    List<ReturnsResponse> list = response.body();
                    if (list != null) {
                        DefaultTableModel model = (DefaultTableModel) tblReturns.getModel();

                        list.forEach(item -> {
                            model.addRow(new Object[]{
                                item.getFolio(),
                                item.getCashier(),
                                item.getClient(),
                                item.getStatus(),
                                item.getTime(),
                                item.getProducts(),
                                item.getTotal(),
                                item.getCash()
                            });
                        });
                    }
                }
            }

            @Override
            public void onFailure(Call<List<ReturnsResponse>> call, Throwable t) {
                System.out.println(t.getLocalizedMessage());
            }
        });
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReturns = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnRefunds = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDetails = new javax.swing.JTable();
        btnDetails = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setText("Ventas del día (Devoluciones)");

        tblReturns.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tblReturns.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Folio", "Cajero", "Cliente", "Estatus", "Hora", "# Artículos", "Total", "Pago con"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblReturns.setSelectionModel(new ForcedListSelectionModel());
        jScrollPane1.setViewportView(tblReturns);

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setText("Venta #1");

        btnRefunds.setBackground(new java.awt.Color(127, 184, 0));
        btnRefunds.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnRefunds.setForeground(new java.awt.Color(255, 255, 255));
        btnRefunds.setText("Cancelar venta");
        btnRefunds.setUI(new StyledButtonUI());
        btnRefunds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefundsActionPerformed(evt);
            }
        });

        tblDetails.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tblDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Nombre", "Cantidad ", "Precio venta", "Importe"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblDetails);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(btnRefunds)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRefunds, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnDetails.setBackground(new java.awt.Color(0, 166, 237));
        btnDetails.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnDetails.setForeground(new java.awt.Color(255, 255, 255));
        btnDetails.setText("Detalles");
        btnDetails.setMaximumSize(new java.awt.Dimension(117, 40));
        btnDetails.setMinimumSize(new java.awt.Dimension(117, 40));
        btnDetails.setPreferredSize(new java.awt.Dimension(117, 40));
        btnDetails.setUI(new StyledButtonUI());
        btnDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 802, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(btnDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRefundsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefundsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRefundsActionPerformed

    private void btnDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetailsActionPerformed
        // TODO add your handling code here:
        int column = 0;
        int row = tblReturns.getSelectedRow();
        int sellId = Integer.valueOf(tblReturns.getModel().getValueAt(row, column).toString());

        SQLiteJDBC sqlite = new SQLiteJDBC();
        String token = sqlite.getToken();
        Call<List<DetailReturnResponse>> detailReturnResponseCall = ApiClient.getSalesService().detailsReturn(sellId, "Bearer " + token);
        detailReturnResponseCall.enqueue(new Callback<List<DetailReturnResponse>>() {
            @Override
            public void onResponse(Call<List<DetailReturnResponse>> call, Response<List<DetailReturnResponse>> response) {
                if (response.isSuccessful()) {
                    List<DetailReturnResponse> list = response.body();
                    if (list != null) {
                        DefaultTableModel model = (DefaultTableModel) tblDetails.getModel();

                        model.setRowCount(0);
                        list.forEach(item -> {
                            model.addRow(new Object[]{
                                item.getId(),
                                item.getProductName(),
                                item.getQuantity(),
                                item.getPriceOut(),
                                item.getTotal()
                            });
                        });
                    }
                }
            }

            @Override
            public void onFailure(Call<List<DetailReturnResponse>> call, Throwable t) {
                System.out.println(t.getLocalizedMessage());
            }
        });
    }//GEN-LAST:event_btnDetailsActionPerformed

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
            java.util.logging.Logger.getLogger(DialogRefunds.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogRefunds.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogRefunds.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogRefunds.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            DialogRefunds dialog = new DialogRefunds(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDetails;
    private javax.swing.JButton btnRefunds;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblDetails;
    private javax.swing.JTable tblReturns;
    // End of variables declaration//GEN-END:variables
}
