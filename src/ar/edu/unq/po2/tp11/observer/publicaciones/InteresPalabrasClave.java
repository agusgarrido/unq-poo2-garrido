package ar.edu.unq.po2.tp11.observer.publicaciones;

public class InteresPalabrasClave implements Interes{
	private String palabraClave;
	
	public InteresPalabrasClave(String palabraClave) {
		this.palabraClave = palabraClave;
	}
	
	public boolean esDeInteres(Articulo articulo) {
		return articulo.getPalabrasClave().stream().anyMatch(pc -> pc.equalsIgnoreCase(palabraClave));
	}
}
