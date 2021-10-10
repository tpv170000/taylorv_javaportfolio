public class Queue {
	 // no parameters initializes the fields of the queue
    private Contact[] data;
    private int size;//max number of queues 
    private int numOfNodes;//store number of nodes 
    private int front; //memory cell -  where next dequue operation will be performed 
    private int rear; // memory cell- where next enque operation will be performed
    //creates a queue of a size given by the parameter
    public Queue(int n){
        size = n;
        numOfNodes = 0;
        front =0;
        rear=0;
        data = new Contact[n];
    }
    //inserts the node given by the parameter to queue 
    public boolean enque(Contact newNode){
        if(numOfNodes == size)
            return false;
        else
        {
            numOfNodes = numOfNodes +1;
            data[rear] = newNode.deepCopy();
            rear = (rear + 1) % size;
            return true; // pushes operation successful 
        }  
    }// end of enque method/operation 
    
    //feteches and deletes... a node from teh queue and returns it
    public Contact deque(){
        int frontLocation;
        if(numOfNodes == 0)
            return null;
        else{
            frontLocation = front;
            front = (front + 1) % size;
            numOfNodes = numOfNodes -1;
            return data [frontLocation];
    } 
}// end of deque 
    public void output(){
        System.out.println("The maximum number of nodes is " + size);
        System.out.println("The number of nodes is "+ numOfNodes);
        System.out.println("Front of queue is " + front);
        System.out.println("Rease queue is " + rear);
    }
    public void empty(){
        numOfNodes = 0;
        front =0;
        rear=0;
    }
    public boolean isEmpty(){
           if (size == numOfNodes) // stack is empty
            return true;
        else 
            return false;
    }
    public Contact peek(){
        int frontLocation;
        if(numOfNodes == 0)
            return null;
        else{
            frontLocation = front;
            return data [frontLocation];
    }
    }
    public void Find(){
        int i = front;
        for (int c =1; c <=numOfNodes; c++)
        {
            System.out.println(data[i].toString());
            i= (i+1) % size;
        }
    }// end of find 

}