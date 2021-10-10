/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Taylor Vu 
 */
public class Stack {
    private Contact[]data;
    private int top;
    private int size;
    
    //with no parameters initializes the fields of the stack
    public Stack(){
        top = -1;
        size = 100;
        data = new Contact [100];
}
    //creates a stack of a size given by th parameter
    public Stack (int n){
        top = -1;
        size = n;
        data = new Contact[n];
    }
    //inserts node given by parameter to the Stack
    public boolean push(Contact newNode){
       if (top == size -1)
           return false;
       else
       {
           top = top +1;
           data[top] = newNode.deepCopy();
           return true;
       }
    }// end of push function
    
    //fetches and delets a node from stack and returns it
    public Contact pop(){
        int topLocation;
        if(top ==-1)
            return null;
        else{
            topLocation = top;
            top = top -1;
            return data[topLocation];
        }
    }// ends of pop function
    
    public void output(){
        System.out.println("The top of the stack is  " + top);
        System.out.println("The size of the stack is  "+ size);
    }//ends of output function
    
    //reinitialize variables
    public void empty(){
        top = -1;
        size= 100;
    }
    public boolean isEmpty(){
        if (top == -1) // stack is empty
            return true;
        else 
            return false;

    }
    public Contact peek() 
    { 
        int topLocation;
        if(top == 0)
            return null;
        else{
            topLocation = top;
            return data [topLocation];
        } 
    }// end of peek function
    
    // finds a contact in teh stack receives contact name as a parameer 
    //outputs the contact and returns the positio or 0 if not in quees
    public void find(){
        for (int i = top; i>0; i--)
            System.out.println(data[i].toString());
    }//end of find function 
    
}
