/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoiceapp;
import invoiceapp.Invoice;
import invoiceapp.Items;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dejaa
 */
public class InvoiceApp {
    /**
     * @param args the command line arguments
     */
    
    static Invoice i;
   
    
    // method for loading the data from the file into the table //
    public static ArrayList<Invoice> LoadData() throws FileNotFoundException, IOException{
        Items item;
        int total;
        int subTotal;
        ArrayList<Invoice> list = new ArrayList<Invoice>();
        // 1st file //
        File fHeader = new File("C:\\Users\\Dejaa\\Desktop\\head1.csv");
        BufferedReader br = new BufferedReader(new FileReader(fHeader));
        
        //2 nd file //
        File fLine = new File("C:\\Users\\Dejaa\\Desktop\\Sales Invoice Generator\\InvoiceLine.csv");
        BufferedReader brItem = new BufferedReader(new FileReader(fLine));
        
        String st,stItem;
        while ((st = br.readLine()) != null) {          
        
            String[] inv = st.split(","); 
            if(inv != null && inv.length>0){
            i = new Invoice (Integer.parseInt(inv[0]),inv[2], inv[1]);
            total = 0;
            
            //Read Invoice line file
            brItem = new BufferedReader(new FileReader(fLine));
            while ((stItem = brItem.readLine()) != null) { 
                String[] it = stItem.split(",");
                if(it != null && it.length>0){
                    if(Integer.parseInt(it[0]) == i.id)
                    {
                     item  = new Items(Integer.parseInt(it[0]),it[1],it[2],it[3]);
                     subTotal = Integer.parseInt(it[2]) * Integer.parseInt(it[3]);
                     total += subTotal;   
                     i.items.add(item);
                    }
                }          
            }
            i.total = Integer.toString(total);
            list.add(i);    
            }        
    }    
    return list;
}
    /////////////////////
    

    public static void SaveData(ArrayList<Invoice> data, String filePath){
        try{
           FileWriter fw = new FileWriter(filePath);
                      
           if (data != null && data.size() > 0)
           {
               for(int i=0; i<data.size(); i++){
                   String line = Integer.toString(data.get(i).getId()) + "," + 
                           data.get(i).getDate() + "," + data.get(i).getCustomerName() + String.format("%n");
                   fw.write(line );                   
               }
           }
           fw.close();
          }catch(Exception e){
          System.out.println(e);
          }
    }
    
    
    /////////////////////
 
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        
    }
    
}

