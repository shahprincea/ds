package ds;

/**
 * Data stucutre which has Last in First our policy
 * @author Prince
 *
 */
public interface Stack<E> extends Iterable<E> {

	/**
	 * push and element to the stack
	 * @param item
	 */
	public void push(E item);
	
	/**
	 * 
	 * @return pop the elemnt from the stack
	 */
	public E pop();
	
	/**
	 * 
	 * @return true if stack is empty else false
	 */
	public boolean isEmpty();
	
	/**
	 * returns number of elements present in the stack
	 * @return
	 */
	public int size();
}
