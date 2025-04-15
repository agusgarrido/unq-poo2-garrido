package ar.edu.unq.po2.tp5.mercadocentral;

public class ProductoCooperativa extends Producto{
	public ProductoCooperativa(double precioBase, int stock) {
		super(precioBase, stock);
	}
	
	private double descuentoIVA() {
		return super.getPrecio() * 0.10;
	}
	
	@Override
	public double getPrecio() {
		return super.getPrecio() - descuentoIVA();
	}
}
