package algo;

/**
 * Sort the element using insertion sort
 * 
 * Algo:
 * Compare each elements all it's right most elements.
 * If they are small perfrom exchange.
 * 
 * Note: 
 * This is inplace sort
 * It is also stable
 * It is very effecient when elements are almost sorted
 * It passes elements only once.
 * 
 * First find the
 * @author Prince
 *
 */
public class Insertion {

	public static void sort(int[] input) {
		
		for(int i = 1; i < input.length ; i++) {
					
					for(int j=i; j>0; j--) {
						if(input[j] < input[j-1]) {
							int tmp = input[j];
							input[j] = input[j-1];
							input[j-1] = tmp;
						}
					}
				}
		
	}
}
