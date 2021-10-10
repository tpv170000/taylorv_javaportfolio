/*
 *Class for main method where demo of program is suppose to take place 
 */

/**
 *
 * @author Taylor Vu 
 */
import java.util.Scanner;
public class TaylorVuAssignment2 {
    public static void main(String[] args)
    {  
       Contact CopyArray[]  = new Contact[UnsortedArray.getSize()];
    //tried passing in an array of contact
    //by taking the Unsorted Array and copying it into another new array without copying the second cotnact in the original array 
    //returning the new arry 
    UnsortedOptimizedArray MyUnsortedOptimizedArray = new UnsortedOptimizedArray();
    SortedArray MySortedArray = new SortedArray();
    UnsortedArray MyUnsortedArray = new UnsortedArray();
    //created objects for Unsorted Array, Sorted Array, Unsorted Optimized Area;
        
    Contact contact1 = new Contact("Taylor Vu", "E Spring Valley rd", "4694220395", "tpvu@gmail.com");
    Contact contact2 = new Contact("Yen Co", "Janwood Lane", "4698108985", "yenco123@gmail.com" );
    //created objects for Contact class
  
    Scanner keyboard = new Scanner(System.in);
    //prompting user for contact 3 
    System.out.println("Please enter the information down below");
    System.out.println("Please enter a name: ");
    String name3= keyboard.nextLine();
    System.out.println("Please enter a address: ");
    String address3 = keyboard.nextLine();
    System.out.println("Please enter a phone number: ");
    String number3 = keyboard.nextLine();
    System.out.println("Please enter an email: ");
    String email3 = keyboard.nextLine();
    Contact contact3 = new Contact(name3, address3, number3, email3);
    //end of object for contact 3
    
    //prompting user for contact 4 object 
    System.out.println("Please enter more information down below");
    System.out.println("Please enter another name: ");
    String name4= keyboard.nextLine();
    System.out.println("Please enter another address: ");
    String address4 = keyboard.nextLine();
    System.out.println("Please enter another phone number: ");
    String number4 = keyboard.nextLine();
    System.out.println("Please enter another email: ");
    String email4 = keyboard.nextLine();
    Contact contact4 = new Contact(name4, address4, number4, email4);
    //end of object contact 4
    
    //Using Insert method to insert all 4 contacts 
    MyUnsortedArray.insert(contact1);
    MyUnsortedArray.insert(contact2);
    MyUnsortedArray.insert(contact3);
    MyUnsortedArray.insert(contact4);
    
    MyUnsortedOptimizedArray.insert(contact1);
    MyUnsortedOptimizedArray.insert(contact2);
    MyUnsortedOptimizedArray.insert(contact3);
    MyUnsortedOptimizedArray.insert(contact4);
    //o insert all 4 MyContact objects into each of the 3 array-based objects
    MySortedArray.insert(contact1.getKey(),contact1);
    MySortedArray.insert(contact2.getKey(), contact2);
    MySortedArray.insert(contact3.getKey(),contact3);
    MySortedArray.insert(contact4.getKey(),contact4);
    
    MyUnsortedArray.output();
    MyUnsortedOptimizedArray.output();
    MySortedArray.output();
    
    MySortedArray.fetch(contact3);
    MyUnsortedOptimizedArray.fetch(contact3);
    
    MySortedArray.Update(5,contact1);
    MyUnsortedArray.Update(5, contact1);
    
    MySortedArray.delete(contact2);
    UnsortedArray.delete(contact2);
    MyUnsortedOptimizedArray.delete(contact2);
    
    }
    }