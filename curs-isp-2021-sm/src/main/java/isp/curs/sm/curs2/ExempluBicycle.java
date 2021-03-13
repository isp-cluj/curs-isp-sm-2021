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
public class ExempluBicycle {
    public static void main(String[] args) {
        Bicycle b1 = new Bicycle(); //variabilele de tip obiect stocheaza in ele o adresa cater locatia din memorie unde acestea sunt stocate
        b1.speed = 10;
        
        Bicycle b2 = new Bicycle();
        b2.speed = 12;
        
        System.out.println("Viteza b1 ="+b1.speed);
        
        System.out.println(b2);
        
        Bicycle b3; //doar am declarat o variabila de tip B... Aceasta nu este inca instantiata (obiectul nu este inca creat)
        //b3.speed = 90;
        //b3 = new Bicycle();
        
        b3 = b2;
        
        b3.speed = 33;
        System.out.println(b2.speed);
        
        b1 = b3;
        
        b2 = null;
    }
}
