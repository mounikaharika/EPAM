package estimateCost;

/**
 * 
 * this program is used to estimate cost of house construction
 * depending on material standard,area of house and automation 
 * @author Mounika Reddy
 *
 */
public class CostEstimator {
   int typeOfMaterial;
   double areaOfHouse;
   boolean isAutomated;
	
   /**
    * 
    * @param materialType
    * @param areaOfHouse
    * @param isAutomated
    */
	  CostEstimator(int typeOfMaterial,double areaOfHouse,boolean isAutomated) {
		this.typeOfMaterial=typeOfMaterial;
		this.areaOfHouse=areaOfHouse;
		this.isAutomated=isAutomated;
		}
	  
	  /**
	   * 
	   * @return double cost of house construction
	   */
	  public double findCost() {
			int cost = 0;
			if(typeOfMaterial==0)
				cost = 1200;
			else if(typeOfMaterial==1)
				cost = 1500;
			else if(typeOfMaterial==2 && isAutomated)
				cost = 2500;
			else
				cost = 1800;
			return areaOfHouse*cost;
	}
}
