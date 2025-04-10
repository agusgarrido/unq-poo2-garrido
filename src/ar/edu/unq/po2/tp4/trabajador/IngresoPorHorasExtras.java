package ar.edu.unq.po2.tp4.trabajador;

public class IngresoPorHorasExtras extends Ingreso {
	private int cantidadHorasExtras;

	public IngresoPorHorasExtras(int mesDePercepcion, String concepto, double monto, int cantidadHorasExtras) {
		super(mesDePercepcion, concepto, monto);
		this.cantidadHorasExtras = cantidadHorasExtras;
	}

	public int getCantidadHorasExtras() {
		return this.cantidadHorasExtras;
	}

	@Override
	public double getMontoImponible() {
		return 0;
	}
}
