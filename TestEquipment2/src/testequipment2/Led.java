/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testequipment2;

/**
 *
 * @author mihai.hulea
 */
public class Led {
    private boolean status;
    private LedRPi driver = new LedRPi();
    
    void turnOn(){
        System.out.println("Turn ON");
        status = true;
        driver.turnOn();
    }
    
    void turnOff(){
        System.out.println("Turn OFF");
        status = false;
        driver.turnOff();
    }
    
    boolean getStatus(){
        return status;
    }

    @Override
    public String toString() {
        return "Led{" + "status=" + status + '}';
    }
    
    
}
