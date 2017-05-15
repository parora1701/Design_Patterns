/**
 * 
 */
package arora.puneet.client;

import arora.puneet.beverage.Beverage;
import arora.puneet.beverage.HouseBlend;
import arora.puneet.condiments.Milk;
import arora.puneet.condiments.Soy;
import arora.puneet.condiments.Whip;

/**
 * @author Puneet
 *
 */
public class StarBuzz {

	/**
	 * 
	 */
	public StarBuzz() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Beverage beverage1 = new HouseBlend();
		beverage1 = new Milk(beverage1);
		beverage1 = new Whip(beverage1);
		beverage1 = new Milk(beverage1);
		
		Beverage beverage2 = new HouseBlend();
		beverage2 = new Soy(beverage2);
		beverage2 = new Whip(beverage2);
		
		System.out.println("\nfirst beverage order: " + beverage1.getDescription());
		System.out.printf("Price: €%.2f", beverage1.getCost());
		
		System.out.println("\nsecond beverage order: " + beverage2.getDescription());
		System.out.printf("Price: €%.2f", beverage2.getCost());

	}

}
