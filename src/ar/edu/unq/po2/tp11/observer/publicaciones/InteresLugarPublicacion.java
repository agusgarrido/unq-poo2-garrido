package ar.edu.unq.po2.tp11.observer.publicaciones;

public class InteresLugarPublicacion implements Interes{
	private String lugarPublicacion;
	
	public InteresLugarPublicacion(String lugarPublicacion) {
		this.lugarPublicacion = lugarPublicacion;
	}
	
	public boolean esDeInteres(Articulo articulo) {
		return articulo.getLugarPublicacion().equalsIgnoreCase(lugarPublicacion);
	}
}
