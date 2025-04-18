package ar.edu.unq.po2.tp5.mercadocentral.Agencia;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.po2.tp5.mercadocentral.Cargo.Factura;

public class AgenciaRecaudadora implements Agencia{
	private List<Factura> facturado = new ArrayList<Factura>();
	
	public void registrarPago(Factura factura) {
		facturado.add(factura);
	}
	
	public int getFacturado() {
		return this.facturado.size();
	}
}
