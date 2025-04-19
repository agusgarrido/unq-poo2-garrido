package ar.edu.unq.po2.tp2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/*
 * IMPORTANTE
 * * Evitar el uso de "magic numbers" mediante el uso de variables y sus getters
 */

public class EmpleadoPlantaTemporaria extends Empleado {

	private LocalDate fechaFinDesignacion;
	private int cantidadHorasExtra;
	
	public EmpleadoPlantaTemporaria(String nombre, String direccion, String estadoCivil, LocalDate fechaNacimiento,
			Double sueldoBasico, LocalDate fechaFinDesignacion, int cantidadHorasExtra) {
		super(nombre, direccion, estadoCivil, fechaNacimiento, sueldoBasico);
		this.fechaFinDesignacion = fechaFinDesignacion;
		this.cantidadHorasExtra = cantidadHorasExtra;
	}

	@Override
	public double calcularSueldoBruto() {
		return getSueldoBasico() + bonoHorasExtra();
	}

	private double bonoHorasExtra() {
		return cantidadHorasExtra * 40;
	}

	@Override
	public double calcularRetenciones() {
		return retencionPorObraSocial() + retencionPorAportesJubilatorios();
	}

	private double retencionPorHorasExtra() {
		return cantidadHorasExtra * 5;
	}

	private double retencionPorAportesJubilatorios() {
		return calcularSueldoBruto() * 0.10 + retencionPorHorasExtra();
	}

	private double descuentoPorMayorDe50() {
		return calcularEdad() > 50 ? 25 : 0;
	}

	private double retencionPorObraSocial() {
		return calcularSueldoBruto() * 0.10 + descuentoPorMayorDe50();
	}
	
	public List<Concepto> desgloceDeSueldo(){
		List<Concepto> conceptos = new ArrayList<Concepto>();
		conceptos.add(new Concepto("Sueldo básico", getSueldoBasico()));
		conceptos.add(new Concepto("Retención por horas extras", retencionPorHorasExtra()));
		conceptos.add(new Concepto("Retención Obra Social", retencionPorObraSocial()));
		conceptos.add(new Concepto("Aportes jubilatorios", retencionPorAportesJubilatorios()));
		
		return conceptos;
	}
}
