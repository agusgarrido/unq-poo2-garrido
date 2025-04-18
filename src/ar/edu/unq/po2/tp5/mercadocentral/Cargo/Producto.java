package ar.edu.unq.po2.tp5.mercadocentral.Cargo;

public class Producto implements Cargo{
	private double precioBase;
	private int stock;
	
	public Producto(double precioBase, int stock) {
		this.precioBase = precioBase;
		this.stock = stock;
	}
	
	public double getValor() {
		return this.precioBase;
	}
	
	public int getStock() {
		return this.stock;
	}
	
	private boolean hayStock() {
		return this.getStock() > 0;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public void liquidar() {
		if (this.hayStock()) { this.setStock(this.getStock() - 1); }
	}
}
