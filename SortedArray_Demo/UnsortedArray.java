/*
 *This is the Class for Unsorted Array
 * @author Taylor Vu
 */
public class UnsortedArray extends Contact{ 
//implements an expanded version of an unsorted array class
//holds fields 
    private int next;
    private final int size;
    private final Contact[]data;
    int j;
    //intialized fields with empty/ default calues 
   public UnsortedArray(){
        next = 0;
        size = 100;
        data = new Contact[size]; 
    }
   //inserts a contact in the array 
    public boolean insert(Contact newNode){
         data[next]=newNode.deepCopy();
         return true;
    }
    //deletes a contact from the array
     public boolean delete(int targetKey){
    int i=0;
    while(targetKey != data[i].getKey())
    {
        i++;
    }
    for (j=i; j> next -1; j++)
    {
        data[j] = data[j +1];
    }
    next = next -1;
    data[next] =null;
    return false;
    }
     //fetches contact from teh array 
    public Contact fetch(int targetKey){
       int i= 0;
       while (targetKey != data[i].getKey())
       {
           i++;
                   }
       return data[i].deepCopy();
         
      }
    //updates array in the array 
     public boolean Update(int targetKey, Contact newNode){
         if(delete(targetKey)== false)
             return false;
         else if (insert(newNode)== false)
             return false;
         else 
             return true;
     }
     public int getSize(){
        return size;
    }
    }