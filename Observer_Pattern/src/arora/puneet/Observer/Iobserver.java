package arora.puneet.Observer;

import arora.puneet.Subject.WeatherData;

public interface Iobserver {

	public void update(WeatherData weatherData);
	
}
