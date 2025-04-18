package ar.edu.unq.po2.tp5.mercadocentral;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp5.mercadocentral.Cargo.ProductoCooperativa;
import ar.edu.unq.po2.tp5.mercadocentral.Cargo.ProductoEmpresaTradicional;

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
		supermercado.registrarPago(azucar);
		supermercado.registrarPago(harina);
		assertEquals(1485, supermercado.getMontoTotal());
		supermercado.registrarPago(leche);
		assertEquals(3385, supermercado.getMontoTotal());
	}

}
