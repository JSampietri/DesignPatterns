package decoders;

public abstract class DecoderTemplate {
	public void play(String videoPath)
	{
		String videoFile = loadFile(videoPath);
		String video = decode(videoFile);
		String output = playVideo(video);
		System.out.println(output);
	}
	
	protected String loadFile(String filePath) {
		String[] path = filePath.split("/");
		return path[path.length - 1];
	}
	
	protected String decode(String videoFile) {
		return videoFile + " decoded.";
	}
	
	protected String playVideo(String video) {
		return "Playing " + video;
	}
}
