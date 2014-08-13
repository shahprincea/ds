package ds;

public interface Bag<E> extends Iterable<E>{

	/**
	 * Add item to the bag
	 * @param item
	 */
	public void add(E item);
	
	/**
	 * @return true if bag has no element else false
	 */
	public boolean isEmpty();
	
	/**
	 * @return number of elements in the bag
	 */
	public int size();
}
