/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curs.isp.sm.interfetegrafice.compresor;

import curs.isp.sm.interfetegrafice.compresor.mvc.*;



/**
 *
 * @author mihai.hulea
 */
public class HvacMvcController extends AbstractController {
    public static final String COMPRESSOR_STATUS = "Status";
    
    public void setCompressorStatus(String newValue){
        System.out.println("COMPRESSOR STATUS:"+newValue);
        this.setModelProperty(COMPRESSOR_STATUS, newValue);
    }
    
}
