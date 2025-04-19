package ar.edu.unq.po2.tp2;

import java.time.LocalDate;
import java.util.List;

public class ReciboDeHaberes {

	private String nombreEmpleado;
	private String direccion;
	private LocalDate fechaDeEmision;
	private double sueldoNeto;
	private double sueldoBruto;
	private List<Concepto> desgloceDeSueldo;

	public ReciboDeHaberes (String nombreEmpleado, String direccion, LocalDate fechaEmision, double sueldoNeto, double sueldoBruto, List<Concepto> desgloceDeSueldo) {
		this.nombreEmpleado = nombreEmpleado;
		this.direccion = direccion;
		this.fechaDeEmision = fechaEmision;
		this.sueldoNeto = sueldoNeto;
		this.sueldoBruto = sueldoBruto;
		this.desgloceDeSueldo = desgloceDeSueldo;
	}
}
