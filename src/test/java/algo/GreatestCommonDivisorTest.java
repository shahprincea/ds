package algo;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for class GreatestCommonDivisorTest
 * 
 * @author Prince
 *
 */
public class GreatestCommonDivisorTest extends TestCase {

	/**
	 * Create test name for test to be tested
	 * @param test name for the test
	 */
	public GreatestCommonDivisorTest(String testName) {
		super(testName);
	}
	
	 /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( GreatestCommonDivisorTest.class );
    }
    
    public void testPositiveNums() {
    	int gcd = GreatestCommonDivisor.find(10, 5);
    	assertTrue(gcd == 5);
    }
    
    public void testInversePositiveNums() {
    	int gcd = GreatestCommonDivisor.find(5, 10);
    	assertTrue(gcd == 5);
    }
    
    public void testLargeNumbers() {
    	int gcd = GreatestCommonDivisor.find(100000, 4);
    	assertTrue(gcd == 4);
    }
    
    public void testMyNumbers() {
    	int gcd = GreatestCommonDivisor.find(6, 8);
    	assertTrue(gcd == 2);
    }
    
    
    public void testNegative() {
    	int gcd = 0;
    	try {
    		gcd = GreatestCommonDivisor.find(-1, 10);
    	} catch (Exception ex) {
    		System.out.println("OOPss !! " + ex.getLocalizedMessage());
    	} finally {
    		assert(gcd == 0);
    	}
    	
    }
    
}
