package ar.edu.unq.po2.tp4.supermercado;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
	private String nombre;
	private String direccion;
	private List<Producto> catalogo = new ArrayList<Producto>();

	public Supermercado(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	public void agregarProducto(Producto producto) {
		catalogo.add(producto);
	}
	
	public double getPrecioTotal() {
		return catalogo.stream().mapToDouble(producto -> producto.getPrecio()).sum();
	}
	
	public int getCantidadDeProductos() {
		return catalogo.size();
	}
}
