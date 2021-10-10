/**
*Description: This program will holds course grade for essay and the exams  
*Class: Fall - COSC 1437.81002
*Assignment10: Course Grades
*Date: 11/21/2019
*@author  Zoltan Szabo
*@version 1.0.0
*/ 
/**
* @param String  as args
* @return Termination code as String, 0 for normal, anything else is error condition
* @throws Nothing is implemented
*/
public class CourseGrades
{
   private GradedActivity[]grades= new GradedActivity [4];
   
   public void setLab(GradedActivity aLab){
       grades[0] = aLab;
   }
   public void setPassFailExam(PassFailExam aPassFailExam){
       double s = 100  - (aPassFailExam.getNumMissed()*aPassFailExam.getPointsEach());
       grades[1] = new GradedActivity();
       grades[1].setScore(s);
   }
   public void setEssay(Essay anEssay){
   double s = anEssay.getTotal();
   grades[2] = new GradedActivity();
   grades[2].setScore(s);
   }
   public void setFinalExam(FinalExam aFinalExam)
   {
       double s = 100- (aFinalExam.getNumMissed()*aFinalExam.getPointsEach());
       grades[3]= new GradedActivity();
       grades[3].setScore(s);
   }
   public String toString(){
       String str= "Lab Score: " + 
       grades[0].getScore() + "\tGrade: " +
       grades[0].getGrade() + "\nPass/Fail Exam Score: " + 
       grades[1].getScore() + "\tGrade: " + 
       grades[1].getGrade() + "\nEssay Score: " + 
       grades[2].getScore() + "\nFinal Exam Score: "+ 
       grades[2].getGrade() + "\nFinal Exam Score: " + 
       grades[3].getScore() + "\tGrade: " + 
       grades[3].getGrade(); 
       return str;
   }
}
