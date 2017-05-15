/**
 * 
 */
package arora.puneet.beverage;

/**
 * @author Puneet
 *
 */
public class HouseBlend extends Beverage {

	/**
	 * 
	 */
	public HouseBlend() {
		description = "House Blend ";
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
