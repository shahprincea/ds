package algo;

import junit.framework.TestCase;

public class SortTest extends TestCase {

	public void testSort() {
		int[] input = {9,7,6,3};
		printArray(input);
		Selection.sort(input);
		printArray(input);
	}

	private void printArray(int[] input) {
		for(int element : input) {
			System.out.print(element+" ");
		}
		System.out.println();
		
	}

}
