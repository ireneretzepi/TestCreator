package Questions;


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * A class to simulates Test objects
 * @author Eirini
 */
public class Test implements java.io.Serializable {
    public static final String testType[]={"TFQ","MCQWSA","MCQWMA","QWMS"};
    private String testName; // name of test
    private int totalTime; // in minutes. 
    private ArrayList<Question> questions; // collection of question. 
    
    /**
     * Default Constructor 
     */
    public Test(){
        this(null); 
    }
    /**
     * One parameter constructor
     * @param testName  the name of the test
     */
    public Test(String testName){
        questions= new ArrayList(); // initializes the arraylist
    }
    
    /**
     * This method adds a new question to the arraylist of questions ONLY 
     * if it does not exist already. 
     * @param q A question object
     */
    public void addQuestion(Question q){
       boolean exists= false;
        for (int i=0; i<getQuestions().size(); i++){
            if (getQuestions().get(i).equals(q)){
                return;  
            }
        }
        this.getQuestions().add(q); 
    }
    
    /**
     * Getter for question based on its index. 
     * @param i
     * @return a Question object.
     */
    public Question getQuestion(int i){
        if(i>=0 && i<this.getQuestions().size()){
            return this.getQuestions().get(i);
        }else{
            return null; 
        }
    }
    
    public int getNumberOfQuestions(){return this.getQuestions().size(); }

    /**
     * @return the testName
     */
    public String getTestName() {
        return testName;
    }

    /**
     * @param testName the testName to set
     */
    public void setTestName(String testName) {
        this.testName = testName;
    }

    /**
     * @return the questions
     */
    public ArrayList<Question> getQuestions() {
        return questions;
    }

    /**
     * @param questions the questions to set
     */
    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }
    
    public String toString(){
        String s1 = new String("Test Name: "+this.getTestName());
        String s2 = new String("Number of Questions: "+this.getNumberOfQuestions());
        String s3 = new String("");
        for(int i=0; i<this.getQuestions().size();i++){
            s3 =s3 +  i+"."+this.getQuestion(i).getStatement()+"\n";
        }
        return s1+"\n"+s2+"\n"+s3;
    }

    /**
     * @return the totalTime
     */
    public int getTotalTime() {
        return totalTime;
    }

    /**
     * @param totalTime the totalTime to set
     */
    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }
}

   
