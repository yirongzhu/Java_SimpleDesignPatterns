package observer;
import java.util.*;

public class Observerable {

	private boolean changed = false;
	private ArrayList<Observer> observers;
	
	public Observerable() {
		observers = new ArrayList<Observer>();
	}
	
	public synchronized void addObserver(Observer o) {
		if (o == null) {
			throw new NullPointerException();
		}
		if (!observers.contains(o)) {
			observers.add(o);
		}
	}
	
	public void notifyObservers(Object data) {
		synchronized(this) {
			if (!changed) {
				return;
			}
			clearChanged();
		}
		for (Observer observer : observers) {
			observer.update(this, data);
		}
	}
	
	public synchronized void deleteObservers() {
		observers.clear();
	}
	
	public synchronized void setChanged() {
		changed = true;
	}
	
	public synchronized void clearChanged() {
		changed = false;
	}
	
	public synchronized boolean hasChanged() {
		return changed;
	}
	
	public synchronized int countObserver() {
		return observers.size();
	}
}
