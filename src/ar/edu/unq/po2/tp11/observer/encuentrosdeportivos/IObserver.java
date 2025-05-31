package ar.edu.unq.po2.tp11.observer.encuentrosdeportivos;

public interface IObserver {
	public void recibirNotificacion(Partido partido);
	public boolean esDeInteres(Partido partido);
}
