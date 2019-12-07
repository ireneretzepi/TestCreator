package Questions;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * A class to make True False questions.
 * @author Eirini
 */
public class TFQ extends Question{
    private boolean answer; // indicates if the question is true or false

    /**
     * Two parameter constructor 
     * @param statement The statement of the question 
     * @param answer the answer of the question
     */
    public TFQ(String statement,boolean answer){
        super(statement); 
        this.answer=answer; 
    }

    /**
     * @return the answer
     */
    public boolean getAnswer() {
        return answer;
    }

    /**
     * @param answer the answer to set
     */
    public void setAnswer(boolean answer) {
        this.answer = answer;
    }
    
    @Override
    public String toString(){
       return super.toString(); // for the moment. I am going to change it later. 
    }
}
