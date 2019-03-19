package calculate;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAddition() {
 Calculator c=new Calculator();
 assertEquals(0,c.addition(0, 0));
 assertEquals(3,c.addition(1, 2));
 assertEquals(1,c.addition(-1, 2));
 assertEquals(-1,c.addition(1, -2));
 assertEquals(-3,c.addition(-1, -2));


	}

	@Test
	public void testMultiplication()
	{
		Calculator c=new Calculator();
		assertEquals(0,c.multiplication(0, 1));
		assertEquals(8,c.multiplication(8, 1));
		assertEquals(-16,c.multiplication(8, -2));
		assertEquals(-16,c.multiplication(-8, 2));
		assertEquals(16,c.multiplication(-8, -2));

	}
	

	@Test

	public void testDivision() {
		Calculator c=new Calculator();
		assertEquals(-1.5, c.division(3,-2),0);
		assertEquals(-1.5, c.division(-3,2),0);
		assertEquals(1.5, c.division(-3,-2),0);
	}

}
