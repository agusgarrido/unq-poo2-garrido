package ar.edu.unq.po2.tp11.observer.encuentrosdeportivos;

import java.util.ArrayList;
import java.util.List;

public class Servidor extends Observer {
	private List<String> deportes = new ArrayList<String>();
	
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
		return deportes.contains(partido.getDeporte());
	}
	
	public void addDeporte(String deporte) {
		deportes.add(deporte);
	}
	
	public void removeDeporte(String deporte) {
		deportes.add(deporte);
	}
}
