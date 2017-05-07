package arora.puneet.client;

import arora.puneet.algorithm.fly.FlyWithWings;
import arora.puneet.algorithm.quack.QuackOMute;

public class SimUDuck {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.display();
		mallard.swim();
		mallard.performFly();
		mallard.performQuack();
		
		Duck redDuck = new RedHeadDuck();
		redDuck.display();
		redDuck.swim();
		redDuck.performFly();
		redDuck.performQuack();
		redDuck.setFlyingBehavior(new FlyWithWings());
		redDuck.setQuackBehavior(new QuackOMute());
		redDuck.performFly();
		redDuck.performQuack();

	}

}
