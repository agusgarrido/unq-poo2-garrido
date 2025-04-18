package ar.edu.unq.po2.tp5.mercadocentral;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.po2.tp5.mercadocentral.Cargo.Cargo;

public class Caja {
	private List<Cargo> lista = new ArrayList<Cargo>();
	
	public void registrarPago(Cargo cargo) {
		lista.add(cargo);
		cargo.liquidar();
	}
	
	public double getMontoTotal() {
		return lista.stream().mapToDouble(cargo -> cargo.getValor()).sum();
	}
}
