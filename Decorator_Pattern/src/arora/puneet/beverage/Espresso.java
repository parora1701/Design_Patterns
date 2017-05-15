/**
 * 
 */
package arora.puneet.beverage;

/**
 * @author Puneet
 *
 */
public class Espresso extends Beverage {
	
	/**
	 * 
	 */
	public Espresso() {
		description = "Espresso ";
		cost = 1.99;
	}

	/* (non-Javadoc)
	 * @see arora.puneet.beverage.Beverage#getCost()
	 */
	@Override
	public double getCost() {

		return cost;
	}

}
