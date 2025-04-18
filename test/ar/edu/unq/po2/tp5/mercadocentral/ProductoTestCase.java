package ar.edu.unq.po2.tp5.mercadocentral;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoTestCase {
	ProductoEmpresaTradicional leche;
	ProductoCooperativa harina;
	ProductoCooperativa azucar;

	@BeforeEach
	public void setUp() {
		leche = new ProductoEmpresaTradicional(1900, 100);
		harina = new ProductoCooperativa(800, 50);
		azucar = new ProductoCooperativa(850, 40);
	}
	
	@Test
	void testStock() {
		assertEquals(100, leche.getStock());
		leche.comprar();
		leche.comprar();
		assertNotEquals(100, leche.getStock());
		assertEquals(98, leche.getStock());
	}
	
	@Test
	void testDescuentoCooperativa() {
		assertNotEquals(800, harina.getPrecio());
		assertEquals(720, harina.getPrecio(), 0);
	}

}
