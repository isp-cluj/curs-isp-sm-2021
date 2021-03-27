/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testequipment2;

import java.util.concurrent.TimeUnit;

/**
 *
 * @author mihai.hulea
 */
public class TestEquipment2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Controller ctrl = new Controller();
        
        for(int i=1;i<10;i++){
            ctrl.control();
            TimeUnit.SECONDS.sleep(2);     
        }
    }
    
}
