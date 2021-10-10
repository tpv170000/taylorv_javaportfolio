/*
 *driver class for the hashing classes
 */

/**
 *
 * @author Taylor Vu
 */
public class TaylorVuAssignment5 {
    public static void main(String[] args)
    {
       DirectHashed DirectHashed = new DirectHashed();
       LQHashed LQHashed = new LQHashed(100);
       Contact contact1 = new Contact("Taylor Vu", "E Spring Valley rd", "4694220395", "tpvu@gmail.com");
       Contact contact2 = new Contact("Yen Co", "Janwood Lane", "4698108985", "yenco123@gmail.com");
       Contact contact3 = new Contact("Stacy Igwe", "Place One Drive", "2147125054", "Scigwe@gmail.com");
        
       System.out.println("LQ Hashed ");
       //performing the insert function of LQ Hashed
       LQHashed.insert(contact1);
       LQHashed.insert(contact2);
       LQHashed.insert(contact3);
       //performing the fetch function of LQ Hashed
       LQHashed.fetch("Taylor Vu");
       LQHashed.fetch("Yen Co");
       LQHashed.output();
       //update Taylor's address to Yen 
       LQHashed.update("Taylor Vu", contact2);
       //delete Yen Co
       //performing the delete function by deleting of Yen Co 
       System.out.println();
       LQHashed.delete("Yen Co");
       System.out.println(); 
       //output all the values
       LQHashed.output();
       
       System.out.println("Direct Hashed ");
       //performing the insert function of Direct Hashed
       DirectHashed.insert(contact1);
       DirectHashed.insert(contact2);
       DirectHashed.insert(contact3);
       //performing the fetch function of LQ Hashed
       DirectHashed.fetch("Taylor Vu");
       DirectHashed.fetch("Yen Co");
       DirectHashed.output();
       //update Taylor's address to Yen 
       DirectHashed.update("Taylor Vu", contact2);
       //delete Yen Co
       //performing the delete function by deleting of Taylor Vu
       System.out.println();
       LQHashed.delete("Taylor Vu");
       System.out.println(); 
       //output all the values
       LQHashed.output();
    }
    
}
