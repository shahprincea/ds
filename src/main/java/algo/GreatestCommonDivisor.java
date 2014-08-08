package algo;

/**
 * 
 * @author Prince
 * 
 * Recursive Algo : 
 * 
 *	GCD of two non-negative elements p & q is caluclated as follows : 
 * 1. if q == 0 then GCD is p 
 * 2. store modulous of p and q as r and find gcd of q and r i.e r = p%q and find GCD(q,r)
 */
public class GreatestCommonDivisor {

	public static int find(int p, int q) {
		
		//Pre Condition check
		if(p <0 || q <0) {
			throw new IllegalArgumentException("GCD input should be positive");
		}
		
		if(q==0) {
			return p;
		} else {
			int r = p%q;
			return find(q,r);
		}
	}
}