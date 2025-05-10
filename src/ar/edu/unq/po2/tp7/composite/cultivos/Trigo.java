package ar.edu.unq.po2.tp7.composite.cultivos;

public class Trigo implements Cultivo{
	private int valor;
	
	public Trigo() {
		this.valor = 300;
	}
	
	public int getValor() {
		return valor;
	}
	
	public void agregarCultivo(Cultivo cultivo) {
		throw new UnsupportedOperationException("No se puede agregar cultivos a una parcela sin subdividir.");
	}
	
}
