/**
 * 
 */
package arora.puneet.condiments;

import arora.puneet.beverage.Beverage;

/**
 * @author Puneet
 *
 */
public class Whip extends CondimentDecorator {

	/**
	 * 
	 */
	public Whip() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param beverage
	 */
	public Whip(Beverage beverage) {
		super(beverage);
		description = beverage.getDescription() + " + Whip";
		condimentCost = 0.30;
	}

	/* (non-Javadoc)
	 * @see arora.puneet.condiments.CondimentDecorator#getCost()
	 */
	@Override
	public double getCost() {
		return beverage.getCost() + condimentCost;
	}

}
