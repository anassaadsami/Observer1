package ObserverIntro.copy;

import java.util.ArrayList;
import java.util.List;

public class PostOffice implements Subject{
	List<ObserverInterface> observers= new ArrayList<>();   // must initialise the Array
	String letter;
	@Override
	public void add(ObserverInterface obj) {
		observers.add(obj);
		
	}
	@Override
	public void remove(ObserverInterface obj) {
		observers.remove(obj);
	}
	
	@Override
	public void updateAll(){
		for (ObserverInterface obs : observers) {
			obs.update();    // this method is a Observer's method 
		}
	}
	/*
	 *  every time we upload a video so we notify all our subscriber
	 *  by notifyAll();
	 */
	void upload(String letter) {
		this.letter = letter;
		this.updateAll();
	}
}
