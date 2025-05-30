package ar.edu.unq.po2.tp11.observer.publicaciones;

public class InteresFiliacion implements Interes{
	private String filiacion;
	
	public InteresFiliacion(String filiacion) {
		this.filiacion = filiacion;
	}
	
	public boolean esDeInteres(Articulo articulo) {
		return articulo.getFiliaciones().stream().anyMatch(f -> f.equalsIgnoreCase(filiacion));
	}
}
