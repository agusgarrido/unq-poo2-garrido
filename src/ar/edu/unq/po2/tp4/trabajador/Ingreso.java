package ar.edu.unq.po2.tp4.trabajador;

import java.time.LocalDate;

public class Ingreso {
	private LocalDate mesDePercepcion;
	private String concepto;
	private double monto;
	
	public Ingreso (LocalDate mesDePercepcion, String concepto, double monto) {
		this.mesDePercepcion = mesDePercepcion;
		this.concepto = concepto;
		this.monto = monto;
	}
	
	public LocalDate getMesDePercepcion() {
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
