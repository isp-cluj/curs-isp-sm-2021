/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.curs.sm.curs4;

/**
 *
 * @author mihai.hulea
 */
public class Test {
    
    
    
    public static void main(String[] args) {
        Point x = new Point(12,90);
        x.draw();
        
        Shape y = new Point(23,45);
        y.draw();
        
        Shape z = new Circle(12,3,76);
        z.draw();
        
        Shape[] shapes = new Shape[10];
        shapes[0] = new Circle(1,2,3);
        shapes[1] = new Point(5,6);
        shapes[2] = new Rectangle(3,4,5,6);
        shapes[3] = new Circle(7,9,8);
        
        for(Shape s: shapes){
            if(s!=null)
                s.draw(); 
        }
        
        //conversia de tip 
        Circle c1 = new Circle(1,2,3);
        c1.increaseRadius();
        
        Shape c2 = new Circle(4,5,6);
        
        //c2.increaseRadius();
        //conversie de tip:
        ((Circle)c2).increaseRadius();
        
        Circle c3  = (Circle)c2;
        
        Object p1 = new Point(3,4);
        
        //p1.draw();
        ((Point)p1).draw();
        
        
        System.out.println(p1.toString());
        
              
    }
}
