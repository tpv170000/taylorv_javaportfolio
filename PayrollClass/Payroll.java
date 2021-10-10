/**
*Description: This program will holds the employee's IDs, hours, and wages
*Class: Fall - COSC 1437.81002
*Assignment 8: Payroll Class
*Date: 08/15/2011
*@author  Taylor Vu 
*@version 0.0.0
*/  
/**
* @param String as args
* @param index, hours, employeeId as int
* @param wages, payRate as double 
* @return hours[index],payRate[index] wages[index] 0 for normal, anything else is error condition
* @throws Nothing is implemented
*/
public class Payroll
{
private int[] employeeId = {5658845,4520125,7895122,8777541,8451277,1302850,7580489};
private int [] hours = new int [7];
private double [] payRate = new double [7];
private double [] wages = new double [7];

public void setHours(int index, int hours){
    this.hours[index] = hours;
}
public void setpayRate (int index, double payRate){
    this.payRate[index] = payRate;
}
public void setEmployeeId(int index, int employeeId){
    this.employeeId[index] = employeeId;
}
public void setWages (int index, double wages){
    this.wages[index] = wages;
}
public double getHours (int index){
    return hours[index];
}
public double getpayRate (int index){
    return payRate[index];
}
public double getEmployeeId(int index){
    return employeeId[index];
}
public double getWages (int index){
    return wages [index];
}
public void GrossPay()
{
    //int hours = 0;
   // double payRate = 0;
   // double wages = 0;
for (int index = 0; index < employeeId.length; index++){
    wages[index] = hours[index] * payRate[index];
}
}
}
