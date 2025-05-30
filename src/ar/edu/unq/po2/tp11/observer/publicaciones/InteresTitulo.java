package ar.edu.unq.po2.tp11.observer.publicaciones;

public class InteresTitulo implements Interes{
	private String titulo;
	
	public InteresTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public boolean esDeInteres(Articulo articulo) {
		return articulo.getTitulo().contains(titulo);
	}
}
