package ds;

import java.util.Iterator;

/**
 * ResizingArrayStack it is a stack implementaion which  autocontrol size of stack
 * It expands by doubling the size and contracts by reducing the size by half.
 * This is Not Multi Thread safe
 * @author Prince
 *
 * @param <E>
 */
public class ResizingArrayStack<E> implements Stack<E> {

	private E[] stack; 
	private final int DEFAULT = 8;
	private final int THRESHOLD = 2; 
	private int ptr;
	
	public ResizingArrayStack() {
		stack = (E[]) new Object[DEFAULT]; 
	}
	
	public Iterator<E> iterator() {
		
		return new Iterator<E>() {
			
			int copyPtr = ptr;
			
			public boolean hasNext() {
				return false;
			}

			public E next() {
				return stack[--copyPtr];
			}
			
		};
	}

	public void push(E item) {
		stack = checkSize(stack);
		stack[ptr++] = item;
	}

	public E pop() {
		stack = checkSize(stack);
		return stack[--ptr];
	}

	public boolean isEmpty() {
		return ptr == 0;
	}

	public int size() {
		return ptr;
	}

	private E[] checkSize(E[] stack) {
		if(this.size() > (DEFAULT/THRESHOLD) ) {
			//Expand by doubling
			E[] newStack = (E[]) new Object[stack.length * THRESHOLD];
			for(int i =0; i < stack.length; i++) {
				newStack[i] = stack[i];
			}
			return newStack;
		} else if(this.size() < (DEFAULT/(THRESHOLD * THRESHOLD))) {
			//Contract contact by half
			E[] newStack = (E[]) new Object[DEFAULT/THRESHOLD];
			for(int i =0; i < newStack.length ; i++) {
				newStack[i] = stack[i];
			}
		} 
		
		return stack;
		
	}
}
