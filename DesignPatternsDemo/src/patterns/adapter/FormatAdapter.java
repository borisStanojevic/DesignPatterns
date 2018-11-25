package patterns.adapter;

//The adapter class is responsible for making two separate interfeces interoperable

//Adapter								//ITarget						
public class FormatAdapter implements IMediaPlayer {
	
	//Adaptee
	private IMediaPackage mediaPackage;
	
	public FormatAdapter(IMediaPackage mediaPackage) {
		this.mediaPackage = mediaPackage;
	}
	@Override
	public void play(String fileName)
	{
		System.out.println("Using adapter : ");
		mediaPackage.playFile(fileName);
	}

}
