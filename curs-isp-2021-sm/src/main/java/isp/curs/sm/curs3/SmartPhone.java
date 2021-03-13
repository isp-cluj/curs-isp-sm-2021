/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.curs.sm.curs3;

/**
 *
 * @author mihai.hulea
 */
public class SmartPhone extends Phone {
    private int internetSpeed;
    
    public SmartPhone(int internetSpeed, String model, Battery battery) {
        super(model, battery);
        this.internetSpeed = internetSpeed;
    }
    
    //suprascriere - a nu se confunda cu supraincarcarea
    public void call(String number){
        battery.use();
        battery.use();
        //System.out.println("Calling number..."+number); 
        super.call(number);
    }
    
    public String downloadData(String site){
        battery.use();
        return "DOWLOADED DATA from site: "+site;
    }
    
}
