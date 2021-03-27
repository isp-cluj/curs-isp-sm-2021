/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.testequipment;

/**
 *
 * @author mihai.hulea
 */
public class Led {
    private boolean status;
    
    void turnOn(){
        status = true;
    }
    
    void turnOff(){
        status = false;
    }
    
    boolean getStatus(){
        return status;
    }

    @Override
    public String toString() {
        return "Led{" + "status=" + status + '}';
    }
    
    
}
