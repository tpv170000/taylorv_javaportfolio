/**
*Description: This program will holds points and score  for the exam
*Class: Fall - COSC 1437.81002
*Assignment10: Final Exam
*Date: 11/21/2019
*@author  Taylor Vu 
*@version 1.0.0
*/ 
/**
* @param String  as args
* @return Termination code as String, 0 for normal, anything else is error condition
* @throws Nothing is implemented
*/
public class FinalExam extends GradedActivity
{
    private int numQuestions;  
    private double pointsEach;
    private int numMissed;     
    private double score;

   public FinalExam(int questions, int missed)
   {
      double numericScore; 

   
      numQuestions = questions;
      numMissed = missed;

    
      pointsEach = 100.0 / questions;
      numericScore = 100.0 - (missed * pointsEach);

      setScore(numericScore);
   }

 
   public double getPointsEach()
   {
      return pointsEach;
   }



   public int getNumMissed()
   {
      return numMissed;
   }

    public void setScore(double numericScore) {
      score = numericScore;
    }
}

