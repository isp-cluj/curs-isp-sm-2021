/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.curs.sm.curs7.vendingmachine;

/**
 *
 * @author mihai.hulea
 */
public class InsuficientCreditException extends Exception {

    public InsuficientCreditException(String message) {
        super(message);
    }
    
}
