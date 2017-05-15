/**
 * 
 */
package arora.puneet.condiments;

import arora.puneet.beverage.Beverage;

/**
 * @author Puneet
 *
 */
public class Mocha extends CondimentDecorator {

	/**
	 * 
	 */
	public Mocha() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param beverage
	 */
	public Mocha(Beverage beverage) {
		super(beverage);
		description = beverage.getDescription() + " + Mocha";
		condimentCost = 0.60;
	}

	/* (non-Javadoc)
	 * @see arora.puneet.condiments.CondimentDecorator#getCost()
	 */
	@Override
	public double getCost() {
		return beverage.getCost() + condimentCost;
	}

}
