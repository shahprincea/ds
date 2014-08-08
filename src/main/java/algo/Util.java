package algo;

/**
 * 
 * This class contains some utility methods 
 * 
 * @author Prince
 *
 */
public class Util {

	/**
	 * 
	 * @param an arrays as an input to test
	 * @return true if sorted else false
	 */
	public static boolean isSorted(int[] values) {
		
		for(int i = 1; i < values.length; i++) {
			if(values[i-1] > values[i]) {
				return false;
			} 
		}
		return true;
	}
}
