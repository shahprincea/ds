package ds;

/**
 * 
 * Queue is a data structure which has First In First out policy
 * @author Prince
 *
 */
public interface Queue<E> extends Iterable<E> {

	/**
	 * Add and item to the Queue
	 * @param item
	 */
	public void enqueue(E item);
	
	/**
	 * @return value from the queue
	 */
	public E dequeue();
	
	/**
	 * 
	 * @return true if queue is empty else false
	 */
	public boolean isEmpty();
	
	/**
	 * @return number of items in the queue
	 */
	public int size();
	
}
