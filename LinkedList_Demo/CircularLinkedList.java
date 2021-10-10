/*
*implements an expanded version of a circuly singly lined list 
*with an iterator class
 */

/**
 *
 * @author Taylor Vu
 */
public class CircularLinkedList {
public class ListNode{ //start of inner class of linked list node
    private Contact data;
    private ListNode next;
        private ListNode() {
         data = null;
         next = null;
        }
  public ListNode(Contact data){
      this.data = data;
      this.next = null;
  }//end of inner class for ListNode (expanded version of linked list node
}
private ListNode header;
public CircularLinkedList(){
    header = new ListNode();
    header.data =null;
    header.next= null;
} //end of the constructor header node 

public class ListIterator{ // start of interator inner class
    private ListNode iteratorNode;
    public ListIterator(){ 
        iteratorNode = header; //header node of circular
    }
    public void set(Contact newContact){ //creates deep copy of contact and places in IteratorNode contact
       iteratorNode.data = newContact.deepCopy();
    }
    
    public void reset(){ //resets iteratorNode to list header
        iteratorNode = header;
    }
    
    public Contact next(){//return the contact from next node
        iteratorNode = iteratorNode.next;
        return iteratorNode.data.deepCopy();
    }
}//end of the ListIterator inner class
public boolean insert(Contact newContact){ //insert a new contact
    ListNode n = new ListNode();
    if (n == null) // out of memory 
    return false;
    else
    {n.next = header.next;
    header.next= n;
    n.data= newContact.deepCopy();
    return true;
    }
}//end of insert function
    
public Contact fetch(String targetKey){ //fetch the contact 
    ListNode p = header.next;
    while(p != null && !(p.data.compareTo(targetKey) == 0))
    {
       p = p.next;
    }
    if(p != header)
    {
        return p.data.deepCopy();
    }
        else
        return null;
    } // end of the fetch method

public boolean delete(String targetKey){ //delete a contact from list
    ListNode q = header;
    ListNode p = header.next;
    while (p != null && !(p.data.compareTo(targetKey) == 0))
    {
      q = p;
      p = p.next;
    }
    if (p != header){
        q.next = p.next;
        return true;
    }
    else 
        return false;
}// end of the delete method 
public boolean update (String targetKey, Contact newContact) //update contact with new contact
{
    if(delete(targetKey) == false)
        return false;
    else if(insert(newContact) == false)
        return false;
    return true;
} // end of the update method

public void OutputBackwards(){ // output all the values from the list in backwards order 
    ListNode p = header.next;
    while (p != null)
    {
        System.out.println(p.data.toString());
        p = p.next;
    }
} //end of teh OutputForward function 
public void OutputBackward(ListNode p){ //output all the values from the list in forwards order
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
