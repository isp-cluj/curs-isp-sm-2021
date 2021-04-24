package curs.isp.sm.interfetegrafice.separare;

public class Calculator {
    double calculeaza(String operand1, String operand2, String operatie){
        System.out.println(operand1+" "+operand2+" "+operatie);
        double op1 = Double.parseDouble(operand1.toLowerCase());
        double op2 = Double.parseDouble(operand2.toLowerCase());
        double result = 0;
        switch(operatie.toLowerCase()){
            case "aduna":{result = op1 + op2;break;}
            case "scade":{result = op1 - op2;break;}
            case "inmulteste":{result = op1 * op2;break;}
            case "imparte":{result = (op1 / op2);break;}
        }
        System.out.println("r="+result);
        return result;
    }
}
