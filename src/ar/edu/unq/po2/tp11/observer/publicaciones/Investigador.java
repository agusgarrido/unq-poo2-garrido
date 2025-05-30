package ar.edu.unq.po2.tp11.observer.publicaciones;

import java.util.ArrayList;
import java.util.List;

public class Investigador implements  SuscriptorObserver{
	private String nombre;
	private List<Interes> intereses;
	
	public Investigador(String nombre) {
		this.nombre = nombre;
		this.intereses = new ArrayList<Interes>();
	}
	
	public void agregarInteres(Interes interes) {
		intereses.add(interes);
	}
	
	public void removerInteres(Interes interes) {
		intereses.remove(interes);
	}
	
	public void recibirNotificacion(Articulo articulo) {
		if(tieneInteres(articulo)) {
			System.out.println("Notificanod...");
		}
	}
	
	private boolean tieneInteres(Articulo articulo) {
		return intereses.stream().anyMatch(tema -> tema.esDeInteres(articulo));
	}
}
