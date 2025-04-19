package ar.edu.unq.po2.tp2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class Empresa {
	private String nombre;
	private String cuit;
	private List<Empleado> empleados = new ArrayList<Empleado>();;
	private List<ReciboDeHaberes> recibosDeHaberes = new ArrayList<ReciboDeHaberes>();;

	public Empresa(String nombre, String cuit) {
		this.nombre = nombre;
		this.cuit = cuit;
	}

	public double calcularTotalSueldosNeto() { return empleados.stream().mapToDouble(Empleado::calcularSueldoNeto).sum();}

	public double calcularTotalRetenciones() { return empleados.stream().mapToDouble(Empleado::calcularRetenciones).sum(); }

	public double calcularTotalSueldosBruto() { return empleados.stream().mapToDouble(Empleado::calcularSueldoBruto).sum(); }

	public void generarRecibosDeHaberes() {
		empleados.stream().forEach(empleado -> {
			agregarReciboDeHaberes(empleado);
		});
	}

	private void agregarReciboDeHaberes(Empleado empleado) {
		ReciboDeHaberes nuevoRecibo = new ReciboDeHaberes(empleado.obtenerNombre(), empleado.obtenerDireccion(), LocalDate.now(), empleado.calcularSueldoNeto(), empleado.calcularSueldoBruto(), empleado.desgloceDeSueldo());
		recibosDeHaberes.add(nuevoRecibo);
	}

	public void agregarEmpleado(Empleado empleado) {
		empleados.add(empleado);
	}

	public List<ReciboDeHaberes> obtenerRecibosEmitidos(){
		return this.recibosDeHaberes;
	}
}
