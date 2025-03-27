package tp02ej01;

import java.time.LocalDate;
import java.time.Period;

abstract class Empleado {

	private String nombre;
	private String direccion;
	private String estadoCivil;
	private LocalDate fechaNacimiento;
	private Double sueldoBasico;
	
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
	
	protected double getSueldoBasico() {
		return sueldoBasico;
	}
	
	protected String getEstadoCivil() {
	    return estadoCivil;
	}
	
	abstract double calcularSueldoBruto();
	
	abstract double calcularRetenciones();
	
	public double calcularSueldoNeto() {
		return calcularSueldoBruto() - calcularRetenciones();
	}
	
	public String obtenerNombre() {
		return nombre;
	}
	
	public String obtenerDireccion() {
		return direccion;
	}
}
