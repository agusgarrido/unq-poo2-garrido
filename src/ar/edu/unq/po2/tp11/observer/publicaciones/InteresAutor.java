package ar.edu.unq.po2.tp11.observer.publicaciones;

public class InteresAutor implements Interes{
	private String autor;
	
	public InteresAutor(String autor) {
		this.autor = autor;
	}
	
	public boolean esDeInteres(Articulo articulo) {
		return articulo.getAutores().stream().anyMatch(a -> a.equalsIgnoreCase(autor));
	}
}
