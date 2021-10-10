/**
*Description: This program will displays a the amount the employee gets paid based on the hours. 
*Class: Fall - COSC 1437.81002
*Assignment 8: Payroll Class
*Date: 08/15/2011
*@author  Taylor Vu 
*@version 0.0.0
*/  
/**
* @param String as args
* @return Termination code as int, 0 for normal, anything else is error condition
* @throws Nothing is implemented
*/
import java.util.Scanner; 
public class PayrollDemo
{
    public static void main(String [] args){
      double payRate;
      int hours;
      Payroll payroll = new Payroll();
      
      Scanner keyboard = new Scanner(System.in);
      
      for (int index = 0; index < 7; index++){
          System.out.println();
          System.out.println("Employee ID: " +payroll.getEmployeeId(index));
          System.out.println();
          System.out.println("Please enter number of hours worked: ");
          hours = keyboard.nextInt();
          payroll.setHours(index, hours);
          
          while (hours < 0){ // input validation if number of hours is negative
              System.out.println("The number is not valid, please enter a" + "positive number.");
              System.out.println("Please enter the number of hours worked: ");
              hours = keyboard.nextInt();
              payroll.setHours(index, hours);
          }
          System.out.println();
          System.out.println("Enter hourly rate: ");
          payRate = keyboard.nextDouble();
          payroll.setpayRate(index, payRate);
          
          while (payRate < 6.00){ //input validation if pay rate is less than 6
              System.out.println("The number is not valid, please enter a" + "number more than 6 for payrate");
              System.out.println("Please enter the number of hours worked: ");
              payRate = keyboard.nextDouble();
      }
      System.out.println();
    }
    payroll.GrossPay();
    for (int index = 0; index <7; index ++){
    System.out.println("Employee ID: " +payroll.getEmployeeId(index) + "\n" + payroll.getWages(index));
    }
}
}
