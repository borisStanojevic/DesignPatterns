package patterns.observer.first;

import java.util.ArrayList;
import java.util.List;

//This class represents the subject and is observable - an object that will notify others when something in it changes
//It holds a list of everyone who is interested to know about the change
public class ITShop implements Observable {
	private int discount;
	private List<IObserver> observers = new ArrayList<>();
	
	public void register(IObserver observer)
	{
		observers.add(observer);
	}
	
	public void unregister(IObserver observer)
	{
		observers.remove(observer);
	}

	public void notifyObserver()
	{
		for (IObserver observer : observers)
		{
			observer.update(discount);
		}
	}

	public int getDiscount() {
		return discount;
	}
	
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
	public List<IObserver> getObservers() {
		return observers;
	}
}
