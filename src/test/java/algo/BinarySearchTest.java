package algo;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class BinarySearchTest extends TestCase {

	public BinarySearchTest(String name) {
		super(name);
	}
	
	public static Test suite() {
		return new TestSuite(BinarySearchTest.class);
	}
	
	public void testBasicSearch() {
		int[] input = {1,4,6,7,9,10,11};
		int index = BinarySearch.search(6, input);
		assertTrue(index == 2);
		
	}
	
	public void testInValidInput() {
		int[] input = {1,4,16,10,11};
		int index = -1;
		
		try {
			BinarySearch.search(6, input);
		} catch (Exception ex) {
			System.out.println("OOps !!! " + ex.getLocalizedMessage());
		}
		assertTrue(index == -1);
		
	}
}
