public class Contact {
	private String name; 
    private String address;
    private String number;
    private String email;
 
    //creates contact with 4 values received as parameters;
    public Contact(String n, String a, String num, String e){
        this.name = n;
        this.address = a;
        this.number = num;
        this.email = e;
    }
    
    public String toString(){
        return ("Name is " + name + "\n Address is " + 
                address + "\n Number is "+ number + "\n Email is " + email + "\n");
    }
    //creates and returns a deep copy of contact
    public Contact deepCopy(){
        Contact clone = new Contact(name, address, number, email);
        return clone; 
    }
    //compares 2 contacts and returns true if there are equal same name if not false
     public int compareTo(String targetKey)
    {
        return(name.compareTo(targetKey));
    }

        public void setName(String input){
        this.name = input;
    }
    public String getName(){
        return name;
    }
    public void setAddress(String input){
        this.address = input;
    }
    public String getAddress(){
        return address;
    }

    public void setNumpber(String input){
        this.number = input;
    }
    public String getPhoneNumber(){
        return number;
    }

    public void setEmailAddress(String input){
        this.email = input;
    }
    public String getEmail(){
        return email;
    }
    public void output()
    {
        System.out.println("Name" + name);
        System.out.println("Address"+ address);
        System.out.println("Phone Number" + number);
        System.out.println("Email" + email);
                
    }

}
