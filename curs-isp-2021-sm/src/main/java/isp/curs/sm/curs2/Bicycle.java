package isp.curs.sm.curs2;


public class Bicycle {
    
    //atrobute
    int speed;
    String model;

    //constructori
    public Bicycle(){
        speed = 0; 
        model = "Pegas";
    }
    public Bicycle(int speed, String model) {
        this.speed = speed;
        this.model = model;
    }
    
    //metode
    public void speedUp(){
        System.out.println("Bicyle accelerate");
        speed++;
        System.out.println(model+" "+speed);
    }

    @Override
    public String toString() {
        return "Bicycle{" + "speed=" + speed + ", model=" + model + '}';
    }
    
}
