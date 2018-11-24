package main;

import patterns.builder.Phone;
import patterns.factory.GameEngineFactory;
import patterns.factory.IGameEngine;
import patterns.observer.first.ITShop;
import patterns.observer.first.User;
import patterns.singleton.Singleton;
import static java.lang.System.out;

public class Main
{
	public static void main(String[] args)
	{
		//Singleton
		Singleton singletonInstance = Singleton.getInstance();
		out.println(singletonInstance);
		divider();
		
		//Factory
		GameEngineFactory gameEngineFactory = new GameEngineFactory();
		IGameEngine gameEngine = gameEngineFactory.getInstance("unity");
		out.println(gameEngine.showDeveloper());
		gameEngine = gameEngineFactory.getInstance("unreal");
		out.println(gameEngine.showDeveloper());
		gameEngine = gameEngineFactory.getInstance("cryengine");
		out.println(gameEngine.showDeveloper());
		divider();
		
		//Builder
		Phone myCustomPhone = new Phone.Builder().withOs("Android Oreo")
												  .withBattery(1000)
												  .withCpu("Octa Core")
												  .withRam(3)
												  .withMemory(4)
												  .withScreenSize(1240)
												  .includeDoubleSim()
												  .buildPhone();
		out.println(myCustomPhone);
		divider();
		
		User u1, u2, u3;
		u1 = new User();
		u2 = new User();
		u3 = new User();
		u1.setName("Mitar Miric");
		u2.setName("Saban Saulic");
		u3.setName("Pale Nabre");
		
		ITShop itShop = new ITShop();
		
		u1.setObservable(itShop);
		u2.setObservable(itShop);
		u3.setObservable(itShop);
		u1.subscribe();
		u2.subscribe();
		u3.subscribe();
		
		itShop.setDiscount(40);
		itShop.notifyObserver();
		
		System.out.println();
		
		u1.unsubscribe();
		divider();
		
	}
	
	
	private static void divider()
	{
		System.out.println("==================================================");
	}
}
