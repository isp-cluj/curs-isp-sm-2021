/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.curs.sm.curs6.colectii;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

class Product implements Comparable<Product>{
    private String name;
    private int price;
    private int quantity;

    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", price=" + price + ", quantity=" + quantity + '}';
    }

    public String getName() {
        return name;
    }
  
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public int compareTo(Product o) {
        return price - o.getPrice();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Product other = (Product) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
    
    
}

class StockManagement{
    //Product[] list = new Product[10000]; //???
    //ArrayList list = new ArrayList(); //pot stoca obiecte de orice tip
    private ArrayList<Product> list = new ArrayList<>(); //specific ca arraylistul va stoca doar obiecte de tip Product
    
    void addProduct(Product p){
        list.add(p);
    }
    
    int getStockValue(){
        int t=0;
        for(Product p: list){
            t+=p.getPrice()*p.getQuantity();
        }
        return t;
    }
    
    Product _findProductByName(String name){
         //aceasta metoda de caoutare merge doar daca am implementat equals si avem ca si cirteriu de egalitate atributul name
         int i  = list.indexOf(new Product(name,0,0));
         if(i!=-1)
             return list.get(i);
         else
             return null;
     }
    
    Product findProductByName(String name){
        for(Product p: list){
            if(p.getName().equals(name))
                return p;
        }
        return null;
    }
    
    boolean removeByName(String name){
        Product p = findProductByName(name);
        if(p!=null){
            list.remove(p);
        }
        return false;
    }
    
    void listProducts(){
        for(Product p: list)
            System.out.println(p);
    }
    
    void sort(){
        Collections.sort(list);
        
    }
    
    void sortByCriteria(Comparator<Product> comparator){
        //Collections.sort(list, comparator);
        list.sort(comparator); //incepand cu Java 8
    }
    
    Product getMaxPriceProduct(){
        return Collections.max(list);
    }
    
}

public class TestStock {
    public static void main(String[] args) {
        StockManagement m = new StockManagement();
        m.addProduct(new Product("A", 1, 6));
        m.addProduct(new Product("B", 2, 9));
        m.addProduct(new Product("C", 5, 4));
        m.addProduct(new Product("D", 3, 1));
        m.addProduct(new Product("E", 1, 3));
        
        m.listProducts();
        System.out.println("Stock valu ="+m.getStockValue());
        
        Product p = m.findProductByName("B");
        p.setQuantity(15);
        m.listProducts();
        m.removeByName("B");
        System.out.println("......");
        m.listProducts();
        System.out.println("......");
        m.sort();
        m.listProducts();
        System.out.println("......");
        
        // utilizand clasa interna anonima
        m.sortByCriteria(new Comparator<Product>(){
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getQuantity()-o2.getQuantity();
            }            
        });

        //utilizand lambda expression pentru a transmite criteriul de comparare
        m.sortByCriteria((o1, o2) -> o1.getQuantity()-o2.getQuantity());
        
        m.listProducts();
        
        //............
        System.out.println("..............");
        System.out.println(m.getMaxPriceProduct());
    }
}
