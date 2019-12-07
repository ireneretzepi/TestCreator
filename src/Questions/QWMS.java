/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

/**
 * Creates Question object With Missing Statements.
 * @author Eirini
 */
public class QWMS extends Question{
    private String statementWithMissingWord; // the full statement
    private String missingWord; // the missing word.
    
    /**
     * Two parameter constructor
     * @param statement indicates the statement of the question 
     * @param missingWord the missing word from the above statement. 
     * if the missingWord does not appear on the statement then this results in 
     * a logical error.
     */
    public QWMS(String statement, String missingWord){
        super(statement);// calls the constructor of the parent class. 
        this.missingWord = missingWord; 
        this.statementWithMissingWord= new String(statement);
        this.statementWithMissingWord = statement.replaceFirst(missingWord,"______________");
    }


    /**
     * @return the statementWithMissingWord
     */
    public String getStatementWithMissingWord() {
        return statementWithMissingWord;
    }

    /**
     * @param statementWithMissingWord the statementWithMissingWord to set
     */
    public void setStatementWithMissingWord(String statementWithMissingWord) {
        this.statementWithMissingWord = statementWithMissingWord;
    }

    /**
     * @return the missingWord
     */
    public String getMissingWord() {
        return missingWord;
    }

    /**
     * @param missingWord the missingWord to set
     */
    public void setMissingWord(String missingWord) {
        this.missingWord = missingWord;
    }
    
}
