/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit4;

/**
 *
 * @author Kristy
 */
public class TestScores {
    private double testScore1;
    private double testScore2;
    private double testScore3;
    private char letterGrade;
    
    public void setTestScore1(double score1){
        testScore1 = score1;
    }
    public double getTestScore1(){
        return testScore1;
    }
    
    public void setTestScore2(double score2){
        testScore2 = score2;
    }
    public double getTestScore2(){
        return testScore2;
    }
    
    public void setTestScore3(double score3){
        testScore3 = score3;
    }
    public double getTestScore3(){
        return testScore3;
    }
    
    public double averageTestScores(){
        return (testScore1 + testScore2 + testScore3)/3.0;
    }
    
    public char getLetterGrade(double grade){
        if(grade >= 90){
            letterGrade = 'A';
        }
        else if((grade < 90) && (grade >= 80)){
            letterGrade = 'B';
        }
        else if((grade < 80) && (grade >= 70)){
            letterGrade = 'C';
        }
        else if((grade < 70) && (grade >= 60)){
            letterGrade = 'D';
        }
        else {
            letterGrade = 'F';
        }
        return letterGrade;
    }
    
}
