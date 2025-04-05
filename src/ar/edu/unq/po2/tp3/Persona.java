package ar.edu.unq.po2.tp3;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
	private String nombre;
	private LocalDate fechaDeNacimiento;

	public Persona(String nombre, LocalDate fechaDeNacimiento) {
		this.nombre = nombre;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public int getEdad() {
		return Period.between(fechaDeNacimiento, LocalDate.now()).getYears();
	}
	
	public boolean menorQue(Persona persona) {
		return this.getEdad() < persona.getEdad();
	}
	
	/* static -> Método de clase */
	public static Persona crearPersona(String nombre, LocalDate fechaDeNacimiento) {
		return new Persona(nombre, fechaDeNacimiento);
	}
}
