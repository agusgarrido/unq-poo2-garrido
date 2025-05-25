package ar.edu.unq.po2.tp9.template.sueldos;

public class Pasante extends Empleado{
	
	private int horasTrabajadas;
	
	public Pasante(int horasTrabajadas) {
		super();
		this.horasTrabajadas = horasTrabajadas;
	}
	
	public double getIngresos() {
		return this.horasTrabajadas * 40;
	};
	
	public double getBonosExtra() {
		return 0;
	}
}
