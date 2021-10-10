/*
* This class implements an expanded version of a singly listing class
 */

/**
 *
 * @author Taylor Vu 
 */
public class SinglyLinkedList {
public class ListNode{ //start of inner class
    private Contact data;
    private ListNode next;
        private ListNode() {
         data = null;
         next = null;
        }
  public ListNode(Contact data){
      this.data = data;
      this.next = null;
  }
    }//end of inner class 
private ListNode header;
public SinglyLinkedList(){
    header = new ListNode();
    header.data =null;
    header.next= null;
} //end of the constructor header node 
    
public boolean insert(Contact newContact){
    ListNode n = new ListNode();
    if (n == null) // out of memory 
    return false;
    else
    {n.next = header.next;
    header.next= n;
    n.data= newContact.deepCopy();
    return true;
    }
} // end of insert method

public Contact fetch(String targetKey){ //fetch the contact 
    ListNode p = header.next;
    while(p != null && !(p.data.compareTo(targetKey) == 0))
    {
       p = p.next;
    }
    if(p != null)
    {
        return p.data.deepCopy();
    }
        else
        return null;
    } // end of the fetch method

public boolean delete(String targetKey){ //delete a contact 
    ListNode q = header;
    ListNode p = header.next;
    while (p != null && !(p.data.compareTo(targetKey) == 0))
    {
      q = p;
      p = p.next;
    }
    if (p != null){
        q.next = p.next;
        return true;
    }
    else 
        return false;
}// end of the delete method 

public boolean update (String targetKey, Contact newContact)// update contact with new contact
{
    if(delete(targetKey) == false)
        return false;
    else if(insert(newContact) == false)
        return false;
    return true;
} // end of the update method

public void OutputBackward(){ // output all the values from the list in backwards order
    ListNode p = header.next;
    while (p != null)
    {
        System.out.println(p.data.toString());
        p = p.next;
    }
} //end of teh OutputForward function 
public void OutputForward(){ //output all the values from the list in forward order 
   ListNode p = header.next.next;
   ListNode prev = null;
   ListNode current = p;
   ListNode next = null;
   while (current!= null){
       next = current.next;
       current.next = prev;
       prev = current;
       current = next;
   }
   p = prev;
while (p != null)
    {
        System.out.println(p.data.toString());
        p = p.next;
    }
}// end of the OutputBackward
}

