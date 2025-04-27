package ar.edu.unq.po2.tp6;

public class SolicitudCreditoHipotecario extends SolicitudCredito{
	private Propiedad propiedad;

	public SolicitudCreditoHipotecario(Cliente cliente, double monto, int plazo, Propiedad propiedad) {
		super(cliente, monto, plazo, 0.5);
		this.propiedad = propiedad;
	}
	
	public boolean esAceptable() {
		return ingresosMensualesValidosParaCuota() && cumpleRequisitoDeEdad() && valorValidoParaGarantia();
	}
	
	private boolean cumpleRequisitoDeEdad() {
		return edadDelClienteAlCumplirPlazo() <= 65;
	}
	
	private double edadDelClienteAlCumplirPlazo() {
		return getCliente().getEdad() + getPlazo() / 12;
	}
	
	private boolean valorValidoParaGarantia() {
		return this.getMonto() <= propiedad.getValorFiscal() * 0.7;
	}
}
