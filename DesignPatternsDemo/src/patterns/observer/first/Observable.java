package patterns.observer.first;

//How an object, that is going to notify others about changes in itself, is going to behave
public interface Observable {
	void register(IObserver observer);
	void unregister(IObserver observer);
	void notifyObserver();
}
