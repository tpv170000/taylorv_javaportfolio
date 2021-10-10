/**
*Description: This program will holds information for the number missed and number of questions which will account to failing or passing the exam 
*Class: Fall - COSC 1437.81002
*Assignment10: Essay 
*Date: 11/21/2019
*@author  Taylor Vu 
*@version 1.0.0
*/ 
/**
* @param String  as args
* @return Termination code as String, 0 for normal, anything else is error condition
* @throws Nothing is implemented
*/
public class PassFailExam extends PassFailActivity 
{
    private int numQuestions; 
   private double pointsEachQ;
   private int numMissed;
   
 public PassFailExam(int questions, int missed, double minPassing) {
      super(minPassing);
      double numericScore;
      numQuestions = questions;
      numMissed = missed;
      pointsEachQ = 100.0 / questions;
      numericScore = 100.0 - (missed * pointsEachQ);
      setScore(numericScore);
   }
 public double getPointsEach()
   {
      return pointsEachQ;
   }

 public int getNumMissed()
   {
      return numMissed;
   }
}

