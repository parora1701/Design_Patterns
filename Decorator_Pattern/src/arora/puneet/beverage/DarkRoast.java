/**
 * 
 */
package arora.puneet.beverage;

/**
 * @author Puneet
 *
 */
public class DarkRoast extends Beverage {

	/**
	 * 
	 */
	public DarkRoast() {
		description = "Dark Roast ";
		cost = 2.99;
	}

	/* (non-Javadoc)
	 * @see arora.puneet.beverage.Beverage#getCost()
	 */
	@Override
	public double getCost() {

		return cost;
	}
}
