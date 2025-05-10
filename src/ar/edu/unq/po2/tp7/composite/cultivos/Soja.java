package ar.edu.unq.po2.tp7.composite.cultivos;

public class Soja implements Cultivo{
	private int valor;
	
	public Soja() {
		this.valor = 500;
	}

	public int getValor() {
		return valor;
	}

	public void agregarCultivo(Cultivo cultivo) {
		throw new UnsupportedOperationException("No se puede agregar cultivos a una parcela sin subdividir.");
	}
}
