/*
 * This is the class for UnsortedOptimizedArray 
 */

/**
 *
 * @author tpvu0
 */
public class UnsortedOptimizedArray extends Contact{
    //unsorted array class expanded version of Unsorted Optimized Array
    private int next;
    private final int size;
    private final Contact[]data;
    public UnsortedOptimizedArray(){
        next = 0;
        size = 100;
        data = new Contact[size]; 
    }
    //end of Constructor
    //insert method starts 
    //stores teh deep copy of the node
     public boolean insert(Contact newNode){
        if (next >= size)
           return false;
        data [next] = newNode.deepCopy();
        if (data [next] == null)
            return false;
        next = next + 1; 
        return true;
     }
     public boolean delete(String targetKey){
    int i =0;
    while (i < next && ! (data[i].compareTo(targetKey) == 0)){
        i ++;
    }
    if(i == next)
        return false;
    data[i] = data[next -1];
    data[next -1] = null;
    next = next -1;
    return true;
     }
     //fetch method uses sequential search 
     public Contact fetch(Contact newNode){
         Contact node;
         Contact temp;
         int i =0;
         int targetKey = 0;
         while (i < next && !(data[i].compareTo(targetKey)== 0))
         {
             i++;
         }
         if (i ==next)
             return null;
         node = data[i].deepCopy();
         if(i != 0)
         {
         temp = data[i -1];
         data[i -1] = data[i];
         data[i] = temp;
     }
         return node;
         
     }
     public boolean Update(String targetKey, Contact newNode){
         if(delete(targetKey)== false)
             return false;
         else if (insert(newNode)== false)
             return false;
         else 
             return true;
     }

}