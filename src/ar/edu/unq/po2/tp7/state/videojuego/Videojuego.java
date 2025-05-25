package ar.edu.unq.po2.tp7.state.videojuego;

public class Videojuego {
	private Estado estado;
	
	public Videojuego() {
		this.estado = new Apagado(this);
	}
	
	public void insertarFicha() {
		estado.insertarFicha();
	}
	
	public void presionarBotonInicio() {
		estado.presionarBotonInicio();
	}
	
	public void setEstado(Estado nuevoEstado) {
		this.estado = nuevoEstado;
	}
	
	public void terminarVideojuego() {
		this.setEstado(new Apagado(this));
	}
}
