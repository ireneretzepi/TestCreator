/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestJava;

import Questions.MCQMA;

/**
 *
 * @author Thanasis
 */
public class TestMCQMA01 {
    public static void main(String[] args) {
        MCQMA q = new MCQMA("T1");
        q.addAnswer("A", true);
        q.addAnswer("B",true);
        q.addAnswer("C",false);
        
        System.out.println(q.getStatement());
        System.out.println(q.getAnswers());
        System.out.println(q.getBoolAnswers());
        
    }
}
