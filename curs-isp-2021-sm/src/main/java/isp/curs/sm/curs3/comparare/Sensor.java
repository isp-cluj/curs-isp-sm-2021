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



    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Sensor other = (Sensor) obj;
        if (this.x != other.x) {
            return false;
        }
        return true;
    }
    
    
    
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
