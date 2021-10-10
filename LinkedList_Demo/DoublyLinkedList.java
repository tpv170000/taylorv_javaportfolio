/*
 * implements an expanded version of a doubly linked list class
*in this class insert, delete functions are modified 
 */

/**
 *
 * @author Taylor Vu
 */
public class DoublyLinkedList {
    public class ListNode{ //start of inner class of ListNode
    private Contact data;
    private ListNode next;
    private ListNode back;
        private ListNode() {
         data = null;
         next = null;
         back = null;
        }
  public ListNode(Contact data){
      this.data = data;
      this.next = null;
      this.back = null;
  }
    }//end of inner class ListNode

private ListNode header;
public DoublyLinkedList(){
    header = new ListNode();
    header.data =null;
    header.next= null;
    header.back = null;
    
} //end of the constructor header node 

public boolean insert(Contact newContact){
    ListNode newLink = new ListNode();
    header.next.back = newLink;
    
    if (newLink == null) // out of memory 
    return false;
    else
    {
    newLink.next = header.next;
    header.next= newLink;
    newLink.data= newContact.deepCopy();
    return true;
    }
    } //end of the insert function

public Contact fetch(String targetKey){ 
    ListNode p = header.next;
    header.next.back = p;
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
    if (p.next != null){
        p.next.back = p.back;
    }
    if (p != null){
        q.next = p.next;
        return true;
    }
    else 
        return false;
}// end of the delete method 

public boolean update (String targetKey, Contact newContact)
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
   ListNode p = header.next;
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

