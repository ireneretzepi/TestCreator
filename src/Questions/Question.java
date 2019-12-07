package Questions;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Class Questions is an abstract class. We cannot create objects from this clas
 * However its purpose is to be a parent class for other classes. 
 * The class contains a constructor we cannot type 
 * Question q  = new Question("What is binary?"); 
 * We can say
 * Question q = new TrueFalseQuestion("");
 * @author Eirini
 */
abstract public class Question implements Comparable, java.io.Serializable{
    private String statement;  // the statement for a question
    private int a ; // numberOfTimesTheQuestionHasBeenTaken; 
    private int b;  // numberOtTimesTheQuestionHasBeenAnswerdCorrectly; 
    private boolean userResponse; // user response
    public Question(String statement){
        this.statement = statement; 
    }

    /**
     * @return the statement
     */
    public String getStatement() {
        return statement;
    }

    /**
     * @param statement the statement to set
     */
    public void setStatement(String statement) {
        this.statement = statement;
    }
    
    @Override
    public String toString(){
        return this.statement ; 
    }

    /**
     * @return the a
     */
    public int getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(int a) {
        this.a = a;
    }
    public void incrementA(){
        this.a++; 
    }
    
    public void increaseB(){
        this.b++; 
    }
    /**
     * Difficulty is a number between 0 and 1. 
     * @return 
     */
    public double difficulty(){
        return (double)b/(double)a; 
    }
    /**
     * @return the b
     */
    public int getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(int b) {
        this.b = b;
    }
    
    /**
     * Overrides the equals method of class Object
     * @param obj
     * @return boolean value based on the comparison. 
     */
    @Override
    public boolean equals(Object obj){
        if(obj == null){return false;}
        if(!obj.getClass().getName().equals(this.getClass().getName())){
            return false; 
        }
        Question q = (Question)obj; 
        if(this.statement.equals(q.getStatement())){
            return true;
        }else{
            return false; 
        }
    }
    
    /**
     * Overrides the compareTo method of Interface Compareable
     * @param o
     * @return 
     */
    @Override
    public int compareTo(Object o){
        if(o==null){
            return 1; 
        }else{
            // the comprison is based on class name and difficulty of the quation
            if(o.getClass().getName().equals(this.getClass().getName())){
                Question q = (Question)o; 
                if(this.difficulty()>q.difficulty()){
                    return 1;
                }else if(this.difficulty()<q.difficulty()){
                    return -1; 
                }else{
                    return 0; 
                }
            }else{
                return 1; 
            }
        }
    }

    /**
     * @return the userResponse
     */
    public boolean getUserResponse() {
        return userResponse;
    }

    /**
     * @param userResponse the userResponse to set
     */
    public void setUserResponse(boolean userResponse) {
        this.userResponse = userResponse;
    }
}
