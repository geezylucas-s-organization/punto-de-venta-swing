/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import com.mycompany.mavenproject1.persons.DialogAddClient;
import com.mycompany.mavenproject1.persons.PanelClients;
import com.mycompany.mavenproject1.inventory.DialogAddInventory;
import com.mycompany.mavenproject1.inventory.PanelKardexProduct;
import com.mycompany.mavenproject1.products.DialogAddCategory;
import com.mycompany.mavenproject1.products.PanelCategories;
import com.mycompany.mavenproject1.products.PanelProducts;
import com.mycompany.mavenproject1.reports.PanelReportClients;
import com.mycompany.mavenproject1.reports.PanelReportMovements;
import com.mycompany.mavenproject1.reports.PanelReportSales;
import com.mycompany.mavenproject1.sell.DialogRefunds;
import com.mycompany.mavenproject1.sell.DialogSearchProduct;
import com.mycompany.mavenproject1.sell.PanelSell;
import com.mycompany.mavenproject1.utils.StyledButtonUI;

/**
 *
 * @author geezylucas
 */
public class MainApplication extends javax.swing.JFrame {

    /**
     * Creates new form MainApplication
     */
    public MainApplication() {
        initComponents();
        PanelSell sell = new PanelSell();
        panelCentral.add(sell);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBackgroud = new javax.swing.JPanel();
        panelTitle = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelCentral = new javax.swing.JPanel();
        menuBar = new javax.swing.JMenuBar();
        sellMenu = new javax.swing.JMenu();
        sellMenuItem = new javax.swing.JMenuItem();
        repaymentMenuItem = new javax.swing.JMenuItem();
        SearchProductMenuItem = new javax.swing.JMenuItem();
        ClientsMenu = new javax.swing.JMenu();
        AddClientMenuItem = new javax.swing.JMenuItem();
        ClientsMenuItem = new javax.swing.JMenuItem();
        productsMenu = new javax.swing.JMenu();
        addCategoryMenuItem = new javax.swing.JMenuItem();
        categoriesMenuItem = new javax.swing.JMenuItem();
        productsMenuItem = new javax.swing.JMenuItem();
        stockMenu = new javax.swing.JMenu();
        restockMenuItem = new javax.swing.JMenuItem();
        kardexProductMenuItem = new javax.swing.JMenuItem();
        productsExpiryMenuItem = new javax.swing.JMenuItem();
        productsLowInvMenuItem = new javax.swing.JMenuItem();
        ReportsMenu = new javax.swing.JMenu();
        reportMovementsMenuItem = new javax.swing.JMenuItem();
        ReportSalesMenuItem = new javax.swing.JMenuItem();
        ReportClientMenuItem = new javax.swing.JMenuItem();
        cashierMenu = new javax.swing.JMenu();
        closeShiftMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Punto de venta");
        setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        panelBackgroud.setLayout(new java.awt.BorderLayout());

        panelTitle.setBackground(new java.awt.Color(13, 44, 84));
        panelTitle.setForeground(new java.awt.Color(255, 255, 255));
        panelTitle.setPreferredSize(new java.awt.Dimension(1200, 70));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bienvenido: Administrador");

        javax.swing.GroupLayout panelTitleLayout = new javax.swing.GroupLayout(panelTitle);
        panelTitle.setLayout(panelTitleLayout);
        panelTitleLayout.setHorizontalGroup(
            panelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1188, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelTitleLayout.setVerticalGroup(
            panelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelBackgroud.add(panelTitle, java.awt.BorderLayout.PAGE_START);

        panelCentral.setLayout(new java.awt.CardLayout());
        panelBackgroud.add(panelCentral, java.awt.BorderLayout.CENTER);

        sellMenu.setText("Ventas");
        sellMenu.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        sellMenuItem.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        sellMenuItem.setText("Vender");
        sellMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellMenuItemActionPerformed(evt);
            }
        });
        sellMenu.add(sellMenuItem);

        repaymentMenuItem.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        repaymentMenuItem.setText("Devoluciones");
        repaymentMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repaymentMenuItemActionPerformed(evt);
            }
        });
        sellMenu.add(repaymentMenuItem);

        SearchProductMenuItem.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        SearchProductMenuItem.setText("Buscar Producto");
        SearchProductMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchProductMenuItemActionPerformed(evt);
            }
        });
        sellMenu.add(SearchProductMenuItem);

        menuBar.add(sellMenu);

        ClientsMenu.setText("Clientes");
        ClientsMenu.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        AddClientMenuItem.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        AddClientMenuItem.setText("Crear Cliente");
        AddClientMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddClientMenuItemActionPerformed(evt);
            }
        });
        ClientsMenu.add(AddClientMenuItem);

        ClientsMenuItem.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        ClientsMenuItem.setText("Clientes");
        ClientsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientsMenuItemActionPerformed(evt);
            }
        });
        ClientsMenu.add(ClientsMenuItem);

        menuBar.add(ClientsMenu);

        productsMenu.setText("Departamentos y Productos");
        productsMenu.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        addCategoryMenuItem.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        addCategoryMenuItem.setText("Crear Departamento");
        addCategoryMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCategoryMenuItemActionPerformed(evt);
            }
        });
        productsMenu.add(addCategoryMenuItem);

        categoriesMenuItem.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        categoriesMenuItem.setText("Departamentos");
        categoriesMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoriesMenuItemActionPerformed(evt);
            }
        });
        productsMenu.add(categoriesMenuItem);

        productsMenuItem.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        productsMenuItem.setText("Productos");
        productsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productsMenuItemActionPerformed(evt);
            }
        });
        productsMenu.add(productsMenuItem);

        menuBar.add(productsMenu);

        stockMenu.setText("Inventarios");
        stockMenu.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        restockMenuItem.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        restockMenuItem.setText("Agregar inventario a producto");
        restockMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restockMenuItemActionPerformed(evt);
            }
        });
        stockMenu.add(restockMenuItem);

        kardexProductMenuItem.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        kardexProductMenuItem.setText("Kardex de producto");
        kardexProductMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kardexProductMenuItemActionPerformed(evt);
            }
        });
        stockMenu.add(kardexProductMenuItem);

        productsExpiryMenuItem.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        productsExpiryMenuItem.setText("Productos con caducidad");
        stockMenu.add(productsExpiryMenuItem);

        productsLowInvMenuItem.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        productsLowInvMenuItem.setText("Productos bajos de inventario");
        stockMenu.add(productsLowInvMenuItem);

        menuBar.add(stockMenu);

        ReportsMenu.setText("Reportes");
        ReportsMenu.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        reportMovementsMenuItem.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        reportMovementsMenuItem.setText("Reporte de movimientos");
        reportMovementsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportMovementsMenuItemActionPerformed(evt);
            }
        });
        ReportsMenu.add(reportMovementsMenuItem);

        ReportSalesMenuItem.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        ReportSalesMenuItem.setText("Reporte de ventas");
        ReportSalesMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReportSalesMenuItemActionPerformed(evt);
            }
        });
        ReportsMenu.add(ReportSalesMenuItem);

        ReportClientMenuItem.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        ReportClientMenuItem.setText("Reporte de clientes");
        ReportClientMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReportClientMenuItemActionPerformed(evt);
            }
        });
        ReportsMenu.add(ReportClientMenuItem);

        menuBar.add(ReportsMenu);

        cashierMenu.setText("Cajero");
        cashierMenu.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        closeShiftMenuItem.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        closeShiftMenuItem.setText("Cerrar turno");
        cashierMenu.add(closeShiftMenuItem);

        menuBar.add(cashierMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Ayuda");
        helpMenu.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        aboutMenuItem.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("Acerca de");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBackgroud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBackgroud, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sellMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellMenuItemActionPerformed
        // TODO add your handling code here:
        PanelSell sell = new PanelSell();
        panelCentral.removeAll();
        panelCentral.add(sell);
        panelCentral.validate();
        panelCentral.repaint();
        sell.getTxtCodeProduct();
    }//GEN-LAST:event_sellMenuItemActionPerformed

    private void repaymentMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repaymentMenuItemActionPerformed
        // TODO add your handling code here:
        DialogRefunds refunds = new DialogRefunds(this, true);
        refunds.setLocationRelativeTo(null);
        refunds.setVisible(true);
    }//GEN-LAST:event_repaymentMenuItemActionPerformed

    private void categoriesMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriesMenuItemActionPerformed
        // TODO add your handling code here:
        PanelCategories categories = new PanelCategories();
        panelCentral.removeAll();
        panelCentral.add(categories);
        panelCentral.validate();
        panelCentral.repaint();
    }//GEN-LAST:event_categoriesMenuItemActionPerformed

    private void addCategoryMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCategoryMenuItemActionPerformed
        // TODO add your handling code here:
        DialogAddCategory addCategory = new DialogAddCategory(this, true);
        addCategory.setLocationRelativeTo(null);
        addCategory.setVisible(true);
    }//GEN-LAST:event_addCategoryMenuItemActionPerformed

    private void productsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productsMenuItemActionPerformed
        // TODO add your handling code here:
        PanelProducts products = new PanelProducts();
        panelCentral.removeAll();
        panelCentral.add(products);
        panelCentral.validate();
        panelCentral.repaint();
    }//GEN-LAST:event_productsMenuItemActionPerformed

    private void restockMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restockMenuItemActionPerformed
        // TODO add your handling code here:
        DialogAddInventory addInventory = new DialogAddInventory(this, true);
        addInventory.setLocationRelativeTo(null);
        addInventory.setVisible(true);
    }//GEN-LAST:event_restockMenuItemActionPerformed

    private void kardexProductMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kardexProductMenuItemActionPerformed
        // TODO add your handling code here:
        PanelKardexProduct kardexProduct = new PanelKardexProduct();
        panelCentral.removeAll();
        panelCentral.add(kardexProduct);
        panelCentral.validate();
        panelCentral.repaint();
    }//GEN-LAST:event_kardexProductMenuItemActionPerformed

    private void reportMovementsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportMovementsMenuItemActionPerformed
        // TODO add your handling code here:
        PanelReportMovements reportMovements = new PanelReportMovements();
        panelCentral.removeAll();
        panelCentral.add(reportMovements);
        panelCentral.validate();
        panelCentral.repaint();
    }//GEN-LAST:event_reportMovementsMenuItemActionPerformed

    private void ReportClientMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReportClientMenuItemActionPerformed
        // TODO add your handling code here:
        PanelReportClients reportClientes = new PanelReportClients();
        panelCentral.removeAll();
        panelCentral.add(reportClientes);
        panelCentral.validate();
        panelCentral.repaint();
    }//GEN-LAST:event_ReportClientMenuItemActionPerformed

    private void ClientsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientsMenuItemActionPerformed
        // TODO add your handling code here:
        PanelClients clientes = new PanelClients();
        panelCentral.removeAll();
        panelCentral.add(clientes);
        panelCentral.validate();
        panelCentral.repaint();
    }//GEN-LAST:event_ClientsMenuItemActionPerformed

    private void AddClientMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddClientMenuItemActionPerformed
        // TODO add your handling code here:
        DialogAddClient addClient = new DialogAddClient(this, true);
        addClient.setLocationRelativeTo(null);
        addClient.setVisible(true);
    }//GEN-LAST:event_AddClientMenuItemActionPerformed

    private void ReportSalesMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReportSalesMenuItemActionPerformed
        // TODO add your handling code here:
        PanelReportSales sales = new PanelReportSales();
        panelCentral.removeAll();
        panelCentral.add(sales);
        panelCentral.validate();
        panelCentral.repaint();
    }//GEN-LAST:event_ReportSalesMenuItemActionPerformed

    private void SearchProductMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchProductMenuItemActionPerformed
        // TODO add your handling code here:
        DialogSearchProduct searchProduct = new DialogSearchProduct(this, true);
        searchProduct.setLocationRelativeTo(null);
        searchProduct.setVisible(true);
    }//GEN-LAST:event_SearchProductMenuItemActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainApplication().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AddClientMenuItem;
    private javax.swing.JMenu ClientsMenu;
    private javax.swing.JMenuItem ClientsMenuItem;
    private javax.swing.JMenuItem ReportClientMenuItem;
    private javax.swing.JMenuItem ReportSalesMenuItem;
    private javax.swing.JMenu ReportsMenu;
    private javax.swing.JMenuItem SearchProductMenuItem;
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem addCategoryMenuItem;
    private javax.swing.JMenu cashierMenu;
    private javax.swing.JMenuItem categoriesMenuItem;
    private javax.swing.JMenuItem closeShiftMenuItem;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem kardexProductMenuItem;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JPanel panelBackgroud;
    private javax.swing.JPanel panelCentral;
    private javax.swing.JPanel panelTitle;
    private javax.swing.JMenuItem productsExpiryMenuItem;
    private javax.swing.JMenuItem productsLowInvMenuItem;
    private javax.swing.JMenu productsMenu;
    private javax.swing.JMenuItem productsMenuItem;
    private javax.swing.JMenuItem repaymentMenuItem;
    private javax.swing.JMenuItem reportMovementsMenuItem;
    private javax.swing.JMenuItem restockMenuItem;
    private javax.swing.JMenu sellMenu;
    private javax.swing.JMenuItem sellMenuItem;
    private javax.swing.JMenu stockMenu;
    // End of variables declaration//GEN-END:variables

}
