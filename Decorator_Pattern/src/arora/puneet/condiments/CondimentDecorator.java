/**
 * 
 */
package arora.puneet.condiments;

import arora.puneet.beverage.Beverage;

/**
 * @author Puneet
 *
 */
public abstract class CondimentDecorator extends Beverage {

	Beverage beverage;
	double condimentCost;
	/**
	 * 
	 */
	public CondimentDecorator() {
		// TODO Auto-generated constructor stub
	}
	
	public CondimentDecorator(Beverage beverage) {
		this.beverage = beverage;
	}

	/* (non-Javadoc)
	 * @see arora.puneet.beverage.Beverage#getCost()
	 */
	@Override
	public abstract double getCost() ;

}
