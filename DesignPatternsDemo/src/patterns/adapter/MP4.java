package patterns.adapter;

public class MP4 implements IMediaPackage {

	@Override
	public void playFile(String fileName) 
	{
		System.out.println("Playing MP4 file : " + fileName);
	}
	
}
