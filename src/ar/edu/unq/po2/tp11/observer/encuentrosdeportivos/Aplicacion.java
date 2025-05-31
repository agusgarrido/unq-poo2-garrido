package ar.edu.unq.po2.tp11.observer.encuentrosdeportivos;

import java.util.ArrayList;
import java.util.List;

public class Aplicacion {
	private List<IObserver> observadores = new ArrayList<IObserver>();
	private List<Partido> partidos = new ArrayList<Partido>();
	
	public void suscribir(IObserver observador) {
		observadores.add(observador);
	}
	
	public void desuscribir(IObserver observador) {
		observadores.remove(observador);
	}
	
	public void nuevoPartido(Partido partido) {
		partidos.add(partido);
		notificar(partido);
	}
	
	/* Versión más ajustada al patrón, pero no cumple con la consigna de tener en cuenta la información suscripta */
	/*public void notificar(Partido partido) {
		observadores.forEach(observador -> observador.recibirNotificacion(partido));
	}*/
	
	public void notificar(Partido partido) {
		observadores.stream()
			.filter(observador -> observador.esDeInteres(partido)) // Filtro por interés
			.forEach(observador -> observador.recibirNotificacion(partido)); // Envío notificaciones
	}

}
