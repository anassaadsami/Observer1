package ObserverIntro.copy;

import java.util.ArrayList;
import java.util.List;

 class Channel implements Subject {  // we can imagine the Subject as a notification department in Channel and it's 
	 //  Responsibility to sent a notification to all the members when something is changed
	 /*
	  *  we have many subscriber (Observers) so we need to collect them 
	  *  in Array so we can add or remove members
	  */
	List<ObserverInterface> observers= new ArrayList<>();   // must initialise the Array
	String title;
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
	void upload(String title) {
		this.title = title;
		this.updateAll();
	}
}
