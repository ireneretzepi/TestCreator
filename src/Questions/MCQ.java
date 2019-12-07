package Questions;

import java.util.ArrayList;

 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * This is an abstract class that simulates Multiple Choice Questions. 
 * Concrete classes should extend this class and add functionality
 * @author Eirini
 */
 public abstract class MCQ  extends Question{
    private ArrayList<String>  answers; // a collection of answers to the question
    public MCQ(String statement){
        super(statement); // calls the construtor of class Question.
    }
    @Override
    public String toString(){
        return super.toString(); 
    }
    
    /**
     * this method adds an answer to the collection of answers
     * @param answer  is String object to be inserted as a potential answer to 
     * answers collection.
     */
    public void addAnswer(String answer){
        for(int i=0;i<answers.size();i++){
            if(answers.get(i).equalsIgnoreCase(answer)){
                System.out.println("The answer already exists ");
                return; 
            }
        }
        this.answers.add(answer); 
    }
    /**
     * @return the answers
     */
    public ArrayList<String> getAnswers() {
        return answers;
    }

    /**
     * @param answers the answers to set
     */
    public void setAnswers(ArrayList<String> answers) {
        this.answers = answers;
    }
}
