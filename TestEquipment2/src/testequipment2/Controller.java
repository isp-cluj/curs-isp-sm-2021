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
public class Controller {
    private Led led;
    private TemperatureSensor sensor;

    public Controller() {
        led = new Led();
        sensor = new TemperatureSensor(10);
    }   
    
    void control(){
        System.out.println("Control...");
        double v = sensor.getValue();
        System.out.println("Temperature = "+v);
        if(v>30)
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
