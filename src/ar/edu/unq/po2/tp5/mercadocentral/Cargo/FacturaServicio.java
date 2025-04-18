package ar.edu.unq.po2.tp5.mercadocentral.Cargo;

import ar.edu.unq.po2.tp5.mercadocentral.Agencia.Agencia;

public class FacturaServicio extends Factura{
	public int unidades;
	public int unidadesPorPeriodo;
	
	public FacturaServicio(Agencia agencia, int unidades, int unidadesPorPeriodo) {
		super(agencia);
		this.unidades = unidades;
		this.unidadesPorPeriodo = unidadesPorPeriodo;
	}
	
	public double getValor() {
		return unidades * unidadesPorPeriodo;
	}

}
