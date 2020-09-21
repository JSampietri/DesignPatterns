package videoPlayer;

import decoders.DecoderTemplate;
import decoders.MP4Decoder;
import decoders.MkvDecoder;

public class Player {
	public static void main(String[] args) {
		DecoderTemplate mkv = new MkvDecoder();
		DecoderTemplate mp4 = new MP4Decoder();
		
		String [] videos = {"C:/teste/videos/video1.mkv","C:/teste/videos/video2.mp4"};
		
		for (String video : videos) {
			if (video.contains("mkv")) {
				mkv.play(video);
			} else if (video.contains("mp4")) {
				mp4.play(video);
			} else {
				System.err.println("Video codec not recognized.");
			}
		}
	}
}
