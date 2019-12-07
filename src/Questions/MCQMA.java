package Questions;


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * A class the creates Multiple Choice Questions With Multiple Answers.
 * @author Eirini
 */
public class MCQMA extends MCQ {
    private ArrayList<Boolean> boolAnswers; // this collection is to be 
    // undestood as a parallel to the answers collection in class MCQ
    
 
    /**
     * Three parameter constructor.
     * @param statement The statement of the question
     * @param answers   A collection of answers
     * @param boolAnswers  A collection containing if the answers are true or false.
     */
    public MCQMA(String statement,  ArrayList<String> answers, ArrayList<Boolean> boolAnswers){
        super(statement); 
        super.setAnswers(answers);
        this.boolAnswers = boolAnswers;
    }
    /**
     * One parameter constructor. 
     * @param statement 
     */
    public MCQMA(String statement){
         this(statement,new ArrayList(), new ArrayList()) ;   // calls the three parameter constructor. 
    }
    
    /**
     * method a pair of potential answers and their truthfulness  
     * @param answer the answer
     * @param boolans indicates if the answer is true or false.
     */
    public void addAnswer(String answer, boolean boolans ){
        for(int i=0;i<super.getAnswers().size(); i++){
            if(super.getAnswers().get(i).equalsIgnoreCase(answer)){
                System.out.println("Answer Already exists");
                return; 
            }
        }
        super.getAnswers().add(answer);
        this.getBoolAnswers().add(boolans); 
    }
    
    /**
     * Removes an answer and its corresponding truthfulness. 
     * This method uses sequential search to access all the answers in
     * the MCQWMA object
     * @param answer A String that indicates the answer to be removed. 
     */
    public void removeAnswer(String answer){
        for(int i=0;i<super.getAnswers().size(); i++){
            if(super.getAnswers().get(i).equalsIgnoreCase(answer)){
                super.getAnswers().remove(i);
                getBoolAnswers().remove(i);
                return; 
            }
        }
    }
    

    /**
     * @return the boolAnswers
     */
    public ArrayList<Boolean> getBoolAnswers() {
        return boolAnswers;
    }

    /**
     * @param boolAnswers the boolAnswers to set
     */
    public void setBoolAnswers(ArrayList<Boolean> boolAnswers) {
        this.boolAnswers = boolAnswers;
    }
    
    /**
     * Utility method to print the fields of the class. 
     */
    public void print(){
        System.out.println(super.getStatement());
        System.out.println(this.getAnswers());
        System.out.println(this.getBoolAnswers());
    }
    
}
