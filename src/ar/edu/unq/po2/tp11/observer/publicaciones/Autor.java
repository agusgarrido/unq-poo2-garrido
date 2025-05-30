package ar.edu.unq.po2.tp11.observer.publicaciones;

public class Autor {
	private String nombre;
	private String filiacion;
	
	public Autor(String nombre, String filiacion) {
		this.nombre = nombre;
		this.filiacion = filiacion;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getFiliacion() {
		return this.filiacion;
	}
}
