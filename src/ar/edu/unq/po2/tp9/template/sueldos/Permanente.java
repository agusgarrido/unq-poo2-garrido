package ar.edu.unq.po2.tp9.template.sueldos;

public class Permanente extends Empleado {
	
	private int cantidadHijos;
	
	public Permanente(int cantidadHijos) {
		super();
		this.cantidadHijos = cantidadHijos;
	}

	public double getBonosExtra() {
		return this.cantidadHijos * 150;
	};

	public double getIngresos() {
		return 3000;
	};
}