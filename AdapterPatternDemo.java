public class AdapterPatternDemo{

	public static void main(String[] args){

		AudioPlayer audioPlayer = new AudioPlayer();

		audioPlayer.play("mp3","beyond_of_horizon.mp3");

		audioPlayer.play("mp4","alone.mp4");

		audioPlayer.play("vlc","far rar away.vlc");

		audioPlayer.play("avi","mind me.avi");
	}
}