/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1.products;

import com.mycompany.mavenproject1.apiclient.ApiClient;
import com.mycompany.mavenproject1.apiclient.products.CategoriesResponse;
import com.mycompany.mavenproject1.sqlite.SQLiteJDBC;
import com.mycompany.mavenproject1.utils.StyledButtonUI;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 *
 * @author geezylucas
 */
public class TableCategories {

    public void viewTable(JTable table) {

        table.setDefaultRenderer(Object.class, new RenderCategories());

        JButton btn1 = new JButton();

        btn1.setBackground(new java.awt.Color(127, 184, 0));

        btn1.setFont(new java.awt.Font("Nadeem", 0, 14)); // NOI18N

        btn1.setForeground(new java.awt.Color(255, 255, 255));

        btn1.setText("Agregar producto");
        btn1.setUI(new StyledButtonUI());

        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        model.addColumn("Codigo");
        model.addColumn("Nombre");
        model.addColumn("E");

        for (int i = 0; i < 4; i++) {
            model.addRow(new Object[0]);
            model.setValueAt(i + 1, i, 0);
            model.setValueAt("Tutorials", i, 1);
            model.setValueAt(btn1, i, 2);
        }

        table.setModel(model);
    }
}
