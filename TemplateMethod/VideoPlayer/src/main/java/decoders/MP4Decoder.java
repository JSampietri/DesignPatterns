package decoders;

public class MP4Decoder extends DecoderTemplate{
	@Override
	protected String decode(String videoFile) {
		return videoFile + " decoded from MP4.";
	}

	@Override
	protected String playVideo(String video) {
		return "Starting vlc and playing " + video;
	}
}
