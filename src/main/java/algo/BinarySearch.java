package algo;

/**
 * 
 * Implementation of search for sorted arrays using Binary Search.
 * 
 * @author Prince
 *
 */
public class BinarySearch {

	/**
	 * 
	 * @param key we are searching for
	 * @param input is the array of sorted elements 
	 * 
	 * Big O is log(n)
	 * 
	 * @return index/position of the value we are looking for
	 * if not match is found it will return -1 
	 */
	public static int search(int key, int[] input) {
		
		if(Util.isSorted(input)) {
		
			int low = 0;
			int high = input.length-1;
			
			while(low <= high) {
				
				int mid = low + (high - low)/2;
				if(key < input[mid]) {
					high = mid - 1;
				} else if(key > input[mid]) {
					low = mid + 1;
				} else {
					return mid;
				}
			}
		}
		return -1;
	}
}
