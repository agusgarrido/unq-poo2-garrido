package ar.edu.unq.po2.tp7.state.reproductormp3;

public class SelectMode implements State{
	public void play(MP3Player player) {
		player.getSong().play();
		player.setState(new Playing());
		
	};
	
	public void pause(MP3Player player) {
		throw new UnsupportedOperationException("Acción no válida.");
	};
	
	public void stop(MP3Player player) {}
}
