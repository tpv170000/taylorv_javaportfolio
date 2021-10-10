/*
 *Contacy class that implement a contact listing class that follows the fieds from assignmemnt
 */

/**
 *
 * @author Taylor Vu 
 */
public class Contact {
    private String name; 
    private String address;
    private String number;
    private String email;
    private int key;
    
    public Contact(String n, String a, String num, String e){
        this.name = n;
        this.address = a;
        this.number = num;
        key = Integer.parseInt(n);
        this.email = e;
    }
    @Override
    public String toString(){
        return ("Name is " + name + "\nAddress is " + address + "\nNumber is "+ number + "n/");
    }
    public Contact deepCopy(){
        Contact clone = new Contact(name, address, number, email);
        return clone; 
    }
    public int compareTo(String targetKey)
    {
        return(name.compareTo(targetKey));
    }
    public void output()
    {
        System.out.println("Name" + name);
        System.out.println("Address"+ address);
        System.out.println("Phone Number" + number);
        System.out.println("Email" + email);
                
    }
    public void Input(String n, String a, String num, String e)
    {
        name = n; 
        address = a; 
        number = num;
        email = e;
        
        
    }
    
    public int getKey(){
        return key;
    }
    }
ta[i];
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