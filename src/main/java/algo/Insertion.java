package algo;

/**
 * Insertion sort implementation to sort elements 
 * 
 * Algo:
 * Find the smallest element & exchange it with first element
 * Find the second smallest element & exchange it with second element
 * Continue until you reach end of the array
 * 
 * This is inplace sort 
 * It takes quadratic time in worse case 
 * 
 * Note input array is divided into two sub arrays. 
 * First array is sorted and continue to grow while 
 * unsorted array will reduce 
 *  
 * @author Prince
 *
 */
public class Insertion {

	public static void sort(int[] input) {
		
		for(int i=0; i <input.length; i++) {
			
			int minIndex = i;
			
			for(int j= i+1; j < input.length; j++) {
				
				if(input[j] < input[minIndex]) {
					minIndex = j;
				}
			}
			
			if(minIndex != i) {
				int tmp = input[i];
				input[i] = input[minIndex];
				input[minIndex] = tmp;
			}
		}
	}
}
