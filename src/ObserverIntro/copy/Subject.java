package ObserverIntro.copy;
  // this interface take the Observer interface as a parameter here
interface Subject {
	public void add(ObserverInterface obs);
	public void remove(ObserverInterface obs);
	public void updateAll();
	
	
}