/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.curs.sm.curs7.vendingmachine;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mihai.hulea
 */
public class VendingmachineApp {
    public static void main(String[] args) {
        System.out.println("It works!");
        System.err.println("It workd!"); //ERR NU ARE BUFFER INTERMEDIAR
        VendingMachine vm = new VendingMachine();
        
        vm.displayProducts();
        System.out.println("...");
        
        vm.addCredit(30);
        try {
            vm.selectProduct(3);
        } catch (ProductNotAvailableException ex) {
            System.out.println("Produs inexistent.");
        } catch (InsuficientCreditException ex) {
            System.out.println("Credit insuficient.");
        }finally{
            System.out.println("SE EXECUTA TO TIMPUL INDIFERENT DE MODUL DE FINALIZARE A BLOCULUI TRY");
        }
        
        System.out.println("..."); 
        vm.displayProducts();
        try {
            vm.selectProduct(7);
        } catch (ProductNotAvailableException ex) {
            Logger.getLogger(VendingmachineApp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InsuficientCreditException ex) {
            Logger.getLogger(VendingmachineApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
