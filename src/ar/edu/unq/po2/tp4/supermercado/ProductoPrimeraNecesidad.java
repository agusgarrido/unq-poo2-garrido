package ar.edu.unq.po2.tp4.supermercado;

public class ProductoPrimeraNecesidad extends Producto{
	public ProductoPrimeraNecesidad(String nombre, double precio) {
		super(nombre, precio);
	}
	
	public ProductoPrimeraNecesidad(String nombre, double precio, boolean programaPreciosCuidados) {
		super(nombre, precio, programaPreciosCuidados);
	}
	
	@Override
	public double getPrecio() {
		return super.getPrecio() * 0.9;
		// Si no pongo super, hago un loop infinito sobre mi propio método
	}
}
