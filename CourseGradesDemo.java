/**
*Description: Course Grades Demo demonstrates the course grades 
*Class: Fall - COSC 1437.81002
*Assignment10: Course Grades Demo 
*Date: 11/21/2019
*@author  Zoltan Szabo
*@version 1.0.0
*/ 
/**
* @param String  as args
* @return Termination code as String, 0 for normal, anything else is error condition
* @throws Nothing is implemented
*/
import java.util.Scanner;
public class CourseGradesDemo
{
    public static void main(String[] args)
    {
        System.out.println("Please enter first term grades: .");
        String MissString = "Please enter the number of questions that was missed:";
        GradedActivity Lab = getLabScores();
        Essay essay = getEssayScores();
        PassFailExam PassFail = getPassFailExamScores(MissString);
        FinalExam Final = getFinalExamScores(MissString);
        CourseGrades grades = new CourseGrades();
        grades.setLab(Lab);
        grades.setEssay(essay);
        grades.setPassFailExam(PassFail);
        grades.setFinalExam(Final);
        System.out.println(grades.toString());
    }
    public static PassFailExam getPassFailExamScores(String missString)
    {
        System.out.println("Pass Fail Exam Score:\n10 questions total:");
        int quest = 10;
        int miss = validateInput(missString, 0, quest);
        double min = 70;
        return new PassFailExam(quest, miss, min);
    }
    public static FinalExam getFinalExamScores(String missString)
    {
        System.out.println("Final Exam Score:\n50 questions total:");
        int fquest = 50;
        int fmiss = validateInput(missString, 0, fquest);
        return new FinalExam(fquest,fmiss);
    }

    public static Essay getEssayScores()
    {
        System.out.println("Essay Score:");
        int gram = validateInput("Enter Grammar points: (0-30)", 0, 30); //grammar
        int spell = validateInput("Enter Spelling points: (0-20)", 0, 20);  //spelling
        int len = validateInput("Enter Length points: (0-20)", 0, 20);  //length
        int cont = validateInput("Enter Content points: (0-30)", 0, 30);  //content
        return new Essay(gram, spell, len, cont);
    }

    public static GradedActivity getLabScores()
    {
        GradedActivity Lab = new GradedActivity();
        Lab.setScore(validateInput("Enter score for lab activity: (0-100)", 0, 100));
        return Lab;
    }

    public static int getIntInput(String stringIn)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println(stringIn);
        return keyboard.nextInt();
    }

    public static double getDblInput(String stringIn)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println(stringIn);
        return keyboard.nextDouble();
    }
    public static String getStringInput(String stringIn)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println(stringIn);
        return keyboard.next();
    }

    public static int validateInput(String stringIn, int min, int max)
    {
        int objVar = getIntInput(stringIn);
        while(objVar > max || objVar < min)
        {
            System.out.println("Invalid Entry!\nTry Again:");
            objVar = getIntInput(stringIn);
        }
        return objVar;
    }
}
