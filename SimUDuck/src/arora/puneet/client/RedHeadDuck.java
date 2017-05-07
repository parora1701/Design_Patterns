/**
 * 
 */
package arora.puneet.client;

import arora.puneet.algorithm.fly.FlyNoWay;
import arora.puneet.algorithm.quack.QuackWithSound;

/**
 * @author Puneet
 *
 */
public class RedHeadDuck extends Duck {

	public RedHeadDuck() {
	
		flyingBehavior = new FlyNoWay();
		quackBehavior = new QuackWithSound();
	}
	/* (non-Javadoc)
	 * @see arora.puneet.client.Duck#display()
	 */
	@Override
	public void display() {

		System.out.println("I look like redhead duck!!");

	}

}
