package decoders;

public class MkvDecoder extends DecoderTemplate{
	@Override
	protected String decode(String videoFile) {
		return videoFile + " decoded from Mkv";
	}
}
