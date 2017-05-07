package arora.puneet.client;

import arora.puneet.algorithm.fly.FlyWithWings;
import arora.puneet.algorithm.quack.QuackWithSound;

public class MallardDuck extends Duck {

	public MallardDuck() {

		flyingBehavior = new FlyWithWings();
		quackBehavior = new QuackWithSound();
	}
	@Override
	public void display() {

		System.out.println("I look like Mallard duck.");

	}

}
