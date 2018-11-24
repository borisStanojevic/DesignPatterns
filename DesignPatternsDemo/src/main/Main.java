package main;

import patterns.builder.Phone;
import patterns.factory.GameEngineFactory;
import patterns.factory.IGameEngine;
import patterns.singleton.Singleton;
import static java.lang.System.out;

public class Main
{
	public static void main(String[] args)
	{
		//Singleton
		Singleton singletonInstance = Singleton.getInstance();
		out.println(singletonInstance);
		
		//Factory
		GameEngineFactory gameEngineFactory = new GameEngineFactory();
		IGameEngine gameEngine = gameEngineFactory.getInstance("unity");
		out.println(gameEngine.showDeveloper());
		gameEngine = gameEngineFactory.getInstance("unreal");
		out.println(gameEngine.showDeveloper());
		gameEngine = gameEngineFactory.getInstance("cryengine");
		out.println(gameEngine.showDeveloper());
		
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
	}
}
