/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestJava;
import Questions.*;
import java.util.ArrayList;
/**
 *
 * @author Dimitra
 */
public class TestMutlipleChoiceQuestionsWIthSingleAnswer {
    public static void main(String[] args) {
        ArrayList<String> answers = new ArrayList();
        answers.add("Greece");
        answers.add("China");
        answers.add("Italy");
        MCQWSA B = new MCQWSA("Where is Athens",answers, 0 );
    
        MCQWSA C  = new MCQWSA("What is Memory");
        C.addAnswer("It is part of the CPU");
        C.addAnswer("A type of software");
        C.addAnswer("Not related to computers");
        C.addAnswer("It is storage location");
        C.setCorrectIndex(3);
        
        
                
                
    }
}
