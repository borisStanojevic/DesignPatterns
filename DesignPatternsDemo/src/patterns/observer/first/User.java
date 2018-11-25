package patterns.observer.first;

public class User implements IObserver {
	private String name;
	//A way to access concrete observable in case we need to find out about the change that occured inside of it
	private Observable observable;

	public void update(int discount)
	{
		goToItShopForDiscount(discount);
	}
	
	private void goToItShopForDiscount(int discount)
	{
		System.out.println(String.format("%s just got notified that there is %d %c discount in ITShop because it's Black Friday", name, discount, '%'));
	}
	
	public void subscribe()
	{
		this.observable.register(this);
	}
	
	public void unsubscribe()
	{
		this.observable.unregister(this);
		System.out.println(String.format("%s just unsubscribed from receiving discount info from ITShop", name));
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Observable getObservable() {
		return observable;
	}

	public void setObservable(Observable observable) {
		this.observable = observable;
	}

}


