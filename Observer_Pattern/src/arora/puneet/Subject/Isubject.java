package arora.puneet.Subject;
import arora.puneet.Observer.*;

public interface Isubject {

	void registerObserver(Iobserver o);
	void removeObserver(Iobserver o);
	void notifyObserver();
}
