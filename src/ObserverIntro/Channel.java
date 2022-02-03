package ObserverIntro;

import java.util.ArrayList;
import java.util.List;

 class Channel {
	 /*
	  *  we have many subscriber (Observers) so we need to collect them 
	  *  in Array so we can add or remove members
	  */
	List<Observer> observers= new ArrayList<>();   // must initialise the Array
	String title;
	
	void add(Observer obj) {
		observers.add(obj);
		
	}
	void remove(Observer obj) {
		observers.remove(obj);
	}
	void saytoAll(){
		for (Observer obs : observers) {
			obs.update();    // this method is a Observer's method 
		}
	}
	/*
	 *  every time we upload a video so we notify all our subscriber
	 *  by notifyAll();
	 */
	void upload(String title) {
		this.title = title;
		this.saytoAll();
	}
}
