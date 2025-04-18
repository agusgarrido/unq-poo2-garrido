package ar.edu.unq.po2.tp5.mercadocentral.Cargo;

import ar.edu.unq.po2.tp5.mercadocentral.Agencia.Agencia;

public abstract class Factura implements Cargo{
	private Agencia agencia;
	
	public Factura(Agencia agencia) {
		this.agencia = agencia;
	}
	
	public abstract double getValor();
	
	public void liquidar() {
		agencia.registrarPago(this); // Registro mi propio pago
	}
}
