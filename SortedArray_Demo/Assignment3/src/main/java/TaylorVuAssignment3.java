/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Taylor Vu 
 */
public class TaylorVuAssignment3 {
    public static void main(String[] args){
    Queue MyQueue1 = new Queue(1);
    Queue MyQueue2 = new Queue(2);
    Queue MyQueue3 = new Queue(3);
    
    Stack MyStack1 = new Stack(1);
    Stack MyStack2 = new Stack(2);
    Stack MyStack3 = new Stack(3);
    
    Contact contact;
    Contact contact1 = new Contact("Taylor Vu", "E Spring Valley rd", "4694220395", "tpvu@gmail.com");
    Contact contact2 = new Contact("Yen Co", "Janwood Lane", "4698108985", "yenco123@gmail.com");
    Contact contact3 = new Contact("Stacy Igwe", "Place One Drive", "2147125054", "Scigwe@gmail.com");
            
    //
    System.out.println(MyQueue1.deque()); // will return a null
    
    // performs enques for queue class
    System.out.println(MyQueue1.enque(contact1));
    System.out.println(MyQueue2.enque(contact2));
    System.out.println(MyQueue3.enque(contact3));
    
    //peroforms deques for queue class
    contact = MyQueue1.deque();
    System.out.println(contact.toString());
    
    contact = MyQueue2.deque();
    System.out.println(contact.toString());
    
    contact = MyQueue3.deque();
    System.out.println(contact.toString());
    
    
    
}
}
