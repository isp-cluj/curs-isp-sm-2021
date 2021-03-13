/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.curs.sm.curs3.compozitie;

import isp.curs.sm.curs3.*;

public class Battery {
    private int chargeLevel;

    public Battery() {
        chargeLevel = 100;
    }
        
    public void charge(){
        if(chargeLevel<=90)
            this.chargeLevel+=10;
    }
    
    public void use(){
        if(chargeLevel>0)
            this.chargeLevel--;
    }

    public int getChargeLevel() {
        return chargeLevel;
    }

    @Override
    public String toString() {
        return "Battery{" + "chargeLevel=" + chargeLevel + '}';
    }
    
    
    
}
