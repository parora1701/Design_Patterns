/**
 * 
 */
package arora.puneet.condiments;

import arora.puneet.beverage.Beverage;

/**
 * @author Puneet
 *
 */
public class Milk extends CondimentDecorator {

	/**
	 * 
	 */
	public Milk() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param beverage
	 */
	public Milk(Beverage beverage) {
		super(beverage);
		description = beverage.getDescription() + " + Milk";
		condimentCost = 0.50;
	}

	/* (non-Javadoc)
	 * @see arora.puneet.condiments.CondimentDecorator#getCost()
	 */
	@Override
	public double getCost() {
		return beverage.getCost() + condimentCost;
	}

}
