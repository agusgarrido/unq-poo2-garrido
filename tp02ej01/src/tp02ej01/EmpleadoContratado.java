package tp02ej01;

import java.time.LocalDate;

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

}
