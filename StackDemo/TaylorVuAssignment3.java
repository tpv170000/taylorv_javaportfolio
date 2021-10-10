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
		    System.out.println(MyQueue2.deque()); // will return a null 
		    System.out.println(MyQueue3.deque()); // wil return a null 
		    
		    // performs enques from queue class
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
		    
		    contact = MyQueue1.deque();
		    System.out.println(contact);
		
		    ////
		    System.out.println(MyStack1.pop());// returns a null also empties it
		    System.out.println(MyStack2.pop());
		    System.out.println(MyStack3.pop());
		    
		    //performs push from Stack class
		    System.out.println(MyStack1.push(contact1));
		    System.out.println(MyStack2.push(contact2));
		    System.out.println(MyStack3.push(contact3));
		    
		    //performs pop function from Stack Class
		    contact = MyStack1.pop();
		    System.out.println(contact.toString());
		    
		    contact = MyStack2.pop();
		    System.out.println(contact.toString());
		    
		    contact = MyStack3.pop();
		    System.out.println(contact.toString());
		    
		    //
		    contact= MyStack1.pop();
		    System.out.println(contact);
		    System.exit(0);
		    
		}

}