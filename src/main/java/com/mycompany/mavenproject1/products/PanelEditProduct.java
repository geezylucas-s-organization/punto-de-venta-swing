/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1.products;

import com.mycompany.mavenproject1.apiclient.ApiClient;
import com.mycompany.mavenproject1.apiclient.products.AddProductRequest;
import com.mycompany.mavenproject1.apiclient.products.ProductsResponse;
import com.mycompany.mavenproject1.sqlite.SQLiteJDBC;
import com.mycompany.mavenproject1.utils.MaxLengthTextDocument;
import com.mycompany.mavenproject1.utils.StyledButtonUI;
import java.awt.Color;
import java.math.BigDecimal;
import javax.swing.JOptionPane;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 *
 * @author geezylucas
 */
public class PanelEditProduct extends javax.swing.JPanel {

    private ProductsResponse product;

    /**
     * Creates new form PanelAddProduct
     *
     */
    public PanelEditProduct() {
        initComponents();
        myInit();
    }

    public PanelEditProduct(ProductsResponse product) {
        this.product = product;
        initComponents();
        myInit();
    }

    private void myInit() {
        MaxLengthTextDocument maxLength = new MaxLengthTextDocument();
        maxLength.setMaxChars(50);

        txtNameProduct.setDocument(maxLength);

        txtBarcode.setText(this.product.getBarcode());
        txtNameProduct.setText(this.product.getName());
        txtDescription.setText(this.product.getDescription());
        txtCostPrice.setText(this.product.getPriceIn().toString());
        txtSalePrice.setText(this.product.getPriceOut1().toString());
        txtSalePrice1.setText(this.product.getPriceOut2() != null ? this.product.getPriceOut2().toString() : "");
        txtSalePrice2.setText(this.product.getPriceOut3() != null ? this.product.getPriceOut3().toString() : "");
        txtMinimum.setText(String.valueOf(this.product.getInventoryMin()));
        txtInventorySalePrice2.setText(this.product.getInventoryOut3() != null ? this.product.getInventoryOut3().toString() : "");
        lblDepartament.setText(this.product.getCategory());

        switch (this.product.getUnit()) {
            case "UD":
                rbUnit.setSelected(true);
                break;
            case "PKG":
                rbPackage.setSelected(true);
                break;
            default:
                rbBulk.setSelected(true);
                break;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroupUnit = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btnEdit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtNameProduct = new javax.swing.JTextField();
        txtSalePrice1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCostPrice = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtMinimum = new javax.swing.JTextField();
        txtSalePrice2 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rbUnit = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        rbPackage = new javax.swing.JRadioButton();
        txtBarcode = new javax.swing.JTextField();
        rbBulk = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        txtDescription = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtSalePrice = new javax.swing.JTextField();
        lblDepartament = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtInventorySalePrice2 = new javax.swing.JTextField();

        setMinimumSize(new java.awt.Dimension(1200, 630));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 50));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        btnEdit.setBackground(new java.awt.Color(0, 166, 237));
        btnEdit.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("Editar");
        btnEdit.setMaximumSize(new java.awt.Dimension(81, 40));
        btnEdit.setMinimumSize(new java.awt.Dimension(81, 40));
        btnEdit.setPreferredSize(new java.awt.Dimension(250, 40));
        btnEdit.setUI(new StyledButtonUI());
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 15;
        jPanel1.add(btnEdit, gridBagConstraints);

        add(jPanel1, java.awt.BorderLayout.PAGE_END);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(1200, 580));

        txtNameProduct.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N

        txtSalePrice1.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N

        jLabel10.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel10.setText("Mínimo en inventario:");
        jLabel10.setMaximumSize(new java.awt.Dimension(181, 26));
        jLabel10.setMinimumSize(new java.awt.Dimension(181, 26));

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel6.setText("Precio venta dinámico:");

        txtCostPrice.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setText("Editar producto");

        txtMinimum.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N

        txtSalePrice2.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N

        jLabel12.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel12.setText("Se vende:");

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel2.setText("Código de barras:");

        rbUnit.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupUnit.add(rbUnit);
        rbUnit.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        rbUnit.setSelected(true);
        rbUnit.setText("Unidad");

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel7.setText("Precio venta mayoreo:");
        jLabel7.setPreferredSize(new java.awt.Dimension(181, 26));

        rbPackage.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupUnit.add(rbPackage);
        rbPackage.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        rbPackage.setText("Paquete");

        txtBarcode.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        txtBarcode.setEditable(false);

        rbBulk.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupUnit.add(rbBulk);
        rbBulk.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        rbBulk.setText("Granel");

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel8.setText("Departamento:");

        txtDescription.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel4.setText("Precio costo:");

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel3.setText("Nombre producto:");

        jLabel13.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel13.setText("Descripción:");

        txtSalePrice.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N

        lblDepartament.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        lblDepartament.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDepartament.setText("Salchichonería");

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel5.setText("Precio venta:");

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel9.setText("Inventario mayoreo:");
        jLabel9.setPreferredSize(new java.awt.Dimension(181, 26));

        txtInventorySalePrice2.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtNameProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rbUnit)
                        .addGap(33, 33, 33)
                        .addComponent(rbPackage)
                        .addGap(34, 34, 34)
                        .addComponent(rbBulk))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtCostPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtSalePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtSalePrice1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtSalePrice2, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtMinimum, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblDepartament, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtInventorySalePrice2, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel2))
                    .addComponent(txtBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel3))
                    .addComponent(txtNameProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel13))
                    .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel12))
                    .addComponent(rbUnit)
                    .addComponent(rbPackage)
                    .addComponent(rbBulk))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel4))
                    .addComponent(txtCostPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel5))
                    .addComponent(txtSalePrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel6))
                    .addComponent(txtSalePrice1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtSalePrice2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtInventorySalePrice2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtMinimum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(lblDepartament))
                .addGap(40, 40, 40))
        );

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        btnEdit.setBackground(Color.GRAY);
        btnEdit.setEnabled(false);
        if (!txtBarcode.getText().equals("") && !txtNameProduct.getText().equals("")
                && !txtCostPrice.getText().equals("") && !txtSalePrice.getText().equals("")
                && !txtMinimum.getText().equals("")) {
            SQLiteJDBC sqlite = new SQLiteJDBC();
            String token = sqlite.getToken();

            AddProductRequest editProduct = new AddProductRequest();
            editProduct.setBarcode(txtBarcode.getText());
            editProduct.setName(txtNameProduct.getText());
            editProduct.setDescription(txtDescription.getText());
            editProduct.setPriceIn(new BigDecimal(txtCostPrice.getText()));
            editProduct.setPriceOut1(new BigDecimal(txtSalePrice.getText()));
            if (!txtSalePrice1.getText().equals("")) {
                editProduct.setPriceOut2(new BigDecimal(txtSalePrice1.getText()));
            }
            if (!txtSalePrice2.getText().equals("")) {
                editProduct.setPriceOut3(new BigDecimal(txtSalePrice2.getText()));
                editProduct.setInventoryOut3(Double.valueOf(this.txtInventorySalePrice2.getText()));
            }
            editProduct.setInventoryMin(Integer.valueOf(txtMinimum.getText()));
            editProduct.setBulk(false);

            if (rbUnit.isSelected()) {
                editProduct.setUnit("UD");
            } else if (rbPackage.isSelected()) {
                editProduct.setUnit("PKG");
            } else if (rbBulk.isSelected()) {
                editProduct.setBulk(true);
            }

            editProduct.setStatus(true);

            Call<ResponseBody> editProductResponseCall = ApiClient.getProductService().editProduct(this.product.getId(), editProduct, "Bearer " + token);
            editProductResponseCall.enqueue(new Callback<ResponseBody>() {
                @Override
                public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                    if (response.isSuccessful()) {
                        JOptionPane.showMessageDialog(null, "Producto " + txtNameProduct.getText() + " editado exitosamente", "Editar producto", JOptionPane.INFORMATION_MESSAGE);
                        btnEdit.setBackground(new java.awt.Color(0, 166, 237));
                        btnEdit.setEnabled(true);
                    }
                }

                @Override
                public void onFailure(Call<ResponseBody> call, Throwable t) {
                    System.out.println(t.getLocalizedMessage());
                }
            });
        } else {
            JOptionPane.showMessageDialog(null, "Faltan campos obligatorios por llenar", "Editar producto", JOptionPane.ERROR_MESSAGE);
            btnEdit.setBackground(new java.awt.Color(0, 166, 237));
            btnEdit.setEnabled(true);
        }
    }//GEN-LAST:event_btnEditActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.ButtonGroup buttonGroupUnit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblDepartament;
    private javax.swing.JRadioButton rbBulk;
    private javax.swing.JRadioButton rbPackage;
    private javax.swing.JRadioButton rbUnit;
    private javax.swing.JTextField txtBarcode;
    private javax.swing.JTextField txtCostPrice;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtInventorySalePrice2;
    private javax.swing.JTextField txtMinimum;
    private javax.swing.JTextField txtNameProduct;
    private javax.swing.JTextField txtSalePrice;
    private javax.swing.JTextField txtSalePrice1;
    private javax.swing.JTextField txtSalePrice2;
    // End of variables declaration//GEN-END:variables
}
