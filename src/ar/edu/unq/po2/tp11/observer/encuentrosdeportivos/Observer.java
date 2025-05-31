package ar.edu.unq.po2.tp11.observer.encuentrosdeportivos;

public abstract class Observer {

	public void recibirNotificacion(Partido partido) {
		System.out.println("Notificado");
	}
	
	public abstract boolean esDeInteres(Partido partido);
}
