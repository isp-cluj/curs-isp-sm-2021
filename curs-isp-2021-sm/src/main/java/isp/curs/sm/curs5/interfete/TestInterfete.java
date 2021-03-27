/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.curs.sm.curs5.interfete;

interface Instrument{
    
    public void play(String note);
}
///////////////////////
class Pian implements Instrument{

    @Override
    public void play(String note) {
        System.out.println("Pian is playing note "+note);
    }    
}
///////////////////////
class Violin implements Instrument{

    @Override
    public void play(String note) {
        System.out.println("Violin is playing note "+note);
    }
    
}
///////////////////////
public class TestInterfete {
    
    static void playMusic(Instrument i){
        i.play("FA");
    }
            
            
    public static void main(String[] args) {
        Instrument t1 = new Pian();
        Instrument t2 = new Violin();
        t1.play("DO");
        
        Instrument t3 = new Instrument(){
          public void play(String nota){
              System.out.println("Instrument is playing "+nota);
          }  
        };
        ///////////////////////////////////////////////////////////////////////
        
        //Lambda expressions 
        Instrument t4 = (String nota) -> {
            System.out.println("Instrument is playing "+nota);  
        };
        
        t4.play("RE");
        
        playMusic(t4);
        
        playMusic((nota)->System.out.println("Instrument is playing "+nota));
    }
}
///////////////////////