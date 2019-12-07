/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestJava;
import Questions.*; 
/**
 *
 * @author Eirini
 */
public class TestTrueFalseQuestions01 {
    public static void main(String[] args) {
        // create a TruFalseQuestion object 
        Question A = new TFQ("Does networks utialize DNS?", true);
        TFQ B = new TFQ("Does networks utilize protocols?",true);
        System.out.println(A.getStatement());
        System.out.println(B.getStatement());
    }
}
