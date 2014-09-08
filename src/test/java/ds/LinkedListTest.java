package ds;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class LinkedListTest extends TestCase {

	public LinkedListTest(String name) {
		super(name);
	}
	
	public static Test suite() {
		return new TestSuite(LinkedListTest.class);
		
	}
	
	public void testAddLast() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.addLast(1);
		list.addLast(2);
		
		for(Integer in : list) {
			System.out.println(""+in);
		}
	}
	
	public void testAddFirst() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.addFirst(1);
		list.addFirst(2);
		
		for(Integer in : list) {
			System.out.println(""+in);
		}
	}
	
	
}
