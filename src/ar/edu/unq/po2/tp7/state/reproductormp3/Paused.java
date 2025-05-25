package ar.edu.unq.po2.tp7.state.reproductormp3;

public class Paused implements State{	
	public void play(MP3Player player){
		throw new UnsupportedOperationException("Reproduciendo...");
	};
	
	public void pause(MP3Player player) {
		player.getSong().play();
		player.setState(new Playing());
	};
	
	public void stop(MP3Player player) {
		player.getSong().stop();
		player.setState(new SelectMode());
	};
}
