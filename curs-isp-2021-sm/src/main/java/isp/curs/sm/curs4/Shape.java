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
public class Shape {
    public void draw(){
        System.out.println("Drawing shape!");
    }
}
//.......
class Point extends Shape{
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    //in clasa derivata se poate suprascrie o metoda din clasa de baza
    
    public void draw(){
        System.out.println("Drawing point with coordinate:"+x+", "+y);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

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
        final Point other = (Point) obj;
        if (this.x != other.x) {
            return false;
        }
        if (this.y != other.y) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }
    
    
    
       
}

class Circle extends Point{
    
    private int r;

    public Circle(int r, int x, int y) {
        //OBLIGATORIU SUPER ESTE PRIMA INSTRUCTIUNE 
        super(x, y); //super se utilizeaza ca prima instructiune in constructor. apeleaza constructorul din calsa de baza.
        this.r = r;
    }
    
    @Override
    public void draw(){
        System.out.println("Drawing circle with center:");
        //IN METODE NU SUNTEM OBLIGATI SA FOLOSIM SUPER
        super.draw(); //super poate fi utilizat si pentru a apela o metoda dintr-o clasa de baza
        System.out.println("Radius = "+r);
    }
    
    public final void increaseRadius(){
        r+=1;
        draw();
    }
    
}

class Rectangle  extends Point{
    private int length;
    private int width;

    public Rectangle(int l, int w, int x, int y) {
        super(x, y);
        this.length = l;
        this.width = w;
    }
    
    
    
}


