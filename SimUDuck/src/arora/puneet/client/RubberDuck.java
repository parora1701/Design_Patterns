/**
 * 
 */
package arora.puneet.client;

import arora.puneet.algorithm.fly.FlyNoWay;
import arora.puneet.algorithm.quack.SqueakyQuack;

/**
 * @author Puneet
 *
 */
public class RubberDuck extends Duck {

	/**
	 * 
	 */
	public RubberDuck() {
		flyingBehavior = new FlyNoWay();
		quackBehavior = new SqueakyQuack();
	}

	/* (non-Javadoc)
	 * @see arora.puneet.client.Duck#display()
	 */
	@Override
	public void display() {
		System.out.println("I am a rubber duck.");

	}

}
