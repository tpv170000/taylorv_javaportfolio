/**
 *Provides an array implementation of BackMasking interface 
 * use length field of an array
 * NAME: TaylorVu
 *NETID: tpv170000
 *CLASS SECTION: CS 3345.006
 *
 */
import java.util.EmptyStackException;
public class ArrayStack implements BKStack{
	private final int DEFAULT_CAPACITY = 100;
	@SuppressWarnings("rawtypes")
	private BKStack[] array;
	private int topStack;
	
	public ArrayStack() {
		topStack =0;
		array = (BKStack[])(new Object[DEFAULT_CAPACITY]);
	}
	
	public ArrayStack (int firstCapacity) {
		topStack = 0;
		array = (BKStack[])(new Object[firstCapacity]);
	}
	
	public boolean isEmpty() {
		return (topStack == 0);
	}
	public int length() {
		return topStack;
	}
	
	private void expandCapacity() {
		BKStack[] expanded = (BKStack[])(new Object[array.length*2]);
		for (int index=0; index < array.length; index++) {
			expanded[index] = array[index];
		array = expanded;
	}
	}
	
	public void push(BKStack arrayElement) {
		if (length() == array.length)
			expandCapacity();
		array[topStack] = arrayElement;	
	}
	
	public BKStack pop1() throws EmptyStackException{
		if(isEmpty())
			throw new EmptyStackException();
		topStack --;
		BKStack result = array[topStack];
		array[topStack] = null;
		return result;
	}
	
	public BKStack peek1() throws EmptyStackException{
		if (isEmpty())
			throw new EmptyStackException();
		return array[topStack-1];
	}
	
	public String toString() {
		String result = "";
		for (int scan=0; scan < topStack; scan++)
			result = result + array[scan].toString() + "\n";
		return result;
	}
	
	
	@Override
	public void push(double d) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public double pop() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double peek() {
		// TODO Auto-generated method stub
		return 0;
	}

}
