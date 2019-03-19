package interest_simple_compund;

import static org.junit.Assert.*;
import org.junit.Test;


public class SimpleInterestandCompoundInterestTest {

	@Test
	public void testSimpleInterest() {
		SimpleInterestandCompoundInterest simpleIntrest;
	   simpleIntrest = new SimpleInterestandCompoundInterest(20202,5, 2.5f);
	 	assertEquals(2525.25, simpleIntrest.calcSimpleIntrest(),0);
	}

	@Test
	public void testCompoundInterest() {
		SimpleInterestandCompoundInterest compoundIntrest;
		compoundIntrest = new SimpleInterestandCompoundInterest(20202, 3,2.5f);
		assertEquals(21755.342888139312, compoundIntrest.calcCompoundIntrest(),0);
		compoundIntrest = new SimpleInterestandCompoundInterest(20202, 5, 2.5f);
		assertEquals(22856.7060585414, compoundIntrest.calcCompoundIntrest(),0);
		
		}

}
