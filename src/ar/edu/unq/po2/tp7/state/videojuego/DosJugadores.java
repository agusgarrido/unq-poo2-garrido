package ar.edu.unq.po2.tp7.state.videojuego;

public class DosJugadores extends Estado{
	public DosJugadores(Videojuego videojuego) {
		super(videojuego);
	}
	
	public void insertarFicha() {
		throw new UnsupportedOperationException("No puede ingresar más fichas.");
	};
	
	public void presionarBotonInicio() {
		System.out.println("Comenzando el juego en modo multijugador...");
	}
}
