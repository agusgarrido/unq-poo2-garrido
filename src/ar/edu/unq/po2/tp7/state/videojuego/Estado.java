package ar.edu.unq.po2.tp7.state.videojuego;

public abstract class Estado {
	private Videojuego videojuego;
	
	public Estado(Videojuego videojuego) {
		this.videojuego = videojuego;
	}
	
	public abstract void insertarFicha();
	
	public abstract void presionarBotonInicio();
	
	protected Videojuego getVideojuego() {
		return this.videojuego;
	}
}
