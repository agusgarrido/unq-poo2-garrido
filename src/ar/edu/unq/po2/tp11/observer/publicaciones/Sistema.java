package ar.edu.unq.po2.tp11.observer.publicaciones;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
	private List<Articulo> articulos = new ArrayList<Articulo>();
	private List<SuscriptorObserver> suscriptores = new ArrayList<SuscriptorObserver>();
	
	public void agregarArticulo(Articulo articulo) {
		articulos.add(articulo);
		notificar(articulo);
	}
	
	public void notificar(Articulo articulo) {
		suscriptores.forEach(suscriptor -> suscriptor.recibirNotificacion(articulo));
	}
	
	public void suscribir(SuscriptorObserver suscriptor) {
		suscriptores.add(suscriptor);
	}
	
	public void desuscribir(SuscriptorObserver suscriptor) {
		suscriptores.remove(suscriptor);
	}
}
