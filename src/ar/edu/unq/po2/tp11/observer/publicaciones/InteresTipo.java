package ar.edu.unq.po2.tp11.observer.publicaciones;

public class InteresTipo implements Interes{
	private String tipo;
	
	public InteresTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public boolean esDeInteres(Articulo articulo) {
		return articulo.getTipoArticulo().equalsIgnoreCase(tipo);
	}
}
