package ar.edu.unq.po2.tp9.template.sueldos;

public abstract class Empleado {

	public Empleado() {}
	
	public final double sueldo() {
		double sueldoBruto = this.getIngresos() + this.getBonosExtra();
		return sueldoBruto - this.descuentos(sueldoBruto);
	}
	
	private double descuentos(double sueldoBruto) {
		return sueldoBruto * 0.13;
	}
	
	public abstract double getBonosExtra();
	public abstract double getIngresos();
	
	/*public double getSueldoBruto() {
		return this.getIngresos() + this.getBonosExtra();
	} -> Complica la lógica de forma innecesaria */
}

/*FINAL AL MÉTODO*/