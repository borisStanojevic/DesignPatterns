package patterns.adapter;

public class MP3 implements IMediaPlayer {

	@Override
	public void play(String fileName)
	{
		System.out.println("Playing MP3 file : " + fileName);
	}

}
