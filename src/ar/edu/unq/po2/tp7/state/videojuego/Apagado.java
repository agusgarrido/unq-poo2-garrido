package ar.edu.unq.po2.tp7.state.videojuego;

public class Apagado extends Estado{
	public Apagado(Videojuego videojuego) {
		super(videojuego);
	}
	
	public void insertarFicha() {
		throw new UnsupportedOperationException("La máquina se encuentra apagada.");
	};
	
	public void presionarBotonInicio() {
		this.getVideojuego().setEstado(new Encendido(getVideojuego()));
	}
}
