package ds;

import java.util.Iterator;

public class LinkedList<E> implements Iterable<E>{

	private Node head;
	
	public LinkedList() {
		
	}
	
	
	
	public class Node {
		private E value;
		private Node next;
		
		public Node(E value) {
		
			this.value = value;
			next = null;
		}
		
		public E value() {
			return value;
		}
	}	
	
	public boolean isEmpty( ) {
		return (head == null);
	}
	
	public void addLast(E value) {
		Node n = new Node(value);
		Node ptr = head;
		if(ptr == null) {
			head = n;
		} else {
			
			while(ptr.next != null) {
				ptr = ptr.next.next;
			}
			
			ptr.next = n;
		}
	}
	
	public void addFirst(E value) {
		Node n = new Node(value);
		Node ptr = head;
		if(ptr == null) {
			head = n;
		} else {
			head = n;
			head.next = ptr;
		}
	}
	
	public boolean delete(E value) {
		boolean success = false;
		return success;
	}

	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return new Iterator<E>() {

			Node ptr = head;
			public boolean hasNext() {
				return ptr != null;
			}

			public E next() {
				E value = ptr.value();
				ptr = ptr.next;
				return value;
			}
			
		};
	}

	
	
}
