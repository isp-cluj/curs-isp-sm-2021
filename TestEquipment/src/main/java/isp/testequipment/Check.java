/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.testequipment;

/**
 *
 * @author mihai.hulea
 */
public interface Check<T> {
    boolean compare(T t);
}
