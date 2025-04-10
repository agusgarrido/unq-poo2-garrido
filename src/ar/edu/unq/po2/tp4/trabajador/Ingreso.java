package ar.edu.unq.po2.tp4.trabajador;

public class Ingreso {
	private int mesDePercepcion;
	private String concepto;
	private double monto;

	public Ingreso(int mesDePercepcion, String concepto, double monto) {
		this.mesDePercepcion = mesDePercepcion;
		this.concepto = concepto;
		this.monto = monto;
	}

	public int getMesDePercepcion() {
		return this.mesDePercepcion;
	}

	public String getConcepto() {
		return this.concepto;
	}

	public double getMonto() {
		return this.monto;
	}

	public double getMontoImponible() {
		return this.getMonto();
	}
}
