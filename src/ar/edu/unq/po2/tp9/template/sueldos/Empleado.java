package ar.edu.unq.po2.tp9.template.sueldos;

public abstract class Empleado {

	public Empleado() {}
	
	public double sueldo() {
		return this.getSueldoBruto() - this.descuentos(getSueldoBruto());
	}
	
	private double descuentos(double sueldoBruto) {
		return sueldoBruto * 0.13;
	}
	
	public abstract double getBonosExtra();
	public abstract double getIngresos();
	
	public double getSueldoBruto() {
		return this.getIngresos() + this.getBonosExtra();
	}
}
