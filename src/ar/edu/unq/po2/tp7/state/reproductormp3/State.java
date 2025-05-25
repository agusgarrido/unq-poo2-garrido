package ar.edu.unq.po2.tp7.state.reproductormp3;

public interface State {
	public abstract void play(MP3Player player);
	public abstract void pause(MP3Player player);
	public abstract void stop(MP3Player player);
}
