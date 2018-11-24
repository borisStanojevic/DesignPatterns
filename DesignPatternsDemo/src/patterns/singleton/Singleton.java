package patterns.singleton;

//Makes sure only one instance of a specific class is available in our code
public class Singleton
{
	
	//Making sure that the instance is immutable (final)
	private static final Singleton INSTANCE = null;
	
	private Singleton() {}
	
	public static Singleton getInstance()
	{
		if(INSTANCE == null)
			return new Singleton();
		//And in case i want to synchronize getting instance
		/*
		synchronized(Singleton.class)
		{
			if (instance == null)
				instance = new Singleton();
		}
		return instance;
		*/
		return INSTANCE;	
	}
	
	//Making sure that the object can not be cloned
	@Override
	protected Object clone() throws CloneNotSupportedException
	{
		throw new RuntimeException();
	}
	
	@Override
	public String toString()
	{
		return "Voila, you made me singleton. There can be only one instance of my type.";
	}
	
	
	
}
