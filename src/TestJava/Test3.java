/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestJava;

import Questions.MCQWSA;
import Questions.TFQ;
import Questions.MCQMA;
import Questions.Test;
import java.util.ArrayList;

/**
 *
 * @author Dimitra
 */
public class Test3 {
    public static void main(String[] args) {
        Test test = new Test("Java");
         MCQWSA D  = new MCQWSA("Java class ");
        D.addAnswer("is a method");
        D.addAnswer("doesn't contain construcotrs");
        D.addAnswer("is a blue print from which individual objects are created");
        D.setCorrectIndex(2);
            
       
        
        ArrayList<String> answers = new ArrayList();
        answers.add("store");
        answers.add("super");
        answers.add("import");
        ArrayList<Boolean> boolans = new ArrayList();
        boolans.add(false);
        boolans.add(true);
        boolans.add(true);
        MCQMA K = new MCQMA("Java keywords",answers, boolans );
        
        ArrayList<String> answers3 = new ArrayList();
        answers.add("has a return type");
        answers.add("is invoked using the new operator");
        answers.add("has a different name than that of the class or its own name");
        answers.add("it is used to create objects of that class");
        ArrayList<Boolean> boolans3 = new ArrayList();
        boolans.add(false);
        boolans.add(true);
        boolans.add(false);
        boolans.add(true);
        MCQMA M = new MCQMA("A constructor ",answers3, boolans3 );
        
               TFQ q1 = new TFQ("Java includes features like Object Oriented, Robust and Interpreted", true);
        System.out.println(q1.getStatement()+" "+ q1.getAnswer());
        for(int i=0;i<test.getNumberOfQuestions();i++){
            System.out.println(test.getQuestion(i).getClass().getName()+"  :"+test.getQuestion(i).getStatement());   
        }
    }
}
