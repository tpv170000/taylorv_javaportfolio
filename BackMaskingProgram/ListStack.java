/**
 *Provides a Linked List implementation of the BackMasking interface 
 * use the length field of an array
 * throw an EmptyStackException if pop() or peek() is called when the stack is empty
 * NAME: TaylorVu
 *NETID: tpv170000
 *CLASS SECTION: CS 3345.006
 */
import java.util.EmptyStackException;
@SuppressWarnings("hiding")
public class ListStack implements BKStack {
private ListStackNode top;
private int length;
public ListStack() {
	top = null;
	length = -1;
}
public void push(BKStack newForm) {
	ListStackNode newListStackListStackNode = new ListStackNode(newForm, top);
	top = newListStackListStackNode;
	length ++;
}
public BKStack pop1() {
	if(top == null) {
		throw new EmptyStackException(); // The stack is empty
	}
	BKStack item = (BKStack) peek1();
	top = top.getNextListStackListStackNode();
	length --;
	return (BKStack) item;	
}
public BKStack peek1() {
	if(top == null) {
		throw new EmptyStackException();
	}
	return top.data;
}
public boolean isEmpty() {
	return (top==null);
}
public void none() {
	length =0;
	top = null;
}
private class ListStackNode{
	private BKStack data; 
	private ListStackNode next;
	private ListStackNode(BKStack dataPart) {
		this(dataPart, null);
	}
	private ListStackNode(BKStack dataPart, ListStackNode linkPart) {
		data = dataPart;
		next = linkPart;
	}
	private BKStack getData() {
		return data;
	}
	private void setData(BKStack newData) {
		data = newData;
	}
	private ListStackNode getNextListStackListStackNode() {
		return next;
	}
	private void setnextListStackNode() {
		next = getNextListStackListStackNode();
	}
}
public void push(double d) {
	// TODO Auto-generated method stub
	
}
public double pop() {
	// TODO Auto-generated method stub
	return 0;
}
public double peek() {
	// TODO Auto-generated method stub
	return 0;
}
}
