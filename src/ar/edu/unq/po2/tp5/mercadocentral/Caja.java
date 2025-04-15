package ar.edu.unq.po2.tp5.mercadocentral;

import java.util.ArrayList;
import java.util.List;

public class Caja {
	private List<Producto> lista = new ArrayList<Producto>();
	
	public void comprarProducto(Producto producto) {
		lista.add(producto);
		producto.comprar();
	}
	
	public double getMontoTotal() {
		return lista.stream().mapToDouble(producto -> producto.getPrecio()).sum();
	}
}
