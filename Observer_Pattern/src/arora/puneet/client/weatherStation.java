/**
 * 
 */
package arora.puneet.client;

import arora.puneet.Observer.ForecaseDisplay;
import arora.puneet.Observer.GeneralDisplay;
import arora.puneet.Observer.StatisticDisplay;
import arora.puneet.Subject.WeatherData;

/**
 * @author Puneet
 *
 */
public class weatherStation {

	/**
	 * 
	 */
	public weatherStation() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		WeatherData wD = new WeatherData(12.0f, 25.0f, 18.0f);
		
		StatisticDisplay sD = new StatisticDisplay(wD); 
		ForecaseDisplay fD = new ForecaseDisplay(wD);
		GeneralDisplay gD = new GeneralDisplay(wD);
		
		wD.setMeasurement(15.f, 26.f, 14.f);
		wD.setMeasurement(15.f, 26.f, 20.f);
		wD.setMeasurement(15.f, 26.f, 25.f);
	}

}
