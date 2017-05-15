/**
 * 
 */
package arora.puneet.beverage;

/**
 * @author Puneet
 *
 */
public abstract class Beverage {

	protected String description = "Unknown Beverage";
	protected double cost = 0.0;
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	
	public abstract double getCost(); 
	/**
	 * 
	 */
	public Beverage() {
		// TODO Auto-generated constructor stub
	}
	
	

}
