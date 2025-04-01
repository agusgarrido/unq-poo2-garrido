package tp02ej01;

import java.time.LocalDate;

/*
 * IMPORTANTE
 * * Evitar el uso de "magic numbers" mediante el uso de variables y sus getters
 */

public class EmpleadoPlantaPermanente extends Empleado {
	private int cantidadHijos;
	private int antiguedad;
	
	public EmpleadoPlantaPermanente(String nombre, String direccion, String estadoCivil, LocalDate fechaNacimiento,
			Double sueldoBasico, int cantidadHijos, int antiguedad) {
		super(nombre, direccion, estadoCivil, fechaNacimiento, sueldoBasico);
		this.cantidadHijos = cantidadHijos;
		this.antiguedad = antiguedad;
	}
	
	@Override
	public double calcularSueldoBruto() {
		return getSueldoBasico() + asignacionPorHijo() + asignacionPorConyuge() + asignacionPorAntiguedad();
	}

	@Override
	public double calcularRetenciones() {
		return retencionPorObraSocial() + retencionPorAportesJubilatorios();
	}

	private double asignacionPorHijo() {
		return cantidadHijos * 150;
	}
	
	private double asignacionPorAntiguedad() {
		return antiguedad * 50;
	}
	
	private double asignacionPorConyuge() {
		return esCasado() ? 100 : 0;
	}
	
	protected boolean esCasado() {
		return getEstadoCivil().toUpperCase().equals("CASADO");
	}
	
	private double retencionPorAportesJubilatorios() {
		return calcularSueldoBruto() * 0.15;
	}

	private double retencionPorObraSocial() {
		return deduccionDeObraSocial() + deduccionPorHijo();
	}

	private double deduccionPorHijo() {
		return cantidadHijos * 0.20;
	}

	private double deduccionDeObraSocial() {
		return calcularSueldoBruto() * 0.10;
	}
}