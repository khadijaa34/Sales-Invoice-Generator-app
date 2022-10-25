/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoiceapp;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Dejaa
 */
public class Invoice {
    
    int id;
    String date;
    String CustomerName;
    String total;
    ArrayList <Items> items; 

    public Invoice(int id, String CustomerName, String date) {
        this.id = id;
        this.CustomerName = CustomerName;
        this.date = date;
        this.items = new ArrayList<Items>();

    }

    public Invoice(int id, String date, String CustomerName, String total) {
        this.id = id;
        this.date = date;
        this.CustomerName = CustomerName;
        this.total = total;
    }
    
    

    Invoice() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public ArrayList<Items> getItems() {
        return items;
    }
    
    
    
}
