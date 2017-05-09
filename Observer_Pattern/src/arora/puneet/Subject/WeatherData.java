/**
 * 
 */
package arora.puneet.Subject;

import java.util.ArrayList;
import java.util.Iterator;

import arora.puneet.Observer.Iobserver;

/**
 * @author Puneet
 *
 */
public class WeatherData implements Isubject {

	public WeatherData(float temp, float pressure, float humidity){
		this.pressure = pressure;
		this.temprature = temp;
		this.humidity = humidity;
		observerList = new ArrayList<Iobserver>();
	}
	
	float pressure;
	float humidity;
	float temprature;
		
	ArrayList<Iobserver> observerList;
	
	/**
	 * @param temprature the temprature to set
	 */
	private void setTemprature(float temprature) {
		this.temprature = temprature;
	}

	/**
	 * @param pressure the pressure to set
	 */
	private void setPressure(float pressure) {
		this.pressure = pressure;
	}

	/**
	 * @param humidity the humidity to set
	 */
	private void setHumidity(float humidity) {
		this.humidity = humidity;
	}
	
	/**
	 * @return the pressure
	 */
	public float getPressure() {
		return pressure;
	}

	/**
	 * @return the humidity
	 */
	public float getHumidity() {
		return humidity;
	}

	/**
	 * @return the temprature
	 */
	public float getTemprature() {
		return temprature;
	}
	
	/* (non-Javadoc)
	 * @see arora.puneet.Subject.Subject#registerObserver(arora.puneet.Observer.Observer)
	 */
	@Override
	public void registerObserver(Iobserver o) {
		observerList.add(o);

	}

	/* (non-Javadoc)
	 * @see arora.puneet.Subject.Subject#removeObserver(arora.puneet.Observer.Observer)
	 */
	@Override
	public void removeObserver(Iobserver o) {
		observerList.remove(o);

	}

	/* (non-Javadoc)
	 * @see arora.puneet.Subject.Subject#notifyObserver()
	 */
	@Override
	public void notifyObserver() {
		for (Iterator<Iobserver> iterator = observerList.iterator(); iterator.hasNext();) {
			Iobserver observer = (Iobserver) iterator.next();
			observer.update(this);
		}
	}
	
	private void measurementChanged(){
		notifyObserver();
	}
	
	public void setMeasurement(float humidity, float pressure, float temprature){
		setHumidity(humidity);
		setPressure(pressure);
		setTemprature(temprature);
		measurementChanged();
	}

}
