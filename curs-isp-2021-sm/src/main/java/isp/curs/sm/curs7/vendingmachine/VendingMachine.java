/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.curs.sm.curs7.vendingmachine;

import java.util.List;

public class VendingMachine {
    private PaymentModule paymentM;
    private ProductDispenser productDispenser;
    
    VendingMachine(){
        paymentM = new PaymentModule();       
        productDispenser = new ProductDispenser();
        productDispenser.addNewProduct(new Product("A",10, 100));
        productDispenser.addNewProduct(new Product("B",10, 100));
        productDispenser.addNewProduct(new Product("C",10, 100));
        productDispenser.addNewProduct(new Product("D",10, 100));
        productDispenser.addNewProduct(new Product("E",10, 100));
    }
    
    public void addCredit(int k){
        paymentM.addCredit(k);
        System.out.println("Available credit:"+paymentM.getCredit());
    }
    
    public void displayProducts(){
//        int i = -1;
//        for(String: productDispenser.getProductsList()){
//            i++;
//            System.out.println(i+" "+s);
//        }
        List<String> list = productDispenser.getProductsList();
        int k = 0;
        for(int i=0;i<list.size();i++){
            System.out.println(i+":"+list.get(i));
            //System.out.println(i);
        }
    }
      
    //1. verific produsul si cantitatea
    //2. verific pret si credit disponibil
    //3. eliberez produsul
    public void selectProduct(int index) throws ProductNotAvailableException, InsuficientCreditException{
        Product p = null;
        try{
            p = productDispenser.findProductByIndex(index);
        }catch(IndexOutOfBoundsException e){
            throw new ProductNotAvailableException("Product witn index "+index+" not found.");
        }
        
        if(p.getPrice()>paymentM.getCredit()){
            throw new InsuficientCreditException("Credit not enought!");
        }
        
        if(p.getQuantity()>0){
            paymentM.subtractCredit(p.getPrice());
            String name = productDispenser.selectProduct(index);
            System.out.println("Product "+name+" provided.");
            System.out.println("Remaingin available credit "+paymentM.getCredit());
        }
    }
}
