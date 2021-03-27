/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testequipment2;

import java.util.Random;

/**
 *
 * @author mihai.hulea
 */
public class TemperatureSensor {
    private double value; 

    public TemperatureSensor(double value) {
        this.value = value;
    }

    public double getValue() {
        Random r = new Random();
        value = r.nextInt(50);
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
    
    
}
