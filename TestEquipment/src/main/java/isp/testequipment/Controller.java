/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.testequipment;

import java.util.function.Predicate;

/**
 *
 * @author mihai.hulea
 */
public class Controller {
    private Led led;
    private TemperatureSensor sensor;
    public Controller() {
        led = new Led();
        sensor = new TemperatureSensor(10);
    }   
    
    void control(Predicate<Double> p){
        if(p.test(sensor.getValue()))
            led.turnOn();
        else
            led.turnOff();
    }

    public Led getLed() {
        return led;
    }

    public TemperatureSensor getSensor() {
        return sensor;
    }   
    
}
