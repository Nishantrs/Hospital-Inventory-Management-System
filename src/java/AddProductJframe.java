
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chandrimaghosh/Nishant Shetty
 */
public class AddProductJframe extends javax.swing.JFrame {

    /**
     * Creates new form AddProductJframe
     * @param vendorid
     */
    
    int vid;
    ArrayList<Product> vendor_products =new ArrayList<>();
    public AddProductJframe(int vendorid) {
        initComponents();
         this.setDefaultCloseOperation(this.HIDE_ON_CLOSE);
        vid=vendorid;
        ProductListJTable.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        ProductListJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                
            },
            new String [] {
                "ProductName", "Desc","Price","ProductId"}
        ));
        
         PreparedStatement products_on_vendor;
        try {
            products_on_vendor = login.con.prepareStatement
        (" Select prd.Prdname,prd.Prddesp ,prd.Prdprice,prd.Prdid from "
        + "Product prd");
        ResultSet rs = products_on_vendor.executeQuery();
                   
            	   while(rs.next()){
                        
                       Product product=new Product();
                      
                       product.setProductName(rs.getString(1));
                       product.setProductDescription(rs.getString(2));
                       product.setProductPrice(rs.getFloat(3));
                       product.setProductId(rs.getInt(4));
                       vendor_products.add(product);
                       }
                    Iterator<Product> vp = vendor_products.iterator();
               
                    int rowCount=ProductListJTable.getRowCount();
                     DefaultTableModel dtm= (DefaultTableModel)ProductListJTable.getModel();
                    for(int i=rowCount-1;i>0;i--){
                        dtm.removeRow(i);
                        }
        //  "ProductName", "Desc","Price","ProductId"}
            while(vp.hasNext()) {
            Product pro=new Product();
            pro=vp.next();
            Object row[] = new Object[4];
            row[0]=pro.getProductName();
            row[1]=pro.getProductDescription();
            row[2]=pro.getProductPrice();
            row[3]=pro.getProductId();
            
            dtm.addRow(row);
        }
                   
                    } catch (SQLException ex) {
            Logger.getLogger(PlaceOrderJFrame.class.getName()).log(Level.SEVERE, null, ex);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        ProductListJTable = new javax.swing.JTable();
        prname = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        prdesc = new javax.swing.JTextArea();
        Add = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        prprice = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        prrating = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        prtype = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ProductListJTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(ProductListJTable);

        jLabel1.setText("Add new product");

        jLabel2.setText("Product Name:");

        jLabel3.setText("Product Desc");

        prdesc.setColumns(20);
        prdesc.setRows(5);
        jScrollPane2.setViewportView(prdesc);

        Add.setText("Add");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        jLabel4.setText("Priced");

        prprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prpriceActionPerformed(evt);
            }
        });

        jLabel5.setText("Rated");

        jLabel6.setText("Type");

        jButton1.setText("refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(prname, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(prrating, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                .addComponent(prprice, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(prtype, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(100, 100, 100)))
                .addGap(738, 738, 738))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Add)
                .addGap(171, 171, 171))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(prname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(jLabel3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(prprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(prrating, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6))
                            .addComponent(prtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Add)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jButton1)
                        .addContainerGap(82, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
     PreparedStatement add_product;
        try {
            add_product = login.con.prepareStatement
        (" Insert into Product(Prdname,Prddesp,Prdprice,Prdrating,Prdtype)values(?,?,?,?,?)");
       String pname=prname.getText();
       String pdesc=prdesc.getText();
       int pprice=Integer.valueOf(prprice.getText());
       int prate=Integer.valueOf(prrating.getText());
       String ptype=prtype.getText();
       add_product.setString(1,pname);
       add_product.setString(2,pdesc);
       add_product.setInt(3,pprice);
       add_product.setInt(4,prate);
       add_product.setString(5,ptype);
       
      
       
        add_product.execute();
        int pid = 0;
        //get latest pid
        PreparedStatement get_latest_pid;
       
            get_latest_pid = login.con.prepareStatement
            (" select Prdid from Product Order by Prdid Desc limit 1");
              ResultSet rs = get_latest_pid.executeQuery();
                    Product productlatest=new Product();
            	   while(rs.next()){
               productlatest.setProductId(rs.getInt(1));
                   }
                      
            
            System.out.println("**********latest product is*******"+productlatest.getProductId());
        
        
        //add to msa as well
        PreparedStatement add_msa;
       
            add_msa = login.con.prepareStatement
        (" Insert MedicineStockAvailability(Vendorid,Productid,quantity,available) values(?,?,?,?)");
      add_msa.setInt(1, vid);
      add_msa.setInt(2, productlatest.getProductId());
      add_msa.setInt(3, 1);
      add_msa.setBoolean(4, true);
      add_msa.execute();
        JOptionPane.showMessageDialog(null, "Successfully added new product!");
        }catch (SQLException ex) 
        {
            Logger.getLogger(AddProductJframe.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }//GEN-LAST:event_AddActionPerformed

    private void prpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prpriceActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.setVisible(false);
        AddProductJframe sj=new AddProductJframe(vid);
        sj.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JTable ProductListJTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea prdesc;
    private javax.swing.JTextField prname;
    private javax.swing.JTextField prprice;
    private javax.swing.JTextField prrating;
    private javax.swing.JTextField prtype;
    // End of variables declaration//GEN-END:variables
}
