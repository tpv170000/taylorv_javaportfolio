/*
 *implements an LQHashed data structure 
*Linear Quotient Data Structure 
*keys will be assumed tobe strings of any length
*/

/**
 *
 * @author Taylor Vu 
 */
public class LQHashed {
    int N; // field for the size of prmary storage array
    Contact deleted;//the dummy node, v2 (v1 = null)
    int size = 0;//the number of nodes in the structures
    int defaultQuotient = 9967; //the default 4k+3 prime (9967)
    double loadingFactor = 0.75;//loading factor (default .75)
    private Contact[] data;// for primary storage area array of contacts
    
    public LQHashed(int length) //a constructor that initalized the fields and use the parameter as a the length for the 4k+3 algorithm
    {
        int pct = (int)((1.0/ loadingFactor)*100.0);
        N = fourKPlus3(length, pct);
        data = new Contact[N];
        deleted = new Contact(" ", " ", " "," ");
        for(int i = 0; i < N; i++)
            data[i] = null;  
    }// end of LQHashed
    
    public boolean insert(Contact newContact)//inserts a new contact into structure
    {
        boolean noError;
        boolean hit = false;
        int pass, q, offset, ip;
        int pk = stringToInt(newContact.getKey());//preprocess the key
        if((((double)size)/N) < loadingFactor) //insert the node
        {
            pass = 0;
            q = pk / N;
            offset = q;
            ip = pk % N;
            if(q % N == 0)
                offset = defaultQuotient;
            while(pass < N)
            {
                if(data[ip] == null || data[ip] == deleted)
                {
                    hit = true;
                    break;
                }
                ip = (ip + offset) % N;
                pass = pass + 1;
            }// end of the while loop
           if(hit == true) // insert the node
           {
               data[ip] = newContact.deepCopy();
               size++;
               return noError = true;
           }
           else
               return noError = false;
        }
        else // structure full to loading factor, insert no perfomed 
            return noError = false;
    } // end of the insert method
    
    public Contact fetch(String targetKey)//fetches a contact into the structure
    {
        boolean noError;
        boolean hit = false;
        int pass, q, offset, ip;
        int pk = stringToInt(targetKey);
        pass = 0;
        q = pk / N;
        offset = q; 
        ip = pk % N;
        if (q % N == 0)
            offset = defaultQuotient;
        while(pass < N)
        {
           if(data[ip] == null) //node not in structure
            break;    
        if(data[ip].compareTo(targetKey) == 0) //node found
        {
            hit = true;
            break;
        }
    ip = (ip + offset) % N; // collision occurred
    pass = pass + 1;
        }// end of the while loop
        if(hit == true) // return a deepcopy of the node
            return data[ip].deepCopy();
        else 
            return null;
    }// end of the fetch method
    
    public boolean delete(String targetKey)//deletes a contact from structure
    {
        boolean noError;
        boolean hit = false;
        int pass, q, offset, ip;
        int pk = stringToInt(targetKey); // preprocess the key
        pass = 0;
        q = pk / N;
        offset = q;
        ip = pk % N;
        if(q % N == 0)
            offset = defaultQuotient;
        while(pass < N)
        {
            if(data[ip] == null) // node is not in the structure
            break;
            if(data[ip].compareTo(targetKey)== 0){
                hit = true;
                break;
            }
            ip = (ip + offset) % N;// collison occurred
            pass = pass + 1;
        }
        if(hit == true) //delete node
        {
            data[ip] = deleted;
            size--;
            return noError = true;
        }
        else 
            return noError = true;
    }// end of the delete method
    
    public boolean update(String targetKey, Contact newContact)//updates a contact from structure with a new contact
    {
        if(delete(targetKey) == false)
        return false;
        else if(insert(newContact) == false)
            return false;
        return true;
    }// end of the update method
    
    public void output()
    {
        for(int i = 0; i < N; i++)
            if(data[i] != null && data[i] != deleted)
                System.out.println(data[i].toString());
    }// end of the output method
    
    public static int fourKPlus3(int n, int pct) //algorithm 4k+3
    {
        boolean fkp3 = false;
        boolean aPrime = false;
        int prime, highDivisor, d;
        double pctd = pct;
        prime = (int)(n * (1.0 + (pctd / 100.0))); //guess the prime pct
        //percent larger than n 
        if(prime % 2 == 0) // if even make the prime guess odd
            prime = prime + 1;
           while(fkp3 == false) // not a 4k + 3
           {while (aPrime == false)//not a prime
           {highDivisor = (int)(Math.sqrt(prime) + 0.5);
           for(d = highDivisor; d > 1; d--)
           {if(prime % d == 0)
               break;
           }
           if(d != 1)//prime not found
               prime = prime + 2;
                else
                    aPrime = true;
           } // end of the prime search loop
           if((prime - 3) % 4 == 0)
               fkp3 = true;
           else
           { prime = prime + 2;
             aPrime = false;
           }
               }// end of the prime search loop
           return prime;
    }// end of the fourKPlus method
    
    public static int stringToInt(String aKey)
    {
        int pseudoKey = 0;
        int n = 1;
        int cn = 0;
        char c[] = aKey.toCharArray();
        int grouping = 0;
        while(cn < aKey.length()) // still more characters in the key
        {
            grouping = grouping << 8; // pack next 4 characters
            grouping = grouping + c[cn];
            cn = cn + 1;
            if(n==4 || cn == aKey.length())//4 characters are processed
                //or no more characters
            {
                pseudoKey = pseudoKey + grouping;// add grouping to pseudo key
                n = 0;
                grouping = 0;
            }
            n = n + 1;
        }// end of the while loop
        return Math.abs(pseudoKey);
    }// end stringToInt method 
}// end class LqHashed
