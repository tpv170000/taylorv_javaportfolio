/*
 * vertex
 */

/**
 *
 * @author Taylor Vu 
 */
    public class Node {
    private int number;
    boolean pushed;
    public Node(int n){
        number = n;
    }
    public int toint(){
    return (number);
}
    public Node deepCopy(){
        Node clone = new Node(number);
        return clone;
    }
    public boolean getPushed(){
        return pushed;
    }
    public void setPushed(boolean value){
        pushed = value;
    }
    public void visit(){
        System.out.println(this);
    }
}