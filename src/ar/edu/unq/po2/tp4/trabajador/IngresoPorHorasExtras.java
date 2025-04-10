package ar.edu.unq.po2.tp4.trabajador;

import java.time.LocalDate;

public class IngresoPorHorasExtras extends Ingreso{
	private int cantidadHorasExtras;
	
	public IngresoPorHorasExtras (LocalDate mesDePercepcion, String concepto, double monto, int cantidadHorasExtras) {
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
