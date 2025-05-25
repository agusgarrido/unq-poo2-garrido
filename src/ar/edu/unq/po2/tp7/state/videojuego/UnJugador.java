package ar.edu.unq.po2.tp7.state.videojuego;

public class UnJugador extends Estado{
	public UnJugador(Videojuego videojuego) {
		super(videojuego);
	}
	
	public void insertarFicha() {
			this.getVideojuego().setEstado(new DosJugadores(getVideojuego()));
	};
	
	public void presionarBotonInicio() {
		System.out.println("Comenzando el juego...");
	}
}
