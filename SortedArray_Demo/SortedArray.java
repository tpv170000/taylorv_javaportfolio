/*
 *This is the class for Sorted Array
 */

/**
 *
 * @author Taylor Vu 
 */

public class SortedArray extends Contact{
    //implements an expanded version of a sorted array class
    //holds necessary fields 
    private int next;
    private final int size;
    private final Contact[]data;
    int j;
    public SortedArray(){
        next = 0;
        size = 100;
        data = new Contact[size]; 
    }
    public boolean insert(int targetKey, Contact newNode){
         int low = 0;
         int high = next -1;
         int i = (low + high)/2;
         while (!(targetKey < data[i].getKey()) && (targetKey > data[i-1].getKey()))
         {
             if(targetKey < data[i].getKey())
             {
                 high = i -1;
             }
             else 
             {
                 low = i+1;
             }
             i = (high + low)/2;
         }
         for (j = next; j> i; j--){
             data[j] = data [j-1];
         }
         next = next +1;
         data[i] = newNode.deepCopy();
         return true;
    }
     public boolean delete(int targetKey){
     int low = 0;
     int high = next -1;
     int i = (low + high)/2;
     while (targetKey != data[i].getKey() && high != low)
     {
         if (targetKey < data[i].getKey()){
             high = i -1;
         }
         else
         {
             low = i +1;
         }
         i = (low + high) /2;
     }
     for(j = i; j < next -1; j++)
     {
         data[j] = data [j+ 1];
     }
     next = next -1;
     data[next] = null;
     return false;
     }
      public Contact fetch(Contact newNode){
       int low = 0;
       int targetKey = 1;
         int high = next -1;
         int i = (low + high)/2;
        while (targetKey != data[i].getKey())
        {
            if(targetKey < data[i].getKey() && high !=low)
        {
            high= i - 1;
        }
        else
        {
            low = i +1;
        }
        i= (low +high)/2;
            }
        return data[i].deepCopy();
     }
   public boolean Update(int targetKey, Contact newNode){
        return delete(targetKey) != false; 
//else if (insert(newNode)== false)
        //return false;
     }

}
