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
public class ExempluBicycle2 {
    public static void main(String[] args) {
        Bicycle b1 = new Bicycle();
        
        Bicycle b2 = new Bicycle(10, "Cube");
        
        System.out.println(b1.model+" "+b1.speed); 
        
        System.out.println(b1);
        System.out.println(b2);
        
        b1.speedUp();
        b1.speedUp();
        
        b1.speed = -100;
        System.out.println(b1);
        
    }
}
