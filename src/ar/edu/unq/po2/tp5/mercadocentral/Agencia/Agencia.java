package ar.edu.unq.po2.tp5.mercadocentral.Agencia;

import ar.edu.unq.po2.tp5.mercadocentral.Cargo.Factura;

public interface Agencia {
	//public void registrarPago(Factura factura);
	
	// Se modifica la interfaz para que la caja pueda cobrar
	public void registrarPago(Factura factura);
}
