/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.curs.sm.curs3;


public class ExempleCurs {
    public static void main(String[] args) {
//        Phone p1 = new Phone("Samsung 1");
//        p1.call("1324");
//        
//        Battery b1 = new Battery();
//        System.out.println("b1");
//        b1.charge();
//        b1.use();
//        System.out.println(b1);
  
        Battery b1 = new Battery();
        Phone p1 = new Phone("One 1", b1);
        p1.call("142");
        p1.call("142");
        p1.call("142");
        
        System.out.println(b1);
        
        
        SmartPhone s1 = new SmartPhone(10, "One 2", new Battery());
        s1.call("5653");
        System.out.println(s1.downloadData("google.com"));
        
        
        ////////////////////
        
        Phone a1 = new Phone("A", b1);
        Phone a2 = new SmartPhone(10, "S1", new Battery());
        
        a1.call("123");
        a2.call("111");
        
        Phone[] list = new Phone[4];
        list[0] = new SmartPhone(1, "D1", b1);
        list[3] = new SmartPhone(10, "S1", new Battery());
        //list[] = new Phone("D3", b1);
        
        for(Phone p: list){
         //   if(p!=null)
                p.call("65383");
        }
        
    }
}
