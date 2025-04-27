package ar.edu.unq.po2.tp6;

public class SolicitudCreditoPersonal extends SolicitudCredito{
	public SolicitudCreditoPersonal(Cliente cliente, double monto, int plazo) {
		super(cliente, monto, plazo, 0.7);
	}
	
	public boolean esAceptable() {
		return getCliente().getSueldoNetoMensual() >= 15000 && ingresosMensualesValidosParaCuota();
	}
	
}
