package ar.edu.unq.po2.tp11.observer.encuentrosdeportivos;

import java.util.ArrayList;
import java.util.List;

public class AplicacionMovil extends Observer {
	private List<String> deportes = new ArrayList<String>();
	private List<String> contrincantes = new ArrayList<String>();
	
	public void addContrincante(String contrincante) {
		contrincantes.add(contrincante);
	}
	
	public void removeContrincante(String contrincante) {
		contrincantes.remove(contrincante);
	}
	
	public void addDeporte(String deporte) {
		deportes.add(deporte);
	}
	
	public void removeDeporte(String deporte) {
		deportes.add(deporte);
	}
	
	/* Versión más ajustada al patrón, pero por la consigna el filtrado queda en el subject */
	/*public void recibirNotificacion(Partido partido) {
		if (esDeInteres(partido)) {
			System.out.println("Notificado");
		}
	}*/
	
	/* Por compartir lógica, lo envío a una superclase */
	/*public void recibirNotificacion(Partido partido) {
		System.out.println("Notificado");
	}*/
	
	@Override
	public boolean esDeInteres(Partido partido) {
		return deporteDeInteres(partido) || contrincanteDeInteres(partido);
	}
	
	private boolean deporteDeInteres(Partido partido) {
		return deportes.contains(partido.getDeporte());
	}
	
	private boolean contrincanteDeInteres(Partido partido) {
		return contrincantes.stream().anyMatch(contrincante -> partido.getContrincantes().contains(contrincante));
	}
}
