/**
 * 
 */
package arora.puneet.client;

import arora.puneet.algorithm.fly.IflyingBehavior;
import arora.puneet.algorithm.quack.IQuackBehaviour;

/**
 * @author Puneet
 *
 */
public abstract class Duck {

	protected IflyingBehavior flyingBehavior;
	protected IQuackBehaviour quackBehavior;
	
	 public abstract void display();
	 
	 public void swim(){
		 System.out.println("I am a duck, I can swim!!!");
	 }
	 public void performQuack(){
		 quackBehavior.quack();
	 }
	 
	 public void performFly(){
		 flyingBehavior.fly();
	 }
	 
	 public void setFlyingBehavior(IflyingBehavior fly){
		 this.flyingBehavior=fly;
	 }
	 
	 public void setQuackBehavior(IQuackBehaviour quack){
		 this.quackBehavior=quack;
	 } 
	
}
