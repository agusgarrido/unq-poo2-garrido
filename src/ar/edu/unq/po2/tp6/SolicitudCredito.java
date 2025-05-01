package ar.edu.unq.po2.tp6;

public abstract class SolicitudCredito {
	private Cliente cliente;
	private double monto;
	private int plazo;
	private double porcentajeLimiteCuota;

	public SolicitudCredito(Cliente cliente, double monto, int plazo, double porcentajeLimiteCuota) {
		this.cliente = cliente;
		this.monto = monto;
		this.plazo = plazo;
		this.porcentajeLimiteCuota = porcentajeLimiteCuota;
	}

	public double getMonto() {
		return this.monto;
	}

	public int getPlazo() {
		return this.plazo;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public double montoMensual() {
		return getMonto() / getPlazo();
	}

	public double getPorcentajeLimiteCuota() {
		return this.porcentajeLimiteCuota;
	}

	public abstract boolean esAceptable();
	public boolean ingresosMensualesValidosParaCuota() {
		return this.montoMensual() <= getCliente().getSueldoNetoMensual() * getPorcentajeLimiteCuota();
	}
}
