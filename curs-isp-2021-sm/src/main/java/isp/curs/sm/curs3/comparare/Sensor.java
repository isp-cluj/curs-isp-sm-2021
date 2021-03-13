/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.curs.sm.curs3.comparare;

/**
 *
 * @author mihai.hulea
 */
public class Sensor {
    private int x;

    public Sensor(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    
//    public boolean equals(Object o){
//        Sensor s = (Sensor)o; ///conversie de tip
//        return s.getX() == x;
//    }
    
    public static void main(String[] args) {
        Sensor s1 = new Sensor(10);
        Sensor s2 = new Sensor(10);
        
        if(s1==s2){  ///NU SE COMPARA OBIECTELE CU ==
            System.out.println("Obiecte egale");
        }
        
        if(s1.equals(s2)){
            System.out.println("Obiecte egale");
        }else{
            System.out.println("Obiecte diferite");
        }
        
        
    }
    
}
