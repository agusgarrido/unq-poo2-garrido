package ar.edu.unq.po2.tp7.state.videojuego;

public class Encendido extends Estado{
	public Encendido(Videojuego videojuego) {
		super(videojuego);
	}
	
	public void insertarFicha() {
			this.getVideojuego().setEstado(new UnJugador(getVideojuego()));
	};
	
	public void presionarBotonInicio() {
		System.out.println("Por favor, ingrese fichas para comenzar.");
	}
}
