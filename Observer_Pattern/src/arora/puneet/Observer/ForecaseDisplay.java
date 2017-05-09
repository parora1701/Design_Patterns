/**
 * 
 */
package arora.puneet.Observer;

import arora.puneet.Subject.WeatherData;
import arora.puneet.display.Idisplay;

/**
 * @author Puneet
 *
 */
public class ForecaseDisplay implements Idisplay, Iobserver {

	private float temprature;
	private float pressure;
	private float humidity;
	private WeatherData weatherData;
	/**
	 * 
	 */
	public ForecaseDisplay() {
		// TODO Auto-generated constructor stub
	}
	
	public ForecaseDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}

	/* (non-Javadoc)
	 * @see arora.puneet.Observer.Iobserver#update()
	 */
	@Override
	public void update(WeatherData weatherData) {
		temprature = weatherData.getTemprature();
		pressure = weatherData.getPressure();
		humidity = weatherData.getHumidity();
		display();

	}

	/* (non-Javadoc)
	 * @see arora.puneet.display.Idisplay#display()
	 */
	@Override
	public void display() {
		System.out.println("Forecase Display temprature is: " + this.getTemprature() + " degree celcius.");

	}

	/**
	 * @return the temprature
	 */
	public float getTemprature() {
		return temprature;
	}

	/**
	 * @param temprature the temprature to set
	 */
	public void setTemprature(float temprature) {
		this.temprature = temprature;
	}

	/**
	 * @return the pressure
	 */
	public float getPressure() {
		return pressure;
	}

	/**
	 * @param pressure the pressure to set
	 */
	public void setPressure(float pressure) {
		this.pressure = pressure;
	}

	/**
	 * @return the humidity
	 */
	public float getHumidity() {
		return humidity;
	}

	/**
	 * @param humidity the humidity to set
	 */
	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}

}
