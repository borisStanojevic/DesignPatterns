package patterns.factory;

//Centralized way of creating objects that share some behaviour/state
//Provide parameter - get back a specific object
public class GameEngineFactory{

	public IGameEngine getInstance(String name)
	{
		if("unreal".equalsIgnoreCase(name))
			return new Unreal();
		else if("unity".equalsIgnoreCase(name))
			return new Unity();
		else if("cryengine".equalsIgnoreCase(name))
			return new CryEngine();
		else
			return null;
	}
}
