package algo;

import junit.framework.TestCase;

public class SortTest extends TestCase {

	public void testInsertionSort() {
		
		System.out.println("Insertion sort");
		int[] input = {9,7,6,3};
		printArray(input);
		Insertion.sort(input);
		printArray(input);
	}
	
	public void testSelectionSort() {

		System.out.println("Selection sort");
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
