package View;


import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Model.InvoiceApp;
import Model.Invoice;
import static Model.InvoiceApp.LoadData;
import Model.Items;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dejaa
 */
public class InvoiceGUI extends javax.swing.JFrame {
         ArrayList<Invoice> data = new ArrayList<Invoice>();

    /**
     * Creates new form InvoiceGUI
     */
    public InvoiceGUI() {
        initComponents();
        setLocation(640,100);
        setSize(955,740);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Invototal1 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        Invototal2 = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTable();
        newInvobtn = new javax.swing.JButton();
        Deletebtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        CustName = new javax.swing.JTextField();
        InvoDate = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        area2 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        Cancelbtn = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        Savebtn1 = new javax.swing.JButton();
        loadfilebtn = new javax.swing.JButton();
        savefilebtn = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 13), new java.awt.Dimension(0, 13), new java.awt.Dimension(32767, 13));
        InvoNo = new javax.swing.JTextField();
        Invototal = new javax.swing.JTextField();

        jLabel5.setText("Invoice Number:");

        jLabel6.setText("Invoice Date:");

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dejaa\\Downloads\\1fd5936b1835e43a042a2b6f60d9f760.jpg")); // NOI18N
        jLabel11.setText("jLabel11");

        jLabel17.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dejaa\\Downloads\\1fd5936b1835e43a042a2b6f60d9f760.jpg")); // NOI18N
        jLabel17.setText("jLabel11");

        jLabel19.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dejaa\\Downloads\\1fd5936b1835e43a042a2b6f60d9f760.jpg")); // NOI18N
        jLabel19.setText("jLabel11");

        jLabel18.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dejaa\\Downloads\\1fd5936b1835e43a042a2b6f60d9f760.jpg")); // NOI18N
        jLabel18.setText("jLabel11");

        jLabel16.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dejaa\\Downloads\\1fd5936b1835e43a042a2b6f60d9f760.jpg")); // NOI18N
        jLabel16.setText("jLabel11");

        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dejaa\\Downloads\\1fd5936b1835e43a042a2b6f60d9f760.jpg")); // NOI18N
        jLabel14.setText("jLabel11");

        jLabel20.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dejaa\\Downloads\\1fd5936b1835e43a042a2b6f60d9f760.jpg")); // NOI18N
        jLabel20.setText("jLabel11");

        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dejaa\\Downloads\\1fd5936b1835e43a042a2b6f60d9f760.jpg")); // NOI18N
        jLabel15.setText("jLabel11");

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dejaa\\Downloads\\1fd5936b1835e43a042a2b6f60d9f760.jpg")); // NOI18N
        jLabel13.setText("jLabel11");

        jLabel22.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dejaa\\Downloads\\3afreeeeeeet.jpg")); // NOI18N
        jLabel22.setText("jLabel11");

        jLabel21.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dejaa\\Downloads\\3afreeeeeeet.jpg")); // NOI18N
        jLabel21.setText("jLabel11");

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dejaa\\Downloads\\3afreeeeeeet.jpg")); // NOI18N
        jLabel12.setText("jLabel11");

        jLabel27.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dejaa\\Downloads\\3afreeeeeeet.jpg")); // NOI18N
        jLabel27.setText("jLabel11");

        jLabel25.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dejaa\\Downloads\\3afreeeeeeet.jpg")); // NOI18N
        jLabel25.setText("jLabel11");

        jLabel31.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dejaa\\Downloads\\3afreeeeeeet.jpg")); // NOI18N
        jLabel31.setText("jLabel11");

        jLabel24.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dejaa\\Downloads\\3afreeeeeeet.jpg")); // NOI18N
        jLabel24.setText("jLabel11");

        jLabel23.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dejaa\\Downloads\\3afreeeeeeet.jpg")); // NOI18N
        jLabel23.setText("jLabel11");

        jLabel26.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dejaa\\Downloads\\3afreeeeeeet.jpg")); // NOI18N
        jLabel26.setText("jLabel11");

        jLabel28.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dejaa\\Downloads\\3afreeeeeeet.jpg")); // NOI18N
        jLabel28.setText("jLabel11");

        jLabel29.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dejaa\\Downloads\\3afreeeeeeet.jpg")); // NOI18N
        jLabel29.setText("jLabel11");

        jLabel30.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dejaa\\Downloads\\3afreeeeeeet.jpg")); // NOI18N
        jLabel30.setText("jLabel11");

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dejaa\\Downloads\\3amoo1.jpg")); // NOI18N

        Invototal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Invototal1ActionPerformed(evt);
            }
        });

        jLabel35.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dejaa\\Downloads\\imo1.jpg")); // NOI18N
        jLabel35.setText("jLabel33");

        jLabel38.setText("jLabel38");

        jLabel37.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dejaa\\Downloads\\imo1.jpg")); // NOI18N
        jLabel37.setText("jLabel33");

        jLabel33.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dejaa\\Downloads\\imo1.jpg")); // NOI18N
        jLabel33.setText("jLabel33");

        jLabel36.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dejaa\\Downloads\\imo1.jpg")); // NOI18N
        jLabel36.setText("jLabel33");

        jLabel43.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dejaa\\Downloads\\imo1.jpg")); // NOI18N
        jLabel43.setText("jLabel33");

        jLabel40.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dejaa\\Downloads\\imo1.jpg")); // NOI18N
        jLabel40.setText("jLabel33");

        Invototal2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Invototal2ActionPerformed(evt);
            }
        });

        jLabel46.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dejaa\\Downloads\\imo1.jpg")); // NOI18N
        jLabel46.setText("jLabel33");

        jLabel42.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dejaa\\Downloads\\imo1.jpg")); // NOI18N
        jLabel42.setText("jLabel33");

        jLabel34.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dejaa\\Downloads\\imo1.jpg")); // NOI18N
        jLabel34.setText("jLabel33");

        jLabel44.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dejaa\\Downloads\\imo1.jpg")); // NOI18N
        jLabel44.setText("jLabel33");

        jLabel41.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dejaa\\Downloads\\imo1.jpg")); // NOI18N
        jLabel41.setText("jLabel33");

        jLabel45.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dejaa\\Downloads\\imo1.jpg")); // NOI18N
        jLabel45.setText("jLabel33");

        jLabel39.setText("jLabel39");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 51));
        setForeground(new java.awt.Color(0, 153, 153));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Invoices Table");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 170, 112, 22);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel2.setText("Invoice Sales Generator App");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(310, 10, 285, 28);

        area.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 204)));
        area.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        area.setForeground(new java.awt.Color(51, 102, 255));
        area.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "22-11-2020", "Ali", "3370"},
                {"2", "13-10-2021", "saleh", "4035"}
            },
            new String [] {
                "Number", "Date", "Customer", "Total"
            }
        ));
        area.setGridColor(new java.awt.Color(255, 204, 204));
        area.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                areaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(area);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 200, 421, 111);

        newInvobtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        newInvobtn.setText("Create New Invoice");
        newInvobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newInvobtnActionPerformed(evt);
            }
        });
        getContentPane().add(newInvobtn);
        newInvobtn.setBounds(20, 600, 183, 31);

        Deletebtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Deletebtn.setText("Delete Invoice");
        Deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletebtnActionPerformed(evt);
            }
        });
        getContentPane().add(Deletebtn);
        Deletebtn.setBounds(260, 600, 143, 31);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Invoice Date");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(460, 240, 98, 22);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Invoice Number");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(460, 200, 125, 22);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Invoice Total");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(460, 320, 103, 22);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Customer Name");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(460, 280, 126, 22);
        getContentPane().add(CustName);
        CustName.setBounds(600, 280, 290, 22);
        getContentPane().add(InvoDate);
        InvoDate.setBounds(600, 240, 290, 22);

        area2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Number", "Item Name", "Item Price", "Count", "Item Total"
            }
        ));
        jScrollPane2.setViewportView(area2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(460, 410, 430, 111);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("Invoice Items Details");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(460, 380, 180, 22);

        Cancelbtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Cancelbtn.setText("Cancel");
        Cancelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelbtnActionPerformed(evt);
            }
        });
        getContentPane().add(Cancelbtn);
        Cancelbtn.setBounds(740, 600, 90, 31);

        jLabel32.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dejaa\\Downloads\\3amoo1.jpg")); // NOI18N
        jLabel32.setText("jLabel32");
        getContentPane().add(jLabel32);
        jLabel32.setBounds(780, 10, 120, 140);

        Savebtn1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Savebtn1.setText("Update");
        Savebtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Savebtn1ActionPerformed(evt);
            }
        });
        getContentPane().add(Savebtn1);
        Savebtn1.setBounds(599, 600, 90, 31);

        loadfilebtn.setText("Load File");
        loadfilebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadfilebtnActionPerformed(evt);
            }
        });
        getContentPane().add(loadfilebtn);
        loadfilebtn.setBounds(0, 0, 100, 25);

        savefilebtn.setText("Save File");
        savefilebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savefilebtnActionPerformed(evt);
            }
        });
        getContentPane().add(savefilebtn);
        savefilebtn.setBounds(0, 30, 100, 25);
        getContentPane().add(filler1);
        filler1.setBounds(440, 53, 0, 610);

        InvoNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InvoNoActionPerformed(evt);
            }
        });
        getContentPane().add(InvoNo);
        InvoNo.setBounds(600, 200, 290, 22);
        getContentPane().add(Invototal);
        Invototal.setBounds(600, 320, 290, 22);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // new invoice button code //
    private void newInvobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newInvobtnActionPerformed
        // TODO add your handling code here:
        // this is the code to load data into the table, first i have to check that theres no missing data and everyhting is entered
        if(InvoNo.getText().equals("") || InvoDate.getText().equals("")  || CustName.getText().equals("") || Invototal.getText().equals("")) {
        // if any of the data is missing, a message will appear to keep entering the rest data
        JOptionPane.showMessageDialog(this, "Please Enter All the Missing Data!");      
        } else {
            // store the data into String array// if they are there and all data entered then we will display the below message along with the entered data in the table
        //String data[] = { InvoNo.getText(), InvoDate.getText(), CustName.getText(), Invototal.getText()};
      
        DefaultTableModel  tblModel = (DefaultTableModel) area.getModel();
            if( data != null && data.size() > 0){
             
                Invoice inv = new Invoice(Integer.parseInt(InvoNo.getText()) , InvoDate.getText(), CustName.getText(), Invototal.getText());                  
                data.add(inv);
                
                tblModel.addRow( new Object[]{inv.getId(), inv.getDate(), inv.getCustomerName(), inv.getTotal()} );            
            }
        
                JOptionPane.showMessageDialog(this, "Invoice Data Added Successfully !");    
                InvoNo.setText("");
                InvoDate.setText("");
                CustName.setText("");
                Invototal.setText("");
        }
    }//GEN-LAST:event_newInvobtnActionPerformed

    
    // delete button code //
    private void DeletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletebtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel  tblModel = (DefaultTableModel) area.getModel();
        if(area.getSelectedRowCount() == 1){
        // if a single row is selected then we can delete successfully
        tblModel.removeRow(area.getSelectedRow());
        //Delete Invoice from data ArrayList
        
        if(data != null && data.size() > 0){
            for(int i=0 ; i<data.size(); i++){
                if(data.get(i) != null && data.get(i).getId() == Integer.parseInt(InvoNo.getText())){
                    data.remove(i);
                }
            }
        }
        
        //Clear textboxes
        InvoNo.setText("");
        InvoDate.setText("");
        CustName.setText("");
        Invototal.setText("");
        
        } else {
        if(area.getRowCount() == 0) {
         JOptionPane.showMessageDialog(this, "Table is Empty!");     
        } else {
         JOptionPane.showMessageDialog(this, "Please select only one single row to be deleted!");     
        }
        }
    }//GEN-LAST:event_DeletebtnActionPerformed

    // cancel button code // 
    private void CancelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelbtnActionPerformed
        // TODO add your handling code here:
      JOptionPane.showMessageDialog(this, "Are you sure you want to cancel?"); 
                InvoNo.setText("");
                InvoDate.setText("");
                CustName.setText("");
                Invototal.setText(""); 
    }//GEN-LAST:event_CancelbtnActionPerformed

    private void Invototal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Invototal1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Invototal1ActionPerformed

    private void Savebtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Savebtn1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel  tblModel = (DefaultTableModel) area.getModel();
        if(data != null && data.size() > 0){
            for(int i=0 ; i<data.size(); i++){
                if(data.get(i) != null && data.get(i).getId() == Integer.parseInt(InvoNo.getText())){
                    data.get(i).setCustomerName(CustName.getText());
                    data.get(i).setDate(InvoDate.getText());
                    data.get(i).setTotal(Invototal.getText());                                        
                }
            }
        }
        
        tblModel.setRowCount(0);
        
        if( data != null && data.size() > 0){
              for (int i=0; i<data.size(); i++){                  
              Invoice c =(Invoice) data.get(i);
              if(c != null){
                  tblModel.addRow( new Object[]{data.get(i).getId(), data.get(i).getDate(), data.get(i).getCustomerName(), data.get(i).getTotal()} );
                }
              }
            }
     
        
        //String data[] = { InvoNo.getText(), InvoDate.getText(), CustName.getText(), Invototal.getText()};     
       
                JOptionPane.showMessageDialog(this, "Invoice Data Updated Successfully!");    
                InvoNo.setText("");
                InvoDate.setText("");
                CustName.setText("");
                Invototal.setText("");
        
        
    }//GEN-LAST:event_Savebtn1ActionPerformed

    private void Invototal2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Invototal2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Invototal2ActionPerformed

    private void loadfilebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadfilebtnActionPerformed
        // TODO add your handling code here:
 
         try {
            data = LoadData();
            
            DefaultTableModel  tblModel = (DefaultTableModel) area.getModel();
            tblModel.setRowCount(0);
            if( data != null && data.size() > 0){
              for (int i=0; i<data.size(); i++){                  
              Invoice c =(Invoice) data.get(i);
              if(c != null){
                  tblModel.addRow( new Object[]{data.get(i).getId(), data.get(i).getDate(), data.get(i).getCustomerName(), data.get(i).getTotal()} );
                }
              }
            }
        } catch (IOException ex) {
            Logger.getLogger(InvoiceGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_loadfilebtnActionPerformed

    private void savefilebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savefilebtnActionPerformed
       // try {
            // TODO add your handling code here:
           InvoiceApp.SaveData(data, "C:\\Users\\Dejaa\\Desktop\\head1.csv");
           JOptionPane.showMessageDialog(this, "File Saved Successfully !");  
        //}
//        catch (IOException ex) {
//            Logger.getLogger(InvoiceGUI.class.getName()).log(Level.SEVERE, null, ex);
//        
//        }
//        
        
    }//GEN-LAST:event_savefilebtnActionPerformed

    private void areaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_areaMouseClicked
        // TODO add your handling code here:
        // to make the data appear in the text fields whenever selected
        DefaultTableModel  tblModeInv = (DefaultTableModel) area.getModel();
        int sr  = area.getSelectedRow();
         
        InvoNo.setText(tblModeInv.getValueAt(sr,0).toString());
        InvoDate.setText(tblModeInv.getValueAt(sr,1).toString());
        CustName.setText(tblModeInv.getValueAt(sr,2).toString());
        Invototal.setText(tblModeInv.getValueAt(sr,3).toString());
        
        // to make the items appear based on the selected row from table 1 to table 2
        DefaultTableModel  tblModeItem = (DefaultTableModel) area2.getModel();
        tblModeItem.setRowCount(0);
        int index = 0; boolean itemFound = false;
        ArrayList<Items> invItems = new ArrayList<Items>();
        if(data != null && data.size() > 0){
            for(int i=0 ; i<data.size(); i++){
                if(data.get(i) != null && data.get(i).getId() == Integer.parseInt(InvoNo.getText())){
                         index = i;
                         itemFound = true;
                         break;
                }                                       
        }
            
            // we will loop on the index where if the index is 2 which is saleh's data. it will
                // go to the file and see the data of saleh and get his items details. all of this is done
                // just because i couldnt access total except this way. as total is in the data.
                
            if(data.get(index) != null && data.get(index).getItems() != null &&  data.get(index).getItems().size()>0 && itemFound){
                for(int j=0; j<data.get(index).getItems().size(); j++){ 
                    int itemTotal = Integer.parseInt(data.get(index).getItems().get(j).getPrice()) * Integer.parseInt(data.get(index).getItems().get(j).getCount());
                    tblModeItem.addRow(new Object[]{data.get(index).getItems().get(j).getId(), data.get(index).getItems().get(j).getItemName()
                     , data.get(index).getItems().get(j).getPrice(), data.get(index).getItems().get(j).getCount(), 
                     Integer.toString(itemTotal)});
                }
            }
            
        }
 
    }//GEN-LAST:event_areaMouseClicked

    private void InvoNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InvoNoActionPerformed
        // TODO add your handling code here:
        InvoNo.setVisible(false);   
    }//GEN-LAST:event_InvoNoActionPerformed

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
            java.util.logging.Logger.getLogger(InvoiceGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InvoiceGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InvoiceGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InvoiceGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InvoiceGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelbtn;
    private javax.swing.JTextField CustName;
    private javax.swing.JButton Deletebtn;
    private javax.swing.JTextField InvoDate;
    private javax.swing.JTextField InvoNo;
    private javax.swing.JTextField Invototal;
    private javax.swing.JTextField Invototal1;
    private javax.swing.JTextField Invototal2;
    private javax.swing.JButton Savebtn1;
    private javax.swing.JTable area;
    private javax.swing.JTable area2;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton loadfilebtn;
    private javax.swing.JButton newInvobtn;
    private javax.swing.JButton savefilebtn;
    // End of variables declaration//GEN-END:variables
}
