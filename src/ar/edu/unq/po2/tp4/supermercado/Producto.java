package ar.edu.unq.po2.tp4.supermercado;

public class Producto {
	private String nombre;
	private double precio;
	private boolean programaPreciosCuidados = false;

	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public Producto(String nombre, double precio, boolean programaPreciosCuidados) {
		this.nombre = nombre;
		this.precio = precio;
		this.programaPreciosCuidados = programaPreciosCuidados;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public double getPrecio() {
		return this.precio;
	}
	
	public boolean esPrecioCuidado() {
		return this.programaPreciosCuidados;
	}
	
	public void aumentarPrecio(double aumento) {
		this.precio += aumento;
	}

}
