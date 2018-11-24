package patterns.observer.first;

public interface IObserver {
	//Method that will be called when change occurs in observable object
	void update(int discount);
}
