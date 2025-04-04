package tp02ej01;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class Empresa {
	private String nombre;
	private String cuit;
	private List<Empleado> empleados;
	private List<ReciboDeHaberes> recibosDeHaberes;
	
	public Empresa(String _nombre, String _cuit) {
		this.nombre = _nombre;
		this.cuit = _cuit;
		this.empleados = new ArrayList<>();
		this.recibosDeHaberes = new ArrayList<ReciboDeHaberes>();
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
		ReciboDeHaberes nuevoRecibo = new ReciboDeHaberes(LocalDate.now(), empleado);
		recibosDeHaberes.add(nuevoRecibo);
	}
	
	public void agregarEmpleado(Empleado empleado) {
		empleados.add(empleado);
	}
}
