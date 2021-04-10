/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.curs.sm.curs7.vendingmachine;


public class PaymentModule {
    private int currentCredit;
    
    public void addCredit(int k){
        currentCredit+=k;
    }
    
    public void subtractCredit(int k){
        currentCredit-=k;
    }
    
    public int getCredit(){
        return currentCredit;
    }
       
}
