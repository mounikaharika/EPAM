package calculate;

/**
 * This program is used to find 
 * addition , multiplication and division
 * of any two integer numbers
 * @author Mounika Reddy
 *
 */

public class Calculator {
	
	/**
	 * 
	 * @param integer1
	 * @param integer2
	 * @return
	 */
	public int addition(int integer1,int integer2)
	{
		return integer1+integer2;
	}
	
	/**
	 * 
	 * @param multiplicand
	 * @param multiplier
	 * @return
	 */
	public int multiplication(int multiplicand,int multiplier)
	{
		return multiplicand*multiplier;
	}
	
	/**
	 * 
	 * @param dividend
	 * @param divisor
	 * @return
	 */
	public double division(int dividend    ,int divisor  )
	{
		if(divisor==0)
			throw new ArithmeticException("Cannot divide by zero");
		else
             return dividend/(double)divisor;
		
	}
}