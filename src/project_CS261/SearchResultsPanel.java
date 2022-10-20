/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_CS261;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author TEJENDRA
 */
public class SearchResultsPanel extends javax.swing.JPanel {
   
    
    /**
     * Creates new form my_panel
     */
    public SearchResultsPanel(Shop.products productobj,String shopUsername) {
        initComponents();
        txtName.setText(productobj.getName());
        txtBrand.setText(productobj.getBrand());
        txtCostPrice.setText(Integer.toString(productobj.getRetailPrice()));
        txtDescription.setText(productobj.getDescription());
        txtStatus.setText(productobj.getStatus());
        txtStock.setText(Integer.toString(productobj.getStock()));
        txtSeller.setText(shopUsername);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtName = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        txtQuantity = new javax.swing.JComboBox<>();
        txtBrand = new javax.swing.JLabel();
        txtStock = new javax.swing.JLabel();
        txtStatus = new javax.swing.JLabel();
        txtDescription = new javax.swing.JLabel();
        txtCostPrice = new javax.swing.JLabel();
        txtSeller = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(791, 46));

        txtName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtName.setText("asd");

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setText("ADD TO CART");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtQuantity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));

        txtBrand.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtBrand.setText("asdd");

        txtStock.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtStock.setText("123");

        txtStatus.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtStatus.setText("Active");

        txtDescription.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtDescription.setText("asddas");

        txtCostPrice.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCostPrice.setText("13");

        txtSeller.setText("Seller");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(txtName)
                .addGap(54, 54, 54)
                .addComponent(txtBrand)
                .addGap(38, 38, 38)
                .addComponent(txtStock)
                .addGap(35, 35, 35)
                .addComponent(txtDescription)
                .addGap(54, 54, 54)
                .addComponent(txtStatus)
                .addGap(59, 59, 59)
                .addComponent(txtCostPrice)
                .addGap(57, 57, 57)
                .addComponent(txtSeller)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jButton2)
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName)
                    .addComponent(txtDescription)
                    .addComponent(txtStatus)
                    .addComponent(txtBrand)
                    .addComponent(txtStock)
                    .addComponent(jButton2)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(txtCostPrice)
                    .addComponent(txtSeller))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        
        Cart obj=new Cart();
        obj.AddToCart(txtName, txtBrand, txtCostPrice, txtQuantity, txtSeller);
        
//            String username = User.NameOfUser;
//            String productName = txtName.getText();
//            int costPrice = Integer.parseInt(txtCostPrice.getText());
//            int quantity =  Integer.parseInt(txtQuantity.getItemAt(txtQuantity.getSelectedIndex()));         
//            String brand = txtBrand.getText();
//            String shopUsername = txtSeller.getText();
//            try{
//            Connection con = DatabaseConnection.getConnection();
//            Statement stmt = con.createStatement();
//            String queryCart = "INSERT INTO Cart(Username,ProductName,Price,Quantity,Brand,ShopUsername) VALUES(" 
//                    + "\"" + username + "\"," 
//                    + "\"" + productName + "\"," 
//                    + "\"" + costPrice + "\"," 
//                    + "\"" + quantity + "\","
//                    + "\"" + brand + "\","
//                    + "\"" + shopUsername+ "\""
//                    +");";
//            stmt.executeUpdate(queryCart);
//            stmt.close();
//            JOptionPane.showMessageDialog(SearchResultsPanel.this, productName + " added to cart");
//            }catch (HeadlessException | SQLException ex) {
//            Logger.getLogger(registerUser.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel txtBrand;
    private javax.swing.JLabel txtCostPrice;
    private javax.swing.JLabel txtDescription;
    private javax.swing.JLabel txtName;
    private javax.swing.JComboBox<String> txtQuantity;
    private javax.swing.JLabel txtSeller;
    private javax.swing.JLabel txtStatus;
    private javax.swing.JLabel txtStock;
    // End of variables declaration//GEN-END:variables
}