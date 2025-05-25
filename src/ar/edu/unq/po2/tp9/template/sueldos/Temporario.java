package ar.edu.unq.po2.tp9.template.sueldos;

public class Temporario extends Empleado{
	
	private int horasTrabajadas;
	private boolean esCasado;
	private boolean tieneHijos;
	
	public Temporario(int horasTrabajadas, boolean esCasado, boolean tieneHijos) {
		super();
		this.horasTrabajadas = horasTrabajadas;
		this.esCasado = esCasado;
		this.tieneHijos = tieneHijos;
	}
	
	public double getBonosExtra() {
		return this.cumpleRequisitos() ? 100 : 0;
	};
	
	public double getIngresos() {
		return 1000 + this.pagoPorHora();
	};
	
	private int pagoPorHora() {
		return this.horasTrabajadas * 5;
	}
	
	private boolean cumpleRequisitos() {
		return this.esCasado || this.tieneHijos;
	}

}
