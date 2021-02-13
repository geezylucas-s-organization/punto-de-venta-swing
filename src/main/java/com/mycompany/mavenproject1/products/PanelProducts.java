/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1.products;

import com.mycompany.mavenproject1.apiclient.ApiClient;
import com.mycompany.mavenproject1.apiclient.ClassBase;
import com.mycompany.mavenproject1.apiclient.products.ProductsResponse;
import com.mycompany.mavenproject1.sqlite.SQLiteJDBC;
import com.mycompany.mavenproject1.utils.ForcedListSelectionModel;
import com.mycompany.mavenproject1.utils.StyledButtonUI;
import java.awt.Color;
import java.awt.Container;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 *
 * @author geezylucas
 */
public class PanelProducts extends javax.swing.JPanel {

    /**
     * Creates new form PanelProducts
     */
    public PanelProducts() {
        initComponents();
        tblProducts.getColumnModel().getColumn(0).setMinWidth(0);
        tblProducts.getColumnModel().getColumn(0).setMaxWidth(0);
        tblProducts.getColumnModel().getColumn(0).setWidth(0);
        tblProducts.setRowHeight(30);
        tblProducts.setShowGrid(true);
        getProducts();
    }

    private void getProducts() {
        SQLiteJDBC sqlite = new SQLiteJDBC();
        String token = sqlite.getToken();
        Call<ClassBase<ProductsResponse>> productsResponseCall = ApiClient.getProductService().getProducts("Bearer " + token);
        productsResponseCall.enqueue(new Callback<ClassBase<ProductsResponse>>() {
            @Override
            public void onResponse(Call<ClassBase<ProductsResponse>> call, Response<ClassBase<ProductsResponse>> response) {
                if (response.isSuccessful()) {
                    ClassBase<ProductsResponse> productsResponse = response.body();
                    if (productsResponse != null) {
                        List<ProductsResponse> list = productsResponse.getData();
                        DefaultTableModel model = (DefaultTableModel) tblProducts.getModel();

                        list.forEach(item -> {
                            model.addRow(new Object[]{
                                item.getId(),
                                item.getBarcode(),
                                item.getName(),
                                item.getDescription(),
                                item.getPriceIn(),
                                item.getPriceOut1(),
                                item.getPriceOut2(),
                                item.getPriceOut3(),
                                item.getInventoryOut3(),
                                item.getInventoryMin(),
                                item.getStock(),
                                item.getUnit(),
                                item.getCategory(),});
                        });

                        lblTotal.setText("Total de productos: " + productsResponse.getTotal());
                    }
                }
            }

            @Override
            public void onFailure(Call<ClassBase<ProductsResponse>> call, Throwable t) {
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

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        lblTotal = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProducts = new javax.swing.JTable();

        setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(1200, 110));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setText("Productos");

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel3.setText("Buscar:");

        btnSearch.setBackground(new java.awt.Color(0, 166, 237));
        btnSearch.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Buscar");
        btnSearch.setMaximumSize(new java.awt.Dimension(93, 40));
        btnSearch.setMinimumSize(new java.awt.Dimension(93, 40));
        btnSearch.setPreferredSize(new java.awt.Dimension(93, 40));
        btnSearch.setUI(new StyledButtonUI());

        txtSearch.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N

        btnEdit.setBackground(new java.awt.Color(127, 184, 0));
        btnEdit.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("Editar");
        btnEdit.setMaximumSize(new java.awt.Dimension(93, 40));
        btnEdit.setMinimumSize(new java.awt.Dimension(93, 40));
        btnEdit.setPreferredSize(new java.awt.Dimension(93, 40));
        btnEdit.setUI(new StyledButtonUI());
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(246, 81, 29));
        btnDelete.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Eliminar");
        btnDelete.setMaximumSize(new java.awt.Dimension(93, 40));
        btnDelete.setMinimumSize(new java.awt.Dimension(93, 40));
        btnDelete.setPreferredSize(new java.awt.Dimension(93, 40));
        btnDelete.setUI(new StyledButtonUI());
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(425, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(1200, 45));

        lblTotal.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTotal.setText("Total de productos: 0");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(830, Short.MAX_VALUE)
                .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTotal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel4, java.awt.BorderLayout.PAGE_END);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        tblProducts.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tblProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Código de barras", "Nombre", "Descripción", "Precio costo", "Precio venta", "Precio dinámico", "Precio mayoreo", "Inv. Mayoreo", "Inv. Mínimo", "Existencia", "Tipo venta", "Departamento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProducts.setSelectionModel(new ForcedListSelectionModel());
        jScrollPane1.setViewportView(tblProducts);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1188, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel5, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        int column = 1;
        int row = tblProducts.getSelectedRow();
        String barcode = tblProducts.getModel().getValueAt(row, column).toString();

        SQLiteJDBC sqlite = new SQLiteJDBC();
        String token = sqlite.getToken();
        Call<ProductsResponse> productResponseCall = ApiClient.getProductService().getProductByBarcodeWithQuantity(barcode, "Bearer " + token);

        ProductsResponse product = null;
        try {
            product = productResponseCall.execute().body();
        } catch (IOException ex) {
            Logger.getLogger(PanelProducts.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (product != null) {
            PanelEditProduct editCategory = new PanelEditProduct(product);
            Container c = this.getParent();
            c.removeAll();
            c.add(editCategory);
            c.validate();
            c.repaint();
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        btnDelete.setBackground(Color.GRAY);
        btnDelete.setEnabled(false);

        int column = 2;
        int row = tblProducts.getSelectedRow();
        String nameProduct = tblProducts.getModel().getValueAt(row, column).toString();
        column = 0;
        int idProduct = Integer.valueOf(tblProducts.getModel().getValueAt(row, column).toString());

        int input = JOptionPane.showConfirmDialog(null, "¿Seguro de eliminar el producto " + nameProduct + "?");

        if (input == 0) {
            SQLiteJDBC sqlite = new SQLiteJDBC();
            String token = sqlite.getToken();

            Call<ResponseBody> editProductResponseCall = ApiClient.getProductService().deleteProduct(idProduct, "Bearer " + token);
            editProductResponseCall.enqueue(new Callback<ResponseBody>() {
                @Override
                public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                    if (response.isSuccessful()) {
                        JOptionPane.showMessageDialog(null, "Producto " + nameProduct + " eliminado exitosamente", "Eliminar producto", JOptionPane.INFORMATION_MESSAGE);
                        btnDelete.setBackground(new java.awt.Color(246, 81, 29));
                        btnDelete.setEnabled(true);
                    }
                }

                @Override
                public void onFailure(Call<ResponseBody> call, Throwable t) {
                    System.out.println(t.getLocalizedMessage());
                }
            });
        } else {
            btnDelete.setBackground(new java.awt.Color(246, 81, 29));
            btnDelete.setEnabled(true);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTable tblProducts;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
