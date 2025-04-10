package ar.edu.unq.po2.tp4.trabajador;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {
	private List<Ingreso> ingresos = new ArrayList<Ingreso>();
	
	public Trabajador () {
		this.ingresos = new ArrayList<Ingreso>();
	}
	
	public void agregarIngreso(Ingreso ingreso) {
		ingresos.add(ingreso);
	}
	
	public double getTotalPercibido() {
		return ingresos.stream().mapToDouble(ingreso -> ingreso.getMonto()).sum();
	}
	
	public double getMontoImponible() {
		return ingresos.stream().mapToDouble(ingreso -> ingreso.getMontoImponible()).sum();
	}
	
	public double getImpuesstoAPagar() {
		return (this.getMontoImponible() * 0.2);
	}
}
