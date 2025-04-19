package ar.edu.unq.po2.tp2;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

abstract class Empleado {

	private String nombre;
	private String direccion;
	private String estadoCivil;
	private LocalDate fechaNacimiento;
	private double sueldoBasico;

	public Empleado(String nombre, String direccion, 
			String estadoCivil, LocalDate fechaNacimiento, Double sueldoBasico) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.estadoCivil = estadoCivil;
		this.fechaNacimiento = fechaNacimiento;
		this.sueldoBasico = sueldoBasico;
	}

	public int calcularEdad() {
		return Period.between(this.fechaNacimiento, LocalDate.now()).getYears();
	}

	public double getSueldoBasico() {
		return this.sueldoBasico;
	}

	protected String getEstadoCivil() {
		return this.estadoCivil;
	}

	abstract double calcularSueldoBruto();

	abstract double calcularRetenciones();

	public double calcularSueldoNeto() {
		return calcularSueldoBruto() - calcularRetenciones();
	}

	public String obtenerNombre() {
		return this.nombre;
	}

	public String obtenerDireccion() {
		return this.direccion;
	}

	abstract List<Concepto> desgloceDeSueldo();
}
