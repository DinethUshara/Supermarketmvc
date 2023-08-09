/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package supermarket.mvc.view;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import supermarket.mvc.controller.ItemController;
import supermarket.mvc.model.ItemModel;

/**
 *
 * @author USHARA
 */
public class itemView extends javax.swing.JFrame {
    ItemController itemController;
    /**
     * Creates new form itemView
     */
    public itemView() {
        itemController=new ItemController();
        initComponents();
        loadAllItems();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basePanel = new javax.swing.JPanel();
        headderPanel = new javax.swing.JPanel();
        headerLabel = new javax.swing.JLabel();
        fornPanel = new javax.swing.JPanel();
        itemCodeLabel = new javax.swing.JLabel();
        itemCodeText = new javax.swing.JTextField();
        titleLabel = new javax.swing.JLabel();
        DescriptionTest = new javax.swing.JTextField();
        packSizeLabel = new javax.swing.JLabel();
        packSizeText = new javax.swing.JTextField();
        unitPriceLabel = new javax.swing.JLabel();
        unitPriceText = new javax.swing.JTextField();
        qohText = new javax.swing.JTextField();
        qohLabel = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        tablePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        itemTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        headerLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        headerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerLabel.setText("Manage Customer");

        javax.swing.GroupLayout headderPanelLayout = new javax.swing.GroupLayout(headderPanel);
        headderPanel.setLayout(headderPanelLayout);
        headderPanelLayout.setHorizontalGroup(
            headderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        headderPanelLayout.setVerticalGroup(
            headderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headderPanelLayout.createSequentialGroup()
                .addComponent(headerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addContainerGap())
        );

        itemCodeLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        itemCodeLabel.setText("Item Code");

        titleLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        titleLabel.setText("Description");

        packSizeLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        packSizeLabel.setText("Pack Size");

        unitPriceLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        unitPriceLabel.setText("Unit Price");

        qohLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        qohLabel.setText("QOH");

        saveButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        saveButton.setText("Save Item");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        updateButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        updateButton.setText("Update Item");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deleteButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        deleteButton.setText("Delete Item");
        deleteButton.setToolTipText("");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fornPanelLayout = new javax.swing.GroupLayout(fornPanel);
        fornPanel.setLayout(fornPanelLayout);
        fornPanelLayout.setHorizontalGroup(
            fornPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fornPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fornPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fornPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(deleteButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updateButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveButton))
                    .addGroup(fornPanelLayout.createSequentialGroup()
                        .addGroup(fornPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fornPanelLayout.createSequentialGroup()
                                .addComponent(itemCodeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(itemCodeText, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(fornPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, fornPanelLayout.createSequentialGroup()
                                    .addComponent(packSizeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(packSizeText))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, fornPanelLayout.createSequentialGroup()
                                    .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(DescriptionTest, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(fornPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, fornPanelLayout.createSequentialGroup()
                                    .addComponent(unitPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(unitPriceText))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, fornPanelLayout.createSequentialGroup()
                                    .addComponent(qohLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(qohText, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 293, Short.MAX_VALUE)))
                .addContainerGap())
        );
        fornPanelLayout.setVerticalGroup(
            fornPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fornPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fornPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemCodeLabel)
                    .addComponent(itemCodeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fornPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleLabel)
                    .addComponent(DescriptionTest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fornPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(packSizeLabel)
                    .addComponent(packSizeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fornPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(unitPriceLabel)
                    .addComponent(unitPriceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fornPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(qohLabel)
                    .addComponent(qohText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(fornPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(updateButton)
                    .addComponent(deleteButton))
                .addContainerGap())
        );

        itemTable.setModel(new javax.swing.table.DefaultTableModel(
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
        itemTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(itemTable);

        javax.swing.GroupLayout tablePanelLayout = new javax.swing.GroupLayout(tablePanel);
        tablePanel.setLayout(tablePanelLayout);
        tablePanelLayout.setHorizontalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        tablePanelLayout.setVerticalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tablePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(157, 157, 157))
        );

        javax.swing.GroupLayout basePanelLayout = new javax.swing.GroupLayout(basePanel);
        basePanel.setLayout(basePanelLayout);
        basePanelLayout.setHorizontalGroup(
            basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(fornPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        basePanelLayout.setVerticalGroup(
            basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basePanelLayout.createSequentialGroup()
                .addComponent(headderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fornPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(basePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        
    }//GEN-LAST:event_saveButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void itemTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemTableMouseClicked
        
    }//GEN-LAST:event_itemTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DescriptionTest;
    private javax.swing.JPanel basePanel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JPanel fornPanel;
    private javax.swing.JPanel headderPanel;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JLabel itemCodeLabel;
    private javax.swing.JTextField itemCodeText;
    private javax.swing.JTable itemTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel packSizeLabel;
    private javax.swing.JTextField packSizeText;
    private javax.swing.JLabel qohLabel;
    private javax.swing.JTextField qohText;
    private javax.swing.JButton saveButton;
    private javax.swing.JPanel tablePanel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel unitPriceLabel;
    private javax.swing.JTextField unitPriceText;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
    public void loadAllItems(){
        try {
            String [] columns={"Code","Description","Pack Size","Unit Price","Quantity On Hand"};
            
            DefaultTableModel dtm = new DefaultTableModel(columns, 0) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            itemTable.setModel(dtm);
            
            ArrayList<ItemModel> itemModels=itemController.getAllItem();
            for(ItemModel item:itemModels){
                Object [] row={item.getItemCode(),item.getDescription(),item.getPackSize(),item.getUnitPrice(),item.getQoh()};
                dtm.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(itemView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

}
