package ar.edu.unq.po2.tp11.observer.publicaciones;

import java.util.List;
import java.util.stream.Collectors;

public class Articulo {
	private String titulo;
	private List<Autor> autores;
	private String tipoArticulo;
	private String lugarPublicacion;
	private List<String> palabrasClave;
	
	public Articulo(String titulo, List<Autor> autores, String tipoArticulo, String lugarPublicacion, List<String> palabrasClave) {
		this.titulo = titulo;
		this.autores = autores;
		this.tipoArticulo = tipoArticulo;
		this.lugarPublicacion = lugarPublicacion;
		this.palabrasClave = palabrasClave;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public String getTipoArticulo() {
		return this.tipoArticulo;
	}
	
	public String getLugarPublicacion() {
		return this.lugarPublicacion;
	}
	
	public List<String> getAutores() {
		return this.autores.stream().map(autor -> autor.getNombre()).collect(Collectors.toList());
	}
	
	public List<String> getPalabrasClave() {
		return this.palabrasClave;
	}
	
	public List<String> getFiliaciones() {
		return this.autores.stream().map(autor -> autor.getFiliacion()).collect(Collectors.toList());

	}
}
