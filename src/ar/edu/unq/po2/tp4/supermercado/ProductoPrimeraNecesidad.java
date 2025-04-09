package ar.edu.unq.po2.tp4.supermercado;

public class ProductoPrimeraNecesidad extends Producto{
	private double descuento;
	public ProductoPrimeraNecesidad(String nombre, double precio, double descuento) {
		super(nombre, precio);
		this.descuento = descuento;
	}
	
	public ProductoPrimeraNecesidad(String nombre, double precio, boolean programaPreciosCuidados, double descuento) {
		super(nombre, precio, programaPreciosCuidados);
		this.descuento = descuento;
	}
	
	@Override
	public double getPrecio() {
		return super.getPrecio() - this.calcularDescuento();
		// Si no pongo super, hago un loop infinito sobre mi propio método
	}
	
	public double getDescuento() {
		return this.descuento;
	}
	
	private double calcularDescuento() {
		return super.getPrecio() * (this.getDescuento() / 100);
	}
}
