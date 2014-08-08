package algo;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class UtilTest extends TestCase {

	/**
	 * Create name for the unit test
	 * @param unit test name
	 */
	public UtilTest(String name) {
		super(name);
	}
	
	public static Test suit() {
		return new TestSuite(UtilTest.class);
	}
	
	public void testSimpleSortedArray() {
		int[] sortedArray = {1,2,3,4,5,6,7,8,9};
		assertTrue(Util.isSorted(sortedArray));
	}
	
	public void testSimpleUnsortedArray() {
		int[] sortedArray = {9,8,7,6,5,4,3,2,1};
		assertFalse(Util.isSorted(sortedArray));
	}
}
