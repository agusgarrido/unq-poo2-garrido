package ar.edu.unq.po2.tp9.template.sueldos;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	
	private List<Empleado> empleados;
	
	public Empresa() {
		this.empleados = new ArrayList<Empleado>();
	}
	
	public void agregarEmpleado(Empleado empleado) {
		empleados.add(empleado);
	}
}
