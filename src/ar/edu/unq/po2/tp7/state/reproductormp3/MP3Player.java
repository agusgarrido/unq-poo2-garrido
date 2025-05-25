package ar.edu.unq.po2.tp7.state.reproductormp3;

public class MP3Player {
	private State state;
	private Song song;
	
	public MP3Player() {
		this.state = new SelectMode();
		this.song = song;
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public Song getSong() {
		return this.song;
	}
	
	public void play() {
		state.play(this);
	}
	
	public void pause() {
		state.pause(this);
	}
	
	public void stop() {
		state.stop(this);
	}
}
