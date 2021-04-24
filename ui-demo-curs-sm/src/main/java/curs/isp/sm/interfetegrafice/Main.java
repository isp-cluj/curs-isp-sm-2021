package curs.isp.sm.interfetegrafice;

import curs.isp.sm.interfetegrafice.separare.Calculator;
import curs.isp.sm.interfetegrafice.separare.CalculatorV2SeparareJFrame;


public class Main {
    public static void main(String[] args){
        System.out.println("It works!");
        
        CalculatorV2SeparareJFrame f = new CalculatorV2SeparareJFrame();
        f.setVisible(true);
        
        Calculator c = new Calculator();
        CalculatorV2SeparareJFrame f2 = new CalculatorV2SeparareJFrame(c);
        f2.setVisible(true);
        
    }
}
