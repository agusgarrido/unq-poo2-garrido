package ar.edu.unq.po2.tp6;

public class Cliente {
	private String nombre;
	private String apellido;
	private String direccion;
	private int edad;
	private double sueldoNetoMensual;

	public Cliente(String nombre, String apellido, 
			String direccion, int edad, 
			double sueldoNetoMensual) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.edad = edad;
		this.sueldoNetoMensual = sueldoNetoMensual;
	}

	public int getEdad() {
		return this.edad;
	}
	
	public double getSueldoNetoMensual() {
		return this.sueldoNetoMensual;
	}
	
	public double getSueldoNetoAnual() {
		return getSueldoNetoMensual() * 12;
	}
	
}
