/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoiceapp;

/**
 *
 * @author Dejaa
 */
public class Items {
    int id;
    String ItemName;
    String price;
    String count;

    public Items(int id, String ItemName, String price, String count) {
        this.id = id;
        this.ItemName = ItemName;
        this.price = price;
        this.count = count;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String ItemName) {
        this.ItemName = ItemName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Items{" + "id=" + id + ", ItemName=" + ItemName + ", price=" + price + ", count=" + count + '}';
    }

    
}
