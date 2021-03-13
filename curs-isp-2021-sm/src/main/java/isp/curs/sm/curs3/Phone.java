/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.curs.sm.curs3;

/**
 * Create de clase prin AGREGARE, adica adaugare de atribute reprezentand alte obiecte\clase
 * @author mihai.hulea
 */
public class Phone {
    private String model;
    protected Battery battery;
            
    public Phone(String model, Battery battery) {
        this.model = model;
        this.battery = battery;
    }
    
    void call(String number){
        if(battery.getChargeLevel()>5){
            System.out.println("Calling number..."+number);
            battery.use();
        }
        else
            System.out.println("Battery too low. Please recharge.");
    }
    
    void chargePhone(){
        battery.charge();
    }
}
