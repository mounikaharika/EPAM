package interest_simple_compund;


/**
 * this program is used to calculate simple and compound interest
 * for the given  Principal amount ,Time  and Rate of Interest
 * @author Mounika Reddy
 *
 */
public class SimpleInterestandCompoundInterest {
	float principle;
	float timePeriod;
	float rateOfInterest;
	 
	/**
	 * constructor initializes the instance variables
	 * @param principle
	 * @param timePeriod
	 * @param rateOfInterest
	 */
	public SimpleInterestandCompoundInterest(float principle,float timePeriod,float rateOfInterest )
	{
		this.principle=principle;
		this.timePeriod=timePeriod;
		this.rateOfInterest=rateOfInterest;
	}

	/**
	 * calculate simple interest by using formula simple interest=(p*t*r)/100
	 * p=principle amount
	 * t=timePeriod
	 * r=rateOfInterest
	 * @return simpleInterest(double)
	 */
	public double calcSimpleIntrest() {
		return (principle*timePeriod*rateOfInterest)/100;
	}
	
	/**
	 * calculate compound interest by using formula compound interest=P(1+R/100)^t
	 *  p=principle amount
	 *   t=timePeriod
	 *   r=rateOfInterest
	 * @return compoundInterest(double)
	 */
	public double calcCompoundIntrest() {
		return principle * (Math.pow((1 + rateOfInterest / 100), timePeriod));
		}
}
