/**
 * 
 */
package arora.puneet.client;

import arora.puneet.algorithm.fly.FlyNoWay;
import arora.puneet.algorithm.quack.QuackOMute;

/**
 * @author Puneet
 *
 */
public class DuckDecoy extends Duck {

	/**
	 * 
	 */
	public DuckDecoy() {

		flyingBehavior = new FlyNoWay();
		quackBehavior = new QuackOMute();
	}

	/* (non-Javadoc)
	 * @see arora.puneet.client.Duck#display()
	 */
	@Override
	public void display() {

		System.out.println("I look like a duck decoy.");

	}

}
