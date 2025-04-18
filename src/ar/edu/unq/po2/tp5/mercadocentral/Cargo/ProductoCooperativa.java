package ar.edu.unq.po2.tp5.mercadocentral.Cargo;

public class ProductoCooperativa extends Producto{
	public ProductoCooperativa(double precioBase, int stock) {
		super(precioBase, stock);
	}
	
	private double descuentoIVA() {
		return super.getValor() * 0.10;
	}
	
	@Override
	public double getValor() {
		return super.getValor() - descuentoIVA();
	}
}
