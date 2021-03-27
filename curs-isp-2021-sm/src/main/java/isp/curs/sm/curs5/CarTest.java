/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.curs.sm.curs5;

enum TransmisionType{
    AUTOMATIC, MANUL;
}

class Car{
    private TransmisionType t;

    public Car(TransmisionType t) {
        this.t = t;
    }
    
    void startEngine(){
        System.out.println(t);
        if(t == TransmisionType.AUTOMATIC){
            System.out.println("Check gearbox is in N");
        }else if (t == TransmisionType.MANUL){
            System.out.println("Check gearbox is in neutral.");
        }else{
            System.out.println("Unknown transmission.");
        }
    }
    
    
}

/**
 *
 * @author mihai.hulea
 */
public class CarTest {
    
    public static void main(String[] args) {
            Car c1 = new Car(TransmisionType.AUTOMATIC);
            c1.startEngine();
    }
    
}
