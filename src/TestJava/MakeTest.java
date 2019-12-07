/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestJava;

import Questions.MCQMA;
import Questions.MCQWSA;
import Questions.QWMS;
import Questions.TFQ;
import Questions.Test;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Dimitra
 */
public class MakeTest {
    public static void main(String[] args) throws FileNotFoundException {
        String statement = null;
        Test test = new Test();
        File file = new File("Test1.txt");
        Scanner sc = new Scanner(file);
        String testName = sc.nextLine();
        System.out.println(testName); 
        test.setTestName(testName);
        int n = Integer.parseInt( sc.nextLine()); 
        System.out.println("The number of Questions is "+n);
        sc.nextLine();
        
        while(sc.hasNext()){
        
            String s = sc.nextLine(); 
            System.out.println(s);
        
           switch(s){
            case "TFQ":
                statement = sc.nextLine();
                String answer = sc.nextLine();
                if(answer.equalsIgnoreCase("true")){
                    test.addQuestion(new TFQ(statement, true));
                }else{
                    test.addQuestion(new TFQ(statement, false));
                }      
                System.out.println(test.getQuestion(0));
                sc.nextLine();
                break;
            case "MCQWSA":
                statement = sc.nextLine();
                MCQWSA q = new MCQWSA(statement);
                boolean flag = true;
                while(flag){
                    try{
                        s = sc.nextLine();
                        q.setCorrectIndex(Integer.parseInt(s));
                    }catch(Exception e){
                        q.addAnswer(s);
                        
                    }
                     // System.out.println(q);
                }
                sc.nextLine();
                break;
            case "MCQMA":
                statement = sc.nextLine();
                MCQMA k = new MCQMA(statement);
                boolean flag1 = true;  //setTrueAnswers(ArrayList<Boolean> trueAnswers)
                boolean bool = true;
                
                String line;
                
                while(flag1){
                try{
                    while((line = sc.nextLine()) != null){
                        String[] parts = line.split("%");
                        String part1 = parts[0];
                        String part2 = parts[1];
                        ArrayList<String>answers1 = new ArrayList(); 
                         ArrayList<Boolean> boolans1 = new ArrayList();
                        answers1.add(part1);
                         if("true".equals(part2)){
                            boolans1.add(true);
                         }else if ("false".equals(sc.nextLine())){
                             boolans1.add(false);
                          }
                         
                        k.addAnswer(part1,bool);
                        test.addQuestion(new MCQMA(statement,answers1, boolans1));
                        System.out.println(test.getQuestion(2));
                    }
                    
                }catch(Exception e){
                        
                }
                
                sc.nextLine();
                break;
            
            
            }
         
            case "QWMS": 
                statement = sc.nextLine();
                String mStat = sc.nextLine();
                    try{
                        if (statement.toLowerCase().contains(mStat.toLowerCase())){
                        QWMS L = new QWMS(statement,mStat);
                }
                    } catch(Exception e){
                    System.out.println("The statement you entered doesn't exist in the statement");                    
                }
                
                break;
        default: break;   
                             
            
            
           }
            
            
        
        }
        sc.close();
    }

}           
            
            
