/**
 * 
 */
package arora.puneet.condiments;

import arora.puneet.beverage.Beverage;

/**
 * @author Puneet
 *
 */
public class Soy extends CondimentDecorator {

	/**
	 * 
	 */
	public Soy() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param beverage
	 */
	public Soy(Beverage beverage) {
		super(beverage);
		description = beverage.getDescription() + " + Soy";
		condimentCost = 0.70;
	}

	/* (non-Javadoc)
	 * @see arora.puneet.condiments.CondimentDecorator#getCost()
	 */
	@Override
	public double getCost() {
		return beverage.getCost() + condimentCost;
	}

}
