
/**
 * Interface for a stack of primitive doubles.
 * 
 *          NOTE: You will need to provide much better descriptive
 *          comments than the ones provided in this interface
 * In order the implement the BKStack in the stacks by cloning 
 */
public interface BKStack {
    
    /**
     * is empty?
     * Withdraws all the inputs from the stack
     */
    public boolean isEmpty();

    /**
     *
     * push
     * Withdraw and gives back the stack's top input
     */
    public void push(double d);

    /**
     * pop
     * Gets the stack's top input.
     * @return the deleted value
     * @throws EmptyStackException if stack is empty
     *             
     */
    public double pop();

    /**
     * peek
     * Find whether there is anything in the stack
     * @throws EmptyStackException f stack is empty
     * 
     */
    public double peek();
}