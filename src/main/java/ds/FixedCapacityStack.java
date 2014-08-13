package ds;

import java.util.Arrays;
import java.util.Iterator;

/**
 * FixedCapacitystack is a stack which uses Array as data structure. 
 * Since array has fixed length if you try to add more then the size you will get exception. 
 * Client should check for isFull() before adding 
 * @author Prince
 * @param <E>
 *
 */
public class FixedCapacityStack<E> implements Stack<E> {

	private E[] stack;
	private int ptr;
	
	@SuppressWarnings("unchecked")
	public FixedCapacityStack(int size) {
		stack = (E[]) new Object[size];
	}
	
	public Iterator<E> iterator() {
		return new Iterator<E>() {
			
			int ptrCopy = ptr;
			
			public boolean hasNext() {
				
				return ptrCopy > 0;
			}

			public E next() {
				
				return stack[--ptrCopy];
			}
			
		};
		
	}

	public void push(E item) {
		stack[ptr++] = item;
	}

	public E pop() {
		return stack[--ptr];
	}

	public boolean isEmpty() {
		return ptr == 0;
	}

	public int size() {
		return ptr;
	}

}
