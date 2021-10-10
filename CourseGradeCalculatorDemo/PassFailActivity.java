/**
*Description: This program will holds information for number missed and number of questions which will account to failing or passing activity portion 
*Class: Fall - COSC 1437.81002
*Assignment10: PassFail Activity 
*Date: 11/21/2019
*@author Taylor Vu 
*@version 1.0.0
*/ 
/**
* @param String  as args
* @return Termination code as String, 0 for normal, anything else is error condition
* @throws Nothing is implemented
*/
public class PassFailActivity extends GradedActivity
{
   private final double minPassingScore; 
   public PassFailActivity(double mps)
   {
      minPassingScore = mps;
   }
   public char getGrade()
   {
      char letterGrade;

      if (super.getScore() >= minPassingScore)
         letterGrade = 'P';
      else
         letterGrade = 'F';

      return letterGrade;
   }
}

