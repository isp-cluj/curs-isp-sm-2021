/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.curs.sm.curs2;

/**
 *
 * @author mihai.hulea
 */
public class Bicycle3 {
    
    static int count;
    private int speed;
    private String model;

    //constructori
    public Bicycle3(){
        speed = 0; 
        model = "Pegas";
    }
    public Bicycle3(int speed, String model) {
        this.speed = speed;
        this.model = model;
    }
    
    //metode
    public void speedUp(){
        System.out.println("Bicyle accelerate");
        speed++;
        count++;
        System.out.println(model+" "+speed);
    }
    
    public void speedUp(int k){
         speed+=k;
    }

    
    /////////////// getter si setter
    
    public int getSpeed() {
        return speed;
    }

    public String getModel() {
        return model;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setModel(String model) {
        this.model = model;
    }
    
    ///////////////////////////////////

    @Override
    public String toString() {
        return "Bicycle3{" + "speed=" + speed + ", model=" + model + ", count="+count+'}';
    }

   
}
