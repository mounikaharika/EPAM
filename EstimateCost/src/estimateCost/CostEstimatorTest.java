package estimateCost;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * @author Mounika Reddy
 *
 */
public class CostEstimatorTest {
	
	@Test
	public void testCostEstimator() {
		CostEstimator costEstimator;
		costEstimator = new CostEstimator(0, 28, false);
		assertEquals(33600.0, costEstimator.findCost(),0);
		costEstimator = new CostEstimator(2, 2, true);
		assertEquals(5000, costEstimator.findCost(),0);
		
	}


}
