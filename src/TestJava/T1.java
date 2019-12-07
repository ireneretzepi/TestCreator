/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestJava;

import java.util.Date;

/**
 *
 * @author Eirini
 */
public class T1 {
    public static void main(String[] args) {
        String s = "Eirini";
        System.out.println( s.getClass().getName() ); 
        Date d1 = new Date("12/5/2017");
        Date d2 = new Date("11/5/2017");
        System.out.println(d1.getClass().getName());
        System.out.println(d2.getClass().getName());
        if(d1.getClass().getName().equals(d2.getClass().getName())){
            
            System.out.println( d1.compareTo(d2) ); 
        }
    }
}
