package Iphone.copy;

import java.util.ArrayList;
import java.util.List;

public class Product implements Subject {
	String productName;
	private boolean available;
	List<Observer> observers = new ArrayList<>();
	
	public Product(String productName) {
		this.productName =  productName;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		if(available) {
			notifyObserver();
		}
		
	}

	@Override
	public void addObserver(Observer obs) {
		this.observers.add(obs);
		
	}

	@Override
	public void removeObserver(Observer obs) {
		this.observers.remove(obs);
		
	}

	@Override
	public void notifyObserver() {
		for (Observer observer : observers) {
			observer.update();
		}
		
	}

}
