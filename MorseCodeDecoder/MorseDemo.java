/**
*Description: This program will displays a morse based on user input 
*Class: Fall - COSC 1437.81002
*Assignment 9: Morse Code Converter
*Date: 11/12/2019
*@author  Zoltan Szabo
*@version 1.0.0
*/ 
/**
* @param String as args
* @return Termination code as int, 0 for normal, anything else is error condition
* @throws Nothing is implemented
*/
import java.util.Scanner; 
import java.io.*;
public class MorseDemo{
public static void main(String [] args){ 
   Scanner keyboard = new Scanner(System.in);
   System.out.println("Please enter anything without spaces");
   Morse m = new Morse(keyboard.nextLine());
   System.out.println(m.getMorseCode());   
}
}
