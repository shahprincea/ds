package ds;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class ResizingArrayStackTest extends TestCase {

	public ResizingArrayStackTest(String name) {
		super(name);
	}
	
	public static Test suite() {
		return new TestSuite(ResizingArrayStackTest.class);
	}
	
	
	public void testFixedCapacityStack() {
		Stack<Integer> stack = new ResizingArrayStack<Integer>();
		
		assertTrue(stack.isEmpty());
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		stack.push(8);
		stack.push(9);
		stack.push(10);
		stack.push(11);
		stack.push(12);
		
		assertTrue(stack.size() == 12);
		
		assertTrue(stack.pop() == 12);
		assertTrue(stack.pop() == 11);
		assertTrue(stack.pop() == 10);
		assertTrue(stack.pop() == 9);
		assertTrue(stack.pop() == 8);
		assertTrue(stack.pop() == 7);
		assertTrue(stack.pop() == 6);
		assertTrue(stack.pop() == 5);
		assertTrue(stack.pop() == 4);
		assertTrue(stack.pop() == 3);
		assertTrue(stack.pop() == 2);
		assertTrue(stack.pop() == 1);
		
		assertTrue(stack.isEmpty());
		
	}
}
