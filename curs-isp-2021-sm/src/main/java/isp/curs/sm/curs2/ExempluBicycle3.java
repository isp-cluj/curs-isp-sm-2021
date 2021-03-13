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
public class ExempluBicycle3 {
    public static void main(String[] args) {
        Bicycle3 x1 = new Bicycle3();
        //x1.speed = -100;
        x1.speedUp();
        
        System.out.println(x1.getSpeed());
        
        x1.setSpeed(90);
        System.out.println(x1);
        x1.speedUp();
        x1.speedUp();
        x1.speedUp();
        System.out.println(x1);
        
        Bicycle3 x2 = new Bicycle3(10, "Focus");
        System.out.println(x2);
        x2.speedUp();
        System.out.println(x1);
        System.out.println(x2);
        
    }
}
