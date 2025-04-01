package tp02ej01;

import java.time.LocalDate;

public class ReciboDeHaberes {

	private LocalDate fechaDeEmision;
	private Empleado empleado;
	
	public ReciboDeHaberes(LocalDate fechaDeEmision, Empleado empleado) {
		this.fechaDeEmision = fechaDeEmision;
		this.empleado = empleado;
	}
	
	public String obtenerNombreDelEmpleado() {
		return empleado.obtenerNombre();
	}
	
	public String obtenerDireccionDelEmpleado() {
		return empleado.obtenerDireccion();
	}
	
	public LocalDate obtenerFechaDeEmision() {
		return fechaDeEmision;
	}
	
	public double obtenerSueldoBruto() {
		return empleado.calcularSueldoBruto();
	}
	
	public double obtenerSueldoNeto() {
		return empleado.calcularSueldoNeto();
	}
	
	public double obtenerRetenciones() {
		return empleado.calcularRetenciones();
	}
	
	public void liquidarSueldo() {
		System.out.println("/****************************/");
		System.out.println("Empleado: " + obtenerNombreDelEmpleado());
		System.out.println("Dirección: " + obtenerDireccionDelEmpleado());
		System.out.println("Fecha: " + obtenerFechaDeEmision());
		System.out.println("Sueldo bruto: $" + obtenerSueldoBruto());
		System.out.println("Retenciones: $" + obtenerRetenciones());
		System.out.println("Sueldo neto: $" + obtenerSueldoNeto());
		System.out.println("/****************************/\n");
	}
}
