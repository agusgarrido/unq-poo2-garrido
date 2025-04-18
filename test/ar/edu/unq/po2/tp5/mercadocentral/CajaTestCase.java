package ar.edu.unq.po2.tp5.mercadocentral;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaTestCase {
	ProductoEmpresaTradicional leche;
	ProductoCooperativa harina;
	ProductoCooperativa azucar;
	Caja supermercado;

	@BeforeEach
	public void setUp() {
		supermercado = new Caja();
		leche = new ProductoEmpresaTradicional(1900, 100);
		harina = new ProductoCooperativa(800, 50);
		azucar = new ProductoCooperativa(850, 40);
	}
	
	@Test
	void testComprarProductos() {
		supermercado.comprarProducto(azucar);
		supermercado.comprarProducto(harina);
		assertEquals(1485, supermercado.getMontoTotal());
		supermercado.comprarProducto(leche);
		assertEquals(3385, supermercado.getMontoTotal());
	}

}
