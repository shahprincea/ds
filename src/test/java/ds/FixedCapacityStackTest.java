package ds;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import ds.FixedCapacityStack;
import ds.Stack;


public class FixedCapacityStackTest extends TestCase {

	public FixedCapacityStackTest(String name) {
		super(name);
	}
	
	public static Test suite() {
		return new TestSuite(FixedCapacityStackTest.class);
	}
	
	
	public void testFixedCapacityStack() {
		Stack<Integer> stack = new FixedCapacityStack<Integer>(10);
		
		assertTrue(stack.isEmpty());
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		assertTrue(stack.size() == 4);
		
		assertTrue(stack.pop() == 4);
		assertTrue(stack.pop() == 3);
		assertTrue(stack.pop() == 2);
		assertTrue(stack.pop() == 1);
		
		assertTrue(stack.isEmpty());
		
	}
	
	public void testFixedCapacityStackiter() {
		Stack<Integer> stack = new FixedCapacityStack<Integer>(10);
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		for(Integer num : stack) {
		   System.out.println(num);
		}
	}

}
