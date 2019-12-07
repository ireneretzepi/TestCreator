package Questions;


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Creates Multiple Choice Questions With Single Answer objects
 * @author Eirini
 */
public class MCQWSA extends MCQ{
    private int correctIndex = -1;  // indicates which index is the correct
    
    /**
     * Three parameter constructor
     * @param statement the statement of the question 
     * @param answers an collection of answers
     * @param correctIndex an index that indicates which answer is correct 
     */
    public MCQWSA(String statement, ArrayList<String> answers, int correctIndex){
        super(statement);
        super.setAnswers(answers);
        if(correctIndex >=0 || correctIndex <super.getAnswers().size()){
            this.correctIndex = correctIndex;
        }
    }
    
    /**
     * One parameter constructor. 
     * @param statement 
     */
    public MCQWSA(String statement){
        this(statement, new ArrayList(), -1);// calls the three parameter constructor.
    }



    /**
     * @return the correctIndex
     */
    public int getCorrectIndex() {
        return correctIndex;
    }

    /**
     * @param correctIndex the correctIndex to set
     */
    public void setCorrectIndex(int correctIndex) {
        this.correctIndex = correctIndex;
    }
    
    @Override
    public String toString(){
        String s = "Statement :"+super.getStatement();
        s = s + "\nAnswers\n";
        for(int i =0;i<super.getAnswers().size();i++){
            s = s + super.getAnswers().get(i)+"\n";
        }
        s = s + "Correct Index: "+this.correctIndex; 
        return s; 
    }
   
    
}
