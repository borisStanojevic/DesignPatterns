package patterns.adapter;

public class VLC implements IMediaPackage {

	@Override
	public void playFile(String fileName)
	{
		System.out.println("Playing VLC file : " + fileName);
	}

}
