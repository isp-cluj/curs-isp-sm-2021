/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.curs.sm.curs7.vendingmachine;

import java.util.ArrayList;
import java.util.List;

public class ProductDispenser {
    private ArrayList<Product> products = new ArrayList<>();
    
    public void addNewProduct(Product p){
        products.add(p);
    }
    
    public void updatedProductQuantity(String name, int quantity){
        for(Product p: products)
            if(p.getName().equals(name))
                p.setQuantity(quantity+p.getQuantity());
    }
    
    public List<String> getProductsList(){
        ArrayList<String> l = new ArrayList<>();
        for(Product p: products)
            l.add(p.getName()+" "+p.getQuantity());
        return l;
    }
    
    public Product findProductByIndex(int index){
        return products.get(index);
    }
    
    public Product getProduct(String name){
        for(Product p: products)
            if(p.getName().equals(name))
                return p;
        return null;
        
    }
    
    public String selectProduct(int index){
        Product p = products.get(index);
        p.setQuantity(p.getQuantity()-1);
        return p.getName();
    }
    
}
