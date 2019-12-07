/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestJava;

import Questions.*;

/**
 *
 * @author Dimitra
 */
public class TestTest01 {
    public static void main(String[] args) {
        Test test = new Test("Networks");
        TFQ tfq1 = new TFQ("A gateway is differenct from a router",true);
        TFQ tfq2 = new TFQ("Virtual memory exists on the hard-disk",true);
        test.addQuestion(tfq1);
        test.addQuestion(tfq2);
        for(int i=0;i<test.getNumberOfQuestions();i++){
            System.out.println(test.getQuestion(i).getClass().getName()+"  :"+test.getQuestion(i).getStatement());
        }
    }
}
