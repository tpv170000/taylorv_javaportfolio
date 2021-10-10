/*
 *Driver Class to test out the lists with contacts 
 *
 */

/**
 *
 * @author Taylor Vu
 */
public class TaylorVuAssignment4 {
    	 public static void main(String[] args){
             SinglyLinkedList SinglyLinkedList = new SinglyLinkedList();
             DoublyLinkedList DoublyLinkedList = new DoublyLinkedList();
             CircularLinkedList CircularLinkedList = new CircularLinkedList();
		    Contact contact1 = new Contact("Taylor Vu", "E Spring Valley rd", "4694220395", "tpvu@gmail.com");
		    Contact contact2 = new Contact("Yen Co", "Janwood Lane", "4698108985", "yenco123@gmail.com");
		    Contact contact3 = new Contact("Stacy Igwe", "Place One Drive", "2147125054", "Scigwe@gmail.com");
                    
		    		System.out.println("SinglyLinkedList");
		    		System.out.println();
                    //performing the insert function of SinglyLinkedList
                    SinglyLinkedList.insert(contact1);
                    SinglyLinkedList.insert(contact2);
                    SinglyLinkedList.insert(contact3);
                    //performing the OutputBackward function of SinglyLinkedList
                    System.out.println("Output values backwards");
                    SinglyLinkedList.OutputBackward();
                    //performing the fetch function by fetching Stacy Igwe 
                    System.out.println();
                    contact3 = SinglyLinkedList.fetch("Stacy Igwe");
                    System.out.println(contact3.toString());
                    //performing the delete function by deleting of Yen Co 
                    System.out.println();
                    SinglyLinkedList.delete("Yen Co");
                    SinglyLinkedList.OutputBackward();
                    System.out.println(); 
                    //performing update of Stacy to Yen
                    SinglyLinkedList.update("Stacy Igwe", contact2);
                    System.out.println();
                    SinglyLinkedList.OutputBackward();
                    System.out.println("Output values forwards");
                    SinglyLinkedList.insert(contact1);
                    SinglyLinkedList.insert(contact2);
                    SinglyLinkedList.insert(contact3);
                    SinglyLinkedList.OutputForward();
                    
                    System.out.println();
                    System.out.println("DoubleLinkedList");
                    System.out.println();
                    //performing the insert function DoublyLinkedList
                    DoublyLinkedList.insert(contact1);
                    DoublyLinkedList.insert(contact2);
                    DoublyLinkedList.insert(contact3);
                    //performing the OutputBackward function of DoublyLinkedList
                    System.out.println("Output values backwards");
                    DoublyLinkedList.OutputBackward();
                    //performing the fetch function of Yen Co in DoublyLinkedList
                    System.out.println();
                    contact2 = DoublyLinkedList.fetch("Yen Co");
                    System.out.println(contact2.toString());
                    System.out.println();
                    //performing the delete function of Stacy Igwe of DoublyLinkedList
                    DoublyLinkedList.delete("Stacy Igwe");
                    DoublyLinkedList.OutputBackward();
                    System.out.println();
                    //performing the update function of Yen to Stacy of DoublyLinkedList
                    DoublyLinkedList.update("Yen Co", contact3); 
                    System.out.println();
                    DoublyLinkedList.OutputBackward();
                    System.out.println("Output values forwards");
                    DoublyLinkedList.insert(contact1);
                    DoublyLinkedList.insert(contact2);
                    DoublyLinkedList.insert(contact3);
                    DoublyLinkedList.OutputForward();
                    System.out.println();
                    
                    System.out.println("CircularLinkedList");
                    System.out.println();
                    //performing the insert function of SinglyLinkedList
                    CircularLinkedList.insert(contact1);
                    CircularLinkedList.insert(contact2);
                    CircularLinkedList.insert(contact3);
                  //performing the OutputBackward function of SinglyLinkedList
                    System.out.println("Output values backwards");
                    CircularLinkedList.OutputBackward();
                    //performing the fetch function of Taylor Vu in CircularLinkedList
                    contact1 = CircularLinkedList.fetch("Taylor Vu");
                    System.out.println(contact1.toString());
                    System.out.println();
                    //performing the delete function of Yen Co of CircularLinkedList
                    CircularLinkedList.delete("Yen Co");
                    CircularLinkedList.OutputBackward();
                    System.out.println();
                    //performing the update function of Taylor to Yen of CircularLinkedList
                    System.out.println();
                    CircularLinkedList.OutputBackward();
                    System.out.println("Output values forwards");
                    CircularLinkedList.insert(contact1);
                    CircularLinkedList.insert(contact2);
                    CircularLinkedList.insert(contact3);
                    CircularLinkedList.OutputForward();
                    System.out.println();
                    
                    
                   
                    
                    System.exit(0);
                    
         }
}
