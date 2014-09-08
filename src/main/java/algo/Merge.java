package algo;

/**
 * Sorting algorithm which guarantees o(nlogn) worse case time.
 * 
 * Algo:
 * 1. Divide input array into n partitions. 
 * Here 1 element is the smallest partitions
 * 2. Merge the sublist by comparing the elements.
 * 
 * Note this algorithm needs scratch space equivalent to size 
 * of input array :(
 * 
 * @author Prince
 *
 */
public class Merge {

	private static int[] tmpArray;
	private static int[] inputArray;
	
	public static void sort(int[] input) {
		inputArray = input;
		tmpArray = new int[input.length];
		doMergeSort(0, input.length-1);
	}
	
	private static void doMergeSort(int low, int high) {
		if(low < high) {
			int middle = (low + (high - low)/2);
			
			doMergeSort(low, middle);
			doMergeSort(middle+1, high);
			
			merge(low, middle, high);
		
		}
	}
	private static void merge(int low, int middle, int high) {
		
		//Copy all the values in tmp array
		for(int i=low; i<= high; i++) {
			tmpArray[i] = inputArray[i];
		}
		
		int i= low;
		int j = middle +1;
		int k = low;
		
		while(i <= middle && j <= high) {
			
			if(tmpArray[i] <= tmpArray[j]) {
				inputArray[k] = tmpArray[i];
				i++;
			} else {
				inputArray[k] = tmpArray[j];
				j++;
			}
			k++;
		}
		
		//Copy remaining elements of left to array
		while(i<=middle) {
			inputArray[k] = tmpArray[i];
			k++;
			i++;
		}
		
	}
}
