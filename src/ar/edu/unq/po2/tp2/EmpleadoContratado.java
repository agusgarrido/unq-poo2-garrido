package ar.edu.unq.po2.tp2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoContratado extends Empleado{

	private int numeroContrato;
	private String medioDePago;

	public EmpleadoContratado(String nombre, String direccion, String estadoCivil, LocalDate fechaNacimiento,
			Double sueldoBasico, int numeroContrato, String medioDePago) {
		super(nombre, direccion, estadoCivil, fechaNacimiento, sueldoBasico);
		this.numeroContrato = numeroContrato;
		this.medioDePago = medioDePago;
	}

	@Override
	public double calcularSueldoBruto() {
		return getSueldoBasico();
	}

	@Override
	public double calcularRetenciones() {
		return 50;
	}

	public List<Concepto> desgloceDeSueldo(){
		List<Concepto> conceptos = new ArrayList<Concepto>();
		conceptos.add(new Concepto("Sueldo básico", getSueldoBasico()));
		conceptos.add(new Concepto("Gastos administrativos", calcularRetenciones()));

		return conceptos;
	}
}
